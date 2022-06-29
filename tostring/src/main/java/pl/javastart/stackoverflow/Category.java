package pl.javastart.stackoverflow;

import java.util.ArrayList;
import java.util.List;

class Category {
    private String name;
    private List<Course> courses = new ArrayList<>();

    Category(String name) {
        this.name = name;
    }

    void addCourse(Course course) {
        courses.add(course);
        course.setCategory(this);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
//                ", courses=" + courses + //na obiektach Course w kolekcji będzie wywoływana metoda toString()
                ", courses=" + courses.size() + //pobieramy tylko rozmiar
                '}';
    }
}
