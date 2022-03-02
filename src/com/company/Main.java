package com.company;

import models.Accounting.Accounting;
import models.Accounting.FinancialAccount;
import models.Accounting.TaxAccounting;
import models.Animal.Animal;
import models.Animal.Dog;

public class Main {

    public static void main(String[] args) {

        TaxAccounting tax = new TaxAccounting();
        tax.account();
        FinancialAccount fin = new FinancialAccount(500,"Accounting");
        fin.account();





    }
}
