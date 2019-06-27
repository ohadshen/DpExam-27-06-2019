package Ex1;

public interface State {
    State ShipIsFine() throws Exception;
    State ShipIsInDanger() throws Exception;
    State GameOverLose() throws Exception;
    State GameOverWin() throws Exception;
}
