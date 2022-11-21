package com.shubhamcodes.tci.providers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ObjectProvider {

    @Bean
    public ObjectMapper getMapper(){
        return new ObjectMapper();
    }
}
