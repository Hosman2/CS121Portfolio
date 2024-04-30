import javax.swing.*;
public class Login {
    public static void main(String[] args) {
        String userName = "Iamcool";
        String password = "1234";
        String name, pw;

        name =JOptionPane.showInputDialog("What is your user name?");

        pw = JOptionPane.showInputDialog("What is your password");

        if(name.equals(userName) && (pw.equals(password))){
            JOptionPane.showMessageDialog(null,"Welcome to CS121!");

        }else if (!name.equals(userName)  && pw.equals(password)){
            JOptionPane.showMessageDialog(null, "User Name is wrong.");

        }else if (!pw.equals(password) && name.equals(userName)){
            JOptionPane.showMessageDialog(null, "Password is wrong.");

        }else{
            JOptionPane.showMessageDialog(null, "Both are incorrect");
        }
    }
}
