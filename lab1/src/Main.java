
import Hero.*;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.startMoving();

        Scanner input = new Scanner(System.in);

        System.out.println("type of moving //flying,riding horse,walking  or enter //end to stop program");

        while (input.hasNext()) {

            String str = input.nextLine().toLowerCase();


            if (str.equals("end") ) {
                break;
            }
            switch (str) {
                case "flying":
                    hero.setMoveStrategy( new Flying());
                    hero.startMoving();
                    break;
                case "riding horse":
                    hero.setMoveStrategy(new RideHorse());
                    hero.startMoving();
                    break;
                case "walking":
                    hero.setMoveStrategy(new Walk());
                    hero.startMoving();
                    break;

                default :
                    System.out.println("Error ");
            }
        }
        input.close();
    }
}
