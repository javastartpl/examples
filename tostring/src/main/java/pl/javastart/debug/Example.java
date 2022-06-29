package pl.javastart.debug;

class Example {
    public static void main(String[] args) {
        Course course = new Course("Kurs Java", "Poznaj jeden z najbardziej popularnych języków programowania", 123);
        System.out.println(course.hashCode());
        System.out.println(course);
        System.out.println("Nazwa kursu " + course.getName());
    }
}
