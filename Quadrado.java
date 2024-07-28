public class Quadrado extends Forma{

    private float lado1;

    public Quadrado(float area, float perimetro, float lado1){
        super(area, perimetro);
        this.lado1 = lado1;
        this.calcularArea(area);
        this.calcularPerimetro(perimetro);
    }

    public float getLado1() {
        return lado1;
    }

    public boolean setLado1(float lado1) {
        if (lado1 > 0){
            this.lado1 = lado1;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public float calcularArea(float area){
        return lado1 * lado1;
    }
    public float calcularPerimetro(float perimetro){
        return lado1 * 4;
    }

    @Override
    public String toString() {
        return "\nQuadrado{ "+
                "\n"+super.toString()+
                "\nLado 1: "+lado1+
                "\nLado 2: "+lado1+
                "\nLado 3: "+lado1+
                "\nLado 4: "+lado1+
                "\n}";
    }
}