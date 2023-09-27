package entity;

import java.util.Date;

public class Product {
    private Integer id;
    private String name;
    private Date createDate;
    private Integer categoryId;
    private Integer brandId;

    public Product(Integer id, String name, Date createDate, Integer categoryId, Integer brandId) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
        this.categoryId = categoryId;
        this.brandId = brandId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}
