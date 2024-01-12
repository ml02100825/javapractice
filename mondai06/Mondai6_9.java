public class Mondai6_9 {
  
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--){
            if (i % 2 == 1)
                System.out.println(i + "の段");
                for ( int j = 9; j >= 1; j --)
                    if (i % 2 == 1)
                        System.out.println(i + "×"+ j+"=" + i * j);
            }
        }
        }
