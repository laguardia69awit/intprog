import java.util.Scanner;
public class BasicOperation {
	 public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
	        System.out.println("Enter x, y, z : ");
	      float x = sc.nextInt();
        float y = sc.nextFloat();		
        float z = sc.nextFloat();
        
        float s = x + y + z;
        float a = s / 3f;
        float p = x * y * z;
	        System.out.println("Sum: " + s + "\nAverage: " + a + "\nProduct: " + p);
}
	}
// short code 
