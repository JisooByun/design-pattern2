package com.study.designpattern.decorator.before;

public abstract class CommentService {
    private final StringBuilder stringBuilder = new StringBuilder();

    void addComment(String comment) {
        stringBuilder.append(comment);
    }

}
