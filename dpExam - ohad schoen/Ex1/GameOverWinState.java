package Ex1;

public class GameOverWinState implements State {
    @Override
    public State ShipIsFine() throws Exception {
        throw new Exception("you have won, so the state is illegale");
    }

    @Override
    public State ShipIsInDanger() throws Exception {
        throw new Exception("you have won, so the state is illegale");
    }

    @Override
    public State GameOverLose() throws Exception {
        throw new Exception("you have won, so the state is illegale");
    }

    @Override
    public State GameOverWin() {
        return new GameOverWinState();
    }
}
