import java.util.ArrayList;
public class Sala {
    private String numero;
    private String bloco;
    private int capacidadeMaximaAnimais;
    private String tipoSala;
    private Veterinario veterinarioResponsavel;
    private ArrayList<Atendimento> atendimentos;
    private int contadorAtendimentosFinalizados;
    
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
        this.atendimentos = new ArrayList<Atendimento>();
        this.contadorAtendimentosFinalizados=0;
    }
    public int getContadorAtendimentosFinalizados() {
        return contadorAtendimentosFinalizados;
    }
    public void setContadorAtendimentosFinalizados(int contadorAtendimentosFinalizados) {
        this.contadorAtendimentosFinalizados = contadorAtendimentosFinalizados;
    }
    public Sala(String numero,String bloco, int capacidadeMaximaAnimais,String tipoSala){
        this.numero=numero;
        this.bloco=bloco;
        this.capacidadeMaximaAnimais=capacidadeMaximaAnimais;
        this.tipoSala=tipoSala;
        this.veterinarioResponsavel= null;
        this.atendimentos = new ArrayList<>();
        this.contadorAtendimentosFinalizados=0;
    }
    public void adicionarVeterinarioResponsavel(Veterinario veterinarioResponsavel){
        if(veterinarioResponsavel.getSala()!=null){

            setVeterinarioResponsavel(veterinarioResponsavel);
            veterinarioResponsavel.associarVeterinarioSala(this);
            System.out.println("\nVeterinario associado com sucesso");
        }else{
            System.out.println("\nVeterinario já associado a uma sala, favor removê-lo da sala anterior");
        }
    }
    public void removerVeterinarioResponsavel(){
        veterinarioResponsavel.setSala(null);
        setVeterinarioResponsavel(null);
    }
    public void adicionarAtendimento(Atendimento atendimento){
        if(atendimentos.size()<1){
            atendimentos.add(atendimento);
            System.out.println("\nPrimeiro atendimento adicionado com sucesso");
        }
        if(atendimento.getProcedimento()==atendimentos.get(0).getProcedimento()){
            atendimentos.add(atendimento);
            System.out.println("\nAtendimento adicionado com sucesso");
        }else{
            System.out.println("\n Não foi possível adicionar o atendimento");
        }

    }
    public void removerAtendimento(Atendimento atendimento){
        atendimentos.remove(atendimento);
    }
    public void exibirAtendimentos(){
        System.out.println("\n\t TABELA DE ATENDIMENTOS");
        if(atendimentos.size()<1){
            System.out.println("\n Vazio, essa sala ainda não possui antendimentos");
            return;
        }
        int contador = 0;
        for(int i=0;i<atendimentos.size();i++){
            System.out.println("\n Atendimento: "+i+1+
            "\nCodigo: "+atendimentos.get(i).getCodigo()+
            "\n Nome do Tutor: "+atendimentos.get(i).getNomeTutor()+
            "\nNome do Animal: "+atendimentos.get(i).getNomeAnimal());
            contador+=1;
        }
        System.out.println("\nTotal atendimentos: "+ contador);
    }
    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }
    public void adicionarAtendimentoFinalizado(){
        this.contadorAtendimentosFinalizados+=1;
    }
    public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }
    public int quantidadeAtendimentosFinalizados(){
        if(atendimentos.size()<1){
            System.out.println("Vazio, essa sala ainda não possui nenhum atendimento");
            return this.contadorAtendimentosFinalizados;
        }
        else{
            return this.contadorAtendimentosFinalizados;
        }
    }

}
