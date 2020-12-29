package br.com.elfem.luiz.elfem.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FILIAIS")
public class Filiais implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long fil_codigo;

    private String fil_cnpj;

    private String fil_nome;

    private String fil_end_endereco;

    private String fil_end_bairro;

    private long fil_end_cid_codigo;

    private String fil_end_cid_nome;

    private String fil_end_cid_uf;

    private String fil_end_cep;

    private String fil_inscest;

    private String fil_email;

    private String fil_nome_contato;

    private String fil_telefone;

    private String fil_cid_nome;

    private String fil_quer_contato;

    private String fil_end_numero;

    private String fil_end_complemento;

    private String fil_quer_NFE;

    private String fil_cnpj_contatodor;

    private String fil_contador_nome;

    private String fil_contador_telefone;

    private String fil_contador_email;

    private String fil_ativo;

    public long getFil_codigo() {
        return fil_codigo;
    }

    public void setFil_codigo(long fil_codigo) {
        this.fil_codigo = fil_codigo;
    }

    public String getFil_cnpj() {
        return fil_cnpj;
    }

    public void setFil_cnpj(String fil_cnpj) {
        this.fil_cnpj = fil_cnpj;
    }

    public String getFil_nome() {
        return fil_nome;
    }

    public void setFil_nome(String fil_nome) {
        this.fil_nome = fil_nome;
    }

    public String getFil_end_endereco() {
        return fil_end_endereco;
    }

    public void setFil_end_endereco(String fil_end_endereco) {
        this.fil_end_endereco = fil_end_endereco;
    }

    public String getFil_end_bairro() {
        return fil_end_bairro;
    }

    public void setFil_end_bairro(String fil_end_bairro) {
        this.fil_end_bairro = fil_end_bairro;
    }

    public long getFil_end_cid_codigo() {
        return fil_end_cid_codigo;
    }

    public void setFil_end_cid_codigo(long fil_end_cid_codigo) {
        this.fil_end_cid_codigo = fil_end_cid_codigo;
    }

    public String getFil_end_cid_nome() {
        return fil_end_cid_nome;
    }

    public void setFil_end_cid_nome(String fil_end_cid_nome) {
        this.fil_end_cid_nome = fil_end_cid_nome;
    }

    public String getFil_end_cid_uf() {
        return fil_end_cid_uf;
    }

    public void setFil_end_cid_uf(String fil_end_cid_uf) {
        this.fil_end_cid_uf = fil_end_cid_uf;
    }

    public String getFil_end_cep() {
        return fil_end_cep;
    }

    public void setFil_end_cep(String fil_end_cep) {
        this.fil_end_cep = fil_end_cep;
    }

    public String getFil_inscest() {
        return fil_inscest;
    }

    public void setFil_inscest(String fil_inscest) {
        this.fil_inscest = fil_inscest;
    }

    public String getFil_email() {
        return fil_email;
    }

    public void setFil_email(String fil_email) {
        this.fil_email = fil_email;
    }

    public String getFil_nome_contato() {
        return fil_nome_contato;
    }

    public void setFil_nome_contato(String fil_nome_contato) {
        this.fil_nome_contato = fil_nome_contato;
    }

    public String getFil_telefone() {
        return fil_telefone;
    }

    public void setFil_telefone(String fil_telefone) {
        this.fil_telefone = fil_telefone;
    }

    public String getFil_cid_nome() {
        return fil_cid_nome;
    }

    public void setFil_cid_nome(String fil_cid_nome) {
        this.fil_cid_nome = fil_cid_nome;
    }

    public String getFil_quer_contato() {
        return fil_quer_contato;
    }

    public void setFil_quer_contato(String fil_quer_contato) {
        this.fil_quer_contato = fil_quer_contato;
    }

    public String getFil_end_numero() {
        return fil_end_numero;
    }

    public void setFil_end_numero(String fil_end_numero) {
        this.fil_end_numero = fil_end_numero;
    }

    public String getFil_end_complemento() {
        return fil_end_complemento;
    }

    public void setFil_end_complemento(String fil_end_complemento) {
        this.fil_end_complemento = fil_end_complemento;
    }

    public String getFil_quer_NFE() {
        return fil_quer_NFE;
    }

    public void setFil_quer_NFE(String fil_quer_NFE) {
        this.fil_quer_NFE = fil_quer_NFE;
    }

    public String getFil_cnpj_contatodor() {
        return fil_cnpj_contatodor;
    }

    public void setFil_cnpj_contatodor(String fil_cnpj_contatodor) {
        this.fil_cnpj_contatodor = fil_cnpj_contatodor;
    }

    public String getFil_contador_nome() {
        return fil_contador_nome;
    }

    public void setFil_contador_nome(String fil_contador_nome) {
        this.fil_contador_nome = fil_contador_nome;
    }

    public String getFil_contador_telefone() {
        return fil_contador_telefone;
    }

    public void setFil_contador_telefone(String fil_contador_telefone) {
        this.fil_contador_telefone = fil_contador_telefone;
    }

    public String getFil_contador_email() {
        return fil_contador_email;
    }

    public void setFil_contador_email(String fil_contador_email) {
        this.fil_contador_email = fil_contador_email;
    }

    public String getFil_ativo() {
        return fil_ativo;
    }

    public void setFil_ativo(String fil_ativo) {
        this.fil_ativo = fil_ativo;
    }

}