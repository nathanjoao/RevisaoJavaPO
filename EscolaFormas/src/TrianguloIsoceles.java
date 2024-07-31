public class TrianguloIsoceles extends Triangulo{

    private float ladoDiferente;
    private float comprimento;
    private float ladoIgual;

    public TrianguloIsoceles(float area, float perimetro, float lado1, float lado2, float lado3, float ladoDiferente,
                             float comprimento, float ladoIgual){
        super(area, perimetro, lado1, lado2, lado3);
        this.ladoDiferente = ladoDiferente;
        this.comprimento = comprimento;
        this.ladoIgual = ladoIgual;
        this.calcularPerimetro(perimetro);
        this.calcularArea(area);
    }

    @Override
    public String toString() {
        return "Triangulo Isoceles {" +
                "Lado diferente: " + ladoDiferente +
                "Lado Igual: " + ladoIgual +
                "Comprimento: " + comprimento +
                super.toString() + "\n}";
    }

    void defLado(){
        if(super.getLado1() == super.getLado2() && super.getLado1() != super.getLado3()){
            this.ladoDiferente = super.getLado3();
            this.ladoIgual = super.getLado1();
        }
        else if(super.getLado1() == super.getLado3() && super.getLado1() != super.getLado2()){
            this.ladoDiferente = super.getLado2();
            this.ladoIgual = super.getLado1();
        }
        else if(super.getLado3() == super.getLado2() && super.getLado3() != super.getLado1()){
            this.ladoDiferente = super.getLado1();
            this.ladoIgual = super.getLado3();
        }

    }

    public void CalcularComprimento(float comprimento){
        this.comprimento = (float) Math.sqrt(Math.pow(ladoIgual, 2) - (Math.pow(ladoDiferente, 2) / 4));
    }

    public float getLadoDiferente() {
        return ladoDiferente;
    }
    public void setLadoDiferente(float ladoDiferente) {
        this.ladoDiferente = ladoDiferente;
    }

    public float getComprimento() {
        return comprimento;
    }
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLadoIgual() {
        return ladoIgual;
    }
    public void setLadoIgual(float ladoIgual) {
        this.ladoIgual = ladoIgual;
    }


}
