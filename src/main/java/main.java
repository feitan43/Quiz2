/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class main {
     public static void main(String[] args) {
        
        Person<String> Person1 = new Person(null, "Person1", null,"firstname","lastname","address");
        Person<String> Person2 = new Person(null, "Person2", null,"firstname","lastname","address");
        Person<String> Person3 = new Person(null, "Person3", null,"firstname","lastname","address");
        Person<String> Person4 = new Person(null, "Person4", null,"firstname","lastname","address");
        Person<String> Person5 = new Person(null, "Person5", null,"firstname","lastname","address");
        
        PersonList<Person> pList = new PersonList<>();
        pList.addFirst(Person1);
        pList.addFirst(Person2);
        pList.addFirst(Person3);
        pList.addFirst(Person4);
        pList.addLast(Person5);
        
        System.out.println("Before Remove");
        pList.DoublyLinkedList();
        
        
        System.out.println("\nAfter Remove First");
        System.out.println("Removed: " + pList.removeFirst().getElement());
        pList.DoublyLinkedList();
        
        System.out.println("\nAfter Remove First");
        System.out.println("Removed: " + pList.removeFirst().getElement());
        pList.DoublyLinkedList();
        
        System.out.println("\nAfter Remove First");
        System.out.println("Removed: " + pList.removeFirst().getElement());
        pList.DoublyLinkedList();
        
        System.out.println("\nAfter Remove First");
        System.out.println("Removed: " + pList.removeFirst().getElement());
        pList.DoublyLinkedList();
        
        
        System.out.println("\nAfter Remove Last");
        System.out.println("Removed: " + pList.removeLast().getElement());
        pList.DoublyLinkedList();
        
         System.out.println("\nAfter Remove Last");
        pList.DoublyLinkedList();
     }
}
