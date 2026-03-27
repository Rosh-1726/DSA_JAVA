import java.util.*;
public class Perimeter {

    public static void main (String args[]){
    System.out.println("Enter 4 side of rectangle");

    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    float b= sc.nextFloat();
    float c= sc.nextFloat();
    float d= sc.nextFloat();

    float peri = a+b+c+d;

    System.out.println("Permeter is : "+peri);

}
}
