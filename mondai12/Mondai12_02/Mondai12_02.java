package Mondai12_02;

public class Mondai12_02 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("近藤勇", "教員", "Go言語");
        Cook cook = new Cook("沖田総司", "シェフ", "オムライス");
        teacher.introduce();
        System.out.println();
        cook.introduce();
    }
}
