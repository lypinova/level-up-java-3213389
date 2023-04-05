public class Person {
  String firstName; 
  String lastName; 
  int age; 

public void setFirstName (String firstName) { 
          this.firstName = firstName; 
} // end setter firstName

public void setLastName (String lastName) { 
this.lastName = lastName; 
} // end setter lastName

public void setAge (int age) { 
  this.age = age; 
} // end setter age; 

public String getFirstName() { 
return this.firstName;
} // end getter firstName

public String getLastName() {
  return this.lastName;
}

public Integer getAge() { 
  return this.age;
}

public void greetings() {
  System.out.println("User's first name: " + getFirstName());
  System.out.println("User's last name: " + getLastName());
  System.out.println("User's age: " + getAge());
}

} // end class Person