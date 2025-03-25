package model.daos;

import java.util.List;

public interface ContratoDAO<T> {
    public T criar(T obj);
    public Boolean excluir(int id);
    public T alterar(T obj);
    public List<T> listar(T obj);
    public List<T> listarFiltro(T obj);
    public T selecionarID(int id);
}
