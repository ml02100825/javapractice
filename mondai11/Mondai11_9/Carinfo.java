package Mondai11_9;

import java.util.ArrayList;

public class Carinfo {
    String carname;
    String makername;
    int price;
    ArrayList<String> al = new ArrayList<String>();
    public Carinfo(String carname, String makername, int price) {
        this.carname = carname;
        this.makername = makername;
        this.price = price;
    }
    public void storing(){
        al.add(carname); al.add(makername); 
        Integer integerprice = Integer.valueOf(price);
        String strprice = integerprice.toString();
        al.add(strprice);
    }
    public ArrayList<String> ret(){
        return al;
    }
    public void serch(String keyword){
        if(keyword == carname || keyword == makername)
            System.out.println("価格：" + price);
        else{
            System.out.println("検索条件を変えてください。");
        }
    }
    
}
