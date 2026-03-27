import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the princle amount , rate of intereset and year ");
        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int year = sc.nextInt();

        float si= (principle * rate * year);
        System.out.println("Simple Interset is : "+si);
    }
}
