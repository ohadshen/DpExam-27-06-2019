package Ex1;

public class ShipIsFineState implements State {
    @Override
    public State ShipIsFine() {
        return new ShipIsFineState();
    }

    @Override
    public State ShipIsInDanger() {
        return new ShipISInDangerState();
    }

    @Override
    public State GameOverLose() {
        return new GameOverLoseState();
    }

    @Override
    public State GameOverWin() {
        return new GameOverWinState();
    }
}
