package com.example.pedro.vendas.onlineConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "br.com.bellacabral.vendas.online.repository")
public class MongoConfig {

}