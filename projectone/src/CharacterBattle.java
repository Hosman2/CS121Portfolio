import java.util.Scanner;
import java.util.Random;

public class CharacterBattle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String name1 = "", name2= "", move1 = "", move2 = "";
        int hp1, hp2, power1, power2, speed1, speed2, score1 = 0, score2 =0;
        int rounds;

        System.out.println("Enter an odd number of rounds");
        rounds = scanner.nextInt();
        if (rounds % 2 ==0){
            System.out.println("Invalid input");
            System.exit(0);
        }else{
            System.out.println("Number of rounds is:" + rounds);
        }


        for(int i = 0; i < rounds; i++){
            //select character stats
            scanner.nextLine();
            System.out.println("Player 1, what is your name?");
            name1 = scanner.nextLine();
            System.out.println("Player 1, what is your HP?");
            hp1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Player 1, what is your move called?");
            move1 = scanner.nextLine();
            System.out.println("Player 1, how much damage does your move do?");
            power1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("PLayer 1, how fast is your move?");
            speed1 = scanner.nextInt();


            scanner.nextLine();
            System.out.println("Player 2, what is your name?");
            name2 = scanner.nextLine();
            System.out.println("Player 2, what is your HP?");
            hp2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Player 2, what is your move called?");
            move2 = scanner.nextLine();
            System.out.println("Player 2, how much damage does your move do?");
            power2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Player 2, how fast is your move?");
            speed2 = scanner.nextInt();

            //determine rounds winner
            //checks if player 1 is faster. If so then damage is dealt
            while(hp1 > 0 && hp2 > 0) {
                if (speed1 > speed2) {
                    hp2 = hp2 - power1;
                    System.out.printf("%s used %s and did %d damage. %s has %d HP left.\n",name1, move1, power1,name2, hp2);
                    if(hp2 <= 0){
                        score1 = score1 + 1;
                        System.out.printf("%s won the round\n",name1);
                        break;
                    }
                    System.out.printf("It's %s turn.",name2);
                    hp1 = hp1 - power2;
                    System.out.printf("%s used %s and did %d damage. %s has %d HP left.\n",name2, move2, power2,name1, hp1);
                    if(hp1 <= 0) {
                        score2 = score2 + 1;
                        System.out.printf("%s won the round\n", name2);
                        break;
                    }
                } else if (speed2 > speed1) {

                    hp1 = hp1 - power2;
                    System.out.printf("%s used %s and did %d damage. %s has %d HP left.\n",name2, move2, power2,name1, hp1);
                    if(hp1 <= 0){
                        score2 = score2 + 1;
                        System.out.printf("%s won the round\n",name2);
                        break;
                    }
                    System.out.printf("It's %s turn.",name1);
                    hp2 = hp2 - power1;
                    System.out.printf("%s used %s and did %d damage. %s has %d HP left.\n",name1, move1, power1,name2, hp2);
                    if(hp2 <= 0) {
                        score1 = score1 + 1;
                        System.out.printf("%s won the round\n",name1);
                        break;
                    }
                } else if (speed1 == speed2) {
                    int tie = rand.nextInt(2);
                    if (tie == 0) {
                        hp2 = hp2 - power1;
                        System.out.printf("%s used %s and did %d damage. %s has %d HP left.\n",name1, move1, power1, name2, hp2);
                        if(hp2 <= 0){
                            score1 = score1 + 1;
                            System.out.printf("%s won the round\n",name1);
                            break;
                        }
                        System.out.printf("It's %s turn.",name2);
                        hp1 = hp1 - power2;
                        System.out.printf("%s used %s and did %d damage. %s has %d HP left.\n",name2, move2, power2, name1, hp1);
                        if(hp1 <= 0){
                            score2 = score2 + 1;
                            System.out.printf("%s won the round\n",name2);
                            break;

                        }
                    } else {
                        hp1 = hp1 - power2;
                        System.out.printf("%s used %s and did %d damage. %s has %d HP left.\n",name2, move2, power2, name1, hp1);
                        if(hp1 <= 0){
                            score2 = score2 + 1;
                            System.out.printf("%s won the round\n",name2);
                            break;

                        }
                        System.out.printf("It's %s turn.",name1);
                        hp2 = hp2 - power1;
                        System.out.printf("%s used %s and did %d damage. %s has %d HP left.\n",name1, move1, power1, name2, hp2);
                        if(hp2 <= 0){
                            score1 = score1 + 1;
                            System.out.printf("%s won the round\n",name1);
                            break;
                        }
                    }
                } else {
                    System.out.println("Something went wrong.");
                }
            }
        }
        System.out.printf("%s won %d times and %s won %d times",name1, score1, name2, score2);

    }
}
