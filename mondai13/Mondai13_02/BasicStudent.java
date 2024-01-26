package Mondai13_02;

public abstract class BasicStudent {
    // --------[　プロパティ　]-------------
    private String name;        // 名前;
    private String no;          // 学生番号
    private String schoolname;  // 学校名
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


