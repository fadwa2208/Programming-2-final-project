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
public class EBook extends Book{
    private double filesize;

    public EBook() {
        super();
        this.filesize = 0.0;
    }

    public EBook(double filesize, String title, String author, String isbn) {
        super(title, author, isbn);
        this.filesize = filesize;
    }

    public double getFilesize() {
        return this.filesize;
    }

    public void setFilesize(double filesize) {
        this.filesize = filesize;
    }

    @Override
    public String toString() {
        return super.toString() + "\n EBook filesize: " + this.filesize + " mb" + "\n --------------------------------------";
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
 
    
    
    
    

