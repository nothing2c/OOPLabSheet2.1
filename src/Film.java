import javax.swing.*;

public class Film {

    private String title, director;
    private int duration;
    private static int numOfFilms=0;

    public Film(String title, String director, int duration)
    {
        setTitle(title);
        setDirector(director);
        setDuration(duration);
        numOfFilms++;
    }

   public Film()
   {
       this("Unknown", "Unknown", 0);
   }

   public String toString()
   {
       return "Title: "+getTitle()+"\nDirector: "+getDirector()+"\nDuration: "+getDuration()+"\n";
   }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static int getNumOfFilms() {
        return numOfFilms;
    }

    private static Film[] expand(Film[] oldArray)
    {
        Film[] biggerArray = new Film[oldArray.length+1];

        for(int i=0;i<oldArray.length;i++)
        {
            biggerArray[i]=oldArray[i];
        }

        return biggerArray;
    }

    public static Film[] add(Film[] films,Film newFilm)
    {
        Film[] biggerFilms = expand(films);
        biggerFilms[biggerFilms.length-1] = newFilm;
        System.out.println("im here"+biggerFilms.length);

        return  biggerFilms;
    }

    public static void displayFilms(Film[] films)
    {
        JTextArea display = new JTextArea();
        display.setText("Number of Films: "+getNumOfFilms()+"\n");

        String displayText="";

        for(int i=0;i<films.length;i++)
        {
            displayText+="\n"+films[i].toString()+"\n";
            System.out.println("im here");
        }

        display.append(displayText);

        System.out.println(displayText);

        JOptionPane.showMessageDialog(null, display);
    }
}
