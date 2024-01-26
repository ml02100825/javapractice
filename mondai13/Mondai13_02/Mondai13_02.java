package Mondai13_02;
import java.util.Scanner;
public class Mondai13_02 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        //------------------[　簿記学校生の情報入力　]------------
        System.out.print("簿記学校生の名前を入力してください：");
        String bokiname = stdIn.nextLine();
        System.out.print(bokiname + "さんの学生番号を入力してください：");
        String bokino = stdIn.nextLine();
        System.out.print(bokiname + "さんの学校名を入力してください");
        String bokischool = stdIn.nextLine();
        System.out.print(bokiname + " さんの会計学の得点を入力してください：");
        int accouting = stdIn.nextInt();
        System.out.print(bokiname +"さんのビジネスの得点を入力してください：");
        int business = stdIn.nextInt();
        System.out.println();
        //------------------------------------------------------
        //--------[　IT学生の情報入力 ]---------
        System.out.print("情報学校生の名前を入力してください：");
        String itname = stdIn.next();
        System.out.print(itname + "さんの学生番号を入力してください：");
        String itno = stdIn.next();
        System.out.print(itname + "さんの学校名を入力してください");
        String itschool = stdIn.next();
        System.out.print(itname + " さんのhtmlの得点を入力してください：");
        int html = stdIn.nextInt();
        System.out.print(bokiname +"さんのjavaScriptの得点を入力してください：");
        int javaScript = stdIn.nextInt();
        System.out.print(itname + "さんのjavaの得点を入力してください：");
        int java = stdIn.nextInt();
        //------------------------------------
        // BookKeepingStudentのインスタンスを生成
        BookKeepingStudent bookkeeping = new BookKeepingStudent(bokiname, bokino, bokischool, accouting, business);
        // ITStudentのインスタンスを生成
        ITStudent itstudent = new ITStudent(itname, itno, itschool, html, javaScript, java);
        
        // bookaveに簿記学校生の平均点を代入
        double bookave = bookkeeping.calcAve();
        // itaveにIT学生の平均点を代入
        double itave = itstudent.calcAve();

        //  結果を出力
        System.out.println(bokischool + "の学生番号"+ bokino +" "+ bokiname + "さんの平均点は" + (Math.floor(bookave * 10)/10)+ "です。");
        System.out.println(itschool + "の学生番号" + itno + " " + itname + "さんの平均点は" + (Math.floor(itave * 10)/10) + "です。");
    }
}
