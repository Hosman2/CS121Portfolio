import javax.swing.*;

public class GuessingGame {
    public static void main(String[] args){
        int counter = 0;
        int correctNum = 43;
        while(true){
            String input2 = JOptionPane.showInputDialog("Enter a number between 1 and 100.");
            counter++;

            if(input2 == null || input2.equalsIgnoreCase("q")){
                JOptionPane.showMessageDialog(null, "You pressed quit");
                break;
            }else{
                int input = Integer.parseInt(input2);
                if(input ==correctNum){
                    JOptionPane.showMessageDialog(null, "You guessed correct!\nNumber of guesses" + counter);
                    break;
                }else if(input > correctNum){
                    JOptionPane.showMessageDialog(null, "You guessed too high.\nNumber of guesses" + counter);

                }else if(input < correctNum){
                    JOptionPane.showMessageDialog(null, "You guessed too low.\nNumber of guessed" + counter);
                }
            }

        }
    }
}
