import java.util.ArrayList;
public class Store {
    private ArrayList<Book> books;
    public Store(){
        this.books = new ArrayList<>();
    }
    public Book getBook(int index){
        Book bookCopy = new Book(this.books.get(index));
        return bookCopy;

    }
    public void setBook(Book book, int index){
        this.books.set(index, new Book(book));
    }
    public void addBook(Book book){
        this.books.add(new Book(book));
    }
    public boolean contains(Book book) {
        return this.books.contains(book);
    }
    public void sellBook(String title){
        for (int i =0;i<books.size();i++){
            if(this.books.get(i).getTitle().equals(title)){
                this.books.remove(i);
            }
        }
    }





}
