public class Main {
    public static void main(String[] args) {
        ComplexNo complexNo1 = new ComplexNo(7,4);
        complexNo1.print();
        ComplexNo complexNo2 = new ComplexNo(4,5);
        complexNo2.print();

        ComplexNo complexNo3 = complexNo1.add(complexNo2);
        complexNo3.print();
        ComplexNo complexNo4 = complexNo1.sub(complexNo2);
        complexNo4.print();
    }
}
