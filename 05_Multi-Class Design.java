public class Song{
  public String name;
  public String artist;
  public int length;
  public Song next;
  public Song(String s1,String s2, int n1){
    this.name = s1;
    this.artist = s2;
    this.length = n1;
  }
  public void songInfo(){
    System.out.println("Title: "+name+", Artist: "+artist);
    System.out.println("Length: "+length+" minutes");
  }
}


public class Playlist {
  public String name;
  public Song start;
  
  public Playlist(String s1) {
    this.name = s1;
    System.out.println(s1 + " created");
  }
  
  public void addSong(Song s1) {
    if (start == null) {
      start = s1;
    } else {
      Song now = start;
      while (now.next != null) {
        now = now.next;
      }
      now.next = s1;
    }
    System.out.println(s1.name + " added to " + name);
  }
  
  public void addSong(Song s1, int n1) {
    if (n1 == 0) {
      s1.next = start;
      start = s1;
      System.out.println(s1.name + " added to " + name);
      return;
    }
    
    Song now = start;
    int count = 0;
    while (now != null && count < n1 - 1) {
      now = now.next;
      count++;
    }
    
    if (now == null) {
      System.out.println("Cannot add song to index " + n1);
    } else {
      s1.next = now.next;
      now.next = s1;
      System.out.println(s1.name + " added to " + name);
    }
  }
  
  public void playSong(String s1) {
    Song now = start;
    while (now != null) {
      if (now.name.equals(s1)) {
        System.out.println("Playing " + now.name + " by " + now.artist);
        return;
      }
      now = now.next;
    }
    System.out.println(s1 + " not found in playlist " + name);
  }
  
  public void playSong(int n1) {
    Song now = start;
    int count = 0;
    while (now != null && count < n1) {
      now = now.next;
      count++;
    }
    if (now == null) {
      System.out.println("Song at Index " + n1 + " not found in " + name);
    } else {
      System.out.println("Playing " + now.name + " by " + now.artist);
    }
  }
  
  public void deleteSong(String s1) {
    if (start == null) {
      System.out.println(s1 + " not found in " + name);
      return;
    }
    
    if (start.name.equals(s1)) {
      start = start.next;
      System.out.println(s1 + " deleted from " + name);
      return;
    }
    
    Song now = start;
    while (now.next != null) {
      if (now.next.name.equals(s1)) {
        now.next = now.next.next;
        System.out.println(s1 + " deleted from " + name);
        return;
      }
      now = now.next;
    }
    System.out.println(s1 + " not found in " + name);
  }
  
  public int totalSong() {
    int count = 0;
    Song now = start;
    while (now != null) {
      count++;
      now = now.next;
    }
    return count;
  }
  
  public void merge(Playlist p1) {
    if (start == null) {
      start = p1.start;
    } else {
      Song now = start;
      while (now.next != null) {
        now = now.next;
      }
      now.next = p1.start;
    }
    System.out.println("Merge Completed!");
  }
  
  public void info() {
    System.out.println(name + " has the following songs:");
    if (start == null) {
      System.out.println("No songs in " + name);
      return;
    }
    
    Song now = start;
    int count = 1;
    while (now != null) {
      System.out.println("Song " + count);
      now.songInfo();
      now = now.next;
      count++;
    }
  }
}

public class SpotifyTester {
  public static void main(String[] args) {
    Song s1 = new Song("Song-A", "Artist-A", 3);
    System.out.println("1===========");
    s1.songInfo();
    System.out.println("2===========");
    Playlist p1 = new Playlist("First Playlist");
    System.out.println("3===========");
    p1.info();
    System.out.println("4===========");
    p1.start = s1;
    p1.info();
    System.out.println("5===========");
    Song s2 = new Song("Song-B", "Artist-B", 4);
    Song s3 = new Song("Song-C", "Artist-C", 2);
    p1.start.next = s2;
    p1.start.next.next = s3;
    p1.info();
    System.out.println("6===========");
    Song s4 = new Song("Song-D",  "Artist-D", 3);
    Song s5 = new Song("Song-E", "Artist-E", 4);
    p1.addSong(s4);
    p1.addSong(s5);
    System.out.println("7===========");
    p1.info();
    System.out.println("8===========");
    Song s6 = new Song("Song-F", "Artist-F", 2);
    Song s7 = new Song("Song-G", "Artist-G", 2);
    Song s8 = new Song("Song-H", "Artist-H", 4);
    Song s9 = new Song("Song-I", "Artist-I", 3);
    p1.addSong(s6, 0);
    p1.addSong(s7, 2);
    p1.addSong(s8, 5);
    p1.addSong(s9, 10);
    System.out.println("9===========");
    p1.info();
    System.out.println("10==========");
    p1.playSong("Song-F");
    p1.playSong("Song-Z");
    p1.playSong("Song-B");
    System.out.println("11==========");
    p1.playSong(0);
    p1.playSong(4);
    p1.playSong(10);
    System.out.println("12==========");
    p1.deleteSong("Song-D");
    p1.deleteSong("Song-B");
    p1.deleteSong("Song-F");
    p1.deleteSong("Song-K");
    System.out.println("13==========");
    p1.info();
    System.out.println("14==========");
    System.out.println(p1.name + " has " + p1.totalSong() + " songs");
    System.out.println("15==========");
    Song ns1 = new Song("Song-Z", "Artist-Z", 3);
    Song ns2 = new Song("Song-Y", "Artist-Y", 4);
    Song ns3 = new Song("Song-X", "Artist-X", 2);
    System.out.println("16==========");
    Playlist p2 = new Playlist("Second Playlist");
    p2.addSong(ns1);
    p2.addSong(ns2);
    p2.addSong(ns3);
    System.out.println("17==========");
    p1.info();
    System.out.println("18==========");
    p2.info();
    System.out.println("19==========");
    p1.merge(p2);
    System.out.println("20==========");
    p1.info();
    System.out.println("21==========");
  }
}

