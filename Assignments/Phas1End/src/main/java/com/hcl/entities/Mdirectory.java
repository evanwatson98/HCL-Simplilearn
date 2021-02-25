package com.hcl.entities;

import java.util.LinkedList;
import java.io.File;
//import com.hcl.virtualKey.File; 
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Mdirectory {

    public static final String name = "src/main/resources/";


    //TODO: Possibly use a HashMap?
    private LinkedList<File> files = new LinkedList<File>();
    
    Path path = FileSystems.getDefault().getPath("src/main/resources/").toAbsolutePath();
	File folder = path.toFile();
	File[] listOfFiles = folder.listFiles();

    public String getName() {
        return name;
    }
    
    public void printFiles() {
    	System.out.println("Exisiting Files: ");
    	for(int i = 0; i < files.size(); i++) {
    		System.out.println(files.get(i).getName());
    	}
    }

    public LinkedList<File> grabFiles() {
    	files.clear();
    	for (int i = 0; i < listOfFiles.length; i++) {
    	  if (listOfFiles[i].isFile()) {
//    	    System.out.println("File " + listOfFiles[i].getName());
    	    files.add(listOfFiles[i]);
    	  } else if (listOfFiles[i].isDirectory()) {
//    	    System.out.println("Directory " + listOfFiles[i].getName());
    	  }
    	}
    	return files;
    }
    
    public LinkedList<File> getFiles(){
    	return this.files;
    }

}
