package co.grandcircus.apicapstone.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.apicapstone.entity.FavoriteList;

public interface MovieListDao extends JpaRepository<FavoriteList, Long> {

}
