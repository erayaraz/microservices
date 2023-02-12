package com.erayaraz.microservices.currencyexchangeservice.controller;

import com.erayaraz.microservices.currencyexchangeservice.Entity.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Objects;

@RestController
public class CurrencyExchangeController {
    @Autowired
    private CurrencyExchangeRepository repository;
    @Autowired
    private Environment environment;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchange(@PathVariable String from, @PathVariable String to){
        CurrencyExchange currencyExchange = repository.findByFromAndTo(from,to);
        if(Objects.isNull(currencyExchange))
            throw new RuntimeException("Currency exchange is null for " + "from : " + from + "to : " + to);
        String port = environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);
        return currencyExchange;
    }
}
