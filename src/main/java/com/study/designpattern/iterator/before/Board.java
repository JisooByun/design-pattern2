package com.study.designpattern.iterator.before;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Post> posts = new ArrayList<>();

    public void addPost(String contents) {
        posts.add(new Post(contents));
    }

    public List<Post> getPosts() {
        return posts;
    }
}
