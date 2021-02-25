package com.hcl.screens;

import java.io.File;
//import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

import com.hcl.entities.Mdirectory;

public class DeleteFile {
	
	Mdirectory mainDir = new Mdirectory();
	public DeleteFile(Mdirectory mainDir) {
		this.mainDir = mainDir;
	}
	
	 public void delete() {
		System.out.println("File Name: ");
		Scanner in = Welcome.in;
		String fileName = in.next();
	     //TODO: Delete file
		Path path = FileSystems.getDefault().getPath("src/main/resources/"+fileName).toAbsolutePath();
		File file = path.toFile();
	      if (file.delete()) {
	    	  System.out.println("Deleted File: " + file.getName());
	    	  mainDir.getFiles().remove(file);
	      } else {
	        System.out.println("Failed to delete file:" + fileName);
	      }
	 }
}
