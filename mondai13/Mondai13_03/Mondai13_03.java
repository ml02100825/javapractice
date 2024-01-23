package Mondai13_03;

public class Mondai13_03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");
        teacher.introduce();
        System.out.println();
        cook.introduce();
    }
    
}

