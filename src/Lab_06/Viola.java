package Lab_06;

/**
 * Viola instrument in our orchestra.
 * Implements instrument methods(functions).
 */
public class Viola implements Instruments {
    String song;
    String name;

    /**
     * Viola class constructor.
     * @param song : song to be played.
     */
    public Viola(String song) {
        this.song = song;
        this.name = "Viola";
    }

    /**
     * toString method:
     *  + print the name of the instrument.
     */
    public String toString() {
        return this.name;
    }

    /**
     * play method:
     *  + plays a song.
     *  + outputs which instrument is playing the song.
     */
    @Override
    public void play() {
        System.out.println(this.name + " is playing...  ♪ " + song);
    }

    /**
     * tune method:
     *  + tunes the viola to a given note.
     */
    @Override
    public void tune(char note) {
        System.out.println("Tuning Viola to note: " + note);
    }

}