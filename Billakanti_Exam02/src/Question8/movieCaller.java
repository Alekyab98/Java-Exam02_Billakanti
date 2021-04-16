/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Alekya Billakanti
 */
public class movieCaller extends Movies{

    public movieCaller(String movieName, int releaseYear) {
        super(movieName, releaseYear);
    }

    @Override
    public String getGenres() {
        return "Horror";
    }

    @Override
    public String toString() {
        return "movieCaller" +"\nMovie Name: "+super.getMovieName()+"\nRelease Year: "+
                super.getReleaseYear()+"\nGenre of the movie: "+getGenres();
    }
    
    
}
