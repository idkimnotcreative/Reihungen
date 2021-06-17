
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Balkendiagramm.
 * Beschreibung: 
 *
 * @author Thomas Schaller, Simon Gebert 
 * @version 1.1 vom 05.02.2020
 */
public class Balkendiagramm extends PApplet
{ 
    int[]   zahlen={45, 23, 123, 87, 98, 2, 1, 23, 23, 34};    
    // Schriften
    PFont kleineSchrift;  
    PFont grosseSchrift; 
    int fgColor=0;
    int bgColor=255;
    int barColor=0xff0000ff;

    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(1000,700);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(bgColor);
        kleineSchrift = createFont("fonts/NotoSans-Medium.ttf", 12); //12 / 26
        grosseSchrift = createFont("fonts/NotoSansDisplay-Medium.ttf",20); //20 /48
        zeichneBalken();
    }

    public void zeichneBalken() {
        clear();
        background(bgColor);

        // Überschrift
        fill(fgColor);
        textFont(grosseSchrift);
        text("Balkendiagramm", 2, 20);
        textFont(kleineSchrift);
        // ----------------------------------------------------------------------
        // To Do
        // ----------------------------------------------------------------------
        for(int i=0; i<zahlen.length;i++)
        {
            rect(120, 25+i*15, zahlen[i], 10);
            text("i="+i+" zahlen ["+i+"]="+zahlen[i], 0, 34+i*15);
        }
        
            

        // Tipp: Vergleiche mit deiner Implementation von der Kaffeehaus-Täuschung.
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(Balkendiagramm.class, _args);
    }

}
