
// THis repository is basically extends the crud repository function for that only we created a new class

package com.Movie.IMDB.rating.repository;
import com.Movie.IMDB.rating.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

// Interface is used for multiple inheritance(Not possible in classes) and to maintain the repository code.
//we use interface cuz in future we can extend from multiple class that we can not do in classes.

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {

    // Here we are defining the function which we going to use.

    public List<Movie> findAll();

    public Movie findById(int id);

    public Movie save(Movie movie);

    public Movie deleteById(int id);

    public long count();

    public boolean existsById(int id);

    public void deleteAll();

}
