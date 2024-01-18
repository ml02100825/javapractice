import java.util.*;
    public class Circle{
        private int radius;
        double pi =3.1415;
        Circle(int radius){
            this.radius = radius;
        }
        double circumference(){
            double pi =3.1415;
            double circumference = radius * 2 * pi;
            return circumference;
        }
        double circlearea(){
            double pi =3.1415;
            double circlearea = radius * radius * pi;
            return circlearea;
        }

    }

    