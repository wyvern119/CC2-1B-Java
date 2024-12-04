/*
Padilla, Renzo Ymanuel L.
December 3, 2024
Final Challenge 4: Linked List Application
*/

//imports the scanner
import java.util.Scanner;

//creation of the list
class SongNode {
    String title;
    SongNode prev, next;

    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}

//creation of the circular doubly linked list
public class MusicPlaylist {
    private SongNode current;

    //adds the song into the list
    public void addSong(String title) {
        SongNode newNode = new SongNode(title);
        if (current == null) {
            current = newNode;
            current.next = current;
            current.prev = current;
        } else {
            SongNode last = current.prev;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = current;
            current.prev = newNode;
        }
        System.out.println("Song Added: " + title);
    }

    //removes the current song from the list
    public void removeCurrentSong() {
        
        //if no song is present
        if (current == null) {
            System.out.println("The playlist is empty. No songs to remove.");
            return;
        }
        
        //if a song is present, removes the song
        if (current.next == current) {
            System.out.println("Removed song: " + current.title);
            current = null;
        } else {
            System.out.println("Removed song: " + current.title);
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current = current.next;
        }
    }

    //switches to the next song
    public void nextSong() {
        if (current != null) {
            current = current.next;
            System.out.println("Now playing: " + current.title);
        } else {
            
            //if no song is present
            System.out.println("The playlist is empty, time to add!");
        }
    }

    //switches to the previous song
    public void previousSong() {
        if (current != null) {
            current = current.prev;
            System.out.println("Now playing: " + current.title);
        } else {
            
            //if no song is present
            System.out.println("The playlist is empty, time to add!");
        }
    }

    //displays the current song
    public void displayCurrentSong() {
        if (current != null) {
            System.out.println("Currently playing: " + current.title);
        } else {
            
            //if no song is present
            System.out.println("The playlist is empty, time to add!");
        }
    }

    //displays the entire playlist
    public void displayPlaylist() {
        if (current == null) {
            System.out.println("The playlist is empty, time to add!");
            return;
        }
        System.out.println("Playlist:");
        SongNode temp = current;
        do {
            System.out.println("- " + temp.title);
            temp = temp.next;
        } while (temp != current);
    }

    //part of code operate and displays the list
    public static void main(String[] args) {
        
        //initialization of the list
        MusicPlaylist playlist = new MusicPlaylist();
        
        /*
        //declaration of pre-defined songs
        playlist.addSong("Caravan Palace - Beatophone");
        playlist.addSong("Tame Impala - Let It Happen");
        playlist.addSong("The Joy Formidable - Cradle");
        playlist.addSong("Nine Black Alps - Cosmopolitan");
        playlist.addSong("Jack Stauber - Oh Klahoma");
        playlist.addSong("Subtronics - Spacetime (feat NEVVE) (Virtual Riot Remix)");
        */
        
        //declaration of the scanner
        Scanner input = new Scanner(System.in);
        
        //for choices in the control structure
        int choice;
        boolean check = true;

        //loops the playlist for operating the list
        while (check == true) {
            System.out.println("\nRen's Music Playlist");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Current Song");
            System.out.println("3. Next Song");
            System.out.println("4. Previous Song");
            System.out.println("5. Display Current Song");
            System.out.println("6. Display Entire Playlist");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            
            //takes the user input for processesing input later
            choice = input.nextInt();

            //the choices for operating and manipulating the list
            switch (choice) {
                
                //adds a song
                case 1:
                    System.out.print("Enter the song title: ");
                    String title = input.nextLine();
                    playlist.addSong(title);
                    break;
                
                //removes a song
                case 2:
                    playlist.removeCurrentSong();
                    break;
                
                //goes to the next song
                case 3:
                    playlist.nextSong();
                    break;
                
                //goes to the previous song
                case 4:
                    playlist.previousSong();
                    break;
                
                //displays the current song
                case 5:
                    playlist.displayCurrentSong();
                    break;
                
                //displays the entire playlist
                case 6:
                    playlist.displayPlaylist();
                    break;
                
                //exits the program
                case 7:
                    System.out.println("Exiting Music Playlist");
                    System.out.println("Thank you for Using the Program!");
                    check = false;
                    break;
            }
        }
    }
}