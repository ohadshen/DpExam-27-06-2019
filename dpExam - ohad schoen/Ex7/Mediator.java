package Ex7;

public interface Mediator {
    void chatPersonal(int senderUserId, int personId, String message);
    void chatRoom(int senderUserId, String message);
    void addUser(User userToAdd);
}
