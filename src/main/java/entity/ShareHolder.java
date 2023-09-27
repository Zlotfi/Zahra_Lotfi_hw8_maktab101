package entity;

public class ShareHolder{
    private Integer shareId;
    private String name;
    private String phoneNumber;
    private String nationalCode;

    public ShareHolder(Integer shareId, String name, String phoneNumber, String nationalCode) {
        this.shareId = shareId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.nationalCode = nationalCode;
    }

    public Integer getId() {
        return shareId;
    }

    public void setId(Integer id) {
        this.shareId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
