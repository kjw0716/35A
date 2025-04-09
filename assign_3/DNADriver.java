//assignment 3 progammed by Jackie Wang email:junkaiwang0716@gmail.com
public class DNADriver {
    public static void main(String[] args) {
        String[] testStrands = {
            "AGCCTAGGATCAG",
            "AGCCTAGGATCTAGGATCAG",
            "AGCCTATAGGATCAG",
            "AAAGCCTAGGATAGGATCAG",
            "AAAGCCTCTGAGGATAGGATCAG"
        };

        for (String strand : testStrands) {
            System.out.println("DNA strand: " + strand);
            DNA dna = new DNA(strand);
            dna.print();
            dna.highestMolarMass();
            dna.totalDensity();
            System.out.println("================================");
        }
    }
}
/*
DNA strand: AGCCTAGGATCAG
=== DNA Strands ===
Index 0: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 1: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 2: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 3: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 4: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 5: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 6: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 7: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 8: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 9: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 10: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 11: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 12: LtoRHelix: Guanine | RtoLHelix: Cytosine
Highest Molar Mass in LtoRHelix: 151.13 g/mol at indices [1, 6, 7, 12]
Highest Molar Mass in RtoLHelix: 151.13 g/mol at indices [2, 3, 10]
Total Density of both strands: 44.0 g/cm3
================================
DNA strand: AGCCTAGGATCTAGGATCAG
=== DNA Strands ===
Index 0: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 1: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 2: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 3: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 4: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 5: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 6: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 7: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 8: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 9: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 10: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 11: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 12: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 13: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 14: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 15: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 16: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 17: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 18: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 19: LtoRHelix: Guanine | RtoLHelix: Cytosine
Highest Molar Mass in LtoRHelix: 151.13 g/mol at indices [1, 6, 7, 13, 14, 19]
Highest Molar Mass in RtoLHelix: 151.13 g/mol at indices [2, 3, 10, 17]
Total Density of both strands: 66.899994 g/cm3
================================
DNA strand: AGCCTATAGGATCAG
=== DNA Strands ===
Index 0: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 1: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 2: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 3: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 4: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 5: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 6: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 7: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 8: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 9: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 10: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 11: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 12: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 13: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 14: LtoRHelix: Guanine | RtoLHelix: Cytosine
Highest Molar Mass in LtoRHelix: 151.13 g/mol at indices [1, 8, 9, 14]
Highest Molar Mass in RtoLHelix: 151.13 g/mol at indices [2, 3, 12]
Total Density of both strands: 49.659996 g/cm3
================================
DNA strand: AAAGCCTAGGATAGGATCAG
=== DNA Strands ===
Index 0: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 1: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 2: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 3: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 4: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 5: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 6: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 7: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 8: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 9: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 10: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 11: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 12: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 13: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 14: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 15: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 16: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 17: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 18: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 19: LtoRHelix: Guanine | RtoLHelix: Cytosine
Highest Molar Mass in LtoRHelix: 151.13 g/mol at indices [3, 8, 9, 13, 14, 19]
Highest Molar Mass in RtoLHelix: 151.13 g/mol at indices [4, 5, 17]
Total Density of both strands: 65.869995 g/cm3
================================
DNA strand: AAAGCCTCTGAGGATAGGATCAG
=== DNA Strands ===
Index 0: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 1: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 2: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 3: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 4: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 5: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 6: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 7: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 8: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 9: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 10: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 11: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 12: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 13: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 14: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 15: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 16: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 17: LtoRHelix: Guanine | RtoLHelix: Cytosine
Index 18: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 19: LtoRHelix: Thymine | RtoLHelix: Adenine
Index 20: LtoRHelix: Cytosine | RtoLHelix: Guanine
Index 21: LtoRHelix: Adenine | RtoLHelix: Thymine
Index 22: LtoRHelix: Guanine | RtoLHelix: Cytosine
Highest Molar Mass in LtoRHelix: 151.13 g/mol at indices [3, 9, 11, 12, 16, 17, 22]
Highest Molar Mass in RtoLHelix: 151.13 g/mol at indices [4, 5, 7, 20]
Total Density of both strands: 76.42 g/cm3
 */