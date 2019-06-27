package Ex1;

public class GameOverLoseState implements State {
    @Override
    public State ShipIsFine() throws Exception {
        throw new Exception("you have lost, so the state is illegale");
    }

    @Override
    public State ShipIsInDanger() throws Exception {
        throw new Exception("you have lost, so the state is illegale");
    }

    @Override
    public State GameOverLose() {
        return new GameOverLoseState();
    }

    @Override
    public State GameOverWin() throws Exception {
        throw new Exception("you have lost, so the state is illegale");
    }
}
