/*
 * Created by me and myself.
 */
package dgg.ucav.mibiblio.welcome.action;

import com.opensymphony.xwork2.ActionSupport;
import dgg.ucav.mibiblio.welcome.model.MessageStore;

/**
 *
 * @author David
 */
public class WelcomeAction extends ActionSupport {
 
    private static final long serialVersionUID = 1L;
 
    private MessageStore messageStore;
     
    @Override
    public String execute() throws Exception {
         
        messageStore = new MessageStore() ;
        return SUCCESS;
    }
 
    public MessageStore getMessageStore() {
        return messageStore;
    }
 
    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
 
}