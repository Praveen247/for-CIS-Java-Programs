import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter a values of a, b, c,c d");
        int a=s.nextInt(), b=s.nextInt(), c=s.nextInt(), d=s.nextInt();
        System.out.println(" The value of a:" +a);
        System.out.println(" The value of b:" +b);
        System.out.println(" The value of c:" +c);
        System.out.println(" The value of d:" +d);
        String result = (a==b && b==c && c==d)?"Given numbers are equal": "Not equal";
        System.out.println("Result:" +result);


    }
}
