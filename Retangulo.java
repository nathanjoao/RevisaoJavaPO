public class Retangulo extends Forma{

    private float lado1;
    private float lado2;

    public Retangulo(float area, float perimetro, float lado1, float lado2){
        super(area, perimetro);
        this.lado1 = lado1;
        this.lado2 = lado2;
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

    public float getLado2() {
        return lado2;
    }

    public boolean setLado2(float lado2) {
        if (lado2 > 0){
            this.lado2 = lado2;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public float calcularArea(float area) {
        return lado1 * lado2;
    }

    @Override
    public float calcularPerimetro(float perimetro) {
        return 2 * (lado1 + lado2);
    }

    @Override
    public String toString() {
        return "\nRetângulo{" +
                super.toString() +
                "\nLado 1: " + lado1 +
                "\nLado 2: " + lado2 +
                "\n}";
    }
}