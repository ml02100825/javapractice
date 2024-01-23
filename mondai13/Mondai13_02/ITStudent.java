package Mondai13_02;

public class ITStudent extends BasicStudent{
    int html;
    int javaScript;
    int java;
    ITStudent(String name, String no, String schoolname,  int html, int javaScript, int java){
        super(name, no, schoolname);
        this.html = html;
        this.java = java;
        this.javaScript = javaScript;
    }
    @Override
    public double calcAve() {
        double ave = ((double)this.html + (double)this.java + (double)this.javaScript) / 3;
        return ave;
        
    }
}
