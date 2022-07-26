public class Album{
  String name;
  String artist;
  ArrayList<Song> songs;
  public Album(String name, String artist){
    this.name = name;
    this.artist = artist;
    songs = new ArrayList<Song>();
  }
  //returns true if song was added successfully
  public boolean addSong(String title, double duration){

  }
  //returns Song if exists, otherwise null
  public Song findSong(String title){

  }
  //returns true if exists, false otherwise
  public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){

  }
  //returns true if exists and added successfully. otherwise false
  public boolean addToPlayList(String title, LinkedList<Song> playlist){
    
  }
}
