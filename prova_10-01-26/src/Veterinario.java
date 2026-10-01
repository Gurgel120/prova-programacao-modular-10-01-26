public class Veterinario{
    private String nome;
    private String cpf;
    private String especialidade;
    private String telefone;
    private Sala sala;
    public String getNome() {
        return nome;
    }
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public Veterinario(String nome,String cpf,String especialidade,String telefone){
        this.nome= nome;
        this.cpf = cpf;
        this.especialidade=especialidade;
        this.telefone = telefone;
        this.sala=null;
    }
    public void associarVeterinarioSala(Sala sala){
        setSala(sala);
        sala.adicionarVeterinarioResponsavel(this);
    }
    public void removerVeterinarioSala(){
        sala.setVeterinarioResponsavel(null);
        setSala(null);
    }

}