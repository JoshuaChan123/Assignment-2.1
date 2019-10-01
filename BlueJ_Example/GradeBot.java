import java.util.Scanner;

class GradeBot {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double outof = 0;
        double score = 0;
        double percent = 0;

        System.out.print("Out of ");
        outof = sc.nextDouble();
        
        System.out.print("Your mark ");
        score = sc.nextDouble();
        
        percent = (score / outof)*100;
        
        System.out.println("Percent:" + percent);
     
            
            if (percent >= 86) {
                System.out.println("Letter Grade: A");
            } else if (percent >= 73) {
                System.out.println("Letter Grade: B");                
            } else if (percent >= 67) {
                System.out.println("Letter Grade: C+");
            } else if (percent >= 60) {
                System.out.println("Letter Grade: C");
            } else if (percent >= 50) {
                System.out.println("Letter Grade: C-");                
            } else {
                System.out.println("Unlucky");
            }

        }
    }
