package Lab_06;

import java.util.ArrayList;
import java.util.Iterator;

public class GenOrchestra<T> implements Iterable<T> {
    ArrayList<Instruments> instrumentsList = new ArrayList<>();
    int currentIndex = 0;

    /**
     * Add an instrument in the ArrayList.
     *
     * @param instrument : instrument to be added in our orchestra.
     */
    public void addInstruments(Instruments instrument) {
        instrumentsList.add(instrument);
        currentIndex++;
    }

    /**
     * Overriding the iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            int currentIndexIterator = 0;

            @Override
            public boolean hasNext() {
                return currentIndexIterator < currentIndex;
            }

            @Override
            public T next() {
                return (T) instrumentsList.get(currentIndexIterator++);
            }

        };
    }

    /**
     * playAll method:
     *  + plays all instruments in the orchestra.
     *
     * @param genOrchestra : general orchestra
     */
    public void playAll(GenOrchestra<Instruments> genOrchestra) {
        for (Instruments instruments : genOrchestra) {
            instruments.play();
        }
    }

    /**
     * tuneAll method:
     *  + tunes all instruments to a single note.
     *
     * @param note : musical note.
     */
    public void tuneAll(char note, GenOrchestra<Instruments> genOrchestra) {
        for (Instruments instruments : genOrchestra) {
            instruments.tune(note);
        }
    }
}
