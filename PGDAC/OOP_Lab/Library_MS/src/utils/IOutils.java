package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import static utils.BookUtils.populateLib;

import com.app.core.Book;

public class IOutils {
	
	//to store books map in bin file
	public static void storeBooks(Map<String, Book> map, String name) throws IOException {
		try(ObjectOutputStream bs  = new ObjectOutputStream(new FileOutputStream(name))){
		bs.writeObject(map);
		System.out.println("Saved books in bin.");
		}
	}
	
	//to retrieve books map from bin file
		public static Map<String, Book> restoreBooks(String name) throws IOException, ClassNotFoundException {
			File f = new File(name);
			
			if(f.isFile() && f.canRead()) {
			try(ObjectInputStream brs = new ObjectInputStream(new FileInputStream(name))){
			return (Map<String, Book>) brs.readObject();
			}
			}
			
			else
				return populateLib();
		}
}
