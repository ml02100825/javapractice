
public class Calculation {
    private int x;
    private int y;
    Calculation(int x, int y){
        this.x = x;
        this.y = y;
    }
   
    public int getsum(){
        int sum = 0;
        for(int i =x; i <= y; i++){
  
            sum += i;
        }
        return sum;
    }
            
        }

