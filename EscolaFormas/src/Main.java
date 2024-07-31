import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        loginProfessor();
        gerenciamento();
    }

    public static void loginProfessor(){
        Professor professor = new Professor();

        boolean tentativa = false;
        int cont = 0;

    }

    public static void gerenciamento() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--MENU PRINCIPAL--" +
                "\n1- Cadastrar quadrado " +
                "\n2- Cadastrar circulo " +
                "\n3- Cadastrar retângulo " +
                "\n4- Listar formas "+
                "\n0- Sair ");
        int x = sc.nextInt();

        switch (x) {
            case 1:
                cadastroQuadrado();
                break;

            case 2:
                cadastroCirculo();
                break;

            case 3:
                cadastroRetangulo();
                break;

            case 4:
                lisarFormas();
                break;
        }
    }

    public static void cadastroQuadrado(){
        Scanner sc = new Scanner(System.in);
        Quadrado quadrado = new Quadrado(0, 0, 0);

        do{
            System.out.println("Digite o tamanho do primeiro lado ");
        }while(!quadrado.setLado1(sc.nextFloat()));
        BancoDeDados.addItem(quadrado);
        System.out.println("--QUADRADO ADICIONADO--");

        gerenciamento();
    }

    public static void cadastroCirculo(){
        Scanner sc = new Scanner(System.in);
        Circulo circulo = new Circulo(0,0,0,0);

        do{
            System.out.println("Digite o diâmetro do círculo");
        }while (!circulo.setDiametro(sc.nextFloat()));
        BancoDeDados.addItem(circulo);
        System.out.println("--CIRCULO ADICIONADO--");

        gerenciamento();
    }
    public static void cadastroRetangulo(){
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo(0,0,0,0);

        do{
            System.out.println("Digite o tamanho do lado 1");
        }while (!retangulo.setLado1(sc.nextFloat()));
        do{
            System.out.println("Digite o tamanho do lado 2");
        }while (!retangulo.setLado2(sc.nextFloat()));
        BancoDeDados.addItem(retangulo);
        System.out.println("--RETÂNGULO ADICIONADO--");

        gerenciamento();
    }
    public static void lisarFormas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--SELECIONE QUAL FORMA VOCÊ DESEJA LISTAR-- " +
                "\n1- Listar quadrado " +
                "\n2- Listar circulo " +
                "\n3- Listar retângulo " +
                "\n4- Listar todas as formas ");
        int x = sc.nextInt();

        switch (x){
            case 1:
                listarQuadrado();
                break;

            case 2:
                listarCirculo();
                break;

            case 3:
                listarRetangulo();
                break;

            case 4:
                listarAllFormas();
                break;
        }
        gerenciamento();
    }

    public static void listarQuadrado(){
        for (Forma forma : BancoDeDados.getFormas()) {
            if (forma.getClass().getName().equals("Quadrado")) {
                System.out.println(forma.toString());
            }
        }
        gerenciamento();
    }
    public static void listarCirculo(){
        for (Forma forma : BancoDeDados.getFormas()){
            if (forma.getClass().getName().equals("Circulo")){
                System.out.println(forma.toString());
            }
        }
        gerenciamento();
    }
    public static void listarRetangulo(){
        for (Forma forma : BancoDeDados.getFormas()){
            if (forma.getClass().getName().equals("Retangulo")){
                System.out.println(forma.toString());
            }
        }
        gerenciamento();
    }
    public static void listarAllFormas(){
        BancoDeDados.ListarItem();

        gerenciamento();
    }


}