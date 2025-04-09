public class HumanGenome{
    private String genomeName;
    private int genesNum;
    private int chromNum;
    private int cellNum;


    public HumanGenome(String genomeName, int genesNum, int chromNum,int cellNum) {
        this.genesNum = genesNum;
        this.genomeName = genomeName;
        this.chromNum = chromNum;
        this.cellNum = cellNum;
    }

    public void setGenomeName(String genomeName){
        this.genomeName = genomeName;
    }

    public String getGenomeName(){
        return genomeName;
    }

    public void setGenesNum(int genesNum){
        this.genesNum = genesNum;
    }

    public int getGenesNum(){
        return genesNum;
    }

    public void setChromNum(int chromNum){
        this.chromNum = chromNum;
    }

    public int getchromNum(){
        return chromNum;
    }

    public void setCellNum(int cellNum){
        this.cellNum = cellNum;
    }

    public int getCellNum(){
        return cellNum;
    }

    public void print(){
        System.out.printf("Genome Name: %s%n", genomeName);
        System.out.printf("Number of Genes in Genome: %d%n", genesNum);
        System.out.printf("Number of Chromosomes: %d%n", chromNum);
        System.out.printf("Number of Cells: %d Trillion%n", cellNum);
        System.out.println("--------------");
    }

}