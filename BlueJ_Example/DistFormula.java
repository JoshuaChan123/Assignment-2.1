import java.util.Scanner;
    class DistFormula{


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Distance Calculator" );
        System.out.println("_____________________");
        
        System.out.println("x: ");
        int x1 = sc.nextInt();
        
        System.out.print("y: ");
        int y1 = sc.nextInt();
        
        System.out.println("x: ");
        int x2 = sc.nextInt();
        
        System.out.print("y: ");
        int y2 = sc.nextInt();
        
        double a = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        
        System.out.println("A:"+a);
        

    }


}
