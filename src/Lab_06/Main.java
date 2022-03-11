/**
 * Name: Basile Mbasha
 * Date: March 9th,2022
 * Description: This program will create:
 *      + an orchestra of three instruments.
 *      + give functionality to instruments in the orchestra.
 */
package Lab_06;

import java.util.*;

/**
 * Main class is here used for testing
 * the program and thus needs access to
 * fields and methods from the Orchestra.
 */
public class Main extends Orchestra {

    public static void main(String[] args) {

        // Let's create a new Instrument
        Instruments Trumpet = new Instruments() {
            // optimize the play method
            @Override
            public void play() {
                // print the trumpet sound (in words).
                System.out.println( "Buuup Buuup Buuup" );
            }

            // optimize the tune method
            @Override
            public void tune(char note) {
                // output which note tuned to
                System.out.println( "\nTuning Trumpet to note: " + note );
            }
        };

        Trumpet.tune('C');  // Tuning instrument
        Trumpet.play(); // displaying the instrument sound

        // Let's create an Orchestra
        Orchestra<Instruments> orchestra = new Orchestra<>();

        orchestra.addInstrument(new Viola("Could've seen it all"));
        orchestra.addInstrument(new Cello("Sonata no 1"));
        orchestra.addInstrument(new Cello("Tuesday afternoon"));
        orchestra.addInstrument(new Tuba("King Me", 2));

        // Let's now create a General Orchestra
        GenOrchestra<Instruments> genOrchestra = new GenOrchestra<>();

        genOrchestra.addInstruments(new Cello("I don't know what to say"));
        genOrchestra.addInstruments(new Tuba("The Great Square of Pegasus", 4));
        genOrchestra.addInstruments(new Cello("Sonata no 1"));
        genOrchestra.addInstruments(new Viola("No time to die"));
        genOrchestra.addInstruments(new Tuba("My heart cries for you", 4));

        Iterator<Instruments> instrumentsIterator = orchestra.iterator();

        // test remove method
        instrumentsIterator.remove();

        while (instrumentsIterator.hasNext()) {
            System.out.print(instrumentsIterator.next() + ", ");
        }

        System.out.println("\nTuning instruments: ");
        orchestra.tuneAll('E', orchestra);

        System.out.println("\nInstruments currently playing: ");
        orchestra.playAll(orchestra);

        Iterator<Instruments> instrumentsIterator2 = genOrchestra.iterator();

        System.out.print("\nList of instruments in the General Orchestra: \n");
        while (instrumentsIterator2.hasNext()) {
            System.out.print(instrumentsIterator2.next() + " \n");
        }

        System.out.println("\nTuning all instruments:");
        genOrchestra.tuneAll('F', genOrchestra);
        System.out.println("\nAll instruments play songs: ");
        genOrchestra.playAll(genOrchestra);

        // now let's test all methods simultaneously
        System.out.println("\nTuning and playing my Instruments:");
        Viola viola = new Viola("Classical Gas");
        Cello cello = new Cello( "Burning love" );
        Tuba tuba = new Tuba("Breath of life", 2);
        viola.play();
        cello.play();
        tuba.play();
        tuba.tune('A');
        cello.tune( 'B' );
        viola.tune('C');

        
    }
}