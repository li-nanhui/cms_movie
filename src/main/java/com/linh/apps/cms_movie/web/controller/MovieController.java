package com.linh.apps.cms_movie.web.controller;

import com.linh.apps.cms_movie.bean.Movie;
import com.linh.apps.cms_movie.bean.extend.MovieExtend;
import com.linh.apps.cms_movie.service.IMovieService;
import com.linh.apps.cms_movie.utils.Message;
import com.linh.apps.cms_movie.utils.MessageUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author ：lnh
 * @date ：Created in 2020/3/13 13:52
 * @description：电影控制器类
 * @modified By：
 * @version:
 */
@Validated
@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private IMovieService movieService;

    @GetMapping("findAll")
    public Message findAll() {
        List<Movie> list = movieService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("cascadeFindAll")
    public Message cascadeFindAll() {
        List<MovieExtend> list = movieService.cascadeFindAll();
        //System.out.println(list.get(1).getComments().get(0).getUserId()+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return MessageUtil.success(list);
    }

    @GetMapping("findById")
    public Message findById(long id) {
        MovieExtend movieExtend = movieService.findById(id);
        return MessageUtil.success(movieExtend);
    }

    @ApiOperation(value = "保存或更新文章信息", notes = "如果参数包含id认为是更新操作，否则为插入操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "编号",paramType = "form",required = false),
            @ApiImplicitParam(name = "title", value = "标题",paramType = "form",required = true),
            @ApiImplicitParam(name = "content", value = "内容",paramType = "form",required = true),
            @ApiImplicitParam(name = "source", value = "源内容",paramType = "form",required = false),
            @ApiImplicitParam(name = "categoryId", value = "所属栏目id",paramType = "form",required = true),
            @ApiImplicitParam(name = "authorId", value = "所属作者id",paramType = "form",required = false)
    })
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(
            Long id,
            @NotNull String title,
            @NotNull String content,
            String source,
            @NotNull long categoryId,
            Long authorId) {
        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setContent(content);
        movie.setSource(source);
        movie.setCategoryId(categoryId);
        movie.setAuthorId(authorId);
        movieService.saveOrUpdate(movie);
        return MessageUtil.success("更新成功");
    }

    @GetMapping("deleteById")
    public Message deleteById(long id){
        movieService.deleteById(id);
        return MessageUtil.success("删除成功");
    }
}
