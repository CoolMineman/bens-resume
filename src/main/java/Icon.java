import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDPageContentStream;

/**
 * https://icons.getbootstrap.com/
 * Copyright (c) 2019-2024 The Bootstrap Authors
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
abstract class Icon {
    final float height;
    final float width;

    Icon(float width, float height) {
        this.height = height;
        this.width = width;
    }

    abstract void draw(float x, float y, float scale, PDPageContentStream cs) throws IOException;

    static final Icon EMAIL = new Icon(16, 12.000000922297431f) {
        @Override
        void draw(float x, float y, float scale, PDPageContentStream cs) throws IOException {
            cs.moveTo(0.05f * scale + x, 10.445000917766862f * scale + y);
            cs.curveTo(0.10004975401071317f * scale + x, 10.66430492600676f * scale + y, 0.186740872000771f * scale + x, 10.873601941506823f * scale + y, 0.3064177502022052f * scale + x, 11.064066297045011f * scale + y);
            cs.curveTo(0.4260946284036394f * scale + x, 11.2545306525832f * scale + y, 0.5770511008176179f * scale + x, 11.423447004876065f * scale + y, 0.7529216127927518f * scale + x, 11.563692464425467f * scale + y);
            cs.curveTo(0.9287921247678858f * scale + x, 11.70393792397487f * scale + y, 1.1270693892472377f * scale + x, 11.81351309007643f * scale + y, 1.3393924214847543f * scale + x, 11.887797381067763f * scale + y);
            cs.curveTo(1.551715453722271f * scale + x, 11.962081672059096f * scale + y, 1.7750572835645142f * scale + x, 12.00001605854838f * scale + y, 2.0f * scale + x, 12.000000917766862f * scale + y);
            cs.lineTo(14.0f * scale + x, 12.000000917766862f * scale + y);
            cs.curveTo(14.224942716435486f * scale + x, 12.00001605854838f * scale + y, 14.448284546277728f * scale + x, 11.962081672059096f * scale + y, 14.660607578515245f * scale + x, 11.887797381067763f * scale + y);
            cs.curveTo(14.872930610752762f * scale + x, 11.81351309007643f * scale + y, 15.071207875232114f * scale + x, 11.70393792397487f * scale + y, 15.247078387207248f * scale + x, 11.563692464425468f * scale + y);
            cs.curveTo(15.422948899182382f * scale + x, 11.423447004876065f * scale + y, 15.57390537159636f * scale + x, 11.2545306525832f * scale + y, 15.693582249797794f * scale + x, 11.064066297045013f * scale + y);
            cs.curveTo(15.813259127999228f * scale + x, 10.873601941506823f * scale + y, 15.899950245989286f * scale + x, 10.66430492600676f * scale + y, 15.95f * scale + x, 10.445000917766862f * scale + y);
            cs.lineTo(8.0f * scale + x, 5.586000917766862f * scale + y);
            cs.lineTo(0.05f * scale + x, 10.445000917766862f * scale + y);
            cs.moveTo(0.0f * scale + x, 9.303000917766862f * scale + y);
            cs.lineTo(0.0f * scale + x, 2.1990009177668615f * scale + y);
            cs.lineTo(5.803f * scale + x, 5.757000917766861f * scale + y);
            cs.lineTo(0.0f * scale + x, 9.303000917766862f * scale + y);
            cs.moveTo(6.761f * scale + x, 5.1700009177668615f * scale + y);
            cs.lineTo(0.19099999999999984f * scale + x, 1.1430009177668623f * scale + y);
            cs.curveTo(0.2717573770287187f * scale + x, 0.9727144300535429f * scale + y, 0.37618071967678274f * scale + x, 0.8146945540923554f * scale + y, 0.5011676404800589f * scale + x, 0.6736360149307252f * scale + y);
            cs.curveTo(0.626154561283335f * scale + x, 0.5325774757690951f * scale + y, 0.770454904501268f * scale + x, 0.40989118217535037f * scale + y, 0.9297815484566847f * scale + x, 0.30922210863138133f * scale + y);
            cs.curveTo(1.0891081924121016f * scale + x, 0.2085530350874123f * scale + y, 1.2618675054091082f * scale + x, 0.13090810311251388f * scale + y, 1.4429268579669525f * scale + x, 0.07859412129472787f * scale + y);
            cs.curveTo(1.6239862105247969f * scale + x, 0.026280139476941855f * scale + y, 1.811534594039326f * scale + x, -0.00017963243574747878f * scale + y, 2.0f * scale + x, 9.177668616189294e-07f * scale + y);
            cs.lineTo(14.0f * scale + x, 9.177668616189294e-07f * scale + y);
            cs.curveTo(14.18843468193044f * scale + x, -4.07742414658685e-05f * scale + y, 14.37593317506344f * scale + x, 0.026548464857299336f * scale + y, 14.556926758277301f * scale + x, 0.07897893241058718f * scale + y);
            cs.curveTo(14.737920341491163f * scale + x, 0.13140939996387502f * scale + y, 14.910599256546126f * scale + x, 0.2091568427413577f * scale + y, 15.069834925044194f * scale + x, 0.309912155109604f * scale + y);
            cs.curveTo(15.229070593542263f * scale + x, 0.4106674674778503f * scale + y, 15.373270815041788f * scale + x, 0.5334231951751125f * scale + y, 15.498152830754691f * scale + x, 0.6745334826949527f * scale + y);
            cs.curveTo(15.623034846467593f * scale + x, 0.815643770214793f * scale + y, 15.72734995877199f * scale + x, 0.9736976531405794f * scale + y, 15.808f * scale + x, 1.1440009177668617f * scale + y);
            cs.lineTo(9.238f * scale + x, 5.171000917766861f * scale + y);
            cs.lineTo(8.0f * scale + x, 4.414000917766861f * scale + y);
            cs.lineTo(6.761f * scale + x, 5.1700009177668615f * scale + y);
            cs.moveTo(10.197f * scale + x, 5.756000917766862f * scale + y);
            cs.lineTo(16.0f * scale + x, 2.1990009177668615f * scale + y);
            cs.lineTo(16.0f * scale + x, 9.303000917766862f * scale + y);
            cs.lineTo(10.197f * scale + x, 5.756000917766862f * scale + y);
            cs.fillEvenOdd();
        }
    };

    static final Icon LINKEDIN = new Icon(16, 16) {
        @Override
        void draw(float x, float y, float scale, PDPageContentStream cs) throws IOException {
            cs.moveTo(0.0f * scale + x, 14.854f * scale + y);
            cs.curveTo(0.0f * scale + x, 15.487f * scale + y, 0.526f * scale + x, 16.0f * scale + y, 1.175f * scale + x, 16.0f * scale + y);
            cs.lineTo(14.825000000000001f * scale + x, 16.0f * scale + y);
            cs.curveTo(15.474f * scale + x, 16.0f * scale + y, 16.0f * scale + x, 15.487f * scale + y, 16.0f * scale + x, 14.854f * scale + y);
            cs.lineTo(16.0f * scale + x, 1.1460000000000008f * scale + y);
            cs.curveTo(16.0f * scale + x, 0.5130000000000017f * scale + y, 15.474f * scale + x, 0.0f * scale + y, 14.825f * scale + x, 0.0f * scale + y);
            cs.lineTo(1.175f * scale + x, 0.0f * scale + y);
            cs.curveTo(0.526f * scale + x, 0.0f * scale + y, 0.0f * scale + x, 0.5129999999999999f * scale + y, 0.0f * scale + x, 1.1460000000000008f * scale + y);
            cs.lineTo(0.0f * scale + x, 14.854f * scale + y);
            cs.moveTo(4.943f * scale + x, 2.6060000000000016f * scale + y);
            cs.lineTo(4.943f * scale + x, 9.831f * scale + y);
            cs.lineTo(2.542f * scale + x, 9.831f * scale + y);
            cs.lineTo(2.542f * scale + x, 2.6060000000000016f * scale + y);
            cs.lineTo(4.943f * scale + x, 2.6060000000000016f * scale + y);
            cs.moveTo(3.7429999999999994f * scale + x, 10.818000000000001f * scale + y);
            cs.curveTo(4.579999999999999f * scale + x, 10.818000000000001f * scale + y, 5.100999999999999f * scale + x, 11.372000000000002f * scale + y, 5.100999999999999f * scale + x, 12.066000000000003f * scale + y);
            cs.curveTo(5.085999999999999f * scale + x, 12.775000000000002f * scale + y, 4.5809999999999995f * scale + x, 13.314000000000002f * scale + y, 3.758999999999999f * scale + x, 13.314000000000002f * scale + y);
            cs.curveTo(2.9369999999999985f * scale + x, 13.314000000000002f * scale + y, 2.4f * scale + x, 12.774000000000001f * scale + y, 2.4f * scale + x, 12.065999999999999f * scale + y);
            cs.curveTo(2.4f * scale + x, 11.372f * scale + y, 2.921f * scale + x, 10.818f * scale + y, 3.727f * scale + x, 10.818f * scale + y);
            cs.lineTo(3.7429999999999994f * scale + x, 10.818000000000001f * scale + y);
            cs.moveTo(8.651f * scale + x, 2.6060000000000016f * scale + y);
            cs.lineTo(8.651f * scale + x, 6.641f * scale + y);
            cs.curveTo(8.651f * scale + x, 6.856999999999999f * scale + y, 8.667f * scale + x, 7.073f * scale + y, 8.731f * scale + x, 7.227f * scale + y);
            cs.curveTo(8.904f * scale + x, 7.6579999999999995f * scale + y, 9.299f * scale + x, 8.105f * scale + y, 9.963f * scale + x, 8.105f * scale + y);
            cs.curveTo(10.831999999999999f * scale + x, 8.105f * scale + y, 11.178999999999998f * scale + x, 7.443f * scale + y, 11.178999999999998f * scale + x, 6.471f * scale + y);
            cs.lineTo(11.178999999999998f * scale + x, 2.606f * scale + y);
            cs.lineTo(13.579999999999998f * scale + x, 2.606f * scale + y);
            cs.lineTo(13.579999999999998f * scale + x, 6.75f * scale + y);
            cs.curveTo(13.579999999999998f * scale + x, 8.97f * scale + y, 12.395999999999999f * scale + x, 10.001999999999999f * scale + y, 10.815999999999999f * scale + x, 10.001999999999999f * scale + y);
            cs.curveTo(9.541999999999998f * scale + x, 10.001999999999999f * scale + y, 8.970999999999998f * scale + x, 9.302f * scale + y, 8.651f * scale + x, 8.809f * scale + y);
            cs.lineTo(8.651f * scale + x, 8.783999999999999f * scale + y);
            cs.lineTo(8.635f * scale + x, 8.783999999999999f * scale + y);
            cs.lineTo(8.651f * scale + x, 8.809f * scale + y);
            cs.lineTo(8.651f * scale + x, 9.831f * scale + y);
            cs.lineTo(6.2509999999999994f * scale + x, 9.831f * scale + y);
            cs.curveTo(6.281f * scale + x, 9.153f * scale + y, 6.2509999999999994f * scale + x, 2.6060000000000016f * scale + y, 6.2509999999999994f * scale + x, 2.6060000000000016f * scale + y);
            cs.lineTo(8.651f * scale + x, 2.6060000000000016f * scale + y);
            cs.fillEvenOdd();
        }
    };

    static Icon GITHUB = new Icon(16.000000000693483f, 15.6052824361543f) {
        @Override
        void draw(float x, float y, float scale, PDPageContentStream cs) throws IOException {
            cs.moveTo(8.0f * scale + x, 15.6052824361543f * scale + y);
            cs.curveTo(3.58f * scale + x, 15.6052824361543f * scale + y, 0.0f * scale + x, 12.0252824361543f * scale + y, 0.0f * scale + x, 7.605282436154299f * scale + y);
            cs.curveTo(0.0f * scale + x, 4.0652824361543f * scale + y, 2.29f * scale + x, 1.075282436154298f * scale + y, 5.47f * scale + x, 0.015282436154299361f * scale + y);
            cs.curveTo(5.87f * scale + x, -0.05471756384570092f * scale + y, 6.02f * scale + x, 0.1852824361542993f * scale + y, 6.02f * scale + x, 0.39528243615430014f * scale + y);
            cs.curveTo(6.02f * scale + x, 0.5852824361542996f * scale + y, 6.01f * scale + x, 1.2152824361543004f * scale + y, 6.01f * scale + x, 1.8852824361543004f * scale + y);
            cs.curveTo(4.0f * scale + x, 1.5152824361543011f * scale + y, 3.48f * scale + x, 2.3752824361543006f * scale + y, 3.32f * scale + x, 2.8252824361543f * scale + y);
            cs.curveTo(3.23f * scale + x, 3.0552824361543003f * scale + y, 2.84f * scale + x, 3.7652824361542994f * scale + y, 2.5f * scale + x, 3.9552824361543006f * scale + y);
            cs.curveTo(2.2199999999999998f * scale + x, 4.105282436154301f * scale + y, 1.8199999999999998f * scale + x, 4.4752824361543f * scale + y, 2.49f * scale + x, 4.4852824361543f * scale + y);
            cs.curveTo(3.12f * scale + x, 4.4952824361543f * scale + y, 3.5700000000000003f * scale + x, 3.9052824361543f * scale + y, 3.72f * scale + x, 3.6652824361542997f * scale + y);
            cs.curveTo(4.44f * scale + x, 2.4552824361543006f * scale + y, 5.59f * scale + x, 2.7952824361543005f * scale + y, 6.050000000000001f * scale + x, 3.0052824361542996f * scale + y);
            cs.curveTo(6.120000000000001f * scale + x, 3.525282436154299f * scale + y, 6.330000000000001f * scale + x, 3.875282436154299f * scale + y, 6.5600000000000005f * scale + x, 4.0752824361543f * scale + y);
            cs.curveTo(4.78f * scale + x, 4.275282436154299f * scale + y, 2.9200000000000004f * scale + x, 4.9652824361543f * scale + y, 2.9200000000000004f * scale + x, 8.0252824361543f * scale + y);
            cs.curveTo(2.9200000000000004f * scale + x, 8.8952824361543f * scale + y, 3.2300000000000004f * scale + x, 9.615282436154299f * scale + y, 3.74f * scale + x, 10.1752824361543f * scale + y);
            cs.curveTo(3.66f * scale + x, 10.3752824361543f * scale + y, 3.3800000000000003f * scale + x, 11.195282436154299f * scale + y, 3.8200000000000003f * scale + x, 12.295282436154299f * scale + y);
            cs.curveTo(3.8200000000000003f * scale + x, 12.295282436154299f * scale + y, 4.49f * scale + x, 12.5052824361543f * scale + y, 6.0200000000000005f * scale + x, 11.475282436154298f * scale + y);
            cs.curveTo(6.66f * scale + x, 11.6552824361543f * scale + y, 7.340000000000001f * scale + x, 11.7452824361543f * scale + y, 8.02f * scale + x, 11.7452824361543f * scale + y);
            cs.curveTo(8.7f * scale + x, 11.7452824361543f * scale + y, 9.379999999999999f * scale + x, 11.6552824361543f * scale + y, 10.02f * scale + x, 11.475282436154298f * scale + y);
            cs.curveTo(11.549999999999999f * scale + x, 12.5152824361543f * scale + y, 12.219999999999999f * scale + x, 12.295282436154299f * scale + y, 12.219999999999999f * scale + x, 12.295282436154299f * scale + y);
            cs.curveTo(12.659999999999998f * scale + x, 11.195282436154299f * scale + y, 12.379999999999999f * scale + x, 10.375282436154299f * scale + y, 12.299999999999999f * scale + x, 10.1752824361543f * scale + y);
            cs.curveTo(12.809999999999999f * scale + x, 9.615282436154299f * scale + y, 13.12f * scale + x, 8.9052824361543f * scale + y, 13.12f * scale + x, 8.0252824361543f * scale + y);
            cs.curveTo(13.12f * scale + x, 4.955282436154299f * scale + y, 11.25f * scale + x, 4.275282436154299f * scale + y, 9.469999999999999f * scale + x, 4.075282436154298f * scale + y);
            cs.curveTo(9.759999999999998f * scale + x, 3.825282436154298f * scale + y, 10.009999999999998f * scale + x, 3.3452824361542977f * scale + y, 10.009999999999998f * scale + x, 2.5952824361542977f * scale + y);
            cs.curveTo(10.009999999999998f * scale + x, 1.5252824361542974f * scale + y, 9.999999999999998f * scale + x, 0.6652824361542979f * scale + y, 9.999999999999998f * scale + x, 0.39528243615429837f * scale + y);
            cs.curveTo(9.999999999999998f * scale + x, 0.18528243615429751f * scale + y, 10.149999999999999f * scale + x, -0.06471756384570249f * scale + y, 10.549999999999999f * scale + x, 0.015282436154297585f * scale + y);
            cs.curveTo(11.339356637147759f * scale + x, 0.2815249991504327f * scale + y, 12.082369169271544f * scale + x, 0.6692860606900659f * scale + y, 12.75219982960111f * scale + x, 1.164559610803968f * scale + y);
            cs.curveTo(13.422030489930677f * scale + x, 1.65983316091787f * scale + y, 14.010516186817464f * scale + x, 2.2565834003807588f * scale + y, 14.496400694830747f * scale + x, 2.933255586769901f * scale + y);
            cs.curveTo(14.98228520284403f * scale + x, 3.6099277731590433f * scale + y, 15.359647145127791f * scale + x, 4.358275438522655f * scale + y, 15.614856130057232f * scale + x, 5.1512681099713f * scale + y);
            cs.curveTo(15.870065114986673f * scale + x, 5.944260781419944f * scale + y, 16.000010961949148f * scale + x, 6.772234416626128f * scale + y, 16.0f * scale + x, 7.605282436154299f * scale + y);
            cs.curveTo(16.0f * scale + x, 12.0252824361543f * scale + y, 12.42f * scale + x, 15.6052824361543f * scale + y, 8.0f * scale + x, 15.6052824361543f * scale + y);
            cs.fillEvenOdd();
        }
    };

    static Icon LINK = new Icon(11.071508145149041f, 11.070508145149041f) {
        @Override
        void draw(float x, float y, float scale, PDPageContentStream cs) throws IOException {
            cs.moveTo(2.250754072574521f * scale + x, 6.49375407257452f * scale + y);
            cs.lineTo(0.8787540725745213f * scale + x, 5.12175407257452f * scale + y);
            cs.curveTo(0.31631308061272323f * scale + x, 4.559313080612721f * scale + y, 0.0f * scale + x, 3.7956657514414722f * scale + y, 0.0f * scale + x, 3.0002540725745206f * scale + y);
            cs.curveTo(0.0f * scale + x, 2.204842393707569f * scale + y, 0.3163130806127228f * scale + x, 1.441195064536318f * scale + y, 0.8787540725745209f * scale + x, 0.8787540725745195f * scale + y);
            cs.curveTo(1.441195064536319f * scale + x, 0.316313080612721f * scale + y, 2.204842393707569f * scale + x, 0.0f * scale + y, 3.0002540725745206f * scale + x, 0.0f * scale + y);
            cs.curveTo(3.7956657514414722f * scale + x, 0.0f * scale + y, 4.559313080612723f * scale + x, 0.316313080612721f * scale + y, 5.121754072574522f * scale + x, 0.8787540725745195f * scale + y);
            cs.lineTo(6.949754072574521f * scale + x, 2.70775407257452f * scale + y);
            cs.curveTo(7.289031513068963f * scale + x, 3.0470798040839497f * scale + y, 7.54199696029881f * scale + x, 3.4629049824670197f * scale + y, 7.687344603149997f * scale + x, 3.920207066882206f * scale + y);
            cs.curveTo(7.832692246001184f * scale + x, 4.377509151297392f * scale + y, 7.8662236175790134f * scale + x, 4.863078655683346f * scale + y, 7.785114565110623f * scale + x, 5.336018879496619f * scale + y);
            cs.curveTo(7.704005512642233f * scale + x, 5.808959103309893f * scale + y, 7.510598927040528f * scale + x, 6.25560884204865f * scale + y, 7.221184322253647f * scale + x, 6.638349381094258f * scale + y);
            cs.curveTo(6.931769717466766f * scale + x, 7.021089920139866f * scale + y, 6.5547070339327025f * scale + x, 7.32886553508621f * scale + y, 6.121754072574522f * scale + x, 7.53575407257452f * scale + y);
            cs.lineTo(5.535754072574521f * scale + x, 6.949754072574519f * scale + y);
            cs.curveTo(5.520895689368805f * scale + x, 6.934876473809818f * scale + y, 5.50651023768244f * scale + x, 6.9195339450637f * scale + y, 5.492619173234305f * scale + x, 6.9037493695233465f * scale + y);
            cs.curveTo(5.478728108786169f * scale + x, 6.887964793982993f * scale + y, 5.465338341126956f * scale + x, 6.871746023049951f * scale + y, 5.452469840925436f * scale + x, 6.855117246815519f * scale + y);
            cs.curveTo(5.439601340723915f * scale + x, 6.838488470581087f * scale + y, 5.427260508897369f * scale + x, 6.821457960360454f * scale + y, 5.415465751640066f * scale + x, 6.8040511169437785f * scale + y);
            cs.curveTo(5.403670994382763f * scale + x, 6.786644273527103f * scale + y, 5.392428178521791f * scale + x, 6.768869755247768f * scale + y, 5.381754072574521f * scale + x, 6.750754072574519f * scale + y);
            cs.curveTo(5.716257090220415f * scale + x, 6.654591684711877f * scale + y, 6.019935233255087f * scale + x, 6.472756409334297f * scale + y, 6.262647137087411f * scale + x, 6.22329618125827f * scale + y);
            cs.curveTo(6.5053590409197355f * scale + x, 5.973835953182244f * scale + y, 6.678799874601744f * scale + x, 5.665286509591242f * scale + y, 6.76575488783644f * scale + x, 5.328272712652588f * scale + y);
            cs.curveTo(6.852709901071137f * scale + x, 4.991258915713933f * scale + y, 6.850203769312875f * scale + x, 4.637312307830431f * scale + y, 6.758485236940439f * scale + x, 4.301563615393512f * scale + y);
            cs.curveTo(6.666766704568003f * scale + x, 3.965814922956593f * scale + y, 6.488974088631863f * scale + x, 3.659752400508628f * scale + y, 6.242754072574522f * scale + x, 3.4137540725745197f * scale + y);
            cs.lineTo(4.415754072574521f * scale + x, 1.5857540725745203f * scale + y);
            cs.curveTo(4.040616668084328f * scale + x, 1.2106166680843273f * scale + y, 3.5312784777579935f * scale + x, 0.99964188181659f * scale + y, 3.000754072574521f * scale + x, 0.99964188181659f * scale + y);
            cs.curveTo(2.470229667391049f * scale + x, 0.99964188181659f * scale + y, 1.9608914770647141f * scale + x, 1.2106166680843273f * scale + y, 1.5857540725745212f * scale + x, 1.5857540725745203f * scale + y);
            cs.curveTo(1.2106166680843282f * scale + x, 1.9608914770647132f * scale + y, 0.9996418818165917f * scale + x, 2.470229667391047f * scale + y, 0.9996418818165917f * scale + x, 3.0007540725745194f * scale + y);
            cs.curveTo(0.9996418818165917f * scale + x, 3.5312784777579918f * scale + y, 1.2106166680843282f * scale + x, 4.040616668084327f * scale + y, 1.5857540725745212f * scale + x, 4.41575407257452f * scale + y);
            cs.lineTo(2.3787540725745213f * scale + x, 5.20775407257452f * scale + y);
            cs.curveTo(2.3507620795692086f * scale + x, 5.312342057374251f * scale + y, 2.3270279911514002f * scale + x, 5.418023436601051f * scale + y, 2.3076104511503654f * scale + x, 5.524537085384606f * scale + y);
            cs.curveTo(2.2881929111493307f * scale + x, 5.63105073416816f * scale + y, 2.2731079254820834f * scale + x, 5.73830885309499f * scale + y, 2.2623927671758555f * scale + x, 5.846046421377139f * scale + y);
            cs.curveTo(2.2516776088696275f * scale + x, 5.9537839896592875f * scale + y, 2.245341110450818f * scale + x, 6.061912199003988f * scale + y, 2.2433989285785287f * scale + x, 6.170163878743626f * scale + y);
            cs.curveTo(2.2414567467062394f * scale + x, 6.278415558483264f * scale + y, 2.243910482324867f * scale + x, 6.386701476541972f * scale + y, 2.250754072574521f * scale + x, 6.49475407257452f * scale + y);
            cs.lineTo(2.250754072574521f * scale + x, 6.49375407257452f * scale + y);
            cs.moveTo(4.121754072574522f * scale + x, 8.363754072574519f * scale + y);
            cs.curveTo(3.782476632080079f * scale + x, 8.02442834106509f * scale + y, 3.5295111848502323f * scale + x, 7.6086031626820185f * scale + y, 3.3841635419990457f * scale + x, 7.151301078266833f * scale + y);
            cs.curveTo(3.238815899147859f * scale + x, 6.693998993851648f * scale + y, 3.20528452757003f * scale + x, 6.208429489465696f * scale + y, 3.2863935800384203f * scale + x, 5.735489265652422f * scale + y);
            cs.curveTo(3.3675026325068105f * scale + x, 5.262549041839148f * scale + y, 3.560909218108513f * scale + x, 4.815899303100389f * scale + y, 3.850323822895395f * scale + x, 4.433158764054781f * scale + y);
            cs.curveTo(4.139738427682277f * scale + x, 4.050418225009173f * scale + y, 4.51680111121634f * scale + x, 3.7426426100628287f * scale + y, 4.949754072574521f * scale + x, 3.5357540725745196f * scale + y);
            cs.lineTo(5.724754072574521f * scale + x, 4.311754072574519f * scale + y);
            cs.curveTo(5.385726984677795f * scale + x, 4.4026911483196045f * scale + y, 5.076539587457104f * scale + x, 4.581297489439356f * scale + y, 4.828388904601664f * scale + x, 4.829551707270959f * scale + y);
            cs.curveTo(4.5802382217462245f * scale + x, 5.077805925102562f * scale + y, 4.4017608703493165f * scale + x, 5.387067799129468f * scale + y, 4.31096522400433f * scale + x, 5.726132790949029f * scale + y);
            cs.curveTo(4.220169577659344f * scale + x, 6.065197782768589f * scale + y, 4.220215680989952f * scale + x, 6.422265100739266f * scale + y, 4.311098882167816f * scale + x, 6.761306634797361f * scale + y);
            cs.curveTo(4.401982083345679f * scale + x, 7.100348168855455f * scale + y, 4.58053929049552f * scale + x, 7.4095639437815395f * scale + y, 4.8287540725745215f * scale + x, 7.6577540725745195f * scale + y);
            cs.lineTo(6.655754072574521f * scale + x, 9.485754072574519f * scale + y);
            cs.curveTo(7.0308914770647135f * scale + x, 9.860891477064712f * scale + y, 7.540229667391049f * scale + x, 10.07186626333245f * scale + y, 8.070754072574521f * scale + x, 10.07186626333245f * scale + y);
            cs.curveTo(8.601278477757994f * scale + x, 10.07186626333245f * scale + y, 9.110616668084328f * scale + x, 9.860891477064712f * scale + y, 9.48575407257452f * scale + x, 9.485754072574519f * scale + y);
            cs.curveTo(9.860891477064714f * scale + x, 9.110616668084326f * scale + y, 10.071866263332451f * scale + x, 8.601278477757992f * scale + y, 10.071866263332451f * scale + x, 8.07075407257452f * scale + y);
            cs.curveTo(10.071866263332451f * scale + x, 7.540229667391047f * scale + y, 9.860891477064714f * scale + x, 7.030891477064713f * scale + y, 9.48575407257452f * scale + x, 6.65575407257452f * scale + y);
            cs.lineTo(8.692754072574521f * scale + x, 5.86375407257452f * scale + y);
            cs.curveTo(8.804754072574521f * scale + x, 5.44375407257452f * scale + y, 8.84775407257452f * scale + x, 5.00875407257452f * scale + y, 8.820754072574521f * scale + x, 4.57675407257452f * scale + y);
            cs.lineTo(10.192754072574521f * scale + x, 5.94875407257452f * scale + y);
            cs.curveTo(10.75519506453632f * scale + x, 6.511195064536318f * scale + y, 11.071508145149041f * scale + x, 7.2748423937075675f * scale + y, 11.071508145149041f * scale + x, 8.07025407257452f * scale + y);
            cs.curveTo(11.071508145149041f * scale + x, 8.865665751441473f * scale + y, 10.75519506453632f * scale + x, 9.629313080612722f * scale + y, 10.192754072574521f * scale + x, 10.19175407257452f * scale + y);
            cs.curveTo(9.630313080612723f * scale + x, 10.754195064536319f * scale + y, 8.866665751441472f * scale + x, 11.070508145149041f * scale + y, 8.07125407257452f * scale + x, 11.070508145149041f * scale + y);
            cs.curveTo(7.275842393707569f * scale + x, 11.070508145149041f * scale + y, 6.51219506453632f * scale + x, 10.754195064536319f * scale + y, 5.949754072574521f * scale + x, 10.19175407257452f * scale + y);
            cs.lineTo(4.121754072574522f * scale + x, 8.363754072574519f * scale + y);
            cs.fillEvenOdd();
        }
    };
}
