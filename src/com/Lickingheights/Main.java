
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        // write your code here
        //Make 8 commits
        //Make 6 Methods
        //1.that doesn't return anything and prints "Hello World"(Done)
        //2.returns "hello" with whatever they type (Done)
        //3.Multiples two given numbers and returns the results (Done)
        //4.Divide two given numbers and returns a double (done)
        //5.Finds the max number (double) between two values and returns it
        //6.Switch the order of two words and return it (Done)


        printGreetings("World");
        int a = 14;
        int b = 7;
        System.out.println(multiplication(a, b));
        System.out.println(divison(a, b));
        printWordFlip("Hello");
        double c = 3;
        double d = 100;
        System.out.println(max(c, d));
        printName("Hello ");
        Scanner keyboard;
    }



        public static void printGreetings (String noun){

            System.out.println("Hello " + noun);


        }
        public static int multiplication ( int firstNumber, int secondNumber){

            int answer = firstNumber * secondNumber;

            return answer;


        }

        public static int divison ( int thirdNumber, int fourthNumber){

            int answer = thirdNumber / fourthNumber;

            return answer;

        }
        public static void printWordFlip (String flip){

        System.out.println("World " +flip);


        }
        public static boolean max (double fifthNumber, double sixthNumber) {

            boolean answer = fifthNumber < sixthNumber;

            return answer;



        }

        public static void printName (String userName) {
        Scanner keyboard;
        System.out.println("Whats your name?");
        userName =  keyboard.nextLine();

        System.out.println("Hello "+userName+);




        }





}
