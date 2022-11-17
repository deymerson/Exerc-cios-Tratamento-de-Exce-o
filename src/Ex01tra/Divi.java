package Ex01tra;
import javax.swing.JOptionPane;
    public class Divi {
    public static void main(String[] args) throws Exception {
        int numA = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro numero"));
        int numB = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo numero"));

        Divisao divisao = new Divisao();

        try {
            JOptionPane.showMessageDialog(null, divisao.calcula(numA, numB));
        } catch (ArithmeticException e1) {
            JOptionPane.showMessageDialog(null, "Não pode dividir por zero!");
        }
    }
}