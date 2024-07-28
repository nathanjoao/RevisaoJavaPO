public class Circulo extends Forma{

    private float diametro;
    private float π = 3.14f;
    private float raio;

    public Circulo (float area, float perimetro, float diametro, float raio){
        super(area, perimetro);
        this.diametro = diametro;
        this.raio = raio;
        this.calcularArea(area);
        this.calcularPerimetro(perimetro);
    }

    public float getDiametro() {
        return diametro;
    }

    public boolean setDiametro(float diametro) {
        if (diametro > 0){
            this.diametro = diametro;
            return true;
        }
        else{
            return false;
        }
    }

    public float valorRaio(float raio){
        return diametro/2;
    }
    @Override
    public float calcularArea(float area){
        return (float) (π * Math.pow(valorRaio(raio),2));
    }
    @Override
    public float calcularPerimetro(float perimetro){
        return π * diametro;
    }

    @Override
    public String toString() {
        return "Circulo{"+
                "\n"+super.toString()+
                "\nValor diâmetro: "+diametro+
                "\nValor raio: "+raio+
                "\n}";
    }
}