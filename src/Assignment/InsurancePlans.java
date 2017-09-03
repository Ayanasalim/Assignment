/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author Paul Johny
 */
public abstract class InsurancePlans {
    int policynumber = 1000;
    String InsurerName;
    float PolicyAmount;
    float Interest;
    int PolicyTerm;
    
    private TYPE type;
    
    public static enum TYPE {
        VEHICLE,
        TRAVEL
    }
    
    InsurancePlans(TYPE type) {
        this.type = type;
    }
    public String getInsurerName() {
        return InsurerName;        
    }

    public void setInsurerName(String InsurerName) {
        this.InsurerName = InsurerName;
        this.policynumber = policynumber++;
    }

    public int getPolicynumber() {
        return policynumber;
    }

    

   

    public float getPolicyAmount() {
        return PolicyAmount;
    }

    public void setPolicyAmount(float PolicyAmount) {
        this.PolicyAmount = PolicyAmount;
    }

    public float getInterest() {
        return Interest;
    }

    public void setInterest(float Interest) {
        this.Interest = Interest;
    }

    public int getPolicyTerm() {
        return PolicyTerm;
    }

    public void setPolicyTerm(int PolicyTerm) {
        this.PolicyTerm = PolicyTerm;
    }

    public TYPE getType() {
        return type;
    }
}
