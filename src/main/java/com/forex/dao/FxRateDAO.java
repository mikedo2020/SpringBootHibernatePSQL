package com.forex.dao;

import com.forex.entity.FxRate;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.apache.log4j.Logger;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Component
@Qualifier("fxRateDAO")
public class FxRateDAO {

    final static Logger log = Logger.getLogger(FxRateDAO.class);


    public List<FxRate> getRates(String currencyPair){

        List<FxRate> fxRates = new ArrayList<FxRate>();

        try {

            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();

            Criteria criteria = session.createCriteria(FxRate.class);

            fxRates = criteria.add(Restrictions.eq("currencyPair", currencyPair)).list();

        }catch (Exception e){
            log.error("error getting fx rates",e);
        }

        return fxRates;
    }


}
