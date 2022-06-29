package pl.javastart.overriden;

class Example {
    public static void main(String[] args) {
        Course course1 = new Course("Kurs Java", "Poznaj jeden z najbardziej popularnych języków programowania", 123);
        Course course2 = new Course("Kurs HTML", "Naucz się tworzyć strony internetowe", 99);
        System.out.println(course1.toString());
        System.out.println(course2.toString());
    }
}
