import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class NumberGuess
{
    static void guess(){
        Random random = new Random();
        int numberToGuess = random.nextInt(101);
        int tries = 0;
        String input;
        Scanner scanner = new Scanner(System.in);
        do{
            try{
                System.out.println("Ilosc prob : " + tries);
                System.out.println("Podaj liczbe z zakresu 0 - 100");
                input = scanner.nextLine();
                int guess = Integer.parseInt(input.trim());
                if(guess == numberToGuess){
                    System.out.println("Zgadles");
                    scanner.close();
                    return;
                }
                if(guess > numberToGuess){
                    System.out.println("za duzo");
                }
                else{
                    System.out.println("za malo");
                }
                tries++;
            }catch(NumberFormatException e) {e.printStackTrace();}
            
        }while(true);



    }


    public static void main(String[] args)
    {
        guess();
    }
}

