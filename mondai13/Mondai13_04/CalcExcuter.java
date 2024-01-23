package Mondai13_04;

public class CalcExcuter implements CalcAddSub, CalcMultiDiv{
    @Override public void dispAdd(int x, int y){
        int sum = x + y;
        System.out.println("足し算の結果：" + sum);
    }
    @Override public void dispSub(int x, int y){
        int sub = x - y;
        System.out.println("引き算の結果：" + sub);
    }
    @Override public void dispMulti(int x, int y){
        int multi = x * y;
        System.out.println("掛け算の結果：" + multi);
    }
    @Override public void dispDiv(int x, int y){
        int div = x / y;
        System.out.println("割り算の結果：" + div);
    }
}
