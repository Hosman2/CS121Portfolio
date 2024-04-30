import javax.swing.*;

public class WordGame {
    public static void main(String[] args) {
        String name, city, college, major, animal, petName;

        name = JOptionPane.showInputDialog("What is your name?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        city = JOptionPane.showInputDialog("What city are you from?");
        college = JOptionPane.showInputDialog("What college do you go to?");
        major = JOptionPane.showInputDialog("What is your major?");
        animal = JOptionPane.showInputDialog("Name an animal");
        petName = JOptionPane.showInputDialog("What's you pets name?");


        String story = String.format("\nThere was once a person name %s who lived in %s.\nAt the age of %d, %s went to college at %s.\n %s graduated with a major in %s. Then, %s adopted a %s named %s.\n They both lived happily ever after!", name, city, age, name, college, name, major, name, animal, petName);

        JOptionPane.showMessageDialog(null, story);
    }
}
