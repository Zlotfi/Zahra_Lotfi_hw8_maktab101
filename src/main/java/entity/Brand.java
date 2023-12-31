package entity;

public class Brand{
    private Integer brandId;
    private String name;
    private String website;
    private String description;

    public Brand(Integer brandId, String name, String website, String description) {
        this.brandId = brandId;
        this.name = name;
        this.website = website;
        this.description = description;
    }

    public Integer getId() {
        return brandId;
    }

    public void setId(Integer id) {
        this.brandId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
