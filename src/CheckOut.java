import java.util.Scanner;
public class CheckOut{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double totalPrice = 0;
        boolean loop = true;
        do {
            boolean userChoice = SafeInput.getYNConfirm(in,"Do you have an item to purchase?[Y/n]: ");
            if(userChoice){
                double itemPrice = SafeInput.getRangedDouble(in,"Enter the price of the item: ",0.5,10);
                totalPrice += itemPrice;
            }
            else{
                loop = false;
            }
        }
        while(loop);
        System.out.printf("The total price for all your item(s): $%.2f",totalPrice);
    }
}