public class Pessoa {

    private long cpf;
    private String nome;
    private String senha;
    private Pet pet;

    public Pessoa(long cpf, String senha, String nome){
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public long getCpf() {
        return cpf;
    }

    public void botaPetParaDormir(){
        
    }
}
