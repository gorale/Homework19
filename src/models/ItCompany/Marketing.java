package models.ItCompany;

public class Marketing extends ItCompany{
    private String departmentName;

    public Marketing() {
    }

    public Marketing(int countOfEmployers, String companyName, String departmentName) {
        super(countOfEmployers, companyName);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void marketing(){

    }
}
