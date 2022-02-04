package Exception;

import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console.
public class CheckedException {

        public static void main(String[] args)  {
            String nomeDoArquivo = "romances-blake-crouch.txt";

            try {
                imprimirArquivoNoConsole(nomeDoArquivo);
            } catch (FileNotFoundException e){ // tratamento específico para o FileReader
                JOptionPane.showMessageDialog(null, "Infome o arquivo correto: " +
                        e.getMessage());
            }
            catch (IOException e) {
                JOptionPane.showMessageDialog(null,
                        "Erro inesperado - " +
                                //e.getMessage());
                                e.getCause()); // Caso não encontre o arquivo, retorna null
                e.printStackTrace();
            }

            //System.out.println("Apesar da exception ou não, o programa continua...");
        }

        public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
            File file = new File(nomeDoArquivo);

            BufferedReader br = new BufferedReader(new FileReader(file.getName()));
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do{
                bw.write(line);
                bw.newLine();
                line=br.readLine();
            } while(line != null);
            bw.flush();
            br.close();
        }

}
