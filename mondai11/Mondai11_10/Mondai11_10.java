public class Mondai11_10 {
    public static void main(String[] args) {
        
        BookInfo book1 = new BookInfo("三国志", "吉川英治", 1989);
        BookInfo book2 = new BookInfo("楊令伝", "北方謙三", 2011);
        BookInfo book3 = new BookInfo("竜馬がゆく", "司馬遼太郎", 1998);
        BookInfo book4 = new BookInfo("坊っちゃん", "夏目漱石", 1906);
        BookInfo book5 = new BookInfo("吾輩は猫である", "夏目漱石", 1905);
        System.out.println("書　  名："+book1.getbookname());
        System.out.println("著 者 名：" +book1.getwritername());
        System.out.println("出 版 年："+book1.getpublicationyear());
        System.out.println("書籍番号：" +book1.getbooknumber());
        System.out.println("書　  名："+book2.getbookname());
        System.out.println("著 者 名：" +book2.getwritername());
        System.out.println("出 版 年："+book2.getpublicationyear());
        System.out.println("書籍番号："+book2.getbooknumber());
        System.out.println("書　  名："+book3.getbookname());
        System.out.println("著 者 名：" +book3.getwritername());
        System.out.println("出 版 年："+book3.getpublicationyear());
        System.out.println("書籍番号：" +book3.booknumber);
        System.out.println("書　  名："+book4.getbookname());
        System.out.println("著 者 名：" +book4.getwritername());
        System.out.println("出 版 年："+book4.getpublicationyear());
        System.out.println("書籍番号：" +book4.booknumber);
        System.out.println("書　  名："+book5.getbookname());
        System.out.println("著 者 名：" +book5.getwritername());
        System.out.println("出 版 年："+book5.getpublicationyear());
        System.out.println("書籍番号：" +book5.booknumber);
    }
}
