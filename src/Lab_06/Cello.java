package Lab_06;

/**
 * Cello class represents a Cello instrument in an orchestra.
 * Just like any instrument, it must play something
 * and be adjustable (tune-able to a certain note)
 * thus implementation of instruments methods.
 */
public class Cello implements Instruments {
    String song;
    String name;

    /**
     * Cello class constructor
     * @param song : song to be played.
     */
    public Cello(String song) {
        this.song = song;
        this.name = "Cello";
    }

    /**
     * toString method:
     *  + prints the name of the instrument
     */
    public String toString() {
        return this.name;
    }

    /**
     * tune method:
     *  + ensures the instrument is adjustable.
     *  + outputs which note the instrument is tuned to.
     */
    @Override
    public void tune(char note) {
        System.out.println("Tuning Cello to note: " + note);
    }

    /**
     * play method:
     *  + ensures an instrument plays a given song/sound.
     *  + outputs which instrument is playing the song
     *  to ensure order in orchestra performance.
     */
    @Override
    public void play() {
        System.out.println(this.name + " is playing...  ♪ " + song);
    }

}