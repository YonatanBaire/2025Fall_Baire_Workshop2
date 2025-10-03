package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //You'll need an array of 20 books, put it here
        Book[] books = new Book[] {
                new Book(1, "978-0-452-28423-4", "1984"),
                new Book(2, "978-0-06-112008-4", "To Kill a Mockingbird"),
                new Book(3, "978-0-7432-7356-5", "The Great Gatsby"),
                new Book(4, "978-0-14-143951-8", "Pride and Prejudice"),
                new Book(5, "978-0-316-76948-0", "The Catcher in the Rye"),
                new Book(6, "978-0-06-088328-7", "One Hundred Years of Solitude"),
                new Book(7, "978-0-618-57494-9", "The Lord of the Rings"),
                new Book(8, "978-0-590-35340-3", "Harry Potter and the Sorcerer's Stone"),
                new Book(9, "978-0-385-49081-8", "The Handmaid's Tale"),
                new Book(10, "978-1-4000-3341-6", "Beloved"),
                new Book(11, "978-0-14-026886-7", "The Odyssey"),
                new Book(12, "978-0-14-243724-7", "Moby-Dick"),
                new Book(13, "978-0-14-144114-6", "Jane Eyre"),
                new Book(14, "978-0-547-92822-7", "The Hobbit"),
                new Book(15, "978-0-06-085052-4", "Brave New World"),
                new Book(16, "978-0-307-38789-9", "The Road"),
                new Book(17, "978-0-385-33384-9", "Slaughterhouse-Five"),
                new Book(18, "978-0-375-84220-7", "The Book Thief"),
                new Book(19, "978-0-14-310483-0", "Crime and Punishment"),
                new Book(20, "978-0-06-112241-5", "The Alchemist")
        };

                                                                                                                                                                              //You'll need a scanner to take in user input. Make one.
        Scanner scanner = new Scanner(System.in);
                                                                                                                                                                            //You'll need a menu. A while(true) loop will be helpful
while(true){
            System.out.println("Welcome to the neighborhood library");
            System.out.println("1) Show Available Books.");
            System.out.println("2) Check out a book.");
            System.out.println("3) Show checked out books.");
            System.out.println("4) Check in a book");
            System.out.println("5) Exit.");
            String userInput = scanner.nextLine();


            switch (userInput){                                                                                                                                           //Based on what they type, make a switch case to handle it
                case "1":
                    for(int book = 0; book < books.length; book++)
                        if(!books[book].isCheckedOut()) {
                            System.out.println("ID: " + books[book].getId() + " ----ISBN #: " + books[book].getIsbn() + " ----Book Title: " + books[book].getTitle());           //Use a for loop and sout to print all the book titles
                        }
                    System.out.println("Type anything to go back to main menu.");
                    String back = scanner.nextLine();
                    break;

                case "2":
                                        for(int book = 0; book < books.length; book++){
                    System.out.println("ID: " + books[book].getId() + " ----ISBN #: " + books[book].getIsbn() + " ----Book Title: " + books[book].getTitle());}


                    System.out.println("\n Which book would you like to check out, Put in ID number");
                    String checkout = scanner.nextLine();
                    int bookId = Integer.parseInt(checkout);

                    System.out.println("What is your name?");
                    String name = scanner.nextLine();

                    for(int book = 0; book < books.length; book++) {
                        if (books[book].getId() == bookId) {
                            books[book].setCheckedOut(true);
                            books[book].setCheckedOutTo(name);
                            System.out.println("Book checked out successfully! \n");
                        }
                    }
                    break;

                case"3":
                    for (int book = 0; book < books.length; book++) {
                        if (books[book].isCheckedOut()) {
                            System.out.println("ID: " + books[book].getId() + " ----Book Title: " + books[book].getTitle() + " ----Checked Out To: " + books[book].getCheckedOutTo());
                        }
                    }
                    System.out.println("Type anything to go back to main menu.");
                    String bb = scanner.nextLine();
                    break;



                case "4":
                    // Show checked out books first
                    for (int book = 0; book < books.length; book++) {
                        if (books[book].isCheckedOut()) {
                            System.out.println("ID: " + books[book].getId() + " ----Book Title: " + books[book].getTitle() + " ----Checked Out To: " + books[book].getCheckedOutTo());
                        }
                    }

                    System.out.println("Which book ID would you like to check in?");
                    int number = scanner.nextInt();
                    String checkin = scanner.nextLine();
                    for (int book = 0; book < books.length; book++) {
                        if (books[book].getId() == number) {
                            books[book].checkIn();
                            System.out.println("Book checked in successfully! \n");
                        }
                    }

                    break;


                case"5":                                                                                                                        //Be sure they can exit the program!
                    System.out.println("Thank you for visiting the library and goodbye.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please choose 1,2,3,4 or 5");
                    break;
            }
        }

    }
}


