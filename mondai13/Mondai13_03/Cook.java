package Mondai13_03;

public class Cook implements Person{
    String name;
    String job;
    String specialies;
    Cook(String name, String job, String specialies){
        this.name = name;
        this.job = job;
        this.specialies = specialies;
    }
    @Override public void introduce(){
        System.out.println("氏名："+ name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialies);
    }
}
