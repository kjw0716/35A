# CIS 35A — Java Programming

Java coursework from De Anza College, covering object modeling, encapsulation, inheritance, polymorphism, file I/O, exceptions, serialization, and interfaces. Each assignment is a separate console program or set of exercises.

## Course context

De Anza's CIS 35A introduces Java control flow, classes and objects, inheritance, interfaces, packages, data structures, file handling, and exceptions. The assignments here put these ideas into practice with genome models, savings accounts, ships, and student-score analysis.

## Assignment guide

| Directory | Focus |
| --- | --- |
| [assign_2/](assign_2/) | Console input and object creation for human-genome and nucleic-acid data |
| [assign_2a/](assign_2a/) | A `Person` model and driver |
| [assign_3/](assign_3/) | DNA strands, complementary bases, and calculations on nucleic-acid objects |
| [assign_4/part1/](assign_4/part1/) | Savings-account balances and interest |
| [assign_4/part2/](assign_4/part2/) | A specialized savings-account subclass |
| [assign_4/exercise2/](assign_4/exercise2/) | `Ship`, `CruiseShip`, and `CargoShip` inheritance and polymorphism |
| [assign_5/](assign_5/) | Read student scores and calculate per-quiz minimum, maximum, and average |
| [assign_6/](assign_6/) | Organize score analysis into packages; add exceptions, serialization, and an interface-based API |

Assignments include sample output and text diagrams where available.

## Requirements

A Java Development Kit providing `javac` and `java`. No Maven, Gradle, or third-party libraries are required for the commands below. Assignment 5 and Assignment 6 compiled and their documented analysis drivers ran with JDK 23.0.1 during documentation verification.

## Run Assignment 5

From the repository root:

```sh
cd assign_5
javac -encoding UTF-8 -d build Student.java Statistics.java Util.java StudentScoreAnalysis.java
java -cp build StudentScoreAnalysis
```

Run from `assign_5/` so the program can find `student_scores.txt`. It prints each student's five quiz scores followed by per-quiz statistics.

## Run Assignment 6

In a new terminal at the repository root:

```sh
cd assign_6
javac -encoding UTF-8 -d build StudentScoreAnalysis.java Driver/*.java adapter/*.java Exception/*.java statistics/*.java student/*.java util/*.java
java -cp build Driver.Driver3
```

| Entry point | Behavior |
| --- | --- |
| `StudentScoreAnalysis` | Print the score table and summary statistics |
| `Driver.Driver1` | Validate score ranges, correct invalid values, and log exceptions |
| `Driver.Driver2` | Serialize a grade-report object to `Report.ser` |
| `Driver.Driver3` | Demonstrate summary statistics and score lookup through `StudentAPI` |

Use `java -cp build` followed by the desired entry point. Run within `assign_6/` because input and output paths are relative to the working directory. Drivers may write `Logging.txt` or `Report.ser`.

## Archive notes

- Compile assignments separately: some reuse class names such as `Student`, `Statistics`, and `SavingsAccount`.
- Assignment 2's input programs reference `HumanGenome` and `NucleicAcid`, whose source files are stored under `assign_3/`. Assignment 2 is therefore not self-contained as uploaded.
- `assign_4/SavingsAccountDriver .java` has a space before its extension. Prefer the organized `part1/` and `part2/` directories when exploring those exercises.
- Existing `.class`, `.ser`, and output files are archived artifacts. Recompile the source for your local JDK rather than relying on bundled binaries.

## References and attribution

- [De Anza CIS 35A course description](https://mobile.deanza.edu/schedule/class-details.html?crn=00441&q=S&y=2025) — course background, not verification of this repository's original section.
- Project summaries and run instructions are based on the repository's Java sources. Original assignment briefs were not available in the accessible Canvas course list.
- Source headers credit Jackie Wang.
