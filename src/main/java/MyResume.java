import java.io.File;
import java.io.IOException;

public class MyResume {
    public static void main(String[] args) throws IOException {
        new Resume(new Section[] {
            new Header(
                "Ben Real",
                new ContactInfo[] {
                    Link.email("ceo@benPLZnoSPAM.PLZnoSPAMenterprises".replace("PLZnoSPAM", "")),
                    Link.https(Icon.LINKEDIN, "www.linkedin.com/about-us"),
                    Link.https(Icon.GITHUB, "github.com/coolmineman")
                }
            ),
            new LabeledSection(
                "EDUCATION",
                new Item[] {
                    new Item(
                        new ItemElement[] {
                            new BasicText("University of Hard Knocks", Alignment.LEFT, Format.BOLD),
                            new BasicText("GPA: 2.6/3.141592653", Alignment.RIGHT, Format.NORMAL),
                            new BasicText("Bachelor of Computer Science in Creative Writing", Alignment.LEFT, Format.NORMAL),
                            new BasicText("January 2038", Alignment.RIGHT, Format.NORMAL),
                            new BulletPoint("Selected coursework: Spanish II, Bank Robbery Past and Present, Data Structures & Algorithms"),
                        }
                    )
                }
            ),
            new LabeledSection("EXPERIENCE", new Item[] {
                experience(
                    "Chase Bank",
                    "Software and Social Media Engineering Intern",
                    "August 2024 - Present",
                    "Increased fee revenue by 13% by creating a TikTok trend encouraging check fraud",
                    "Ported legacy Fortran webserver to Motorola 68000 Assembly to increase maintainability"
                ),
                experience(
                    "Crowd Strike",
                    "Software Engineering Intern",
                    "May 2024 - August 2024",
                    "Created $10 billion in impact by enhancing Crowdstrike Sensor Detection Engine with increased security capabilities through the novel strategy of crashing the computer before viruses have a chance to attack",
                    "Reduced 911 calls by 11%"
                ),
                experience(
                    "Meta",
                    "Misinformation Engineering Intern",
                    "Past - May 2024",
                    "Increased online misinformation by 23% by developing and implementing proprietary shitposting techniques",
                    "Posted so many minion memes people started to think they were funny"
                ),
            }),
            new LabeledSection("PROJECTS", new Item[] {
                projectWithTools(
                    "Cancer Cure",
                    "PHP, Larvel",
                        "Developed a cure for cancer using PHP and Laravel",
                        "Not been released yet because I can't think of a good LinkedIn post title"
                ),
                project(
                    "Tic-Tac-Toe Game",
                    "Wrote a Tic-Tac-Toe game with Pygame and Python because my buddy said it would get me into quant",
                    "It didn't"
                ),
                project(
                    "Yes Unix Command Rust Rewrite",
                    "Rewrote the classic yes unix command into Rust (the only moral programming language) allowing blazingly fast performance with memory safety and fearless concurrency",
                    "Increased GitHub README emojis by 132%"
                ),
                project(
                    "ChatGPT Wrapper",
                    "Basically the same thing as every startup the past few years",
                    "Achieved 100% the performance of ChatGPT"
                )
            }),
            new LabeledSection("TECHNICAL SKILLS", new Item[] {
                new Item(new ItemElement[] {
                    new BasicText("Bench Press: 225lbs", Alignment.LEFT, Format.NORMAL),
                    new BasicText("Languages: PHP, Fortran, Python 2, Motorola 68000 Assembly, Game Maker Scripts", Alignment.LEFT, Format.NORMAL),
                    new BasicText("Developer Tools: Notepad, Haphazard Zip File Backups, _v2_final_edited.docx Versioning Scheme", Alignment.LEFT, Format.NORMAL),
                    new BasicText("Libraries: Library of Alexandria, Anna's Archive, Stealth Private Library", Alignment.LEFT, Format.NORMAL),
                })
            })
        }).write(new File("my-resume.pdf"));
    }
    
    static Item project(String name, String... bullets) {
        var ieArr = new ItemElement[bullets.length + 2];
        ieArr[0] = new BasicText(name, Alignment.LEFT, Format.BOLD);
        ieArr[1] = new Padding(1f);
        for (int i = 0; i < bullets.length; i++) {
            ieArr[i + 2] = new BulletPoint(bullets[i]);
        }
        return new Item(ieArr);
    }

    static Item projectWithTools(String name, String tools, String... bullets) {
        var ieArr = new ItemElement[bullets.length + 2];
        ieArr[0] = new JakeStyleProjectText(name, tools);
        ieArr[1] = new Padding(1f);
        for (int i = 0; i < bullets.length; i++) {
            ieArr[i + 2] = new BulletPoint(bullets[i]);
        }
        return new Item(ieArr);
    }

    static Item experience(String name, String title, String date, String... bullets) {
        var ieArr = new ItemElement[bullets.length + 4];
        ieArr[0] = new BasicText(name, Alignment.LEFT, Format.BOLD);
        ieArr[1] = new BasicText(date, Alignment.RIGHT, Format.NORMAL);
        ieArr[2] = new BasicText(title, Alignment.LEFT, Format.NORMAL);
        ieArr[3] = new Padding(1f);
        for (int i = 0; i < bullets.length; i++) {
            ieArr[i + 4] = new BulletPoint(bullets[i]);
        }
        return new Item(ieArr);
    }
}
