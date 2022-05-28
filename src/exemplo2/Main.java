package exemplo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senha;
        System.out.println("Insira uma senha: ");
        senha = scan.next();

        while(!senha.equals("1234")){
            System.out.println("Sua senha está errada, digite novamente");

            System.out.println("Insira uma senha: ");
            senha = scan.next();
        }

        System.out.println("Você acertou a senha!");

    }
}
