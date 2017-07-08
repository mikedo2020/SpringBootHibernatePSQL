package com.forex.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.forex.dao.FxRateDAO;
import com.forex.entity.FxRate;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController
public class FxController {

    @Autowired
    @Qualifier("fxRateDAO")
    private FxRateDAO fxRateDAO;

    @RequestMapping("/fxRateObjs")
    public List<FxRate> getRateObjs(@RequestParam(value="currencyPair") String currencyPair) {
        return fxRateDAO.getRates(currencyPair);
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.GET, allowCredentials = "false")
    @RequestMapping("/fxRates")
    public List<Object[]> getRates(@RequestParam(value="currencyPair") String currencyPair) {

        List<FxRate> fxRates = fxRateDAO.getRates(currencyPair);

        List<Object[]> mapFxRates = new ArrayList<Object[]>();

        for(FxRate fxRate : fxRates){
            Object[] arr = {fxRate.getEpochTime(),fxRate.getRate()};
            mapFxRates.add(arr);
        }

        return mapFxRates;
    }
}
