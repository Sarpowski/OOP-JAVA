package Hero;

public class Walk implements MoveStrategy {

    @Override
    public void move(){
        System.out.println("Hero is walking");
    }
}
