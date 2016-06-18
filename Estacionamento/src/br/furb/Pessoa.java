/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb;

import java.io.Serializable;

/**
 *
 * @author flaviolosada
 */
public class Pessoa<T> implements Serializable, Comparable<T>{
    private String nome;
    private String cpf;

    public Pessoa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.trim().equals("")){
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF Inválida.");
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.getCpf().equals(((String) obj));
    }

    @Override
    public int compareTo(T o) {
        return this.nome.compareTo(((Pessoa) o).getNome());
    }
}
