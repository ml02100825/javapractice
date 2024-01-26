package Mondai13_02;

public class ITStudent extends BasicStudent{
    private int html;       // htmlの点数
    private int javaScript; // javaScriptの点数
    private int java;       // javaの点数
    //-----------------------[ コンストラクタ ]--------------------------
    ITStudent(String name, String no, String schoolname,  int html, int javaScript, int java){
        super(name, no, schoolname);    // 名前と学生番号と学校名を継承
        this.html = html;               // htmlの点数
        this.java = java;               // javaの点数   
        this.javaScript = javaScript;   // javaScriptの点数
    }
    // オーバーライド　平均値を求めるメソッド(戻り値はdouble型)
    @Override public double calcAve() {
        // 計算結果をaveに代入
        double ave = ((double)this.html + (double)this.java + (double)this.javaScript) / 3;
        // aveを返す
        return ave;
        
    }
}
