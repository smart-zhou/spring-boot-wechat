package com.wechat.jersey.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * TestResource
 *
 * @author hzzjb
 * @date 2017/4/10
 */
@Path("test")
public class TestResource {

    @GET
    public String test() {
        return "hello world";
    }
}
