//assignment 2 progammed by Jackie Wang email:junkaiwang0716@gmail.com
import java.util.Scanner;

public class GenoNucleicAcid{//calss for input and creating objects
    private Scanner in = new Scanner(System.in);

    public NucleicAcid input() {
        System.out.print("Enter Nucleic Acid Name: ");
        String name = in.nextLine();

        System.out.print("Enter Chemical Formula: ");
        String chemicalFormula = in.nextLine();

        System.out.print("Enter Molar Mass (g/mol): ");
        float molarMass = in.nextFloat();

        System.out.print("Enter Density (g/cm3): ");
        float density = in.nextFloat();
        in.nextLine();

        return new NucleicAcid(name, chemicalFormula, molarMass, density);
    }

    public static void main(String[] args) {//main code to execute program
        GenoNucleicAcid driver = new GenoNucleicAcid();

        //Driver:creating objects
        NucleicAcid p1 = driver.input();
        NucleicAcid p2 = driver.input();
        NucleicAcid p3 = driver.input();
        NucleicAcid p4 = driver.input();
        NucleicAcid p5 = driver.input();


        //print the object details
        p1.print();
        p2.print();
        p3.print();
        p4.print();
        p5.print();

    }
}
/*
Enter Nucleic Acid Name: Cytosine
Enter Chemical Formula: C4H5N3O
Enter Molar Mass (g/mol): 111.10
Enter Density (g/cm3): 1.55
Enter Nucleic Acid Name: Adenine
Enter Chemical Formula: C5H5N5
Enter Molar Mass (g/mol): 135.13
Enter Density (g/cm3): 1.6
Enter Nucleic Acid Name: Guanine
Enter Chemical Formula: C5H5N5O
Enter Molar Mass (g/mol): 151.13
Enter Density (g/cm3): 2.200
Enter Nucleic Acid Name: Thymine
Enter Chemical Formula: C5H6N2O2
Enter Molar Mass (g/mol): 126.115
Enter Density (g/cm3): 1.223
Enter Nucleic Acid Name: Uracil
Enter Chemical Formula: C4H4N2O2
Enter Molar Mass (g/mol): 112.08676
Enter Density (g/cm3): 1.32
Name:Cytosine
Chemical Formula:C4H5N3O
Molar Mass:111.1g/mol
Density:1.55g/cm3
--------------------------------
Name:Adenine
Chemical Formula:C5H5N5
Molar Mass:135.13g/mol
Density:1.6g/cm3
--------------------------------
Name:Guanine
Chemical Formula:C5H5N5O
Molar Mass:151.13g/mol
Density:2.2g/cm3
--------------------------------
Name:Thymine
Chemical Formula:C5H6N2O2
Molar Mass:126.115g/mol
Density:1.223g/cm3
--------------------------------
Name:Uracil
Chemical Formula:C4H4N2O2
Molar Mass:112.08676g/mol
Density:1.32g/cm3
--------------------------------
 */