package Mondai11_5;

public class Person {
    private String name;
    private int age;
    private String gender;
    private double  height;
    private double weight;
    Person(String name, int age, String gender, double height, double weight){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }  
    public void disp_info(){
        System.out.println("名前："+ name+ "年齢：" + age + "性別：" + gender + "身長：" + height + "体重：" + weight);

    }
    public double get_bmi(){
        double m = (height /100) * (height /100 );
        double bmi = (weight / m) ;
        return bmi;

    }
    public String get_obestily(){
        double bmi = get_bmi();
        String degrees = null;
        if (bmi >= 40)
            degrees = "肥満（4度）";
        else if (bmi >= 35)
            degrees = "肥満（3度）";
        else if (bmi >= 30)
            degrees = "肥満（2度）";
        else if (bmi >=25)
            degrees = "肥満（1度）";
        else if (bmi >= 18.5)
            degrees = "普通体重";

        else
            degrees = "低体重（やせ型）";
        return degrees;


    }
    public double get_suitable_weight(){
        double suitable = (height /100) * (height /100) * 22;
        return suitable;
    }
}
