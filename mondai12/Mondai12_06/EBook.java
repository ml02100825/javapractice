package Mondai12_06;

public class EBook extends Book{
    int fileSize;
    EBook(String title, String auther, int price, int fileSize){
        super(title, auther, price);
        this.fileSize = fileSize;
    }
    public void dispinfo(){
        int count = gatCounter(); 
        System.out.println("書名：" + title);
        System.out.println("著者名：" + auther);
        System.out.println("価格：" + price+ "円");
        System.out.println("識別番号：" + count);
        System.out.println("ファイルサイズ：" + fileSize+ "KB");
        System.out.println();
    }
    
}
