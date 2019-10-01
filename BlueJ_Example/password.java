import java.util.Scanner;

class password {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Password Here: ");
        
        String ans=sc.nextLine();

        if("dragon".equals(ans)){

            System.out.println("C o r r e c t ! ");

        } else {
            System.out.println("Password Incorrect");
        }

    
    }
}
