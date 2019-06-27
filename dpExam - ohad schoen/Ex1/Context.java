package Ex1;

public class Context{
    private int currentLevel;

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getGameLevels() {
        return GameLevels;
    }

    public void setGameLevels(int gameLevels) {
        GameLevels = gameLevels;
    }

    private int GameLevels;
    private int LifePoints;
    State state;

    public Context() {
        newGame();
        currentLevel = 1;
        GameLevels = 5;
        LifePoints = 50;
    }

    public int getLifePoints() {
        return LifePoints;
    }

    public void setLifePoints(int lifePoints) {
        LifePoints = lifePoints;
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Context(State state) {
        this.state = state;
    }

    public void newGame() {
        this.state  = new ShipIsFineState();
    }

    public void lose() {
        this.state =  new GameOverLoseState();
    }

    public void getHurt() {
        this.state = new ShipISInDangerState();
    }

    public void fixShip() {
        this.state = new ShipIsFineState();
    }

    public void makeTurn() {
        if(this.state instanceof ShipISInDangerState) {
            LifePoints -= 20;
        }

        this.setCurrentLevel(this.getCurrentLevel() + 1);

        if(this.getLifePoints() <= 0) {
            this.state = new GameOverLoseState();
        } else {
            if(this.getCurrentLevel() == this.getGameLevels()) {
                this.state = new GameOverWinState();
            }
        }
    }

    @Override
    public String toString() {
        return "Context{" +
                "currentLevel=" + currentLevel +
                ", GameLevels=" + GameLevels +
                ", LifePoints=" + LifePoints +
                ", state=" + state +
                '}';
    }

}
