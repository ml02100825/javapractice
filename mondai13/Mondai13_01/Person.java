package Mondai13_01;

 public abstract class Person {
    private String name;
    private String job;
    public Person(String name, String job){
        this.name =name;
        this.job = job;
    }
    //-------[ メソッド ]---------
    //  抽象メソッドを作成
    abstract void introduce();
    public String getName(){
        return this.name;
    }
    public String getJob(){
        return this.job;
    }
    //-----------------------
}
