/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class PersonList<E> {
    private Person header,trailer;
    private int size;
    
    public PersonList(){
        header = new Person(null, null, null, "firstname", "lastname", "address");
        trailer = new Person(header, null, null, "firstname", "lastname", "address");
        header.setNext(trailer);
        size = 0;
}

    /**
     * @return the header
     */
    public Person getHeader() {
        return header;
    }

    /**
     * @param header the header to set
     */
    public void setHeader(Person header) {
        this.header = header;
    }

    /**
     * @return the trailer
     */
    public Person getTrailer() {
        return trailer;
    }

    /**
     * @param trailer the trailer to set
     */
    public void setTrailer(Person trailer) {
        this.trailer = trailer;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
     public boolean isEmpty(){
        return size <= 0;
    }
    
    public Person first(){
        return header.getNext();
    }
    
    public Person last(){
        return trailer.getPrev();
    }
    private void addBetween(Person prevNode, Person newNode, Person nextNode){
        newNode.setPrev(prevNode);
        newNode.setNext(nextNode);
        prevNode.setNext(newNode);
        nextNode.setPrev(newNode);
        size++;
    }
    
    private void remove(Person node){
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        node.setNext(null);
        node.setPrev(null);
        size--;
    }
    
    public Person removeFirst(){
        Person temp = header.getNext();
        remove(header.getNext());
        return temp;
    }
    
    public Person removeLast(){
        Person temp = trailer.getPrev();
        remove(trailer.getPrev());
        return temp;
    }
    
    public void addFirst(Person newNode){
        addBetween(header, newNode, header.getNext());
    }
    
    public void addLast(Person newNode){
        addBetween(trailer.getPrev(), newNode, trailer);
    }
    
    public void DoublyLinkedList(){
//        System.out.print(header.getNext().getElement());
//        System.out.print(header.getNext().getNext().getElement());
//        System.out.print(header.getNext().getNext().getNext().getElement());
        Person<E> tempNode = header.getNext();
        for(int i = 0; i < size; i++){
            System.out.print("[" + tempNode.getElement() + tempNode.getFirstname() + tempNode.getLastname() + tempNode.getAddress() + "]");
            tempNode = tempNode.getNext();
        }
    }
}
