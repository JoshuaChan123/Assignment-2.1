import java.util.Scanner;
class magicball {

public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Magic 8 ball");

        System.out.println("Ask me a question");
        sc.nextLine();
        double a = Math.random()*20+1;
        int b = (int) a;

        if (b == 1){
            System.out.println("It is certain.");
        }else if (b == 2){
            System.out.println("It is decidedly so.");
        }else if (b ==3){
            System.out.println("Without a doubt.");
        } else if (b ==4){
            System.out.println("Yes - definitely");
        }else if (b == 5){
            System.out.println("You may rely on it.");
        }else if( b == 6){
            System.out.println("As I see it, yes.");
        }else if (b ==7){
            System.out.println("Most likely.");
        }else if (b ==8){
            System.out.println("Outlook good.");
        }else if (b ==9){
            System.out.println("Yes.");
        }else if ( b ==10){
            System.out.println("Signs point to yes.");
        }else if (b ==11){
            System.out.println("Reply hazy, try again.");
        }else if (b == 12){
            System.out.println("Ask again later.");
        }else if (b == 13){
            System.out.println("Better not tell you now.");
        }else if (b ==14){
            System.out.println("Cannot predict now.");
        } else if (b ==15){
            System.out.println("Concentrate and ask again.");
        }else if (b == 16){
            System.out.println("Don't count on it.");
        }else if( b == 17){
            System.out.println("My reply is no.");
        }else if (b ==18){
            System.out.println("My sources say no.");
        }else if (b ==19){
            System.out.println("Outlook not so good.");
        }else if (b ==20){
            System.out.println("Very doubtful.");
       }
    }
}
