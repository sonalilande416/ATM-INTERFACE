import java.util.Scanner;

public class AtmEx {

    private static int status;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance = 10000, deposit, withdraw;

        while (true) {
            System.out.println("choose 1 for deposit :");
            System.out.println("choose 2 for deposit :");
            System.out.println("choose 3 for deposit :");
            System.out.println("choose 4 for deposit :");
            System.out.println("choose correct operation to perform :");

            int choice = sc.nextInt();

        switch (choice) {
    case 1:
          System.out.println("Enter amount you want to deposit:");
          deposit = sc. nextInt();

       balance = balance + deposit;
          System.out.println("your updated balance is :"+balance);  
          System.out.println(); 
          break;
    
    case 2:
          System.out.println("Enter amount you want to deposit:");
          withdraw = sc. nextInt();   
          if(balance >= withdraw){
        balance = balance - withdraw;
           System.out.println("your uodated balance is :"+balance);
          } else {
            System.out.println("insufficiant funds...!");
          }
            System.out.println();
        break;
        
     case 3:
          System.out.println("your account balance is:"+balance);
          System.out.println(); 
          break;  

     case 4:
        System.exit(0);
       
        }             
        }
     }
}