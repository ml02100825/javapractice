package Mondai13_02;

public class BookKeepingStudent extends BasicStudent{
    private int accouting;  //  会計学の点数
    private int business;   //　ビジネスの点数
    //---------------[ コンストラクタ ]------------------------
    BookKeepingStudent(String name, String no, String schoolname, int accouting, int business){
        super(name, no, schoolname);    // 名前と学生番号と学校名を継承
        this.accouting = accouting;     // 会計学の点数
        this.business = business;       // ビジネスの点数
    }
    //---------------------------------------------------------
    //-----[ メソッド ]--------
    //  オーバーライド　各テストの平均点数を求めるメソッド(戻り値はdouble型)
    @Override public double calcAve(){
        //  aveに計算結果を代入
        double ave = ((double)this.accouting + (double)this.business) /2;
        // aveを返す
        return ave;
    }
    //-----------------------
}
