package com.server.restapi.services;

import com.server.restapi.models.Tweet;
import com.server.restapi.repositories.TweetRepository;

import java.util.List;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class TweetService {
    
    private final Logger LOG = LoggerFactory.getLogger(getClass());
    private final TweetRepository tweetRepository;

    public TweetService(TweetRepository tweetRepository){
        this.tweetRepository = tweetRepository;
    }

    public List<Tweet> getAllTweets() {
        LOG.info("Getting all tweets.");
        return tweetRepository.findAll();
    }

}
