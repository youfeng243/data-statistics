package com.haizhi.factory;

import com.google.common.base.Strings;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import lombok.extern.slf4j.Slf4j;

/**
 * @author youfeng
 * @date 2018/5/31
 */
@Slf4j
public class MongoFactory {
    public static MongoClient get(String uri) {
        if (Strings.isNullOrEmpty(uri)) {
            throw new IllegalArgumentException("mongodb.uri must be set!");
        } else {
            log.info("mongodb.uri: {}", uri);
        }

        MongoClientOptions.Builder builder = MongoClientOptions.builder();
        builder.connectTimeout(30000);
        builder.socketTimeout(30000);
        builder.maxConnectionIdleTime(60000);
        MongoClientURI clientURI = new MongoClientURI(uri, builder);

        return new MongoClient(clientURI);
    }
}
