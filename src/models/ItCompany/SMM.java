package models.ItCompany;

public class SMM extends Marketing{
    public SMM() {
    }

    public SMM(int countOfEmployers, String companyName, String departmentName) {
        super(countOfEmployers, companyName, departmentName);
    }

    @Override
    public void marketing() {
        super.marketing();
        System.out.println("SMM marketing");
    }
}
