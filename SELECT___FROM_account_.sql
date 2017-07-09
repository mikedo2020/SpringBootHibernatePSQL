

CREATE TABLE public.account
(
  accountid INTEGER PRIMARY KEY NOT NULL,
  balance DOUBLE PRECISION,
  currency VARCHAR(255),
  eurobalance DOUBLE PRECISION,
  variation DOUBLE PRECISION
);



INSERT INTO public.account (accountid, balance, currency, eurobalance, variation) VALUES (4526647, 57060, 'USD', 50000, 0);
INSERT INTO public.account (accountid, balance, currency, eurobalance, variation) VALUES (8523495, 50000, 'EUR', 50000, 0);
INSERT INTO public.account (accountid, balance, currency, eurobalance, variation) VALUES (7320665, 6387500, 'JPY', 50000, 0);
INSERT INTO public.account (accountid, balance, currency, eurobalance, variation) VALUES (4451277, 43966.5, 'GBP', 50000, 0);
INSERT INTO public.account (accountid, balance, currency, eurobalance, variation) VALUES (4135811, 74255, 'AUD', 50000, 0);
INSERT INTO public.account (accountid, balance, currency, eurobalance, variation) VALUES (8220199, 73925, 'CAD', 50000, 0);
INSERT INTO public.account (accountid, balance, currency, eurobalance, variation) VALUES (3352455, 54650, 'CHF', 50000, 0);