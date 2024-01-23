package Mondai13_02;

public abstract class BasicStudent {
    // --------[　プロパティ　]-------------
    String name;        // 名前;
    String no;          // 学生番号
    String schoolname;  // 学校名
    // ------------------------------------

    //----------[　コンストラクタ　]------
    BasicStudent(String name, String no, String schoolname){
        this.name = name;
        this.no = no;
        this.schoolname = schoolname;
    }
    //-----------------------------------

    //-----[メソッド]---------
    public abstract double calcAve();
   //------------------------ 
}


