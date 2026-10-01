public class Procedimento {
    private String nome;
    private double duracaoEstimada;    
    private double valor;
    private String nivelComplexidade;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getDuracaoEstimada() {
        return duracaoEstimada;
    }
    public void setDuracaoEstimada(double duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getNivelComplexidade() {
        return nivelComplexidade;
    }
    public void setNivelComplexidade(String nivelComplexidade) {
        this.nivelComplexidade = nivelComplexidade;
    }

    public Procedimento(String nome, double duracaoEstimada, double valor, String nivelComplexidade){
        this.nivelComplexidade = nivelComplexidade;
        this.nome = nome;
        this.valor = valor;
        this.duracaoEstimada = duracaoEstimada;
    }
    
}
