public class Mondai9_6 {
    static void sum(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum = sum + a[i];
            System.out.println("合計値："+ sum);
    }    
    public static void main(String[] args) {
        int[] li= {4, 10, 59, 679, 1991, 3994, 6789, 19324};
        sum(li);    

    }
}
