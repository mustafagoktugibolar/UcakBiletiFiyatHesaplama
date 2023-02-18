import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        String welcome = "Welcome to the ticket generator! \n"
        +"Enter the necessary infos and creat your ticket!\n"
        +"To start the process press 1\n"
        +"To leave press q";


        System.out.println(welcome);
        System.out.print("Entrence : ");
        String entrence = sc.nextLine();

        while(true){

            if(entrence.equals("q")){
                System.out.println("Leaving...");
                Thread.sleep(3000);
                break;
            }
            else if(entrence.equals("1")){

                System.out.println("Starting the process...");
                Passenger pass1 = new Passenger();
                Thread.sleep(3000);

                System.out.print("Enter Your Age : ");
                pass1.checkAge(sc.nextInt());//pass1.setAge(sc.nextInt()); 
                Thread.sleep(1500);
                
                System.out.print("Enter The Distance : ");
                pass1.checkDistance(sc.nextInt());//pass1.setDistance(sc.nextInt());
                sc.nextLine();
                Thread.sleep(1500);

                System.out.print("Do you want twoWay ticket ? (yes or no) : ");
                pass1.checkTwoWay(sc.nextLine());
                sc.close();
                System.out.println("Calculating...");
                Thread.sleep(3000);

                System.out.println("Total Price is : " + Passenger.price + " TL");
                break;
                
            }
            else{
                System.out.println("Unvalid process!");
            }
        }
    }
}
