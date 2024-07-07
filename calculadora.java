import javax.swing.JOptionPane;
public class calculadora{
    //Calculadora das quatro operações primárias

    public static void main(String[] args) {
        
        double numero1;
        double numero2;
        String operacao;
        double resultado = 0;
        

        numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro número:"));
        

       operacao = JOptionPane.showInputDialog(null, "Insira o sinal da operação (+, -, * ou /)");

        numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo número:"));
        
       
        switch(operacao) {
            case "+":
            resultado = numero1 + numero2;
            break;
            case "-":
            resultado = numero1 - numero2;
            break;
            case "/": if(numero2 !=0) {
            resultado = numero1 / numero2;} else {JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida!");
            return;
        } // Não existe divisão por zero.
            break;
            case "*":
            resultado = numero1 * numero2;
            break;
            default:
            JOptionPane.showMessageDialog(null, "Por favor, insira uma operação válida.");
        } 
        JOptionPane.showMessageDialog(null, "Resultado: " + numero1 + " " + operacao + " " + numero2 + " = " + resultado);
    }
}    