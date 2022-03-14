package com.study.designpattern.decorator.before;

public class TrimCommentService extends CommentService {

    @Override
    void addComment(String comment) {
        super.addComment(comment.replace("...", ""));
    }
}
