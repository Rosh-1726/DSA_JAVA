import java.util.*;
public class TriangleArea {
    public static void main(String[] args) 
    {
        System.out.println("Enter the Base and Height");

        Scanner sc = new Scanner(System.in);
        float base = sc.nextFloat();
        float height= sc.nextFloat();

        float area = (base * height)/2;
        System.out.println("Area: "+area);
    }
}
