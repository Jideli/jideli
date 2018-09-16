// create array holding objects from any of the child classes

public class Tut60childList {
	
	private Tut60arrayHoldingManyObjects[] thelist = new Tut60arrayHoldingManyObjects[5];
	private int i = 0;
	
	public void add(Tut60arrayHoldingManyObjects a) {
		if(i<thelist.length) {
			thelist[i]=a;
			System.out.println("Parent added at index " +i);
			i++;
			
			
		}
	}

}
