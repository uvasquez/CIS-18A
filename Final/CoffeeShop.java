import java.util.Scanner;

class Snacks{
    float price;
    String name;
    String[] types =  {"Cookies","Bread","Protein Bars","Chips","Brownie"};


    Snacks(){
        price = 0.99f; //makes all snacks worth the same
    }

}
class Coffee {
    float price;
    String[] roast = {"Light", "Medium", "Dark"};
    boolean Sweet;
    boolean cold;

    Coffee() { 
        price = 2.99f;//makes all coffee worth the same
    }
}
class Tea {
    float price;
    String name;
    String[] strands = {"Green","Hibiscus","Apple","Cinnamon"};
    Tea() { 
        price = 1.99f;//makes all tea worth the same
    }
}


class CoffeeShop
{
            static String menu (int a){
                if (a == 1)
                {
                Coffee coffee = new Coffee();
                for (int i = 0; i < coffee.roast.length; i++)
                {
                    System.out.println(coffee.roast[i]);
                    System.out.println("Which coffe would you like?");
                    int choice = Integer.parseInt(sc.nextLine());
                    return coffee.roast[choce];

                }
                }
                if (a == 2)
                { 
                Snacks snacks = new Snacks();
                for (int i = 0; i < snacks.types.length; i++)
                {
                    System.out.println(""); 
                }
                
                }
                if (a == 3)
                {
                Tea tea = new Tea();
                }

              
            }

            public static void main (String args[]) throws java.io.IOException {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Bean Roasting Operation!");
            System.out.println("1.Order \n2.Quit");

            boolean ordering = true;
            String[] coffee = new coffee

            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1)
            {
                        System.out.println("1.Snacks \n2.Coffee\n3.Tea");
            }
            else if (choice == 2){
            ordering = false;
            System.out.println("Exited");//skips loop ending program
            }
            while (ordering == true)
            {
            int menuChoice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    menu(choice);
                    System.out.println("Which coffee would you like ?");
                    int coffeeChoice = Integer.parseInt(sc.nextLine());

                break;
                case 2:
                System.out.println("Goodbye.");
                break;

                default:
                System.out.println("See you around");
            }
            }
            
        }
}
