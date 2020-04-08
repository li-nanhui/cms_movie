package com.linh.apps.cms_movie.service.impl;

import com.linh.apps.cms_movie.bean.Movie;
import com.linh.apps.cms_movie.bean.MovieExample;
import com.linh.apps.cms_movie.bean.extend.MovieExtend;
import com.linh.apps.cms_movie.config.TimeChange;
import com.linh.apps.cms_movie.dao.MovieMapper;
import com.linh.apps.cms_movie.dao.extend.MovieExtendMapper;
import com.linh.apps.cms_movie.service.IMovieService;
import com.linh.apps.cms_movie.utils.CustomerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author ：lnh
 * @date ：Created in 2020/3/13 13:47
 * @description：电影的业务实现类
 * @modified By：
 * @version:
 */
@Service
public class MovieServiceImpl implements IMovieService {
    @Resource
    private MovieMapper movieMapper;
    @Resource
    private MovieExtendMapper movieExtendMapper;

    @Override
    public List<Movie> findAll() {
        return movieMapper.selectByExample(new MovieExample());
    }

    @Override
    public List<MovieExtend> cascadeFindAll() {
        return movieExtendMapper.selectAll();
    }

    @Override
    public MovieExtend findById(long id) {
        return movieExtendMapper.selectById(id);
    }

    @Override
    public void saveOrUpdate(Movie movie) throws CustomerException{
        if(movie.getId()!=null){
            movieMapper.updateByPrimaryKey(movie);
        } else {
            // 标题不能重名
            MovieExample example = new MovieExample();
            example.createCriteria().andTitleEqualTo(movie.getTitle());

            List<Movie> movies = movieMapper.selectByExample(example);
            if(movies.size()>0){
                throw new CustomerException("标题不能重复");
            }else {
                // 初始化
                TimeChange timeChange = new TimeChange();
                movie.setPublishTime(timeChange.timeStampToDate(new Date().getTime()));
                movie.setStatus(MovieExtend.STATUS_UNCHECK);
                movie.setThumpDown(0l);
                movie.setThumpUp(0l);
                movieMapper.insert(movie);
            }
        }
    }

    @Override
    public void deleteById(long id) {
        movieMapper.deleteByPrimaryKey(id);
    }
}
