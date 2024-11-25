package org.calcmaster;
/*@author Skullius*/

public class CalcMasterLogin {
        private String email;
        private String senha;
        public CalcMasterLogin(){
    }
      
    public CalcMasterLogin (String log, String sen){
        setEmail(log);
        setSenha(sen);
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
