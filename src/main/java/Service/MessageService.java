package Service;

import Model.Message;
import DAO.MessageDAO;

import java.util.List;


public class MessageService {
    private MessageDAO messageDAO;
    
    public MessageService(){
        messageDAO = new MessageDAO();
    }
    
    public MessageService(MessageDAO messageDAO){
        this.messageDAO = messageDAO;
    }
    
    public List<Message> getAllMessages() {
        return messageDAO.getAllMessages();
    }

    public Message getMessageById(int message_id) {
        return messageDAO.getMessageById(message_id);
    }

    public List<Message> getAllMessagesByUser(int user_id) {
        return messageDAO.getAllMessagesByUser(user_id);
    }


    public Message deleteMessageById(int message_id) {
        return messageDAO.deleteMessageById(message_id);
    }

    public Message updateMessageById(Message message) {
        return messageDAO.updateMessageById(message);
    }
   
    public Message addMessage(Message message) {
        return messageDAO.insertMessage(message);
    }
}