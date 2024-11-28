package org.calcmaster;
/*@author Skullius*/
public class CalcMasterSource {
        private int ID;
        private String nome;
        private String email;
        private String cpf;
        private String senha;
        public CalcMasterSource(){
    }
        
    public CalcMasterSource (int id, String n, String e, String c, String s){
        setID(id);
        setNome(n);
        setEmail(e);
        setCpf(c);
        setSenha(s);
    }
    
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
