package x49;

public class MyLinkedList implements NodeList{
    private ListItem root;
    public MyLinkedList(ListItem item){
        root = item;
    }
    public ListItem getRoot(){
        return root;
    }
    // Come back to this method later
    public boolean addItem(ListItem item){
        boolean result = false;
        if(item.compareTo(root)<0){
            result = addItem(item.previous());
        } else if (item.compareTo(root)>0){
            result = addItem(item.next());
        } else if (root==null){
            root = item;
            result = true;
        } else {
            return false;
        }
        return result;
    }
    public boolean removeItem(ListItem item){
        //revisit the null case
        if(item.previous()==null || item.next()==null){
            return false;
        }
        ListItem left = item.previous();
        ListItem right = item.next();
        left.setNext(right);
        return true;
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
