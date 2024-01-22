package Mondai13_01;

public class Cook extends Person{
    String specialites;
    Cook(String name, String job, String specialites){
        super(name, job);
        this.specialites = specialites;
    }
    @Override public void introduce(){
        System.out.println("氏名：" + name);
        System.out.println("職業；" + job);
        System.out.println("科目：" + specialites);
        System.out.println();
    }
}
