public class Atendimento {
    private String codigo;
    private String nomeAnimal;
    private String especie;
    private String nomeTutor;
    private String data;
    private String horario;
    private String statusAtendimento;
    private String observacoes;
    private Sala sala;
    private Atendimentos atendimentos;
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNomeAnimal() {
        return nomeAnimal;
    }
    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getNomeTutor() {
        return nomeTutor;
    }
    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getStatusAtendimento() {
        return statusAtendimento;
    }
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    public void setStatusAtendimento(String statusAtendimento) {
        this.statusAtendimento = statusAtendimento;
    }
    public Procedimento getProcedimento() {
        return procedimento;
    }
    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }
    private Procedimento procedimento;

        public Atendimento(String codigo, String nomeAnimal,String especie, String nomeTutor,String data,String horario,Atendimentos atendimentos){
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.nomeTutor = nomeTutor;
        this.data = data;
        this.horario = horario;
        this.statusAtendimento = "agendado";
        this.observacoes = "";
        this.sala = null;
        this.atendimentos = atendimentos;
        atendimentos.adicionarAtendimento(this);
    }
            public Atendimento(String codigo, String nomeAnimal,String especie, String nomeTutor,String data,String horario,
            String observacoes, Atendimentos atendimentos
        ){
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.nomeTutor = nomeTutor;
        this.data = data;
        this.horario = horario;
        this.statusAtendimento = "agendado";
        this.observacoes = observacoes;
        this.sala=null;
        this.atendimentos = atendimentos;
        atendimentos.adicionarAtendimento(this);
    }


    public void adicionarSala(Sala sala){
        this.sala=sala;
    }
    public void comecarAtendimento(){
        if(this.sala != null){

            this.statusAtendimento = "em andamento";
        }else{
            System.out.println("\nAdicione uma sala para começar o antedimento");
        }
    }
    public void finalizarAtendimento(){
        this.statusAtendimento = "finalizado";
        this.getSala().adicionarAtendimentoFinalizado();
    }
    public void adicionarObservacao(String observacoes){
        this.observacoes = observacoes;
    }
}
