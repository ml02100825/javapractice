package Mondai13_01;

public class Cook extends Person{
    private String specialites; // 得意料理
    //------[ コンストラクタ ]---------
    public Cook(String name, String job, String specialites){
        super(name, job);   //  superで抽象クラスからnameとjobを引っ張ってくる
        this.specialites = specialites; // 得意料理
    }
    //---------------------------
    //-----------------------[ メソッド ]--------------------------
    @Override public void introduce(){
        //結果を出力
        System.out.println("氏名：" + getName());
        System.out.println("職業；" + getJob());
        System.out.println("得意料理：" + this.specialites);
        System.out.println();
    }
    //--------------------------------------------------------
}
