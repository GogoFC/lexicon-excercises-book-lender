package se.lexicon;

public class Person {

    private int id;
    private String firstName;
    private String lastName;

    private Book loaned;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setLoaned(Book loaned) {
        this.loaned = loaned;
    }

    public String getLoaned() {
        return loaned.getTitle();
    }
}
