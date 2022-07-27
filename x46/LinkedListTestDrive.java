public class LinkedListTestDrive{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.removeSong();
        list.addSong(new Song("title", 25.11));
        list.printHeadTail();
        list.addSong(new Song("helloworld", 34.5));
        list.printHeadTail();
        Song song = list.removeSong();
        Song song1 = list.removeSong();
        Song song2 = list.removeSong();
        list.printHeadTail();
    }
}