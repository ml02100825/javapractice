
public class Calculation {
    private static int x=100;
    private static int y=200;
   
    public int getsum(){
        int sum = 0;
        for(int i =x; i <= y; i++){
  
            sum += i;
        }
        return sum;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
            
        }

