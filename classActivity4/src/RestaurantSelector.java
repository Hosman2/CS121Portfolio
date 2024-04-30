import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String vegetarian, vegan, gluten;

        System.out.println("Is there anyone in your party that is vegetarian?");
        //.toUpperCase
        //.toLowerCase()
        vegetarian = scanner.nextLine().toLowerCase();
        System.out.println("Is there anyone in your party that is vegan?");
        vegan = scanner.nextLine().toLowerCase();
        System.out.println("Is there anyone in your party that is gluten-free?");
        gluten = scanner.nextLine().toLowerCase();
        //&& = and, || = or

        if(vegetarian.equals("no") && (vegan.equals("no") && (gluten.equals("no")))){
            System.out.println("Your restaurant is Joe's GourmetBurgers");

        }else if(vegetarian.equals("yes") && (vegan.equals("no") && (gluten.equals("yes")))){
            System.out.println("Your restaurant is Main Street Pizza Company");

        }else if(vegetarian.equals("yes") && (vegan.equals("yes") && (gluten.equals("yes")))){
            System.out.println(("Your restaurant is Corner Cafe"));

        }else if (vegetarian.equals("yes") && (vegan.equals("no") && (gluten.equals("no")))){
            System.out.println("Your restaurant is Mamas Fine Italian");


        }else {
            System.out.println("Your restaurant is The Chefs Kitchen");
        }



        }


    }



