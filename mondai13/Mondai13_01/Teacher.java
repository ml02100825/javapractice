package Mondai13_01;

public class Teacher extends Person{
    String subject; //  科目
    //------[ コンストラクタ ]--------
    Teacher(String name, String job, String subject){
        super(name, job);
        this.subject =subject;
    }
    //---------------------------
    //------------------[ メソッド ]----------------------
    @Override public void introduce(){
        // 結果を出力
        System.out.println("氏名：" + this.name);
        System.out.println("職業；" + this.job);
        System.out.println("科目：" + this.subject);
        System.out.println();
    //-----------------------------------------------
    }
    
}
