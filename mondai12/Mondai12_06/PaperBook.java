package Mondai12_06;

public class PaperBook extends Book{
    int page;
    PaperBook(String title, String auther, int price, int page){
        super(title, auther, price);
        this.page = page;
    }
    @Override public void dispinfo(){
        int count = gatCounter(); 
        System.out.println("書名：" + this.title);
        System.out.println("著者名：" + this.auther);
        System.out.println("価格：" + this.price + "円");
        System.out.println("識別番号：" + count );
        System.out.println("ページ数：" + this.page + "ページ");
        System.out.println();
    }
    
}
