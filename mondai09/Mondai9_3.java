public class Mondai9_3 {
    static void hello(String str, int num){
        for(int i = 0; i < num; i++)
            System.out.println(str);
    }
    public static void main(String[] args) {
        String hello = "Hello";
        String morning = "Good morning";
        String evening = "Good evening";
        int num1 = 3;
        int num2 = 4;
        int num3 = 2;
        hello(hello, num1);
        hello(morning, num2);
        hello(evening, num3);
    }
    
}
