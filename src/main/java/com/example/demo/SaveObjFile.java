package com.example.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.apache.tomcat.jni.File;

public class SaveObjFile  implements Serializable{
	
	transient int a;
	static int b;
	String name;
	int age;
	
	public SaveObjFile(String name, int age, int a, int b) {
		
		this.name = name; 
        this.age = age; 
        this.a = a; 
        this.b = b; 
		
	}
	public static void printdata(SaveObjFile object1) 
    { 
  
        System.out.println("name = " + object1.name); 
        System.out.println("age = " + object1.age); 
        System.out.println("a = " + object1.a); 
        System.out.println("b = " + object1.b); 
    } 

	public static void main(String[] args) 
    { 
		SaveObjFile object = new SaveObjFile("ab", 20, 2, 1000); 
        String filename = "shubham.txt"; 
  
        // Serialization 
        try { 
  
            // Saving of object in a file 
            FileOutputStream file = new FileOutputStream 
                                           (filename); 
            ObjectOutputStream out = new ObjectOutputStream 
                                           (file); 
            out.writeObject(object);
            object = null;
            out.close();
            file.close();
            object.b= 2000;
        }catch (IOException ex) { 
            System.out.println("IOException is caught when writing"); 
        } 
        
       
        try {
        	
        	FileInputStream fi =new FileInputStream(filename);
        	ObjectInputStream oi = new ObjectInputStream(fi);
        	
        	object = (SaveObjFile)oi.readObject();
        	printdata(object);
        	
        }
        
        catch (IOException ex) { 
            System.out.println("IOException is caught when reading"); 
        } 
  
        catch (ClassNotFoundException ex) { 
            System.out.println("ClassNotFoundException" + 
                                " is caught"); 
        } 
    }
}
