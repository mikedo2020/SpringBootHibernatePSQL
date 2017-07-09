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


        Account account1 = new Account();

        account1.setAccountId(4526647);
        account1.setBalance(57060);
        account1.setEuroBalance(50000);
        account1.setCurrency("USD");
        account1.setVariation(0);

        session.save(account1);


        Account account2 = new Account();

        account2.setAccountId(8523495);
        account2.setBalance(50000);
        account2.setEuroBalance(50000);
        account2.setCurrency("EUR");
        account2.setVariation(0);

        session.save(account2);

        Account account3 = new Account();

        account3.setAccountId(7320665);
        account3.setBalance(6387500);
        account3.setEuroBalance(50000);
        account3.setCurrency("JPY");
        account3.setVariation(0);

        session.save(account3);

        Account account4 = new Account();

        account4.setAccountId(4451277);
        account4.setBalance(43966.5);
        account4.setEuroBalance(50000);
        account4.setCurrency("GBP");
        account4.setVariation(0);

        session.save(account4);

        Account account5 = new Account();

        account5.setAccountId(4135811);
        account5.setBalance(74255);
        account5.setEuroBalance(50000);
        account5.setCurrency("AUD");
        account5.setVariation(0);

        session.save(account5);

        Account account6 = new Account();

        account6.setAccountId(8220199);
        account6.setBalance(73925);
        account6.setEuroBalance(50000);
        account6.setCurrency("CAD");
        account6.setVariation(0);

        session.save(account6);

        Account account7 = new Account();

        account7.setAccountId(3352455);
        account7.setBalance(54650);
        account7.setEuroBalance(50000);
        account7.setCurrency("CHF");
        account7.setVariation(0);

        session.save(account7);

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
