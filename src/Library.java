import java.util.Arrays;

public class Library {
    String[] books;
     int total_books;
     public Library() {
         this.books = new String[15];
         this.total_books =0;
     }
     public void addBook(String book) {
         this.books[total_books] = book;
         this.total_books++;
         System.out.println('"'+book+'"'+" has been added to the library.");
     }
     public void showBooks(){
         System.out.print("Available books are: ");
             System.out.println(Arrays.toString(books));

     }
     public void issueBook(String book){
         for(int i=0; i<this.books.length;i++){
             if (this.books[i].equals(book)){
                 System.out.println("This book has been issued!");
                 this.books[i]=null;
                 return;
             }
         }
         System.out.println("This book does not exist.");
     }
     public void returnBook(String book) {
         addBook(book);
     }

}
