package pl.teb.edukacja.cwiczenia1;

public class Greeting {

    public long getId() {
        return id;
    }

    private long id;

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;


}