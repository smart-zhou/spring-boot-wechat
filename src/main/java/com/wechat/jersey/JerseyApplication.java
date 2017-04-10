package com.wechat.jersey;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * JerseyApplication
 *
 * @author Smart.Zhou
 * @date 2017/4/10
 */
public class JerseyApplication extends ResourceConfig {
    public JerseyApplication() {
        packages("com.wechat.jersey.resources");
    }
}
