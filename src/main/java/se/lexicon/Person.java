package se.lexicon;

public class Person {

    private int id;
    private String firstName;
    private String lastName;

    private Book loaned;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void loanBook (Book title) {
        title.setPerson(this);
        this.loaned = title;
    }

    //public void setLoaned(Book loaned) {
    //    this.loaned = loaned;
    //}

    public String getLoaned() {
        return loaned.getTitle();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
