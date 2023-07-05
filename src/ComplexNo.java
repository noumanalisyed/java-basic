public class ComplexNo {

    private int realPart;
    private int imgPart;

    public ComplexNo(){
        realPart = 0;
        imgPart = 0;
    }
    public ComplexNo(int realPart,int imgPart){
        this.imgPart = imgPart;
        this.realPart = realPart;
    }
    public void print(){
        System.out.println("( "+realPart+" + "+imgPart+" i )");
    }
}
