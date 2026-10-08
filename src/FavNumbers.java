import java.util.Scanner;
public class FavNumbers{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int favInt = SafeInput.getInt(in,"Enter your favorite integer: ");
        double favDouble = SafeInput.getDouble(in,"Enter your favorite decimal value: ");
        System.out.println("Your favorite integer and decimal are "+favInt+" and "+favDouble+", respectively.");
    }
}