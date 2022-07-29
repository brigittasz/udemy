package x49;

public class Node extends ListItem{
    public Node(Object o){
        super(o);
    }
    public ListItem next(){
        return super.rightLink;
    }
    public ListItem setNext(ListItem item){
        super.rightLink = item;
        return super.rightLink;
    }
    public ListItem previous(){
        return super.leftLink;
    }
    public ListItem setPrevious(ListItem item){
        super.leftLink = item;
        return super.leftLink;
    }
    public int compareTo(ListItem item){
        //use source code from videos
        //it assumes the object as a string which annoys the heck out of me
        if(item!=null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
