package com.ssc.ooa.spring;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "simpleHttpClient", url = "${spring.cloud.openfeign.client.config.simpleHttpClient.url}", path = "/service")
public interface SimpleHttpClient {
    @GetMapping(value = "/data/{id}")
    String getData(@PathVariable(value = "id") Integer id);
}