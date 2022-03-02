package models.ItCompany;

public class Accounting extends ItCompany{
    private String departmentName;
    public Accounting() {
    }

    public Accounting(int countOfEmployers, String companyName,String departmentName) {
        super(countOfEmployers, companyName);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void account() {
        super.account();
    }
}
