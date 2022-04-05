package AbstractFactory;

public class Test {
    public static void main(String[] args) {
        RacingFactory factory1 = new RacingCarDriverAFactory();
        RacingFactory factory2 = new GoCartCarDriverBFactory();

        RacingGame racingGame = new RacingGame(factory1, "Lightning", "McQueen");

        racingGame.test();


        RacingGame racingGame1 = new RacingGame(factory2, "2 Good 2 Kart", "Troels");

        racingGame1.test();

    }
}
