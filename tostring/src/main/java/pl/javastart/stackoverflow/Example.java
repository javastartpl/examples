package pl.javastart.stackoverflow;

class Example {
    public static void main(String[] args) {
        Course course = new Course("Kurs Java", "Poznaj jeden z najbardziej popularnych języków programowania", 123);
        Category category = new Category("Programowanie");
        category.addCourse(course);
        System.out.println(course);
    }
}
