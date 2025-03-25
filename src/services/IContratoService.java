package services;

import java.util.List;

public interface IContratoService<T> {
    public void criar(T obj);

    public Boolean excluir(int id);

    public void alterar(T obj);

    public List<T> listar(T obj);

    public List<T> listarFiltro(T obj);

    public T selecionarID(int id);
}
