/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author 6296112
 */
public class Library implements LibraryOperations{
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
    
    private boolean saveBooks(){
        String path = "SerializedFiles\\Books.ser";
        
        try(FileOutputStream fos = new FileOutputStream(path)){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(books);
            return true;
        }catch(Exception e){
            System.out.println(e.getClass());
            System.out.println("Could not save books.");
            return false;
        }
    }
    
    private boolean loadBooks(){
        String path = "DeserializedFiles\\Books.ser";
        
        try(FileInputStream fis = new FileInputStream(path)){
            ObjectInputStream ois = new ObjectInputStream(fis);
            books = (ArrayList<Book>)(ois.readObject());
            return true;
        }catch(Exception e){
            System.out.println(e.getClass());
            System.out.println("Could not load books.");
            return false;
        }
    }
    
    public boolean saveBooksToCSV(){
        File f;
        String path = "CSVFiles\\CSVBooks.csv";
        f = new File(path);
        try(FileWriter fw = new FileWriter(f)){
                fw.write("");
        }catch(IOException ioe){
            System.out.println("Could not write in File");
            return false;
        }
         for (Book book : books) {
            book.saveToCSV();
        }
         return true;
    }

    @Override
    public boolean addBook(Book book) {
        try{
            books.add(book);
            return true;
        }catch(Exception e){
            System.out.println("Could not add book to books list.");
            return false;
        }
    }

    @Override
    public String retrieveAllBooks() {
        String str="";
        for (int i = 0; i < books.size(); i++) {
            str += books.get(i) + "\n";
        }
        System.out.println(" ");
        return str;
    }

    @Override
    public String retrieveBookByAuthor(String author) {
        String str = "";
          for (int i = 0; i < books.size(); i++) {
            if(books.get(i).author.toLowerCase().contains(author.toLowerCase())){
                str+= books.get(i);
            }
          }
           return str;
    }

    @Override
    public String retrieveBookByTitle(String title) {
           String str = ""; 
          for (int i = 0; i < books.size(); i++) {
            if(books.get(i).title.toLowerCase().contains(title.toLowerCase())){
                str+= books.get(i) + "\n";
            }
          }
            return str;       
    }
    
    
    public Book findBookByTitle(String title) {
           Book book = null; 
          for (int i = 0; i < books.size(); i++) {
            if(books.get(i).title.toLowerCase().contains(title.toLowerCase())){
                book = books.get(i);
            }
          }
            return book;       
    }

    @Override
    public boolean removeBook(Book book) {
        try{
            books.remove(book);
            return true;
        }catch(Exception e){
            System.out.println("Could not remove book.");
            return false;
        }
    }
    
    
}
