import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
class Person implements Comparable
{
	String name;
	int age;

	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	public String toString()
	{
		return "["+this.name+" , "+this.age+"]";
	}
	
	public int compareTo(Object o)
	{
		Person p=(Person)o;
		int res=this.name.compareTo(p.name);
		if(res==0)
		{
			res=this.age-p.age;
		}
		return res;
	}
	
}

class PersonDriver
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		
		list.add(new Person("Sangram",23));
		list.add(new Person("Krishna",24));
		list.add(new Person("Jyoti",21));
		list.add(new Person("Deepak",23));
		list.add(new Person("Sangram",25));
		list.add(new Person("Krishna",22));

		System.out.println("The origional ArrayList");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("The sorted Arraylist after calling the compareTo() method");
		System.out.println("Its sorted based on both name and age");
		System.out.println(list);
		System.out.println("The Sorted ArrayList after calling the compare method");
		System.out.println("Its sorted based upon the age");
		Collections.sort(list,new Comparator<Person>(){

			public int compare(Person p1,Person p2)
			{
				return p1.age-p2.age;
			}
		});

		System.out.println(list);
	}
}