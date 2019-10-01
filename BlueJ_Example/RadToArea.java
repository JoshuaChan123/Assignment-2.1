import java.util.Scanner;

class RadToArea {
    
    public static void main (String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Radius To Area" );
        System.out.println("_____________________");
        
        System.out.println("R: ");
        int r = sc.nextInt();
        
        Double a = (Math.PI)*Math.pow(r,2);
        System.out.println("A:"+a);
        
    }

}