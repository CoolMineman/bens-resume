'''
Converts a SVG path into Java PDF code
'''
from svgpathtools import *

def conv(path):
    minx, width, miny, height = path.bbox()
    print(f"// {width - minx}, {height - miny}")
    def pdfCoords(coords):
        x, y = coords.real, coords.imag
        # (height - miny) - (y - miny) = height - y
        return f"{x - minx}f * scale + x, {height - y}f * scale + y"
    start = None
    prev = None
    def do_curve(curve):
        nonlocal prev
        nonlocal start
        if isinstance(curve, Arc):
            for c2 in curve.as_cubic_curves(curves=4):
                do_curve(c2)
            return
        if prev is not None and curve.start != prev:
            if prev == start:
                start = None
                prev = None
            else:
                raise Exception("Disconnected path")
        if prev is None:
            print(f"cs.moveTo({pdfCoords(curve.start)});")
            start = curve.start
        prev = curve.end
        if isinstance(curve, Line):
            print(f"cs.lineTo({pdfCoords(curve.end)});")
        elif isinstance(curve, CubicBezier):
            print(f"cs.curveTo({pdfCoords(curve.control1)}, {pdfCoords(curve.control2)}, {pdfCoords(curve.end)});")
        else:
            print(curve)
    for curve in path:
        do_curve(curve)
    print(f"cs.fillEvenOdd();")
conv(parse_path(input()))