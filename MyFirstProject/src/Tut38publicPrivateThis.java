
public class Tut38publicPrivateThis {
	private int hour = 1;
	private int minute = 2;
	private int second = 3;
	
	public void setTime(int hour, int minute, int second) {
		
	this.hour = 4;
	this.minute = 5;
	this.second = 6;
	}
}

/*
public: can be accessed by other classes
private variables: only methods inside the class have access to the variables
static method or variable is unique, main method is always static, common to capitalize static names
final: to mark a variable constant, so that it can be assigned only once i.e. can't be overwritten

if say local variables have the same name as parameters of a public method, the local variables will be used
use this.* to override and use the public variable

*/