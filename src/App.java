import java.util.Scanner;
import java.util.function.IntPredicate;

public class App {
    public static void main(String[] args) throws Exception {
        
    // Exercício 1:
        int indice = 13;
        int soma = 0;
        int k = 0;

        while(k < indice) {
            k+=1;
            soma+= k;
        }
        System.out.println(soma);

    // Exercício 2:
        Scanner scanner = new Scanner(System.in); // intânciando o scanner para pegar a entrada do usuário

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt(); // informação digitada guardada

        IntPredicate verificaFibonacci = (num) -> { // criando uma expressão lambda para verificar o número passado por parâmetro
            int a = 0;
            int b = 1;

            while (b <= num) { // enquanto o valor de b for menor ou igual, continua a execução do código abaixo
                if (b == num) {
                    return true; // o número pertence à sequência de Fibonacci
                }

                int temp = a + b;
                a = b;
                b = temp;
            }

            return false; // o número não pertence à sequência de fibonacci
        };

        if (verificaFibonacci.test(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    
    // Exercicio 5
        String nome = "caio";
        String nomeInvertido = "";
    
        for(int i = nome.length() -1; i >= 0; i--) { // atribui a i o valor do tamanho da string. É necessário usar -1 porque nesse caso o .charAt considera o último caracter sendo "3"
            nomeInvertido += nome.charAt(i); // atribui o caracter da posição i
        }
        System.out.println(nomeInvertido);
    }
}
