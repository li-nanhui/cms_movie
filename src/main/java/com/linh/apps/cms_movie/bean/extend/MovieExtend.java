package com.linh.apps.cms_movie.bean.extend;

import com.linh.apps.cms_movie.bean.Category;
import com.linh.apps.cms_movie.bean.Comment;
import com.linh.apps.cms_movie.bean.Movie;

import java.util.List;

/**
 * @author ：lnh
 * @date ：Created in 2020/3/13 14:00
 * @description：电影拓展类
 * @modified By：
 * @version:
 */
public class MovieExtend extends Movie {
    public static final String STATUS_UNCHECK="未审核";
    public static final String STATUS_CHECK_PASS="审核通过";
    public static final String STATUS_CHECK_NOPASS="审核未通过";

    private Category category;//所属栏目
    private List<Comment> comments;//电影评论

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
