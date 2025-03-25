package Mapper.Agendamento;

import Mapper.IMapper;
import model.dtos.AgendamentoDTO;
import model.entidades.Agendamento;

public class MapperAgendamento implements IMapper<Agendamento, AgendamentoDTO> {

    @Override
    public AgendamentoDTO toDTO(Agendamento entity) {
        AgendamentoDTO agendamentoDTO = new AgendamentoDTO();

        agendamentoDTO.setId(entity.getId());
        agendamentoDTO.setData(entity.getData());
        agendamentoDTO.setTitulo(entity.getTitulo());
        agendamentoDTO.setItens(entity.getItens());

        return agendamentoDTO;

    }

    @Override
    public Agendamento toEntity(AgendamentoDTO dto) {

        Agendamento agendamento = new Agendamento();

        agendamento.setData(dto.getData());
        agendamento.setId(dto.getId());
        agendamento.setItens(dto.getItens());
        agendamento.setTitulo(dto.getTitulo());

        return agendamento;
    }

}
