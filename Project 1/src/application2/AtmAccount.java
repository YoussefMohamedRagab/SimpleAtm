/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application2;


/**
 *
 * @author USER
 */
public class AtmAccount {
    
    
    private final String CardPin = "20465";
    private int balance;
    private String [] history = new String[5];
    private int index;
    private int nextindex;
    
    public AtmAccount(){
        balance = 0;
        index=-1;
        nextindex=0;
    }
   

    public String getCardPin() {
        return CardPin;
    }

    public void setBalance(int balance) {
        this.balance = this.balance+ balance;
    }

    public int getBalance() {
        return balance;
    }
    
    public boolean pinValidation (String pin){
        
        if(pin.equals(CardPin))
            return true;
        else
            return false;
    
}
    
      
    public boolean withdrawValidation(int withdrawal){
        if(balance > withdrawal)
            return true;
        else
            return false;
    }
    
   public void writetransaction(String string){
        if(index +1 >4){
            for(int i=0;i<4;i++){
                history[i]=history[i+1];
            }
            history[4]=string;
        }
        else{
          index++;
          history[index]=string;
          nextindex++;
        }
       
   }
    
    public String gettransaction(){
        
        return history[index];
    }
     public String previoushistory(){
        
        return history[--index];
    }
      public String nexthistory(){
        
        return history[++ index];
    }
    
    
    public int getIndex() {
        return index;
    }
    public boolean testnextbtn(){
        if (index +1 >=nextindex)
            return false;
        else
            return true;      
    }
    public boolean testprevbtn(){
        if(this.index -1 <0)
            return false;
        else
            return true;
    }
   
}
