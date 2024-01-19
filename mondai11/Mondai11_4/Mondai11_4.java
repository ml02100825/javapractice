import java.util.*;

public class Mondai11_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();{
        map.put(1, 0);
        map.put(10, 0);
        map.put(50, 0);
        map.put(100, 0);
        map.put(500, 0);


    }

    int ge = stdIn.nextInt();
    Coinpurse coin = new Coinpurse(ge, map);
    coin.addCoins();
    for(Integer key: map.keySet()){
        Integer value =map.get(key);
            System.out.println(key + ":" + value);


                                    }
    
    }
}
