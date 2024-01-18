import java.util.*;
public class Mondai11_7 {
    public static void main(String[] args) {
        
        Student a= new Student("aさん", "001", 89, 65, 88);
        Student b= new Student("bさん", "002", 80, 95, 64);
        Student c = new Student("cさん", "003", 70, 80, 98);

        System.out.println(a.getStudentnumber()+ "番 "+ a.getName() + " 平均点 " + (Math.floor(a.getAvarage() * 1000)/1000));
        System.out.println(b.getStudentnumber()+ "番 "+ b.getName() + " 平均点 " + (Math.floor(b.getAvarage() * 1000)/1000));
        System.out.println(c.getStudentnumber()+ "番 " + c.getName()+ " 平均点" + (Math.floor(c.getAvarage() * 1000)/1000));
    }
    
}
