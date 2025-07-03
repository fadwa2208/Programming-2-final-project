/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 6296112
 */
public class PrintedBook extends Book{
    private int pages;

    public PrintedBook() {
        super();
        this.pages = 0;
    }
    
    public PrintedBook(int pages, String title, String author, String isbn) {
        super(title, author, isbn);
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Printed book number of pages: " + this.pages + "\n --------------------------------------";
    }

    @Override
    public boolean saveToCSV() {
        File f;
        String path = "CSVFiles\\CSVBooks.csv";
        f = new File(path);
        try(FileWriter fw = new FileWriter(f,true)){
                fw.write(super.toCSV());
            return true;
        }catch(IOException ioe){
            System.out.println("Could not write in File");
            return false;
        }
    }
    
    
}
