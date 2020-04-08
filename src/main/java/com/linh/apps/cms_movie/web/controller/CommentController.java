package com.linh.apps.cms_movie.web.controller;

import com.linh.apps.cms_movie.bean.Comment;
import com.linh.apps.cms_movie.service.ICommentService;
import com.linh.apps.cms_movie.utils.Message;
import com.linh.apps.cms_movie.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private ICommentService commentService;

    @GetMapping("findAll")
    public Message findAll(){
        List<Comment> list = commentService.findAll();
        return MessageUtil.success(list);
    }
    @GetMapping("findById")
    public Message findById(long id){
        return MessageUtil.success(commentService.findById(id));
    }
    @PostMapping("save")
    public Message saveOrUpdate(Comment comment){
        commentService.save(comment);
        return MessageUtil.success("保存成功");
    }
    @PostMapping("deleteById")
    public Message deleteById(long id){
        commentService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

}
