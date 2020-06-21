public class Person<E> {
        private Person prev,next;
        private E element;
        private String firstname;
        private String lastname;
        private String address;
        
        public Person(Person prev,E element,Person next,String firstname,String lastname,String address){
                this.prev = prev;
                this.element = element;
                this.firstname = firstname;
                this.lastname = lastname;
                this.address = address;              
        }

    /**
     * @return the prev
     */
    public Person getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Person prev) {
        this.prev = prev;
    }

    /**
     * @return the next
     */
    public Person getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Person next) {
        this.next = next;
    }

    /**
     * @return the element
     */
    public E getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(E element) {
        this.element = element;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
        
                
}
