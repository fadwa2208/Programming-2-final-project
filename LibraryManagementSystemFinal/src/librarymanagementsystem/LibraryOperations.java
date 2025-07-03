/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagementsystem;

/**
 *
 * @author 6296112
 */
public interface LibraryOperations {
    public abstract boolean addBook(Book book);
    public abstract String retrieveAllBooks();
    public abstract String retrieveBookByAuthor(String author);
    public abstract String retrieveBookByTitle(String title);
    public abstract boolean removeBook(Book book);
}
