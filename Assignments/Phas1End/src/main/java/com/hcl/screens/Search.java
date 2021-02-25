package com.hcl.screens;

import java.io.File;
//import java.nio.file.FileSystems;
//import java.nio.file.Path;
import java.util.LinkedList;
import java.util.Scanner;

import com.hcl.entities.Mdirectory;

public class Search {
	 public boolean find(Mdirectory mainDir) {
		LinkedList<File> files = mainDir.getFiles();
		Scanner in = Welcome.in;
		System.out.println("File Name: ");
		String fileName = in.next();
//		Path path = FileSystems.getDefault().getPath(Mdirectory.name + fileName).toAbsolutePath();
//		File file = path.toFile();
		
		for(int i = 0; i <files.size(); i++) {
			if(files.get(i).getName().equals(fileName)) {
				System.out.println("Found " + fileName);
				return true;
			}
		}
		System.out.println("Did not find " + fileName);
		return false;
	 }
	 
	 
}
