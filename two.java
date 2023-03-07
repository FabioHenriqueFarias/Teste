import java.util.Scanner;

public class two {

    public static boolean calculatingFibonacci(int numberInput){
        int soma = 0;
        int anterior = 0;
        int proximo = 1;

        for (int i = 1; i < 20; i++){

            if(soma == numberInput) return true;
            soma = anterior + proximo;
            anterior = proximo;
            proximo = soma;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número para calcular sequência Fibonacci: ");
        int numberInput = input.nextInt();

        if(calculatingFibonacci(numberInput)){
            System.out.println("O número está na Sequência Fibonacci");
        }else{
            System.out.println("O número não está na Sequência Fibonacci");
        }

    }
}
