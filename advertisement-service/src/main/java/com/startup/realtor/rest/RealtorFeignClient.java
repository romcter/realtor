package com.startup.realtor.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "realtor-service", url = "${services.realtor-service.url}")
public interface RealtorFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    Object getPosts();

    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
    Object getPostById(@PathVariable("postId") Long postId);
}
