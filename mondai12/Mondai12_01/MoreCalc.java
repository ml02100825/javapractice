package Mondai12_01;

public class MoreCalc extends Calculator{
    MoreCalc(int x, int y){super(x, y);}
    
    public int calcPow(){
        int pow = 1;
        for (int i = 0; i < y; i++){
            pow *= x;
        }
        return pow;
    }
}
