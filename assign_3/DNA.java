
public class DNA {
    
    private NucleicAcid[] LtoRHelix;
    private NucleicAcid[] RtoLHelix;

    // Default class
    public DNA() {
        LtoRHelix = null;
        RtoLHelix = null;
    }

    // Overloaded Constructor
    public DNA(String strand) {
        LtoRHelix = new NucleicAcid[strand.length()];
        RtoLHelix = new NucleicAcid[strand.length()];

        LtoRHelixpopulate(strand);

        // Populate RtoLHelix
        for (int i = 0; i < LtoRHelix.length; i++) {
            char name = strand.charAt(i);
            if (name == 'A') {
                RtoLHelix[i] = createNucleicAcid('T');
            }
             else if (name == 'T') {
                RtoLHelix[i] = createNucleicAcid('A');
            } 
            else if (name == 'C') {
                RtoLHelix[i] = createNucleicAcid('G');
            } 
            else if (name == 'G') {
                RtoLHelix[i] = createNucleicAcid('C');
            }
        }
    }

    // Populates LtoRHelix
    public void LtoRHelixpopulate(String strand) {
        int length = strand.length();
        LtoRHelix = new NucleicAcid[length];
        for (int i = 0; i < length; i++) {
            char c = strand.charAt(i);
            LtoRHelix[i] = createNucleicAcid(c);
        }
    }

    // Creates a NucleicAcid object for a given base
    private NucleicAcid createNucleicAcid(char c) {
        switch (c) {
            case 'A':
                return new NucleicAcid("Adenine", "C5H5N5", 135.13f, 1.60f);
            case 'T':
                return new NucleicAcid("Thymine", "C5H6N2O2", 126.11f, 1.23f);
            case 'C':
                return new NucleicAcid("Cytosine", "C4H5N3O", 111.10f, 1.66f);
            case 'G':
                return new NucleicAcid("Guanine", "C5H5N5O", 151.13f, 2.20f);
            default:
                return new NucleicAcid("Unknown", "N/A", 0f, 0f);
        }
    }

    // Prints LtoRHelix nucleicacid and RtoLHelix nucleicacid
    public void print() {
        if (LtoRHelix == null || RtoLHelix == null) {
            System.out.println("DNA not initialized.");
            return;
        }
        System.out.println("=== DNA Strands ===");
        for (int i = 0; i < LtoRHelix.length; i++) {
            System.out.printf("Index %d: LtoRHelix: %s | RtoLHelix: %s%n",
                i, LtoRHelix[i].getName(), RtoLHelix[i].getName());
        }
    }

    // Finds the highest molar mass in both arrays
    public void highestMolarMass() {
        if (LtoRHelix == null || RtoLHelix == null) {
            System.out.println("No DNA");
            return;
        }
    
        float maxLtoR = -1;
        String indicesL = "";  
    
        float maxRtoL = -1;
        String indicesR = ""; 

        for (int i = 0; i < LtoRHelix.length; i++) {
            float molarMass = LtoRHelix[i].getMolarMass();
            if (molarMass > maxLtoR) {
                maxLtoR = molarMass;
                indicesL = i + "";  
            } else if (molarMass == maxLtoR) {
                indicesL += ", " + i;  // add index
            }
        }
    
        // Traverse the RtoLHelix to find the largest molarMass
        for (int i = 0; i < RtoLHelix.length; i++) {
            float molarMass = RtoLHelix[i].getMolarMass();
            if (molarMass > maxRtoL) {
                maxRtoL = molarMass;
                indicesR = i + "";  
            } else if (molarMass == maxRtoL) {
                indicesR += ", " + i;  // add index
            }
        }
    
        System.out.println("Highest Molar Mass in LtoRHelix: " + maxLtoR + " g/mol at indices [" + indicesL + "]");
        System.out.println("Highest Molar Mass in RtoLHelix: " + maxRtoL + " g/mol at indices [" + indicesR + "]");
    }
    

    // Prints the total density of all
    public void totalDensity() {
        if (LtoRHelix == null || RtoLHelix == null) {
            System.out.println("No DNA initialized.");
            return;
        }
        float total = 0;

        for (int i = 0; i < LtoRHelix.length; i++) {
            total += LtoRHelix[i].getDensity();
            total += RtoLHelix[i].getDensity();
        }
        System.out.println("Total Density of both strands: " + total + " g/cm3");
    }
}
