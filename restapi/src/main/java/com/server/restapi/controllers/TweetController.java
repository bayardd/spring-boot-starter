package com.server.restapi.controllers;

import java.util.List;

import com.server.restapi.models.Tweet;
import com.server.restapi.services.TweetService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class TweetController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final TweetService tweetService;

	public TweetController(TweetService tweetService) {
		this.tweetService = tweetService;
	}

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Tweet> getAllTweets() {
        LOG.info("Calling Service to get all tweeks.");
        return tweetService.getAllTweets();
    }
}
