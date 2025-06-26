import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        lib.addBook(new Book("The Alchemist", "Paulo Coelho"));
        lib.addBook(new Book("Harry Potter", "J.K. Rowling"));
        lib.addBook(new Book("Atomic Habits", "James Clear"));

        while (true) {
            System.out.println("\n1. Show Books\n2. Issue Book\n3. Return Book\n4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    lib.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String title1 = sc.nextLine();
                    lib.issueBook(title1);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String title2 = sc.nextLine();
                    lib.returnBook(title2);
                    break;
                case 4:
                    System.out.println("Done");
                   
            }
        }
    }
}
