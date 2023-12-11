package se.lexicon;

public class Book {

    private String title;

    private String author;

    private boolean available;

    private Person person;

    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
        //setPerson(person);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("person='").append(person.getFirstName()).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getPerson() {
        return person.getFirstName();
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
