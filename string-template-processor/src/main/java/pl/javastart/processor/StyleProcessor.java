package pl.javastart.processor;

import java.lang.StringTemplate.Processor;

class StyleProcessor implements Processor<StyleProcessor, RuntimeException> {
    private static final String RED = "\u001B[31m";
    private static final String BLUE = "\u001B[34m";
    private static final String BOLD = "\u001B[1m";
    private static final String UNDERLINE = "\u001B[4m";
    private static final String RESET = "\u001B[0m";
    private final String text;

    private StyleProcessor(String text) {
        this.text = text;
    }

    @Override
    public StyleProcessor process(StringTemplate template) {
        StringBuilder builder = new StringBuilder(text);
        String interpolatedTemplate = template.interpolate();
        switch (interpolatedTemplate) {
            case "RED" -> builder.append(RED);
            case "BLUE" -> builder.append(BLUE);
            case "BOLD" -> builder.append(BOLD);
            case "UNDERLINE" -> builder.append(UNDERLINE);
            default -> builder.append(template.interpolate());
        }
        return new StyleProcessor(builder.toString());
    }

    @Override
    public String toString() {
        return text + RESET;
    }

    public static final StyleProcessor STYLE = new StyleProcessor("");
}
