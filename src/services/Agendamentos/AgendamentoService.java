package services.Agendamentos;

import model.dtos.AgendamentoDTO;
import model.entidades.Agendamento;

        /// meu service tem a funlça de converter antes do dto e o dao se comunicarem
public class AgendamentoService {
    AgendamentoDTO agendamentoDTO;

    public Agendamento criar(AgendamentoDTO aDto){
        Agendamento agendamento =  agendamentoDTO.toAgendamento(aDto);     
        return 
    }
}
