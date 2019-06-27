package Ex7;

import java.util.HashMap;
import java.util.Map;

public class WhatsappMediator implements Mediator {

    HashMap<Integer, User> users = new HashMap<>();

    public String generateMessage(String message, int senderUserId, int getterUserId) {
        return users.get(senderUserId).getUserName() + " : " + message + " - " + users.get(getterUserId).getUserName();
    }

    @Override
    public void chatPersonal(int senderUserId, int personId, String message) {
        users.get(personId).gotMessage(generateMessage(message,senderUserId, personId));
    }

    @Override
    public void chatRoom(int senderUserId, String message) {
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
             entry.getValue().gotMessage(generateMessage(message, senderUserId, entry.getValue().getPersonalId()));
        }
    }

    @Override
    public void addUser(User userToAdd) {
        this.users.put(userToAdd.getPersonalId(), userToAdd);
    }
}
