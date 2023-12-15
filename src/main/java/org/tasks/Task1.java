package org.tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {

    private Scanner sc;

    public void task1() {
        Locale.setDefault(Locale.US);
        sc = new Scanner(System.in);

        System.out.println("Lista de exerc\u00EDcios 1:");
        optionChoise();
    }

    public void optionChoise() {
        int option;


        System.out.println("\n\nEscolha a opção desejada:");
        System.out.println("1 - Somar valores");
        System.out.println("2 - Area do circulo atraves da area");
        System.out.println("3 - Diferenca entre produtos");
        System.out.println("4 - Calcular remuneracao");
        System.out.println("5 - Calcular itens");
        System.out.println("6 - Calcular area de formas geometricas");
        System.out.println("7 - Sair");
        System.out.print("Informe a opcao desejada: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                sumValues();
                break;
            case 2:
                circleAreaByRadius();
                break;
            case 3:
                productDifference();
                break;
            case 4:
                calcRemuneration();
                break;
            case 5:
                calcItens();
                break;
            case 6:
                calcGeometricObjetics();
                break;
            case 7:
                return;
            default:
                System.out.println("Opa, opcao invalida major!");
        }
        optionChoise();
    }

    public void sumValues() {
        double sum_1, sum_2, result;

        System.out.println("Opera\u00E7\u00E3o de Soma #####################\n");
        System.out.print("Informe o primeiro valor: ");
        sum_1 = sc.nextDouble();
        System.out.print("Informe o segundo valor: ");
        sum_2 = sc.nextDouble();

        result = sum_1 + sum_2;

        System.out.printf("O resultado da soma \u00E9: %f \n", result);
        System.out.print("################################################\n");
    }

    public void circleAreaByRadius() {
        double radius, result;
        double PI = 3.14159;


        System.out.println("Opera\u00E7\u00E3o para saber \u00E1rea atrav\u00E9s do raio ####\n");
        System.out.print("Informe o valor do raio: ");
        radius = sc.nextDouble();

        result = PI * Math.pow(radius, 2);

        System.out.printf("A \u00E1rea do c\u00EDrculo \u00E9: %.4f \n", result);
        System.out.print("################################################\n");
    }

    public void productDifference() {
        double a, b, c, d, diff;


        System.out.println("Opera\u00E7\u00E3o para saber produto entre 4 valores ####\n");
        System.out.print("Informe o valor de A: ");
        a = sc.nextDouble();
        System.out.print("Informe o valor de B: ");
        b = sc.nextDouble();
        System.out.print("Informe o valor de C: ");
        c = sc.nextDouble();
        System.out.print("Informe o valor de D: ");
        d = sc.nextDouble();

        diff = a * b - c * d;

        System.out.printf("A diferen\u00E7a do produto \u00E9: %.4f \n", diff);
        System.out.print("################################################\n");
    }

    public void calcRemuneration() {
        double employeeId, hoursOfWork, hourValue, salary;


        System.out.println("Opera\u00E7\u00E3o para saber o sal\u00E1rio ####\n");
        System.out.print("Informe seu n\u00FAmero de funcion\u00E1rio: ");
        employeeId = sc.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        hoursOfWork = sc.nextDouble();
        System.out.print("Informe o valor da sua hora: ");
        hourValue = sc.nextDouble();

        salary = hoursOfWork * hourValue;

        System.out.printf("NUMBER = %.0f\n", employeeId);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        System.out.print("################################################\n");
    }

    public void calcItens() {
        int codIten1, codIten2, qtdIten1, qtdIten2;
        double priceIten1, priceIten2, totalPrice;

        System.out.println("Opera\u00E7\u00E3o para saber o valor total da compra das pe\u00E7as ####\n");

        System.out.print("Informe o código da pe\u00E7a 1: ");
        codIten1 = sc.nextInt();
        System.out.print("Informe a quantidade pe\u00E7a 1: ");
        qtdIten1 = sc.nextInt();
        System.out.print("Informe o valor da pe\u00E7a 1: ");
        priceIten1 = sc.nextDouble();

        System.out.print("Informe o código da pe\u00E7a 2: ");
        codIten2 = sc.nextInt();
        System.out.print("Informe a quantidade pe\u00E7a 2: ");
        qtdIten2 = sc.nextInt();
        System.out.print("Informe o valor da pe\u00E7a 2: ");
        priceIten2 = sc.nextDouble();

        totalPrice = qtdIten1 * priceIten1 + qtdIten2 * priceIten2;

        System.out.printf("VALOR A PAGAR = %.2f\n", totalPrice);
        System.out.print("################################################\n");
    }

    public void calcGeometricObjetics() {
        double A, B, C, triangleArea, circleArea, trapezeArea, squareArea, rectangleArea;

        System.out.println("Opera\u00E7\u00E3o para saber a area das formas geometricas ####\n");
        System.out.print("Informe o valor de A: ");
        A = sc.nextDouble();
        System.out.print("Informe o valor de B: ");
        B = sc.nextDouble();
        System.out.print("Informe o valor de C: ");
        C = sc.nextDouble();

        triangleArea = .5 * A * C;
        circleArea = 3.14159 * Math.pow(C, 2);
        trapezeArea = .5 * (A + B) * C;
        squareArea = Math.pow(B, 2);
        rectangleArea = A * B;

        System.out.printf("TRIANGULO = %.3f\n", triangleArea);
        System.out.printf("CIRCULO = %.3f\n", circleArea);
        System.out.printf("TRAPEZIO = %.3f\n", trapezeArea);
        System.out.printf("QUADRADO = %.3f\n", squareArea);
        System.out.printf("RETANGULO = %.3f\n", rectangleArea);
        System.out.print("################################################\n");
    }
}
