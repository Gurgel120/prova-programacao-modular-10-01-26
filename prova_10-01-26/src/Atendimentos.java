
import java.util.ArrayList;
public class Atendimentos {

    private ArrayList<Atendimento> atendimentos;

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }
    public Atendimentos(){
        this.atendimentos = new ArrayList<Atendimento>();
    } 
    public void adicionarAtendimento(Atendimento atendimento){
        atendimentos.add(atendimento);
    }
    public void buscarAtendimentoStatus(String status){
        if (status.equals("agendado")||status.equals("em andamento")||status.equals("finalizado")){
            for(int i=0;i<atendimentos.size();i++){
                if(atendimentos.get(i).getStatusAtendimento().equals(status)){
                    System.out.println("\nCodigo: "+atendimentos.get(i).getCodigo()+
                    "\nSala: "+atendimentos.get(i).getSala()+
                    "\nVeterinario Responsavel: "+atendimentos.get(i).getSala().getVeterinarioResponsavel());
                }
            }
        }else{
            System.out.println("Erro, adicionar um status válido");
        }
    }
}
