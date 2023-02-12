package com.erayaraz.microservices.currencyexchangeservice.controller;

import com.erayaraz.microservices.currencyexchangeservice.Entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {
    CurrencyExchange findByFromAndTo(String from, String to);

}
