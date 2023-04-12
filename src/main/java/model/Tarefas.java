/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author User
 */
public class Tarefas {
    private int id;
    private int idProject;
    private String nome;
    private String descricao;
    private String observacao;
    private boolean completada;
    private Date datalimite;
    private Date datacricao;
    private Date dataatualizacao;

    public Tarefas(int id, int idProject, String nome, String descricao, boolean completada, String observacao, Date datalimite, Date datacricao, Date dataatualizacao) {
        this.id = id;
        this.idProject = idProject;
        this.nome = nome;
        this.descricao = descricao;
        this.completada = completada;
        this.observacao = observacao;
        this.datalimite = datalimite;
        this.datacricao = datacricao;
        this.dataatualizacao = dataatualizacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDatalimite() {
        return datalimite;
    }

    public void setDatalimite(Date datalimite) {
        this.datalimite = datalimite;
    }

    public Date getDatacricao() {
        return datacricao;
    }

    public void setDatacricao(Date datacricao) {
        this.datacricao = datacricao;
    }

    public Date getDataatualizacao() {
        return dataatualizacao;
    }

    public void setDataatualizacao(Date dataatualizacao) {
        this.dataatualizacao = dataatualizacao;
    }

    @Override
    public String toString() {
        return "Tarefas{" + "id=" + id + ", idProject=" + idProject + ", nome=" + nome + ", descricao=" + descricao + ", completada=" + completada + ", observacao=" + observacao + ", datalimite=" + datalimite + ", datacricao=" + datacricao + ", dataatualizacao=" + dataatualizacao + '}';
    }
    
    
    
    
}
