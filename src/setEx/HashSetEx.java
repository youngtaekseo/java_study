package setEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Person {
	private int age;
	private String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
		@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person ps = (Person) obj;
		return this.name.equals(ps.name) && (this.age == ps.age);
	}
}

public class HashSetEx {
	
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person(100, "홍길동"));
		set.add(new Person(90, "손흥민"));
		set.add(new Person(80, "김민재"));
		set.add(new Person(100, "홍길동"));
		set.add(new Person(80, "김민재"));
		
		Iterator ir = set.iterator();
		while(ir.hasNext()) {
			Person ps = (Person) ir.next();
			System.out.println(ps.toString());
		}
	}

}
