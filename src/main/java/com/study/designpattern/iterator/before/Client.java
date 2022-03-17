package com.study.designpattern.iterator.before;

import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인패턴1");
        board.addPost("디자인패턴2");
        board.addPost("디자인패턴3");

        List<Post> posts = board.getPosts(); // List가 아니여도 set이여도 반복 가능하도록 즉 client가 세부 구현을 몰라도 반복 가능
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

    }
}
