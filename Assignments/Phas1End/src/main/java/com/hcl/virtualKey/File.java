package com.hcl.virtualKey;

public class File {
	
	String name;
	public File(String fName) {
		this.name = fName;
	}

    String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


}
