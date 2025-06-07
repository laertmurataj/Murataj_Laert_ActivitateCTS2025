package ro.cts.clase;

public class Editor {
    private String content;
    private TextFormator formatter;

    public Editor(String content) {
        this.content = content;
        this.formatter = new UpperCase();
    }

    public Editor(String content, TextFormator formatter) {
        this.content = content;
        this.formatter = formatter;
    }
    public void display(){
        System.out.println(formatter.format(content));
    }
    public void setTextFormator(TextFormator formatter){
        this.formatter = formatter;
    }
}
