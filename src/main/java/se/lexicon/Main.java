package se.lexicon;

public class Main {
    public static void main(String[] args) {

        Book theLittlePrince = new Book("Den lille Prinsen","Antoine De Saint-Exupéry" );
        Book designPatterns = new Book("Design Patterns","Erich Gamma , Richard Helm, Ralph Johnson , John Vlissides");


        Person goran = new Person(1000,"Goran","Muminovic");

        goran.setLoaned(theLittlePrince);
        System.out.println(goran.getLoaned());

    }
}