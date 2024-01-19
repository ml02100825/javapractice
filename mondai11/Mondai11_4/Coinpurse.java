import java.util.*;
public class Coinpurse {
    private int x;
    private Map<Integer, Integer> coins;
    Coinpurse(int x, Map<Integer, Integer> coins){
        this.x = x;
        this.coins = coins;
    }


    public void addCoins(){
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            int add = rand.nextInt(6);
            if (add == 0){
                Integer value = coins.get(1);
                value += 1;
                coins.replace(1, value);
            }
            if (add == 1){
                Integer value1 = coins.get(5);
                value1 += 1;
                coins.replace(5, value1);
            }
            if (add == 2){
                Integer value2 = coins.get(10);
                value2 += 1;
                coins.replace(10, value2);
            }
            if (add == 3){
                Integer value3 = coins.get(50);
                value3 += 1;
                coins.replace(50, value3);
            }
            if (add == 4){
                Integer value4 = coins.get(100);
                value4 += 1;
                coins.replace(100, value4);
            }
            if (add == 5){
                Integer value5 = coins.get(500);
                value5 += 1;
                coins.replace(500, value5);
            }

        }
        for(Integer key: coins.keySet()){
            Integer value =coins.get(key);
            if (key == 500)
                System.out.println(key + "円:" + value + "枚 ");
            else
                System.out.print(key + "円:" + value + "枚 ");
        }
    }
    public Integer getCount(){
         if (coins.containsKey(x) == true){
         Integer value = coins.get(x);
         return value;
         }
         else{
            return 0;
         }
    }
    public int getAmount(){
        int sum = 0;
        for(Integer key: coins.keySet()){
            Integer value =coins.get(key);
            sum += key * value;
        }
        return sum;
    }
}

