package com.hcl.screens;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

import com.hcl.entities.Mdirectory;

public class AddFile {
	
	Mdirectory mainDir = new Mdirectory();
	public AddFile(Mdirectory mainDir) {
		this.mainDir = mainDir;
	}
	
	//Should add regex for fileName
	public boolean create() throws IOException {
		System.out.println("File Name: ");
		Scanner in = Welcome.in;
		String fileName = in.next();
		try {
			Path path = FileSystems.getDefault().getPath(Mdirectory.name + fileName).toAbsolutePath();
			File file = path.toFile();
		      if (file.createNewFile()) {
		    	  System.out.println("File created: " + file.getName());
		    	  mainDir.getFiles().add(file);
		        return true;
		      } else {
		        System.out.println("This File Already Exits, no need to add another");
		        return false;
		      }
		}catch (IOException e){
			System.out.println(e);
			return false;
		}
	}
}
