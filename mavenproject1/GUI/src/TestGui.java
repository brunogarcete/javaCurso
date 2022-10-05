import javax.swing.JOptionPane;

public class TestGui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null, "Hola "+name);
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad "));
        JOptionPane.showMessageDialog(null, "Tu edad actual es : "+edad);
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso"));
                JOptionPane.showMessageDialog(null, "tu peso es : "+ peso);
    }   
}
