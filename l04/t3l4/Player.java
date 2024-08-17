package l04.t3l4;

public class Player implements Recodable, Playable{
    @Override
    public void record() {
        System.out.println("Music record");
    }

    @Override
    public void play() {
        System.out.println("Music play");
    }

    @Override
    public void pause() {
        System.out.println("Music pause");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
