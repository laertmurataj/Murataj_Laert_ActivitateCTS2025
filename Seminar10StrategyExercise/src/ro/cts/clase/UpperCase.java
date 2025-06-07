package ro.cts.clase;

public class UpperCase implements TextFormator{
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
