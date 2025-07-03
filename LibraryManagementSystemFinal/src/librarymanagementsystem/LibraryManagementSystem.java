/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagementsystem;

import librarymanagementsystem.JFrames.MyLibrary;






/**
 *
 * @author 6296112
 */
public class LibraryManagementSystem {
    public static Library library = new Library();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyLibrary ml  = new MyLibrary(library);
        ml.setVisible(true);
        
    }
    
}
