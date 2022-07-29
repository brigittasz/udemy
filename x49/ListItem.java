package x49;
// -  It has three protected fields. Two ListItems called rightLink and leftLink, and an Object called value.

//     -  A constructor that takes an Object and initialises the field value with the parameter that was passed in.

//     -  And seven methods:

//         -  next(), setNext(), previous(), setPrevious() and compareTo() which are package-private and abstract (see child class for declaration).

//         -  getValue(), takes no parameters and returns its value.

//         -  setValue(), takes an Object and assigns it to value.
public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;
    public ListItem(Object o){
        value = o;
    }
    public abstract ListItem next();
    public abstract ListItem setNext(ListItem item);
    public abstract ListItem previous();
    public abstract ListItem setPrevious(ListItem item);
    public abstract int compareTo(ListItem item);
    public Object getValue(){ return value;}
    public void setValue(Object value){ this.value = value; }
}
