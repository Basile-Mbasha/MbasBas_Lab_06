package Lab_06;

/**
 * Interface of our instruments
 * functionality:
 *  + each instrument should play a song.
 *  + and be adjusted/tuned to a user_entered musical note.
 */
interface Instruments {
    void play();
    void tune(char note);
}
