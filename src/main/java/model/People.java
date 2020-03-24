package model;

import java.util.List;

public class People {
    public List<Person> results;

    public List<String> getFilmUrlListFor(String actorName) {
        System.out.println("Getting films for " + actorName);
        for (Person person : results) {
            if (person.getName().toLowerCase().equals(actorName.toLowerCase())) {
                return person.getFilmUrlList();
            }
        }
        throw new RuntimeException("No person found for term '" + actorName + "'");
    }
}
