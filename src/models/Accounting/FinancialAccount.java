package models.Accounting;

public class FinancialAccount extends TaxAccounting {

    private static final int SALARY = 500;

    public FinancialAccount(){

    }

    public FinancialAccount(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    @Override
    public void account() {
        super.account();

        System.out.println("Employers salary: " + (this.getCountOfEmployers() * SALARY) + "$");
    }
}
