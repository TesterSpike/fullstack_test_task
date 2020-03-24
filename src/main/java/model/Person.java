package model;

import java.util.List;

@SuppressWarnings("UnusedDeclaration")
public class Person {
    private List<String> films;
    private String name;

    public List<String> getFilmUrlList() {
        return films;
    }

    public String getName() {
        return name;
    }
}
