package Chapter6;

import java.time.Year;

public class Book {

    /**
     * Instance variables
     */

    /**
     * The book title
     * @String title
     */
    private String title;

    /**
     *The book's author
     * @Sting author
     */
    private String author;

    /**
     * The book's publisher
     * @String publisher
     */
    private String publisher;

    /**
     * The book's year of publication
     * @Year year;
     */
    private Year year;

    /**
     * Whether the book is circulating or non-circulating
     * @boolean isCirculating
     */
    private boolean isCirculating;

    public Book(){
        this.title = "";
        this.author = "";
        this.publisher = "";
        this.year = Year.now();
        this.isCirculating = true;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return  this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public Year getYear(){
        return  this.year;
    }

    public boolean isCirculating(){
        return isCirculating;
    }

    public Book setTitle(String title){
        this.title = title;
        return this;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return  this;
    }

    public Book setPublisher(String publisher){
        this.publisher = publisher;
        return  this;
    }

    public Book setYear(Year year) {
        this.year = year;
        return this;
    }

    public Book setIsCirculating(boolean isCirculating){
        this.isCirculating = isCirculating;
        return this;
    }

    public String toString() {
        String bookYear = this.year.toString();
        return "Chapter6.Book Title: " + this.title + " , \n" + "Chapter6.Book Author: " + this.author + " , \n" + " Chapter6.Book Publisher : " + this.publisher + " , \n " + "Chapter6.Book year or publishing: " +bookYear;
    }
}
