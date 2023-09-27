package entity;

public class Category {
    private Integer id;
    private String name;
    private String discription;

    public Category(Integer id, String name, String discription) {
        this.id = id;
        this.name = name;
        this.discription = discription;
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

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
