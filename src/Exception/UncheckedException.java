package Exception;

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
// Falta realizar o tratamento da divisão
public class UncheckedException {
    public static void main(String[] args) {
        boolean flag = true;

        do {
            String a = JOptionPane.showInputDialog("Digite o Numerador");
            String b = JOptionPane.showInputDialog("Digite o Denominador");

            try {
                int resultant = divider(Integer.parseInt(a), Integer.parseInt(b));
                //System.out.println("Resultado da Divisão = " + resultant);
                JOptionPane.showMessageDialog(null, "O Resultado da divisão = " + resultant);
                flag = false;
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Não pode haver divisão " + e.getMessage());
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Informe um número Inteiro positivo ");
                //JOptionPane.showMessageDialog(null, "Informe um número Inteiro positivo - Tipo de Error " + e.getMessage());
                //e.printStackTrace();
            } finally {
                // finally não é obrigatório, apenas para exemplicar o fluxo do try catch
                System.out.println("Chegou no Finally");
            }

        } while (flag);
    }

    public static int divider(int a , int b) { return a / b; }
}

