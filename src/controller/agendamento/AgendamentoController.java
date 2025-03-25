package controller.agendamento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import controller.IController;
import model.dtos.AgendamentoDTO;
import services.Agendamentos.AgendamentoService;


public class AgendamentoController implements IController<AgendamentoDTO> {

    AgendamentoDTO agendamentoDTO;
    AgendamentoService agendamentoService;

    @Override
    public AgendamentoDTO criar(AgendamentoDTO obj) {
        
        AgendamentoDTO agendamentoDTO = new AgendamentoDTO();
        agendamentoDTO.setTitulo("Salve");
        agendamentoDTO.setData(23);
        agendamentoDTO.setItens(new ArrayList<>(Arrays.asList("sela", "aa")));        
        agendamentoService.criar(agendamentoDTO);
        return agendamentoDTO;
    }

    @Override
    public Boolean excluir(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public AgendamentoDTO alterar(AgendamentoDTO obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    @Override
    public List<AgendamentoDTO> listar(AgendamentoDTO obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public List<AgendamentoDTO> listarFiltro(AgendamentoDTO obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarFiltro'");
    }

    @Override
    public AgendamentoDTO selecionarID(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarID'");
    }

    

}
