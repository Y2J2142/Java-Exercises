import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Wektory{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] w1String = scanner.nextLine().split(" ");
        List<Integer> w1 = new ArrayList<>();
        for(int i = 0; i < w1String.length; i++){
            try{
                w1.add(Integer.parseInt(w1String[i]));
            }catch(NumberFormatException e ) {}
        }

        String[] w2String = scanner.nextLine().split(" ");
        List<Integer> w2 = new ArrayList<>();
        for(int i = 0; i < w2String.length; i++){
            try{
                w2.add(Integer.parseInt(w1String[i]));
            }catch(NumberFormatException e ) {}
        }
        scanner.close();
        try{
            if(w1.size() != w2.size()){
                throw new SizeMismatchException(w1.size(), w2.size());
            }
            else{
                List<Integer> wynik = new ArrayList<>();
                for(int i = 0; i < w1.size(); i++){
                    wynik.add(i, new Integer(w1.get(i) + w2.get(i)));
                }
                for(Integer i : wynik)
                    System.out.print(i + " ");
                System.out.println();
            } 

        

        }catch(SizeMismatchException e) {e.printStackTrace();}


    }

}

