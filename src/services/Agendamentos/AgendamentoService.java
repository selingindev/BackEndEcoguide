package services.Agendamentos;

import java.util.List;

import Mapper.Agendamento.MapperAgendamento;
import model.daos.agendamento.AgendamentoDAO;
import model.dtos.AgendamentoDTO;
import model.entidades.Agendamento;
import services.IContratoService;

/// meu service tem a funlça de converter antes do dto e o dao se comunicarem
public class AgendamentoService implements IContratoService<AgendamentoDTO> {
    AgendamentoDTO agendamentoDTO;
    AgendamentoDAO agendamentoDAO;
    MapperAgendamento mapperAgendamento;
    
    @Override
    public void criar(AgendamentoDTO aDto){
        Agendamento agendamento = mapperAgendamento.toEntity(aDto);
        agendamentoDAO.criar(agendamento);
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
    public List listar(AgendamentoDTO obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public List listarFiltro(AgendamentoDTO obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarFiltro'");
    }

    @Override
    public Object selecionarID(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarID'");
    }
}
