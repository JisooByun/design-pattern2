package com.study.designpattern.decorator.after;

public class App {

    private static boolean enableSpamFilter = true;
    private static boolean enableTrimFilter = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enableSpamFilter) {
            commentService = new SpamCommentDecorator(commentService);
        }
        if (enableTrimFilter) {
            commentService = new TrimCommentDecorator(commentService);
        }

        Client client = new Client(commentService);

        client.writeComment("오징어게임");
        client.writeComment("오징어게임...");
        client.writeComment("http://오징어게임");

    }

}
