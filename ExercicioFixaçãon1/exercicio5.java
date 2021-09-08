
/**
 Escreva que verifique a validade de uma senha fornecida pelo usuário.A senha válida é o número 1234.Devem
 ser impressas as sequintes mensagens:
 ACESSO PERMITIDO caso a senha seja válida.
 ACESSO NEGADO caso a senha seja inválida.
 */

import java.util.Scanner;


public class exercicio5{

    public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    
    String usuário;
    int senha;
    
    System.out.println("Informe o seu usuário");
    usário = read.nextLine();
    
    if(usuário.equals("Gustavo")){
    System.out.println("Digite sua senha");
    senha = read.nextInt();
    
    if((senha == 1234)){
    System.out.println("ACESSO PERMITIDO");
    } else{
    System.out.println("ACESSO NEGADO");

} else {
    System.out.println("Usuário não encontrado");
    }
    }
    
    }
}
