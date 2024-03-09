package com.cydeo.reposetory;

import com.cydeo.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
