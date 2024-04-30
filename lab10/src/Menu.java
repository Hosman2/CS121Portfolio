import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Pokedex pokedex = new Pokedex();




    public void displayMenu(){
        boolean keepGoing = true;
        while(keepGoing) {
            System.out.println("********* MENU *********\nPlease make a selection\n1) Add a Pokemon\n2) Remove a Pokemon\n3) Display Pokemon Info\n4) Display All Pokemon Info\n5) Exit");
            String userInput;
            userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                createPokemon();
            }else if(userInput.equals("2")) {
                deletePokemon();
            }else if(userInput.equals("3")){
                displayPokemon();
            }else if (userInput.equals("4")){
                displayAllPokemon();
            }else if (userInput.equals("5")){
                System.out.println("Exiting........");
                break;
            }else{
                System.out.println("Invalid Entry");
            }


        }}
    private void createPokemon(){
        boolean keepGoing = true;
        Pokemon pokemon;
        Move move;

        System.out.println("Enter the name of the Pokemon: ");
        String name = scanner.nextLine();
        System.out.println("Enter the HP of the Pokemon: ");
        int hp = Integer.parseInt(scanner.nextLine());
        pokemon  = new Pokemon(name,hp);
        pokedex.addPokemon(pokemon);
        while(keepGoing) {
            System.out.println("Enter a Move name or press q if finished: ");
            String moveName = scanner.nextLine();
            if (moveName.equals( "q")){
                    break;
                }else {
                    System.out.println("Enter the moves power: ");
                    int power = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the moves speed: ");
                    int speed = Integer.parseInt(scanner.nextLine());
                    move = new Move(moveName,power,speed);
                    pokemon.addMove(move);
                }
                pokedex.addPokemon(pokemon);
                System.out.printf("%s has been added\n", name);

            }

        }

    private void deletePokemon(){
        String name;
        Pokemon pokemon;
        System.out.println("Name of Pokemon you want to delete: ");
        name = scanner.nextLine();
        pokemon = pokedex.getPokemon(name);
        if (pokemon == null){
            System.out.println("Pokemon is not found");
        }else{
            pokedex.removePokemon(pokemon);
            System.out.printf("%s has been removed\n", name);

        }
    }
    private void displayPokemon(){

        String name;
        Pokemon pokemon;
        System.out.println("Enter the name to see info: ");
        name = scanner.nextLine();
        pokemon = pokedex.getPokemon(name);
        if (pokemon == null){
            System.out.println("Pokemon not found");
        }else{
            System.out.println(pokemon.toString());
        }
    }
    private void displayAllPokemon(){
        ArrayList<Pokemon> pokemonArrayList = pokedex.getPokemonArrayList();
        for (int i = 0; i < pokemonArrayList.size(); i++){
            System.out.printf("%d. %s\n", i + 1, pokemonArrayList.get(i));
        }
    }
}


