package Mondai13_01;

 public abstract class Person {
    String name;
    String job;
    Person(String name, String job){
        this.name = name;
        this.job = job;
    }
    abstract void introduce();
}
