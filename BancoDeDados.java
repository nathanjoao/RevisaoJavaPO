import java.util.ArrayList;

public class BancoDeDados {
    private static ArrayList<Forma> formas = new ArrayList<>();

    static void addItem(Forma forma){
        BancoDeDados.formas.add(forma);
    }

    public static void ListarItem(){
        System.out.println(formas);
    }

    public static ArrayList<Forma> getFormas(){
        return formas;
    }

    public static void setFormas(ArrayList<Forma> formas) {
        BancoDeDados.formas = formas;
    }
}
