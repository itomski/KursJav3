package de.cbw.oca.playground;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ToStringTest {

	public static void main(String[] args) {
		
		Person p = new Person("Peter", "Parker", LocalDate.of(1995, 10, 5), true);
		System.out.println(p);
		
		System.out.println();
		
		Person p2 = new Person("Peter", "Parker", LocalDate.of(1995, 10, 5), true);
		Person p3 = new Person("Peter", "Parker", LocalDate.of(1995, 10, 5), true);
		Person p4 = new Person("Bruce", "Baner", LocalDate.of(1995, 10, 5), true);

		System.out.println(p2 == p3);
		System.out.println(p2.equals(p3));
		
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println();
		
		System.out.println("A" == "A");
		System.out.println("A".equals("A"));
		System.out.println("A".hashCode());
		
		System.out.println();
		
		// HashCode und Equals müssen richtig implementiert werden
		// Set = Menge, erlauben keine Duplikate 
		Set<Person> menge = new HashSet<>();
		menge.add(p2);
		menge.add(p3);
		menge.add(p4);
		System.out.println(menge);
	}

}

/*
// JSON
{
	"books": [
	    {
	    	"title": "Kochen ohne Fett",
	    	"price": 12.99
	    },
	    {
	    	"title": "Kochen mit Fett",
	    	"price": 12.99
	    }
]}


// XML
<books>
	<book id="123">
		<title>Kochen ohne Fett</title>
		<price>12.99</price>
	</book>
	
	<book id="124">
	</book>
	
	<book id="125">
	</book>
</books>
*/