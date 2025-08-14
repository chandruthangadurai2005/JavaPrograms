/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 class Person{
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // To print Person object info
    @Override
    public String toString() {
        return name + " (" + age + ")";
    } 
}
public class ArrayPerson {
    public static void main(String[] args){
     ArrayList<Person> people = new ArrayList<>();
     people.add(new Person("Chandru",20));
     people.add(new Person("Hari",20));
     people.add(new Person("Sharvesh",16));
     people.add(new Person("Naresh",12));
     System.out.println("Original list:" + people);
     people.add(0,new Person("Jashwanth",9));
     System.out.println("New list:" + people);
     Person removedPerson = people.remove(4);
     System.out.println("Removed the fifth element: " + removedPerson);
     System.out.println("List after removal: " + people);
     int retrieveIndex = 2;
     Person p = people.get(retrieveIndex);
     System.out.println("Element at index " + retrieveIndex + ": " + p);
     int updateIndex = 3;
        if (updateIndex < people.size()) {
            people.set(updateIndex, new Person("Frank", 33));
            System.out.println("After updating index " + updateIndex + ": " + people);
        }
     String searchName = "Hari saravanan";
        boolean found = false;
        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }
        System.out.println(searchName + (found ? " is present in the list." : " is NOT present in the list."));
      System.out.println("Is the list empty? " + people.isEmpty());

        // Print all elements with their positions
        System.out.println("All elements with positions:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println("Position " + i + ": " + people.get(i));
        }

        // Extract a portion of the list (subList)
        int fromIndex = 1;
        int toIndex = 4; // exclusive
        if (fromIndex >= 0 && toIndex <= people.size() && fromIndex < toIndex) {
            List<Person> subList = people.subList(fromIndex, toIndex);
            System.out.println("Extracted portion (index " + fromIndex + " to " + (toIndex - 1) + "): " + subList);
        }

        // Number of elements
        System.out.println("Number of elements: " + people.size());

        // Collections methods:
        // Sort by name (alphabetical order)
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted by name: " + people);

        // Shuffle list
        Collections.shuffle(people);
        System.out.println("Shuffled list: " + people);

        // Reverse list
        Collections.reverse(people);
        System.out.println("Reversed list: " + people);
    }
    
}

















/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author student
 */

public class Arraystring {
    public static void main(String[] args){
     ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        System.out.println("Original list:"+list);
        list.add(0,"Fig");
        System.out.println("New list:"+list);
        int n=list.size();
        if(n>5){
            list.remove(5);
        }
        int k=3;
        if(k<n) list.get(k);
        list.set(k,"Grapes");
        String tosearch="Fig";
        list.contains(tosearch);
        System.out.println("Is the list empty?" + list.isEmpty());
        for(int i=0;i<n;i++){
            System.out.println("position" + i+":"+ list.get(i));
        }
        int s=1,e=4;
        for(int i=s;i<e;i++){
            System.out.println( list.get(i));
        }
        System.out.println("No of elements"+list.size());
        Collections.sort(list);
        System.out.println("Sorted list"+list);
        Collections.shuffle(list);
        System.out.println("Shuffled list"+list);
        Collections.reverse(list);
        System.out.println("Reverse list"+list); 
    }
}
