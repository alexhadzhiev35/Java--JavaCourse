public abstract class ListItem {
    protected ListItem rightLink = null; //reference to te right List Item
    protected ListItem leftLink = null;//reference to te left List Item

    protected Object value; // Holding a value(item)

    public ListItem(Object value) {
        this.value = value;
    }//Constructor
    abstract ListItem next();//To move to the next item in the list
    abstract ListItem setNext(ListItem item);//To set the next item in the list
    abstract ListItem previous(); //To move to the previous item in the list
    abstract ListItem setPrevious(ListItem item); //To set the previous item in the list

    abstract int compareTo(ListItem item);
    //Creating a compareTo() method which  takes a parameter of the same type as the
    // class and returns 0 if the values are equal, greater than zero if the value sorts greater than
    // the parameter and less than zero if it sorts less than the parameter.
    //Basically used to sort the list.


    public Object getValue() {
        return value;
    }//Getter of the value being stored in the list.

    public void setValue(Object value) {
        this.value = value;
    }//Setter of the value being stored in the list.
}