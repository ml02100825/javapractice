package Mondai13_01;

public class Teacher extends Person{
    private String subject; //  科目
    //------[ コンストラクタ ]--------
    public Teacher(String name, String job, String subject){
        super(name, job);
        this.subject =subject;
    }
    //---------------------------
    //------------------[ メソッド ]----------------------
    @Override public void introduce(){
        // 結果を出力
        System.out.println("氏名：" + getName());
        System.out.println("職業；" + getJob());
        System.out.println("科目：" + this.subject);
        System.out.println();
    //-----------------------------------------------
    }
    
}
