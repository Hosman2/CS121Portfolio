import javax.swing.*;


public class Triangles {
    public static void main(String[] args) {
        int length1 = Integer.parseInt(JOptionPane.showInputDialog("What is the first length?"));
        int length2 = Integer.parseInt(JOptionPane.showInputDialog("What is the second length?"));
        int length3 = Integer.parseInt(JOptionPane.showInputDialog("What is the third length?"));


        if (length1 != length2 && length2 != length3 && length1 != length3){
            JOptionPane.showMessageDialog(null, "Scalene Triangle");
        }else if(length1 == length2 && length2 == length3 && length1 == length3){
            JOptionPane.showMessageDialog(null, "Equilateral Triangle");
        }else if(length1 == length2 || length2 == length3 || length1 == length3){
            JOptionPane.showMessageDialog(null, "Isosceles Triangle");
        }
        else{
            JOptionPane.showMessageDialog(null,"invalid");
        }
    }

}
