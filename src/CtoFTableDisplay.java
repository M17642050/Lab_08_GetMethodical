public class CtoFTableDisplay{
    public static void main(String[]args){
        System.out.printf("| %7s | %7s |\n","C","F");
        for(double i=-100;i<=100;i++){
            double result = CtoFTableDisplay.CtoF(i);
            System.out.printf("| %7.2f | %7.2f |\n",i,result);
        }
    }
    public static double CtoF(double Celsius){
        double Fahrenheit = (Celsius*9/5)+32;
        return Fahrenheit;
    }
}