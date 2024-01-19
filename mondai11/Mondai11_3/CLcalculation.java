public class CLcalculation {

        private int x;
        private int y;
        CLcalculation(int x, int y){
            this.x = x;
            this.y = y;
        }
        int getx(){
            return x;
        }
        int gety(){
            return y;
        }
        public int getsum(){
            int sum = 0;
            for(int i =x; i <= y; i++){
      
                sum += i;
            }
            return sum;
        }
                
            }

