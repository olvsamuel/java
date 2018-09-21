package calculadora;
import javax.swing.JOptionPane;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        byte op = 0;

        float a = 0,b  = 0, c = 0, d = 0;
        
        do {
            if(d == 0){                
                a = Float.parseFloat(JOptionPane.showInputDialog("Primeiro número: "));
            }

            String opp = JOptionPane.showInputDialog("1 - Somar (+)\n2 - Subtrair (-)\n3 - Multiplicar (x)\n4 - Dividir(:)\n5 - Exibir Resultado Final\n0 - Encerrar");
            
            if(opp.equalsIgnoreCase("+") || opp.equalsIgnoreCase("1")){
                op = 1;
            }else if(opp.equalsIgnoreCase("-") || opp.equalsIgnoreCase("2")){
                op = 2;
            }else if(opp.equalsIgnoreCase("x") || opp.equalsIgnoreCase("3")){
                op = 3;
            }else if(opp.equalsIgnoreCase(":") || opp.equalsIgnoreCase("4")){
                op = 4;
            }else if(opp.equalsIgnoreCase("=") || opp.equalsIgnoreCase("5")){
                op = 5;
            }else if(opp.equalsIgnoreCase("0")){
                op = 0;
            }else{
                JOptionPane.showMessageDialog(null, "Erro!");
                break;
            }

            switch (op) {
                case 1:
                    b = Float.parseFloat(JOptionPane.showInputDialog("Digite o número: "));
                    
                    if (d == 0) {
                        c = a + b;
                        d = 1;
                    } else {
                        c = c + b;
                    }
                    JOptionPane.showMessageDialog(null, "Resultado: " + c);
                    break;

                case 2:

                    b = Float.parseFloat(JOptionPane.showInputDialog("Digite o número: "));
                    if (d == 0) {
                        c = a - b;
                        d = 1;
                    } else {
                        c = c - b;
                    }
                    JOptionPane.showMessageDialog(null, "Resultado: " + c);

                    break;
                    
                case 3:
                    b = Float.parseFloat(JOptionPane.showInputDialog("Digite o número: "));
                    if (d == 0) {
                        c = a * b;
                        d = 1;
                    } else {
                        c = c * b;
                    }
                    JOptionPane.showMessageDialog(null, "Resultado: " + c);
                    break;
                    
                case 4:
                    b = Float.parseFloat(JOptionPane.showInputDialog("Digite o número: "));
                    if (d == 0) {
                        c = a / b;
                        d = 1;
                    } else {
                        c = c / b;
                    }
                    JOptionPane.showMessageDialog(null, "Resultado: " + c);
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Resultado Final: " + c);
                    break;
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "Calculadora encerrada.");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (op != 0);

    }

}