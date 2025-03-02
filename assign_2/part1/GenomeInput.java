//assignment 2 progammed by Jackie Wang email:junkaiwang0716@gmail.com
import java.util.Scanner;

public class GenomeInput {//calss for input and creating objects
    Scanner in = new Scanner(System.in);

    public HumanGenome input() {
        System.out.println("Enter Genome Name: ");
        String name = in.nextLine();

        System.out.println("Enter Number of Genes in Genome: ");
        int genes = in.nextInt();

        System.out.println("Enter Number of Chromosomes: ");
        int chromosomes = in.nextInt();

        System.out.println("Enter Number of Cells: ");
        int cells = in.nextInt();
        in.nextLine(); // Consume newline

        return new HumanGenome(name, genes, chromosomes, cells);
    }

    public static void main(String[] args) {//main code to execute program
        GenomeInput driver = new GenomeInput();

        //Driver:creating objects
        HumanGenome p1 = driver.input();
        HumanGenome p2 = driver.input();
        HumanGenome p3 = driver.input();

        //print the object HumanGenome
        p1.print();
        p2.print();
        p3.print();
    }
}
/*
Enter Genome Name: 
Human Bob
Enter Number of Genes in Genome: 
20000
Enter Number of Chromosomes: 
46
Enter Number of Cells: 
76
Enter Genome Name: 
Human Sally
Enter Number of Genes in Genome: 
20000
Enter Number of Chromosomes: 
46
Enter Number of Cells: 
120
Enter Genome Name: 
Human Sri
Enter Number of Genes in Genome: 
20000
Enter Number of Chromosomes: 
46
Enter Number of Cells: 
75
Genome Name:Human Bob
Number of Genes in Genome:20000
Number of Chromosomes:46
Number of Cells:76Trillion
--------------
Genome Name:Human Sally
Number of Genes in Genome:20000
Number of Chromosomes:46
Number of Cells:120Trillion
--------------
Genome Name:Human Sri
Number of Genes in Genome:20000
Number of Chromosomes:46
Number of Cells:75Trillion
--------------
 */
