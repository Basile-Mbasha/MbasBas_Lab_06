package Lab_06;

/**
 * Tuba class represents a Tuba instrument in our orchestra.
 * It must play a song/sound and be adjustable.
 * And repeat a melody(if needed).
 */
public class Tuba implements Instruments {
    String song;
    int repeatMelody;
    String name;

    /**
     * Tuba class constructor.
     * @param song : song to be played by artist.
     * @param repeatMelody : melody to be repeated.
     */
    public Tuba(String song, int repeatMelody) {
        this.song = song;
        this.repeatMelody = repeatMelody;
        this.name = "Tuba";
    }

    /**
     * toString method:
     *  + prints out the name of the instrument
     */
    public String toString() {
        return this.name;
    }

    /**
     * play method:
     *  + plays a song
     *  + repeats a melody (if needed).
     */
    @Override
    public void play() {
        System.out.print(this.name + " is playing...  ♪ " + song);
        for (int i = 0; i < repeatMelody; i++)
            System.out.print(" oom pa pa,.. ");
        System.out.println();
    }

    /**
     * tune method:
     *  + tunes the instrument to a given note.
     *  + outputs which note the instrument is tuned to.
     */
    @Override
    public void tune(char note) {
        System.out.println("Tuning Tuba to note: " + note);
    }
}