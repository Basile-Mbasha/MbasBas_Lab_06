
                        Lab 06: Building an Orchestra
                        
In this lab, you’ll build your very own orchestra!


Instruments

In an orchestra, you have many instruments. Implement an interface that represents an instrument. All
instruments need to implement a play method (public void play()), and a tune method (public void
tune(char note)).
In your orchestras, you’ll need to have a Viola, Cello, and Tuba. All three are constructed with a string
that denotes the song they will play. The Tuba, however, also accepts a second parameter that dictates
the number of times it plays `oom pa pa` after playing the song. Each of these must implement the tune
method by printing something like: Tuning Tuba to note: C
When you play the instruments they print that they are playing the song they currently assigned to play.
The tuba is the only one which plays `oom pa pa` some number of times at the end of the song it plays.
Feel free to change the instruments in your orchestra (just make sure you have one that plays something
extra at the end like the Tuba).

Orchestra 

Use your Instruments to create an Orchestra class that has an “unbounded” array of Instruments (no
ArrayLists here, only array with `[ ]` ). It will need a method to add Instruments to the array. If the
orchestra is full, increase it’s size by 50%.
Implement an iterator for this class with hasNext, next, and remove methods. The remove method will
need to ensure that there are no holes in the array (null values) and the next and hasNext methods will
need to gracefully handle reaching the end of the Instruments in the array before the null value without
raising an Exception.
Your orchestra will then need a method for playing all the instruments (playAll), and for tuning all of the
instruments to a single note (tuneAll).

GenOrchestra 

Reimplement the Orchestra above using an ArrayList (like we did for the Team class in Lab 05).



Testing 

Ensure that you test all of your methods! Have them tune to all sorts of notes, and play all sorts of songs.
Here are some ideas:
➢ Bach: suites for solo Violoncello
➢ Andrew Macdonald: The Great Square of Pegasus:
➢ Bach: Symphony no 1 to 4
➢ Sonata no 1
➢ Bach: Suite no 1
While running these tests, add an object an Orchestra by using an anonymous class that represents a
Trumpet to the Orchestra.
