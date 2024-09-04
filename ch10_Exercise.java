//you have to implement a library using java class 'library'
// Methods: add book, issue book, Return book
//Properties: Array to store the available books, array to store the issued books


class Library{

    String[] books;
    int no_of_books = 0;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
//    String[] avBooks = {"Math", "Physics", "Chemistry", "Biology"};
//    String[] issBooks = {"Philosophy", "Elec. Device", "Control system"};

    void addBook(String books){
        this.books[no_of_books] = books;
        no_of_books++;
        System.out.println(books+" has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available books are :");
        for(String book : this.books){
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            String b = this.books[i];
            if(this.books[i].equals(book)){
                System.out.println("Book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Does not exist");
    }
    void returnBook(String book){
        addBook(book);

    }
}

public class ch10_Exercise {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Think and Rich");
        lib.addBook("java");
        lib.showAvailableBooks();
        lib.issueBook("java");
    }
}
