package models.Accounting;

import models.Accounting.Accounting;

public class TaxAccounting extends Accounting {
    private static final int PAY_TAX=32;

    public TaxAccounting(){
        super();
    }


    public TaxAccounting(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    @Override
    public void account() {
        super.account();
        System.out.println("Tax of company: "+(this.getCountOfEmployers()*PAY_TAX)+"$");
    }

}
