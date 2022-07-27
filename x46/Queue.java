public class Queue{
    Song song;
    Queue next;
    public Queue(){
        this.song = null;
        this.next = null;
    }
    public Queue(Song song){
        this.song = song;
        this.next = null;
    }
    public Queue(Song song, Queue next){
        this.song = song;
        this.next = next;
    }
    
}