package Mondai15_05;
import java.util.*;
public class Mondai15_05 {
    static boolean inValid(int n){
        return n > 0;
    }
    static boolean inva(int n, int size){
        return  n < size;
    }
    static boolean decision(int [] a , int num1, int size) throws MinuxIndex, OutOfIndex{
        if (! inValid(num1)) throw new MinuxIndex();
        if (! inva(num1, size)) throw new OutOfIndex();
        if (a[num1] % 2 == 0){
        return true;}
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        try{
        int [] base_list = {1, 2, 3, 4, 5};
        System.out.println("元のリスト = " + Arrays.toString(base_list));
        System.out.print("インデックス番号 ＝ ");
        int indexnumber = stdIn.nextInt();
        int size = base_list.length;
        if(decision(base_list, indexnumber, size) == true){
            System.out.println("base_list[" + indexnumber + "] = " + base_list[indexnumber] + "は偶数です。");
        }
        else{
            System.out.println("base_list[" + indexnumber + "] = " + base_list[indexnumber] + "は偶数ではありません  。");
        }
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("インデックス番号に負の値を設定しています");
    }catch(IndexOutOfBoundsException e){
        System.out.println("領域外参照です。");
    }
    System.out.println("処理終了");
    }
}
