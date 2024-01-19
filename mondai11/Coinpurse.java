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
                Integer value = coins.get(5);
                value += 1;
                coins.replace(5, value);
            }
            if (add == 2){
                Integer value = coins.get(10);
                value += 1;
                coins.replace(10, value);
            }
            if (add == 3){
                Integer value = coins.get(50);
                value += 1;
                coins.replace(50, value);
            }
            if (add == 4){
                Integer value = coins.get(100);
                value += 1;
                coins.replace(100, value);
            }
            if (add == 5){
                Integer value = coins.get(500);
                value += 1;
                coins.replace(500, value);
            }
        }
    public int getCount(){
        int size = coins.size();
        for(int i = 0; i < size; i++)
            
    }
    }    
}
