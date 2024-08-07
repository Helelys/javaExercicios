import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        /*
        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.


        System.out.println("Escreva o primeiro número: ");
        int a = teclado.nextInt();

        System.out.println("Escreva o segundo número: ");
        int b = teclado.nextInt();

        System.out.println("A soma dos dois é: " + (a + b));
         */ //Soma

        /* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159

        double pi = 3.14159;
        System.out.println("Digite o valor que deseja calcular desse círculo: ");
        double circulo = teclado.nextDouble();

        double area = pi * (circulo*circulo);

        System.out.printf("O valor do seu círculo com 4 casas decimais é %.4f", area);
         */ //Área de um círculo com 4 casas decimais

        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)


        System.out.println("Digite o primeiro valor: ");
        int a = teclado.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = teclado.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int c = teclado.nextInt();
        System.out.println("Digite o quarto valor: ");
        int d = teclado.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.println("A diferença deles é: " + diferenca);

         */ //Diferença entre quatro números

        /* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.

        System.out.println("Qual número do funcionário: ");
        int numeroDoFuncionario = teclado.nextInt();
        System.out.println("Quantas horas trabalhadas nessa semana?");
        double horasTrabalhadas = teclado.nextDouble();
        System.out.println("Quanto você recebe por hora?");
        double salarioPorHora = teclado.nextDouble();

        double salarioFinal = salarioPorHora * horasTrabalhadas;

        System.out.printf("O funcionário de número %s recebe em salário o valor de: %.2f", numeroDoFuncionario, salarioFinal);

         */ //Calculando quanto o funcionário ganhará no fim da semana

        /* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        System.out.println("Primeira peça, qual número dela? ");
        int numeroPecaUm = teclado.nextInt();
        System.out.println("Quantas dela você pegará? ");
        int quantidadePecaUm = teclado.nextInt();
        System.out.println("Quanto ela custa? ");
        double valorPecaUm = teclado.nextDouble();

        System.out.println("Segunda peça, qual número dela? ");
        int numeroPecaDois = teclado.nextInt();
        System.out.println("Quantas dela você pegará? ");
        int quantidadePecaDois = teclado.nextInt();
        System.out.println("Quanto ela custa? ");
        double valorPecaDois = teclado.nextDouble();

        double valorPecasUm = valorPecaUm * quantidadePecaUm;
        double valorPecasDois = valorPecaDois * quantidadePecaDois;

        double valorTotal = valorPecasUm + valorPecasDois;

        System.out.printf("Valor total a pagar: %.2f", valorTotal);

         */ //O programa para ler a quantidade de peças compradas, o ID e o valor

        /* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.

        System.out.println("Digite o primeiro número: ");
        double A = teclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        double B = teclado.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double C = teclado.nextDouble();

        double triangulo = (A * C) / 2;
        double pi = 3.14159;
        double areaDoCirculo = pi * (C * C);
        double areaDoTrapezio = ((A + B) * C) / 2;
        double areaDoQuadrado = B * B;
        double areaDoRetangulo = A * B;

        System.out.printf("A área do triângulo retângulo que tem A por base C e por altura é: %.3f%n", triangulo);
        System.out.printf("A área do círculo de raio C é: %.3f%n", areaDoCirculo);
        System.out.printf("A área do Trapézio é de %.3f%n", areaDoTrapezio);
        System.out.printf("A área do quadrado é: %.3f%n", areaDoQuadrado);
        System.out.printf("A área do retângulo é: %.3f%n", areaDoRetangulo);

         */ //Calcular áreas

        teclado.close();

        }
}