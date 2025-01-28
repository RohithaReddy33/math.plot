import java.util.Scanner;
public class Powercal {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int base=scanner.nextInt();
        int power=scanner.nextInt();
        double result=Math.pow(base,power);
        System.out.println(result);
        scanner.close();
    }
}
