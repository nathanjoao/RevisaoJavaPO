public abstract class Forma {

    private float area;
    private float perimetro;

    public Forma(float area, float perimetro){
        this.area = area;
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "\nÁrea: "+calcularArea(area)+
                "\nPerímetro: "+calcularPerimetro(perimetro);
    }

    public abstract float calcularArea(float area);
    public abstract float calcularPerimetro(float perimetro);

}