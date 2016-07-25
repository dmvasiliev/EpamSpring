http://howtodoinjava.com/core-java/basics/working-with-hashcode-and-equals-methods-in-java/

Working with hashCode and equals methods in java
October 9, 2012 by Lokesh Gupta

In this post, I will point out my understanding about hashCode() and equals() methods. I will talk about their default implementation and how to correctly override them. I will also write about implement these methods using Apache Commons package’s utility classes.

hashCode() and equals() methods have been defined in Object class which is parent class for java objects. For this reason, all java objects inherit a default implementation of these methods.

Sections in this post:

Usage of hashCode() and equals()
Overriding the default behavior
Overriding hashCode() and equals() using Apache Commons Lang
Important things to remember
Special Attention When Using in ORM

Usage of hashCode() and equals()

hashCode() method is used to get a unique integer for given object. This integer is used for determining the bucket location, when this object needs to be stored in some HashTable like data structure. By default, Object’s hashCode() method returns and integer representation of memory address where object is stored.

equals() method, as name suggest, is used to simply verify the equality of two objects. Default implementation simply check the object references of two objects to verify their equality.


Overriding the default behavior

Everything works fine until you do not override any of these methods in your classes. But, sometimes application needs to change the default behavior of some objects.

Lets take an example where your application has Employee object. Lets create a minimal possible structure of Employee class::

public class Employee
{
    private Integer id;
    private String firstname;
    private String lastName;
    private String department;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
Above Employee class has some very basic attributes and there accessor methods. Now consider a simple situation where you need to compare two employee objects.

public class EqualsTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setId(100);
        e2.setId(100);

        //Prints false in console
        System.out.println(e1.equals(e2));
    }
}
No prize for guessing. Above method will print “false“. But, is it really correct after knowing that both objects represent same employee. In a real time application, this must return true.

To achieve correct behavior, we need to override equals method as below:

public boolean equals(Object o) {
    if(o == null)
    {
        return false;
    }
    if (o == this)
    {
        return true;
    }
    if (getClass() != o.getClass())
    {
        return false;
    }

    Employee e = (Employee) o;
    return (this.getId() == e.getId());

}
Add this method to your Employee class, and EqualsTest will start returning “true“.

So are we done? Not yet. Lets test again above modified Employee class in different way.

import java.util.HashSet;
import java.util.Set;

public class EqualsTest
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setId(100);
        e2.setId(100);

        //Prints 'true'
        System.out.println(e1.equals(e2));

        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);

        //Prints two objects
        System.out.println(employees);
    }
}
Above class prints two objects in second print statement. If both employee objects have been equal, in a Set which stores only unique objects, there must be only one instance inside HashSet, after all both objects refer to same employee. What is it we are missing??

We are missing the second important method hashCode(). As java docs say, if you override equals() method then you must override hashCode() method. So lets add another method in our Employee class.

@Override
public int hashCode()
{
    final int PRIME = 31;
    int result = 1;
    result = PRIME * result + getId();
    return result;
}
Once above method is added in Employee class, the second statement start printing only single object in second statement, and thus validating the true equality of e1 and e2.


Overriding hashCode() and equals() using Apache Commons Lang

Apache commons provide two excellent utility classes HashCodeBuilder and EqualsBuilder for generating hash code and equals methods. Below is its usage:

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
public class Employee
{
    private Integer id;
    private String firstname;
    private String lastName;
    private String department;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public int hashCode()
    {
        final int PRIME = 31;
        return new HashCodeBuilder(getId()%2==0?getId()+1:getId(), PRIME).toHashCode();
    }
    @Override
    public boolean equals(Object o) {
    if (o == null)
       return false;

    if (o == this)
       return true;

    if (o.getClass() != getClass())
       return false;

    Employee e = (Employee) o;

    return new EqualsBuilder().
              append(getId(), e.getId()).
              isEquals();
    }
}
Alternatively, if you are using any code editor, they also must be capable of generating some good structure for you. For example, Eclipse IDE has option under right click on class >> source > Generate hashCode() and equals() … will generate a very good implementation for you.




Important things to remember

1) Always use same attributes of an object to generate hashCode() and equals() both. As in our case, we have used employee id.

2) equals() must be consistent (if the objects are not modified, then it must keep returning the same value).

3) Whenever a.equals(b), then a.hashCode() must be same as b.hashCode().

4) If you override one, then you should override the other.


Special Attention When Using in ORM

If you’re dealing with an ORM, make sure to always use getters, and never field references in hashCode() and equals(). This is for reason, in ORM, occasionally fields are lazy loaded and not available until called their getter methods.

For example, In our Employee class if we use e1.id == e2.id. It is very much possible that id field is lazy loaded. So in this case, one might be zero or null, and thus resulting in incorrect behavior.

But if uses e1.getId() == e2.getId(), we can be sure even if field is lazy loaded; calling getter will populate the field first.

This is all i know about hashCode() and equals() methods. I hope, it will help someone somewhere.

If you feel, I am missing something or wrong somewhere, please leave a comment. I will update this post again to help others.

Happy Learning !!