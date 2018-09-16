// in this class, build an array to hold objects ONLY from Tut59child1

public class Tut59child1List {
	private Tut59child1[] thelist = new Tut59child1[5];
	private int i=0;
	
	// build new method to hold child1 objects
	public void add(Tut59child1 d) { // every time this method is called, new object will be added to array
		if(i<thelist.length) {
			thelist[i]=d;
			System.out.println("Dog added at index "+i);
			i++;
			
		}
	}

}
