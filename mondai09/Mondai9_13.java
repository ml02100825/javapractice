import java.util.*;
public class Mondai9_13 {
    static void sort(int[] li){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < li.length; i++ ){
            if(li[i] % 2 == 1)
            list.add(li[i]);
        
            
        }
        System.out.println(list);



    }
    public static void main(String[] args) {
        int [] hairetu = {4, 9, 24, 45, 69, 22, 44, 51, 90, 78};
        sort(hairetu);
    }
    
}
