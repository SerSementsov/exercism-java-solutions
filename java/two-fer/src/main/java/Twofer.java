public class Twofer {
    public String twofer(String name) {
        String phrase = "One for %s, one for me.";
        if (isEmpty(name)) {
            name = "you";
        }
        return String.format(phrase, name);

    }

    private boolean isEmpty(String name) {
        return name == null || name.isEmpty();
    }
}