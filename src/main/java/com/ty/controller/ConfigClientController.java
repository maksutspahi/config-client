package com.ty.controller;

import com.ty.config.ConfigurationReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Autowired
    private ConfigurationReader configurationReader;

    @GetMapping("/string/{key}")
    public String getString(@PathVariable String key) {
        return (String) configurationReader.getValue(key);
    }

    @GetMapping("/integer/{key}")
    public Integer getInteger(@PathVariable String key) {
        return (Integer) configurationReader.getValue(key);
    }

    @GetMapping("/boolean/{key}")
    public Boolean getBoolean(@PathVariable String key) {
        return (Boolean) configurationReader.getValue(key);
    }

    @GetMapping("/double/{key}")
    public Double getDouble(@PathVariable String key) {
        return (Double) configurationReader.getValue(key);
    }
}
