public class LinkedList{
  SongWrapper head;
  SongWrapper tail;
  public LinkedList(){
    head = null;
    tail = null;
  }
  public boolean addSong(Song song){
     if(head == null && tail == null){
        head = new SongWrapper(song);
        tail = head;
        return true;
     } else if (head != null && tail != null){
        SongWrapper temp = tail;
        tail = new SongWrapper(song);
        temp.setNext(tail);
        return true;
     }
     return false;
  }
  public boolean isEmpty(){
    return head == null && tail == null;
  }
  public Song removeSong(){
    if(!this.isEmpty()){
        SongWrapper temp = head;
        head = head.getNext();
        if(head == null)
            tail = null;
        return temp.getSong();
    } else {
        System.out.println("trying to remove from empty list");
    }
    return null;
  }
  public void printHeadTail(){
    System.out.println(head.toString()+" "+ tail.toString());
  }
  
  class SongWrapper{
    Song song;
    SongWrapper next;
    SongWrapper(Song song){
        this.song = song;
        this.next = null;
    }
    private void setNext(SongWrapper next){
        this.next = next;
    }
    private SongWrapper getNext(){
        return next;
    }
    public String toString(){
        return song.toString();
    }
    private Song getSong(){
        return song;
    }
  }
}
