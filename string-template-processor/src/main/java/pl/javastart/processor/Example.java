package pl.javastart.processor;

import static pl.javastart.processor.StyleProcessor.STYLE;

class Example {
    public static void main(String[] args) {
        String firstName = "John";
        StyleProcessor styleProcessor = STYLE."RED";
        styleProcessor = styleProcessor."UNDERLINE";
        String text = styleProcessor."Hello \{firstName}".toString();
        System.out.println(text);
    }
}
