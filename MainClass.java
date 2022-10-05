public class MainClass {
    public static void main(String[] args) {
        Library library=new Library();
        Book b1= new Book(1,"Ankur","Do Epic Shit");
        Book b2= new Book(2,"Wariko","Do Epic Shit 2");
        library.add(b1);
        library.showBooks();
        library.add(b2);
        library.showBooks();
        library.delete(b1.id);
        library.showBooks();
    }
}
