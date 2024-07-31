public class Pet {

    private static int geradorCodigo = 0;
    private int codigo;
    private String nome;
    private boolean vivo;
    private boolean acordado;
    private int sede = 0;
    private int fome = 0;
    private int energia = 0;
    private int diversao = 0;
    private int higiene = 0;
    private int vontadeBanheiro = 0;

    public Pet(String nome){
        this.codigo = geradorCodigo++;
        this.nome = nome;
    }
    public void beberAgua(){
        sede = sede + 50;
        vontadeBanheiro = vontadeBanheiro -25;
        if (vontadeBanheiro == 0){
            higiene = 0;
            vontadeBanheiro = 100;
        }
    }

    // public void comer(Alimento alimento){}

    public void dormir(){
        energia = energia + 25;
    }

    public void acordar(){
        energia = energia + 25;
    }

    // public void brincar(Brincadeira brincadeira){}

    public void limpar(){
        higiene = higiene + 75;
    }

    public void fazerNecessidades(){
        vontadeBanheiro = vontadeBanheiro + 100;
        higiene = higiene - 25;
    }

    public void morrer(){
        if(sede == 0 || fome == 0 || energia == 0){
            vivo = false;
        }
    }

    @Override
    public String toString() {
        return "\nPet{" +
                "\nCódigo: " + codigo +
                "\nNome" + nome +
                "\nVivo" + vivo +
                "\nAcordado: " + acordado +
                "\nSede: " + sede +
                "\nFome: " + fome +
                "\nEnergia: " + energia +
                "\nDiversao: " + diversao +
                "\nHigiene: " + higiene +
                "\nVontade banheiro: " + vontadeBanheiro +
                "}";
    }
}
