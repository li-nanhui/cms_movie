package com.linh.apps.cms_movie.service;

import com.linh.apps.cms_movie.bean.Comment;

import java.util.List;

public interface ICommentService {
    List<Comment> findAll();

    Comment findById(long id);

    void save(Comment comment);

    void deleteById(long id);
}
