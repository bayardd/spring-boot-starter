package com.server.restapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Tweet")
public class Tweet {
    
    @Id
    private String tweetId;
    private String content;

    public String getTweetId() {
        return this.tweetId;
    }

    public void setTweetId(String id) {
        this.tweetId = id;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return "Tweet [id=" + tweetId + ", content=" + content + "]";
    }

}