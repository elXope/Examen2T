package Ejercicio4;

/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;

    private int playCount;

    private String album;
    // Duracion de una pista en segundos. Si no se sabe el valor es "-1".
    private int seconds;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename)
    {
        setDetails(artist, title, filename, -1);
    }

    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file.
     * @param seconds The track's length in seconds.
     */
    public Track(String artist, String title, String filename, int seconds)
    {
        setDetails(artist, title, filename, seconds);
    }
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename, -1);
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }

    /**
     * Return the length in seconds.
     * @return The length in seconds.
     */
    public int getSeconds()
    {
        return seconds;
    }

    /**
     * Set the length in seconds.
     * @param seconds length in seconds.
     */
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public String getAlbum(){
        return album;
    }
          
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file.
     * @param seconds The track's length in seconds.
     */
    private void setDetails(String artist, String title, String filename, int seconds)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
        this.seconds = seconds;
    }

    public void resetPlayCount(){
        playCount = 0;
    }

    public void incPlayCount(){
        playCount++;
    }

    /**
     * Incrementa la duracion de una pista en un segundo.
     */
    public void incSeconds() {
        this.seconds++;
    }

    /**
     * Decrementa la duracion de una pista en un segundo.
     */
    public void decSeconds() {
        this.seconds--;
    }

    @Override
    public String toString(){
        return artist + ": " + title +
                "  (file: " + filename + ")" +
                " " + album;
    }
}
