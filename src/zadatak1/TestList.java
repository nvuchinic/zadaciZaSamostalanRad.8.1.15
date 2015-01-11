package zadatak1;

import zadatak2.SortedDynamicArrayInt;

public class TestList {
public static void main(String[] args) {
	LinkedListInt lli=new LinkedListInt();
	lli.add(3);
	lli.add(5);
	lli.add(8);
	lli.add(11);
	//System.out.println(lli.getSize());
	/*boolean exists=lli.contains(0);
	if(exists==true){
		System.out.println("Broj se nalazi u listi");
	}
	else
	{
	System.out.println("Broja nema u listi");	
	}*/
	/*DynamicArrayInt dai=new DynamicArrayInt();
	dai.add(3);
	dai.add(5);
	dai.add(8);
	dai.add(11);
	boolean exists=dai.contains(5);
	if(exists==true){
		System.out.println("Broj se nalazi u nizu");
	}
	else
	{
	System.out.println("Broja nema u nizu");	
	}*/
	
	SortedDynamicArrayInt sda=SortedDynamicArrayInt();
}
}
