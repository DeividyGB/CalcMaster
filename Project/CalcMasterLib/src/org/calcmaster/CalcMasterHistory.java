package org.calcmaster;
/*@author Skullius*/
public class CalcMasterHistory {
    private int id;
    private Double n1;
    private Double n2;
    private Double r1;
    private Double r2;
    private String op;
        
    public CalcMasterHistory (int id, Double n1, Double n2,  Double r1, Double r2, String op){
        setId(id);
        setN1(n1);
        setN2(n2);
        setR1(r1);
        setR2(r2);
        setOp(op);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public Double getR1() {
        return r1;
    }

    public void setR1(Double r1) {
        this.r1 = r1;
    }

    public Double getR2() {
        return r2;
    }

    public void setR2(Double r2) {
        this.r2 = r2;
    }
    
}
