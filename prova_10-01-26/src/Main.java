import java.util.ArrayList;
public class Main {
    void buscarAtendimentoStatus(ArrayList<Atendimento> atendimentos, String status){
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

    public static void main(String[] args) throws Exception {


    ArrayList<Atendimento> atendimentos = new ArrayList<Atendimento>();
    






    }
}
