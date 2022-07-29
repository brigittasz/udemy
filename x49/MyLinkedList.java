package x49;

public class MyLinkedList implements NodeList{
    ListItem root;
    public MyLinkedList(ListItem item){
        root = item;
    }
    public ListItem getRoot(){
        return root;
    }
    public boolean addItem(ListItem item){
        return (root.setNext(item)!=null);
    }
    public boolean removeItem(ListItem item){
        
    }
    public void traverse(ListItem root){
        if(root == null){
            System.out.println("The list is empty");
        } else {
            ListItem i = root;
            System.out.println(i.toString());
            traverse(i.next());
        }
    }
    public void traverse(){
        traverse(this.root);
    }

}
