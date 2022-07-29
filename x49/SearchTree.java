package x49;

public class SearchTree implements NodeList{
    ListItem root;
    public SearchTree(ListItem item){
        root = item;
    }    
    public ListItem getRoot(){
        return root;
    }
    public boolean addItem(ListItem item){
        root.setNext(item);
    }
    public boolean removeItem(ListItem item){
        
    }
    public void traverse(ListItem item){

    }
    public void performRemoval(ListItem remove, ListItem parent){

    }
