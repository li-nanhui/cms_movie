package com.linh.apps.cms_movie.service.impl;

import com.linh.apps.cms_movie.bean.Comment;
import com.linh.apps.cms_movie.bean.CommentExample;
import com.linh.apps.cms_movie.dao.CommentMapper;
import com.linh.apps.cms_movie.service.ICommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements ICommentService {
   @Resource
   private CommentMapper commentMapper;
    @Override
    public List<Comment> findAll() {
        return commentMapper.selectByExampleWithBLOBs(new CommentExample());
    }

    @Override
    public Comment findById(long id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public void save(Comment comment) {
        commentMapper.insert(comment);
    }

    @Override
    public void deleteById(long id) {
        commentMapper.deleteByPrimaryKey(id);
    }
}
