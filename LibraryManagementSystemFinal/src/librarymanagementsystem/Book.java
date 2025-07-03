/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;

import java.io.Serializable;

/**
 *
 * @author 6296112
 */
public abstract class Book implements Serializable, Formatable{
    protected String title, author, isbn;

    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book info: \n title: " + this.title + "\n author: " + this.author + "\n isbn: " + this.isbn;
    }
    
    @Override
    public String toCSV() {
        return this.title + "; " + this.author + "; " + this.isbn + "\n";
    }
    
}
