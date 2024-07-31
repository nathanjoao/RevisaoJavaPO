public class TrianguloEquilatero extends Triangulo{

    public TrianguloEquilatero(float area, float perimetro, float lado1, float lado2, float lado3){
        super(area, perimetro, lado1, lado2, lado3);
        this.calcularArea(area);
        this.calcularPerimetro(perimetro);
    }

    @Override
    public float calcularArea(float area){
        return 0;
    }

    @Override
    public float calcularPerimetro(float perimetro){
        return getLado1() * 3;
    }

    @Override
    public String toString() {
        return "\nTriângulo equilátero {"+
                super.toString()+
                "\n}";
    }
}
