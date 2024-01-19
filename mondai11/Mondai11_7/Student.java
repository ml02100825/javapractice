public class Student {
    private String name;
    private String studentnumber;
    private int japanese;
    private int math;
    private int english;
    Student(String name, String studentnumber, int japanese, int math, int english){
        this.name = name;
        this.studentnumber = studentnumber;
        this.japanese = japanese;
        this.math = math;
        this.english = english;
    }
    public String getStudentnumber() {
        return studentnumber;
    }
    public String getName() {
        return name;
    }
    public double getAvarage(){
        double avarage = (japanese + math + english) /3;
        return avarage;
    }
}
