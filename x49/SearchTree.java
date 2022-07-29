package x49;

public class SearchTree implements NodeList{
    private ListItem root;
    public SearchTree(ListItem item){
        root = item;
    }    
    public ListItem getRoot(){
        return root;
    }
    public boolean addItem(ListItem item){
        boolean result = false;
        if(item.compareTo(root)<0){
            result = addItem(item.previous());
        } else if (item.compareTo(root)>0){
            result = addItem(item.next());
        } else if (root==null){
            root = item;
        }
        return result;
    }
    public boolean removeItem(ListItem item){
        boolean result = false;
        if(item.compareTo(root)<0){
            result = removeItem(item.previous());
        } else if (item.compareTo(root)>0){
            result = removeItem(item.next());
        } else if (root==null){
            root = item;
        }
        return result;
    }
    public void traverse(ListItem item){

    }
    public void performRemoval(ListItem remove, ListItem parent){

    }
}
