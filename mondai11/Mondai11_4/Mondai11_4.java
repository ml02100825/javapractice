import java.util.*;

public class Mondai11_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(1, 0);
        map.put(5, 0);
        map.put(10, 0);
        map.put(50, 0);
        map.put(100, 0);
        map.put(500, 0);

    System.out.print("知りたいコインの種類を入力してください：");
    int ge = stdIn.nextInt();
    Coinpurse coin = new Coinpurse(ge, map);
    coin.addCoins();
    // int  count = coin.getCount();
    // System.out.println(ge + "円は" + count +"枚です。");
    int sum = coin.getAmount();
    System.out.println("総額：" + sum + "円");
    
    }
}
