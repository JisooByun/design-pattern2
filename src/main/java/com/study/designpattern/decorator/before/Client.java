package com.study.designpattern.decorator.before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }


}
