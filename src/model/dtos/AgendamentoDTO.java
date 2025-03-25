package model.dtos;

import java.util.ArrayList;


public class AgendamentoDTO {
    private String titulo;
    private int data;
    private ArrayList<String> itens;
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public ArrayList<String> getItens() {
        return itens;
    }
    public void setItens(ArrayList<String> itens) {
        this.itens = itens;
    }

}
