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

    public ComplexNo add(ComplexNo c){
        int r = this.realPart + c.realPart;
        int i = this.imgPart + c.imgPart;
        return new ComplexNo(r,i);
    }
    public ComplexNo sub(ComplexNo c){
        int r = this.realPart - c.realPart;
        int i = this.imgPart - c.imgPart;
        return new ComplexNo(r,i);
    }
}
