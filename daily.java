
import java.util.Scanner;


class event{
    public int id;
    public String d;



    public event(int id,String d) {
        this.id = id;
        this.d = d;
    }


}




public class Main {
    public static void main(String[] args) {

        int i = 0;

        event[] myArray = new event[100];

        System.out.printf("Hello and welcome!");


        Scanner myObj = new Scanner(System.in);


        while (true) {

            System.out.println("what your want to do? 1 - add, 2 - show all, 3 - close");

            int num0 = myObj.nextInt();


            switch (num0) {
                case 1:


                    System.out.println("Enter day of the month (int)(1-31) ");
                    int num1 = myObj.nextInt();
                    //int num1 = 5;
                    System.out.println("Enter month (int)(1-12)");
                    int num2 = myObj.nextInt();
                    //System.out.println("Enter number 3");
                    int num3 = 2025;

                    System.out.println("Enter begin time ");
                    int num4 = myObj.nextInt();

                    System.out.println("Enter ending time ");
                    int num5 = myObj.nextInt();

                    String ev = num4 + ":00-" + num5 + ":00 - " + num1 + "." + num2 + "." + num3;

                    

                    Object ev1 = new event(1, ev);

                    myArray[i] = (event) ev1;
                    i++;
                    System.out.println("Added!");

                    break;
                case 2:
                    


                    for (int a = 0; a < i; a++) {
                        System.out.println(myArray[a].d);
                    }
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }




        }






    }
