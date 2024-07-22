# Music-Player-App

This is a simple console-based music player application written in Java. It allows users to create albums, add songs to those albums, create playlists, and play songs from the playlists.

## Features

- Create and manage multiple albums
- Add songs to albums
- Create playlists from songs in different albums
- Play songs from the playlist with controls like next, previous, and replay
- View all songs in the playlist
- Remove songs from the playlist

## Classes

The application consists of three main classes:

1. `Main`: Contains the main logic for playing songs and managing the playlist.
2. `Album`: Represents an album with a list of songs.
3. `Song`: Represents a single song with title and duration.

## How to Use

1. Compile and run the `Main` class.
2. The application will create sample albums and a playlist automatically.
3. Use the following commands while the playlist is playing:
   - 0: Quit the application
   - 1: Play next song
   - 2: Play previous song
   - 3: Replay the current song
   - 4: List all songs in the playlist
   - 5: Print all available options
   - 6: Delete current song from the playlist

## Example Usage

```java
Album album = new Album("Album1", "AC/DC");
album.addSong("TNT", 4.5);
album.addSong("Highway to hell", 3.5);

LinkedList<Song> playlist_1 = new LinkedList<>();
albums.get(0).addToPlayList("TNT", playlist_1);
albums.get(0).addToPlayList("Highway to hell", playlist_1);

play(playlist_1);
```

## Contributing

Feel free to fork this repository and submit pull requests to contribute to this project. You can also open issues for any bugs found or improvements you'd like to suggest.

## License

This project is open source and available under the [MIT License](LICENSE).