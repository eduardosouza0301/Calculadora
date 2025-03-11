package secao11;

import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Resgatando números
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Resgatando operações
        System.out.println("Escolha a operação: ");
        System.out.println("1) Adição (+)");
        System.out.println("2) Subtração (-)");
        System.out.println("3) Multiplicação (*)");
        System.out.println("4) Divisão (/)");

	// Realizando o cálculo

        int operacao = scanner.nextInt();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = adicionar(num1, num2);
                break;

            case 2:
                resultado = subtrair(num1, num2);
                break;

            case 3:
                resultado = multiplicar(num1, num2);
                break;

            case 4:
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                } else {
                    System.out.println("Operação por zero não permitida!");
                    scanner.close();
                    return;
                }
                break;

            default:
                System.out.println("Operação inválida!");
                scanner.close();
                return;
        }

        // Exibição do resultado
        System.out.println("O resultado da operação é: " + resultado);

        // Fechando o scanner
        scanner.close();
    }

    // Funções para cálculos
    public static double adicionar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}