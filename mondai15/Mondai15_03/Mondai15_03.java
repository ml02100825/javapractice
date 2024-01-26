package Mondai15_03;
import java.util.*;
public class Mondai15_03 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
    try{    
        int [] baselist =  {1, 2, 3, 4, 5};
        System.out.println("base_list = " + Arrays.toString(baselist));
        System.out.print("インデックス番号 ＝ ");
        int indexnumber = stdIn.nextInt();
        System.out.println("base_list[" + indexnumber + "] ＝ " + baselist[indexnumber]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("領域外参照です");
        }
    System.out.println("終了");
}   
}
