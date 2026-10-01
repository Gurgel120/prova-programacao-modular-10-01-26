public class Sala {
    private String numero;
    private String bloco;
    private int capacidadeMaximaAnimais;
    private String tipoSala;
    private Veterinario veterinarioResponsavel;
    
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getBloco() {
        return bloco;
    }
    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
    public int getCapacidadeMaximaAnimais() {
        return capacidadeMaximaAnimais;
    }
    public void setCapacidadeMaximaAnimais(int capacidadeMaximaAnimais) {
        this.capacidadeMaximaAnimais = capacidadeMaximaAnimais;
    }
    public String getTipoSala() {
        return tipoSala;
    }
    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }
    public Veterinario getVeterinarioResponsavel() {
        return veterinarioResponsavel;
    }
    public void setVeterinarioResponsavel(Veterinario veterinarioResponsavel) {
        this.veterinarioResponsavel = veterinarioResponsavel;
    }

    public Sala(String numero,String bloco, int capacidadeMaximaAnimais,String tipoSala, Veterinario veterinarioResponsavel){
        this.numero=numero;
        this.bloco=bloco;
        this.capacidadeMaximaAnimais=capacidadeMaximaAnimais;
        this.tipoSala=tipoSala;
        this.veterinarioResponsavel=veterinarioResponsavel;
    }
    public Sala(String numero,String bloco, int capacidadeMaximaAnimais,String tipoSala){
        this.numero=numero;
        this.bloco=bloco;
        this.capacidadeMaximaAnimais=capacidadeMaximaAnimais;
        this.tipoSala=tipoSala;
        this.veterinarioResponsavel= null;
    }
    public void adicionarVeterinarioResponsavel(Veterinario veterinarioResponsavel){
        setVeterinarioResponsavel(veterinarioResponsavel);
    }
}
