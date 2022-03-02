package models.ItCompany;

public class FinancialAccount extends TaxAccounting{
    private static final int SALARY = 500;

    public FinancialAccount(){

    }

    public FinancialAccount(int countOfEmployers,String companyName, String departmentName) {

        super(countOfEmployers,companyName, departmentName);
    }

    @Override
    public void account() {
        super.account();

        System.out.println("Employers salary: " + (this.getCountOfEmployers() * SALARY) + "$");
    }
}
