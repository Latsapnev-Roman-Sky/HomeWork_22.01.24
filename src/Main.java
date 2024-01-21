public class Main {
    public static void main(String[] args) {
        Author authorFirstBook = new Author("Фёдор", "Достоевский");
        Author authorSecondBook = new Author("Лев", "Толстой");

        Book firstBook = new Book("Униженные и оскорбленные", authorFirstBook, 1861);
        Book secondBook = new Book("Война и мир", authorSecondBook, 1868);

        System.out.println(firstBook);
        System.out.println(secondBook);
        secondBook.setPublicationYear(1900);
        System.out.println(secondBook);
        System.out.println(firstBook.equals(secondBook));


    }
}