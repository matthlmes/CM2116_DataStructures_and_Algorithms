import java.util.Random;

public class Lab1_Implementation{
    public static void main(String arg[]){
  
        //Create random number
        Random rand = new Random();
        int n = rand.nextInt(10);

        // Run algorithm question methods
        Algo1(n);
  
    }


    public static int Algo1(int n){
        int total = 1;
        for (int i = 1; i< n; i++){
            total *= i;
        }
        return total;
    }
  }