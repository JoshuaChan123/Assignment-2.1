import java.util.Scanner;

class Example {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pythagorean Theorem Calculator" );
        System.out.println("_____________________");
        System.out.println("");
        System.out.println("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        
        Double c = Math.sqrt( a*a + b*b );
        System.out.println("C:"+c);
    }
     
    
}
   