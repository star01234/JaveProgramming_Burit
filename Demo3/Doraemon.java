import javax.swing.JOptionPane;

public class Doraemon {
    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog(null, "Hello, whe are you?",
         "Doraemon",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your name is " +data);

        String me = JOptionPane.showInputDialog(null, "Hello, whe are you?" + me,
         "Doraemon",JOptionPane.QUESTION_MESSAGE);
    }
}
