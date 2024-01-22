package Mondai12_01;

public class Calculator {
    int x;
    int y;
    Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int calcSum(){
        int sum = x + y;
        return sum;
    }
    public int calcAve(){
        int sum = calcSum();
        int ave = sum / 2;
        return ave;
    }
}
