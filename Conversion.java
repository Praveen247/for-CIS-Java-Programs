import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter a number which you want to convert to meters");
        double num=sc.nextDouble();
        double converted=num*0.0254;
        System.out.println("Number which is converted in meters:" +converted);
    }
}