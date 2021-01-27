package learning;

public class AccessSpecifiers2 {
	//default
	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		PriAccessSpecifier  obj = new PriAccessSpecifier(); 
        //trying to access private method of another class 
        //obj.display();
	}

}
