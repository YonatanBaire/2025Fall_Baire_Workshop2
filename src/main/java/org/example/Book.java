package org.example;

public class Book {
                                                                                                                                     //properties
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut = false;
    private String checkedOutTo = "";


                                                                                                                                      //constructor

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;

    }

                                                                                                                                      //getters and setters


    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //check in and check out methods
    public void checkIn(){
    this.isCheckedOut = false;
    this.checkedOutTo = "";
    }

    public void checkOut(){

    }
}
