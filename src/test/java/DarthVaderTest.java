import model.Film;
import model.People;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.FilmPage;
import page.PeoplePage;

import java.util.List;

public class DarthVaderTest {
    @Test
    public void DarthVaderFilmListDoesNotIncludeEP1EP2EP7() {
        System.out.println("Verifying Darth Vader is not in certain movies");
        People people = new PeoplePage().GET();
        List<String> filmUrls = people.getFilmUrlListFor("Darth Vader");

        for (String filmURL : filmUrls) {
            Film film = new FilmPage().GET(filmURL);
            Assertions.assertNotEquals("The Phantom Menace", film.getTitle(), "Film title");
            Assertions.assertNotEquals("Attack of the Clones", film.getTitle(), "Film title");
            Assertions.assertNotEquals("The Force Awakens", film.getTitle(), "Film title");
        }
    }
}
