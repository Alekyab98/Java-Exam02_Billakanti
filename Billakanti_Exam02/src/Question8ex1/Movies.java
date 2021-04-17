/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8ex1;

/**
 *
 * @author Alekya Billakanti
 */
public abstract class Movies {
    private String movieName;
    private int releaseYear;

    public Movies(String movieName, int releaseYear) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
    
    
    
    public abstract String getGenres();
    
}
