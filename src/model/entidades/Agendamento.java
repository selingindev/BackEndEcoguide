package model.entidades;

import java.util.ArrayList;

public class Agendamento {
    private String titulo;
    private int data;
    private ArrayList<String> itens;
    private int id;

    public Agendamento(String titulo, int data, ArrayList<String> itens) {
        this.titulo = titulo;
        this.data = data;
        this.itens = itens;
    }

    public Agendamento(int id, String titulo, int data, ArrayList<String> itens) {
        this.id = id;
        this.titulo = titulo;
        this.data = data;
        this.itens = itens;
    }

    public Agendamento() {
        // TODO Auto-generated constructor stub
    }

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
