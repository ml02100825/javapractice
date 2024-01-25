package Mondai13_03;


public class Teacher implements Person {
    private String name;        //　名前
    private String job;         // 職業
    private String subject;     //　科目
    //--------[ コンストラクタ ]----------  
    Teacher(String name, String job, String subject){
        this.name = name;       // 名前
        this.job = job;         // 職業
        this.subject = subject; // 科目
    }
    //-----------------------------------
    //-------[ メソッド ]----------
    // オーバーライド　結果を出力するメソッド
    @Override public void introduce() {
        System.out.println("氏名：" + this.name);
        System.out.println("職種：" + this.job);
        System.out.println("担当科目：" + this.subject);
    }
    //---------------------------
}
