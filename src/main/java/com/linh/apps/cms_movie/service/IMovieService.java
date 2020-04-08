package com.linh.apps.cms_movie.service;

import com.linh.apps.cms_movie.bean.Movie;
import com.linh.apps.cms_movie.bean.extend.MovieExtend;
import com.linh.apps.cms_movie.utils.CustomerException;

import java.util.List;

/**
 * @author ：lnh
 * @date ：Created in 2020/3/13 13:45
 * @description：
 * @modified By：
 * @version:
 */
public interface IMovieService {
    List<Movie> findAll();

    List<MovieExtend> cascadeFindAll();

    MovieExtend findById(long id);

    void saveOrUpdate(Movie movie) throws CustomerException;

    void deleteById(long id);
}
