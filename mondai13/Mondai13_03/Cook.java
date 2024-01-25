package Mondai13_03;

public class Cook implements Person{
    private String name;        // 名前
    private String job;         // 職業
    private String specialies;  // 得意料理
    //---------[ コンストラクタ ]-------------
    Cook(String name, String job, String specialies){
        this.name = name;               // 名前
        this.job = job;                 // 職業
        this.specialies = specialies;   //  得意料理
    }
    //----------------------------------
    //---[ メソッド ]---
    //  オーバーライド  結果を出力
    @Override public void introduce(){
        System.out.println("氏名："+ this.name);
        System.out.println("職種：" + this.job);
        System.out.println("得意料理：" + this.specialies);
    }
    //------------------    
}
