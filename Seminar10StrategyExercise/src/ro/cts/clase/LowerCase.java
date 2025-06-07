package ro.cts.clase;

public class LowerCase implements TextFormator{
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
