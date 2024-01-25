
package Mondai13_01;
class Mondai13_01{
    public static void main(String[] args) {
        //  Teacherのインスタンスを生成
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");  
        // teacherのメソッドを実行
        teacher.introduce();    
        //  Cookのインスタンスを生成
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");
        //  cookのメソッドを実行
        cook.introduce();
        
    }
}