package co.grandcircus.apicapstone;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieListDao extends JpaRepository<FavoriteList, Long> {

}
