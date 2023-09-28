package entity;

import java.sql.Date;

public class Product {
    private Integer id;
    private String name;
    private String createDate;
    private Integer categoryId;
    private Integer brandId;

    public Product(Integer id, String name, String createDate, Integer categoryId, Object o) {
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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
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
