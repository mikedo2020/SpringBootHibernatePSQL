package com.forex.controller;


import com.forex.entity.Account;
import com.forex.entity.FxRate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PortfolioController {



    @CrossOrigin(origins = "*", methods = RequestMethod.GET, allowCredentials = "false")
    @RequestMapping("/getPortfolio")
    public List<Account> getPortfolio(@RequestParam(value="currencyPair") String currencyPair) {

        List<Account> accounts = new ArrayList<Account>();

        return accounts;
    }

}
