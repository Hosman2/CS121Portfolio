import javax.swing.*;

public class JOptionPaneRectangle {
    public static void main(String[] args) {
        String name;

        name = JOptionPane.showInputDialog("Enter In Name");
        int num = Integer.parseInt(JOptionPane.showInputDialog("enter the width of the rectangle"));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

        int area = (num * num2);

        int perimeter = (2 * num) + (2 * num2);

        JOptionPane.showMessageDialog(null, "Area: " + area + "\nPerimeter: " + perimeter);
        JOptionPane.showMessageDialog(null, String.format("Area: %d\nPerimeter: %d", area, perimeter));
    }
}
