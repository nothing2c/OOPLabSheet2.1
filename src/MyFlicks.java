import javax.swing.*;

public class MyFlicks {
    public static void main(String[] args) {

        Film[] films = new Film[0];

        String input="";

        while(!input.equals("x"))
        {
            input=JOptionPane.showInputDialog("Press any key to continue(not x that kicks ya out)");
            input=input.toLowerCase();

            if(!input.equals("x"))
            {
                Film film = new Film();

                film.setTitle(JOptionPane.showInputDialog("Please enter the title"));

                film.setDirector(JOptionPane.showInputDialog("Please enter the director"));

                film.setDuration(Integer.parseInt(JOptionPane.showInputDialog("Please enter the duration")));

                films=Film.add(films, film);
            }
        }

        Film.displayFilms(films);
    }
}
