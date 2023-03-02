//import java.util.Scanner;
import javax.swing.*;
import java.lang.NullPointerException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        ValidaCPF valida = new ValidaCPF();
        //Scanner input = new Scanner(System.in);
        String cpf;

        try {
            do {
                //System.out.println("::::::::VALIDAR CPF::::::::\n");
                //System.out.print("Informe o CPF para validar: ");
                //cpf = input.nextLine();
                cpf = JOptionPane.showInputDialog("Informe o CPF: ");

                if (cpf.equals("sair")) {
                    System.out.println("\nFinalizando....");
                    break;
                }

                //System.out.println("CPF informado: " + cpf);

                if (valida.verificaEValida(cpf)) {
                    //System.out.println("\n -> CPF valido!");
                    JOptionPane.showMessageDialog(null, "O CPF é valido!",
                            "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    //System.out.println("\n -> CPF invalido!");
                    JOptionPane.showMessageDialog(null, "O CPF é invalido!",
                            "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
                }

            } while (true);

        }catch (NullPointerException e){
            System.out.println("Finalizando...");
        }catch (InputMismatchException e){
            System.out.println("Número invalido");
        }
    }
}