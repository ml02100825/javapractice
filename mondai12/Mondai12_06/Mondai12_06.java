package Mondai12_06;

public class Mondai12_06 {
    public static void main(String[] args) {
        PaperBook book1 = new PaperBook("吾輩は猫である", "夏目漱石", 850, 245);
        book1.dispinfo();
        PaperBook book2 = new PaperBook("ノルウェイの森", "村上春樹", 1200, 328);
        book2.dispinfo();
        EBook book3 = new EBook("Python 入門", "Python.org", 2400, 9824);
        book3.dispinfo();
        EBook book4 = new EBook("Web技術の仕組み", "www.org", 4530, 12458);
        book4.dispinfo();
        int totalnumber = book4.gatCounter() -1;
        System.out.println("与えた識別番号 ＝" + totalnumber);

        
    }
}
