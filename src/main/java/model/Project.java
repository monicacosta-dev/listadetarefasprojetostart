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
public class Project {
    private int id;
    private String nome;
    private String descricao;
    private Date datacricao;
    private Date dataatualizacao;

    public Project(int id, String nome, String descricao, Date datacricao, Date dataatualizacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.datacricao = datacricao;
        this.dataatualizacao = dataatualizacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Project{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", datacricao=" + datacricao + ", dataatualizacao=" + dataatualizacao + '}';
    }
    
    
    
}
