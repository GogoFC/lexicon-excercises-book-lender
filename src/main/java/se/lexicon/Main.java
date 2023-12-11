package se.lexicon;

public class Main {
    public static void main(String[] args) {

        Book littlePrince = new Book("Den lille Prinsen","Antoine De Saint-Exupéry" );
        Book designPatterns = new Book("Design Patterns","Erich Gamma , Richard Helm, Ralph Johnson , John Vlissides");
        Book c = new Book("The C Programming Language","Brian Kernighan, Dennis Ritchie");

        Person goran = new Person(1000,"Goran","Muminovic");
        Person amra = new Person(1001, "Amra","Piragic");

        //amra.setLoaned(designPatterns);
        //goran.setLoaned(littlePrince);

        goran.loanBook(c);
        //c.setPerson(goran);

        //System.out.println("Amra loaned " + amra.getLoaned());
        System.out.println("Goran loaned " + goran.getLoaned());

        System.out.println(c.getPerson());

    }
}