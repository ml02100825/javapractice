import java.util.*;
public class Mondai8_11 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>(); // ArrayListのインスタンス化
        List<Integer> numberone = new ArrayList<Integer>(Arrays.asList(0, 99));
        List<Integer> numbertwo = new ArrayList<Integer>(Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88));
        List<Integer> numberthree = new ArrayList<Integer>(Arrays.asList(5, 10, 15, 20,25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95));
        for (int i = 0; i < 10; i ++){
            int num = rand.nextInt(100);
            list.add(num);
            
        }
        int size = list.size();
        for (int j = 0; j < size; j++){
            if (numberone.contains(list.get(j)) == true){
            System.out.println(list.get(j) + "を引きました。1等賞です！");
            }
            else if (numbertwo.contains(list.get(j)) == true){
                System.out.println(list.get(j) + "を引きました。2等賞です。");
                }
            else if (numberthree.contains(list.get(j)) == true){
                System.out.println(list.get(j) + "を引きました。3等賞です。");
                }
             else{
                System.out.println(list.get(j) + "を引きました。残念ながらハズレです。");
                }


        }
        }

}
