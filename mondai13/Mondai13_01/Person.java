package Mondai13_01;

 public abstract class Person {
    String name;    // 名前
    String job;     // 職業
    //------------[ コンストラクタ ]--------------
    Person(String name, String job){
        this.name = name;   // 名前
        this.job = job;     // 職業
    }
    //---------------------------------------
    //-------[ メソッド ]---------
    //  抽象メソッドを作成
    abstract void introduce();
    //-----------------------
}
