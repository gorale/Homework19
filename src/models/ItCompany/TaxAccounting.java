package models.ItCompany;

public class TaxAccounting extends Accounting{
    private static final int PAY_TAX=32;

    public TaxAccounting(){
        super();
    }


    public TaxAccounting(int countOfEmployers, String companyName, String departmentName) {
        super(countOfEmployers, companyName, departmentName);
    }

    @Override
    public void account() {
        super.account();
        System.out.println("Tax of company: "+(this.getCountOfEmployers()*PAY_TAX)+"$");
    }
}
