import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(" Enter a number");
        double number=obj.nextDouble();
        double square=Math.pow(number,2);
        double cube=Math.pow(number,3);
        double fourth=Math.pow(number,4);
        System.out.println("Square of number:" +square +",Cube of number:" +cube +",Fourth power of number:" +fourth);

    }
}
