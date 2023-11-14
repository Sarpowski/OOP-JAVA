package Hero;

public class Hero {

    protected MoveStrategy moveStrategy;
    {
        moveStrategy = new Walk();
    }

    public void setMoveStrategy(MoveStrategy routeStrategy) {
        this.moveStrategy = routeStrategy;
    }

    public void startMoving() {
        moveStrategy.move();
    }
}
