package models.ItCompany;

public class SEO extends Marketing{
    public SEO() {
    }

    public SEO(int countOfEmployers, String companyName, String departmentName) {
        super(countOfEmployers, companyName, departmentName);
    }

    @Override
    public void marketing() {
        super.marketing();
        System.out.println("SEO marketing");
    }
}
