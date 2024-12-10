import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = 0.0, altura = 0.0, lado = 0.0, comprimento = 0.0, largura = 0.0;
        double Volume = 0.0;
        int opcao = 0;

        do {
            System.out.println("-----------------------------------------------------");
            System.out.println(" Programa: Calcular volume de figuras geométricas");
            System.out.println("-----------------------------------------------------");
            System.out.println("       1° - Volume do Cilindro              ");
            System.out.println("       2° - Volume do Cone                  ");
            System.out.println("       3° - Calcular o hexagono             ");
            System.out.println("       4° - Calcular a Esfera               ");
            System.out.println("       5° - Calcular Cubo                   ");
            System.out.println("       6° - Calcular a Pirâmide Quadrangular");
            System.out.println("       7° - Calcular o Paralelepípedo       ");
            System.out.println("       0° - Sair                            ");
            System.out.println("\n\n\n");
            System.out.println( "Escolha sua opcao:           ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(" Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println(" Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    Volume = Cilindro.calcularVolume(raio, altura);
                    System.out.printf("O volume do Cilindro é : %.2f \n", Volume);
                    break;

                case 2:
                    System.out.println("Calcular o Volume do Cone");
                    System.out.println(" Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println(" Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    Volume = Cone.calcularVolume(raio, altura);
                    System.out.printf("O volume do Cilindro é : %.2f \n", Volume);
                    break;

                case 3:
                    System.out.println("Digite o valor do lado do hexagono: ");
                    lado = sc.nextDouble();
                    System.out.println("Digite o valor da altura do hexagono: ");
                    altura = sc.nextDouble();

                    Volume = hexagono.calcularHexagono(lado,altura);
                    System.out.printf("O valor do hexagono é : %.2f \n", Volume);
                    break;

                case 4:
                    System.out.println("Digite o valor do raio da Esfera: ");
                    raio = sc.nextDouble();

                    Volume = esfera.calcularEsfera(raio)/3.0;
                    System.out.printf("O valor da esfera é : %.2f \n", Volume);
                    break;


                case 5:
                    System.out.println("Digite o valor do lado do Cubo");
                    lado = sc.nextDouble();

                    Volume = Cubo.calcularCubo(lado);
                    System.out.printf("O valor do Cubo é : %.2f \n", Volume);
                    break;

                case 6:
                    System.out.println("Digite o valor do lado da Pirâmide Quadrangular");
                    lado = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    Volume = quadrangular.calcularQuadrangular(lado,altura);
                    System.out.printf("O valor da Pirâmide é : %.2f \n", Volume);
                    break;

                case 7:
                    System.out.println("Digite o valor do comprimento do paralelepípedo:");
                    comprimento = sc.nextDouble();
                    System.out.println("Digite o valor da largura: ");
                    largura = sc.nextDouble();
                    System.out.println("Digite o valor da altura:  ");
                    altura = sc.nextDouble();

                    Volume = Paralelepípedo.calcularQuadrangular(lado,lado, altura);
                    System.out.printf("O valor do paralelepípedo é : %.2f \n", Volume);
                    


                    break;
                default:
                    System.out.println("(Programa encerrado !)");
                    break;

            }

        }while (opcao != 0);

        sc.close();
    }
}
