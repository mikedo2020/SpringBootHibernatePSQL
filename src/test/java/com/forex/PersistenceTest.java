package com.forex;


import com.forex.entity.Account;
import com.forex.entity.FxRate;
import junit.framework.TestCase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersistenceTest extends TestCase {


    public void testInsert(){

        /*
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Account account = new Account();

        account.setAccountId(4526647);
        account.setBalance(57060);
        account.setEuroBalance(50000);
        account.setCurrency("USD");
        account.setVariation(0);

        session.save(account);

        session.getTransaction().commit();
        session.close();
        */


    }


    public void testInsertCurrency(){

        /*
        String currencyPair = "USDEUR";

        try {

            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            File file = new File(PersistenceTest.class.getClassLoader().getResource(currencyPair+".txt").getFile());

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");

                String[] fields = line.split("\t");


                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

                String strDate = fields[0];
                Date date = new Date();

                try {
                    date = simpleDateFormat.parse(strDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                double rate = Double.parseDouble(fields[1]);

                long epoch = date.getTime();

                FxRate fxRate = new FxRate();

                fxRate.setDate(date);
                fxRate.setRate(rate);
                fxRate.setEpochTime(epoch);
                fxRate.setCurrencyPair(currencyPair);


                session.save(fxRate);

            }
            fileReader.close();
            System.out.println("Contents of file:");
            System.out.println(stringBuffer.toString());

            session.getTransaction().commit();
            session.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        */

    }

}
