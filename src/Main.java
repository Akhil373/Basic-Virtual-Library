import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        System.out.println("WELCOME TO ONLY VIRTUAL LIBRARY YOU'LL EVER NEED!");
        while (true) {
            System.out.println("Choose from options below: ");
            System.out.println("1. Add Book\n" + "2. Show all books\n" + "3. Issue Book\n" + "4. Return Book\n" + "5. Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter the book to be added: ");
                String bk = sc.next();
                lib.addBook(bk);
            } else if (ch == 2) {
                lib.showBooks();
            } else if (ch == 3) {
                System.out.print("Enter the book name: ");
                String choice = sc.next();
                lib.issueBook(choice);
            } else if (ch == 4) {
                System.out.print("Enter book name: ");
                String bk1 = sc.next();
                lib.returnBook(bk1);
            } else if(ch==5){
                break;
            } else {
                System.out.println("Valid choices are 1,2,3,4 & 5 only.");
            }
        }
    }
}