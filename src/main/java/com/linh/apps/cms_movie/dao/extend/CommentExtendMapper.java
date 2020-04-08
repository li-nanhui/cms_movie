package com.linh.apps.cms_movie.dao.extend;

import com.linh.apps.cms_movie.bean.Comment;

import java.util.List;

public interface CommentExtendMapper {
    List<Comment> selectByMovieId(long movie_id);

}
