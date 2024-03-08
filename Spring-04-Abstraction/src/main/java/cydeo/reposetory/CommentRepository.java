package cydeo.reposetory;

import cydeo.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
