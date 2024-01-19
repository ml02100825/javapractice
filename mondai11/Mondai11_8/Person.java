package Mondai11_8;

public class Person {
    private String name;
    private int age;
    private String liveadress;
    private String mailadress;
    Person(String name, int age, String liveadress, String mailadress){
        this.name = name;
        this.age = age;
        this.liveadress = liveadress;
        this.mailadress = mailadress;
    }
    public String check_mailadress(){
        String decision = null;
        char test = mailadress.charAt(0);
        if (mailadress.contains("@") == false || test == '@'){
            decision = "False";
            return decision;
        }
        else{
            decision ="True";
            return decision;
        }

    }
    public String check_age(){
        String decision = null;
        if (age < 0 || age > 100){
            decision ="False";
            return decision;
        }
        else{
            decision = "True";
            return decision;
        }

        
    

}
}
