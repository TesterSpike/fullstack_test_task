package page;

import model.Film;

public class FilmPage extends BasePage {
    public Film GET(String filmURL) {
        Film film = request.get(filmURL).as(Film.class);
        System.out.println("Film: '" + film.getTitle() + "'");
        return film;
    }
}
