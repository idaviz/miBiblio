/*
 * Created by me and myself.
 */
package dgg.ucav.mibiblio.welcome.model;

/**
 *
 * @author David
 */
public class MessageStore {
     
    private String message;
     
    public MessageStore() {
         
        setMessage("Hello Struts User");
    }
 
    public String getMessage() {
 
        return message;
    }
 
    public void setMessage(String message) {
 
        this.message = message;
    }
 
}