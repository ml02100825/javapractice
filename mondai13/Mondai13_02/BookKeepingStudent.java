package Mondai13_02;

public class BookKeepingStudent extends BasicStudent{
    int accouting;
    int business;
    BookKeepingStudent(String name, String no, String schoolname, int accouting, int business){
        super(name, no, schoolname);
        this.accouting = accouting;
        this.business = business;
        
    }
    @Override
    public double calcAve(){
        double ave = ((double)this.accouting + (double)this.business) /2;
        return ave;
    }
}
