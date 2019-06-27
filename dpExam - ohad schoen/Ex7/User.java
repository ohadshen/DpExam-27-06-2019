package Ex7;

public class User {
    private Mediator mediator;
    private int personalId;
    private String userName;


    public User(Mediator mediator, int personalId, String userName) {
        this.mediator = mediator;
        this.personalId = personalId;
        this.userName = userName;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void sendPersonalMessage(int userId, String message) {
        this.mediator.chatPersonal(this.personalId, userId, message);
    }

    public void sendRoomMessage(String message) {
        this.mediator.chatRoom(this.personalId, message);
    }

    public void gotMessage(String message) {
        System.out.println(message);
    }
}
