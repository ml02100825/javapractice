package Mondai12_02;

public class Cook extends Person{
    String specialities;
    Cook(String name, String job, String specialities){
        super(name, job);
        this.specialities = specialities;
    }
    public void introduce(){
        System.out.println("氏名：" + this.name);
        System.out.println("職業：" + this.job);
        System.out.println("得意料理：" + this.specialities);
    }
}
