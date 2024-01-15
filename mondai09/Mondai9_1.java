import java.util.Scanner;
class Mnodai9_1{
    static void name(String school, String myname){
        System.out.println("学校名：" + school);
        System.out.println("名前：" + myname);
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String school = stdIn.next();
        String myname = stdIn.next();
        name(school, myname);
        stdIn.close();
    }
}