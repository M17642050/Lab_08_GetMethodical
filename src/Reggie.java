import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reggie{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in,"Enter your Social Security Number: ","^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(in,"Enter your M number: ","^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in,"Enter your menu choice as 'O'/'o' to Open, 'S'/'s' to Save, 'V'/'v' to View, or 'Q'/'q' to Quit: ","^[OoSsVvQq]$");
        System.out.println("\nYour Social Security Number: "+ssn+"\nYour M number: "+mNumber+"\nYour menu choice: "+menuChoice);
    }
}