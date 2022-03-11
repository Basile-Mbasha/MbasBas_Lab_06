package Lab_06;

import java.util.*;

/**
 * Orchestra with an 'unbounded' array of Instruments.
 */
public class Orchestra<T> implements Iterable<T> {

    Instruments[] instrumentsArray = new Instruments[5]; // array of Instruments
    int size = instrumentsArray.length; // gets the array's size
    int currentIndex = 0;   // this will be used with the iterator
    int counter = 0;    // counts our array content
    int newSize;    // new size after 50% size-increase

    /**
     * Add method:
     *  + Adds an instrument to our array of Instruments.
     *  + Increases the size of the array if full, by 50%.
     *
     * @param instrument : instrument to be added in our Orchestra.
     */
    public void addInstrument(Instruments instrument) {

        // check if array is full
        if (counter >= size) {
            newSize = (int) (size + (size * 0.5));
            // Create a new array with newSize and add instrument into new array
            Instruments[] newInstrumentsArray = new Instruments[newSize];
            if (size >= 0)
                System.arraycopy(instrumentsArray, 0, newInstrumentsArray, 0, size);

            size = newSize; // size after increase
            instrumentsArray = newInstrumentsArray; // new Instrument is now added
        }

        // loop through & add an Instrument
        for (int i = counter; i < counter + 1; i++) {
            instrumentsArray[i] = instrument;
        }
        // increment both counter & index
        counter++;
        currentIndex++;
    }

    /**
     * Override the iterator method
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
                return (T) instrumentsArray[currentIndexIterator++];
            }

            /**
             * remove method:
             *  + ensures that there are no holes(null values) in the array.
             *  + removes holes if found.
             */
            @Override
            public void remove() {
                // print size before implementation
                System.out.println("Size before remove: " + size);
                for (int i = 0; i < size; i++) {
                    if (instrumentsArray[i] == null) {
                        newSize = size - 1;
                        Instruments[] newInstruments = new Instruments[newSize];
                        System.arraycopy(instrumentsArray, 0, newInstruments, 0, newSize);
                        instrumentsArray = newInstruments;
                        size = newSize;
                    }
                }
                // print size after implementation
                System.out.println("Current size is: " + size);
            }
        };
    }

    /**
     * playAll method:
     *  + plays all the instruments in the orchestra.
     *
     * @param orchestra
     */
    public void playAll(Orchestra orchestra) {
        for (Instruments instruments : (Iterable<Instruments>) orchestra) {
            instruments.play(); // execute the play action.
        }
    }

    /**
     * tuneAll method:
     *  + tunes all the instruments to a single note.
     *
     * @param note : musical note
     */
    public void tuneAll(char note, Orchestra orchestra) {
        for (Instruments instruments : (Iterable<Instruments>) orchestra) {
            instruments.tune(note); // execute the tuning to note passed in.
        }
    }

}