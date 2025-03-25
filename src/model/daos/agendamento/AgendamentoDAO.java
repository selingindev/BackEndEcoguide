package model.daos.agendamento;

import java.util.List;
import model.daos.ContratoDAO;
import model.entidades.Agendamento;

public class AgendamentoDAO implements ContratoDAO<Agendamento> {

    @Override
    public Agendamento criar(Agendamento obj) {
        
        


        return
    }

    @Override
    public Boolean excluir(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public Agendamento alterar(Agendamento obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    @Override
    public List<Agendamento> listar(Agendamento obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public List<Agendamento> listarFiltro(Agendamento obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarFiltro'");
    }

    @Override
    public Agendamento selecionarID(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarID'");
    }

}
