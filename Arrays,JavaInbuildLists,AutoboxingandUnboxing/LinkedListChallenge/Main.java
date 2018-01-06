package com.bikashgurung;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer","Deep Purple");
        album.addSong("Stormbringer",4.44);
        album.addSong("Love don't",4.50);
        album.addSong("Holy man",3.44);
        album.addSong("Hold on",3.54);
        album.addSong("lady double dealer",3.88);
        album.addSong("You can't",5.4);
        album.addSong("High ball",4.70);
        album.addSong("The gypsy",3.77);
        album.addSong("Soldier",4.2);
        albums.add(album);

        album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock",3.44);
        album.addSong("I put",5.50);
        album.addSong("Let's go",2.94);
        album.addSong("Beach",3.54);
        album.addSong("Back",4.88);
        album.addSong("COD",4.4);
        album.addSong("Breaking the rules",3.70);
        album.addSong("Night",5.77);
        album.addSong("Evil",3.2);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("You can't",playList);
        albums.get(0).addToPlaylist("Holy man",playList);
        albums.get(0).addToPlaylist("You don't know",playList); //does not exist
        albums.get(0).addToPlaylist(9, playList);
        albums.get(1).addToPlaylist(8, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(90, playList); // does not exist

        play(playList);

    }
    public static void play(LinkedList<Song> playList){
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist.");
            return;
        }
        else{
            System.out.println("Now playing "+listIterator.next().toString());
            printMenu();
        }
        while (!quit){
            int action = scan.nextInt();
            scan.nextLine();
            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+listIterator.next().toString());
                    }
                    else {
                        System.out.println("You have reached the end of the playlist.");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }
                    else {
                        System.out.println("We are at the starting.");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying "+listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are at the start of the list.");
                        }
                    }
                    else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying "+listIterator.next().toString());
                            forward = true;
                        }
                        else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing "+listIterator.next());
                        }
                        else if (listIterator.hasPrevious()){
                            System.out.println("Now playing "+listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("Available actions:\npresss");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available options\n" +
                "6 - delete current song from playlist\n");
    }
    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=======================================");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("=====================================");
    }
}
