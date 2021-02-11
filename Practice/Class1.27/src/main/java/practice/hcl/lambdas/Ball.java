package practice.hcl.lambdas;

public class Ball implements Bounceable<String> {

	@Override
	public boolean test(String obj) {
		// TODO Auto-generated method stub
		return obj.length() > 3;
	}
	
}
