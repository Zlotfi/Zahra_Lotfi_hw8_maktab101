package service;

import entity.Brand;
import entity.User;
import repository.BrandRepository;

import java.sql.SQLException;

public class BrandService {

    private final BrandRepository brandRepository = new BrandRepository();

    public BrandService() throws SQLException {
    }

    public void register() throws SQLException {
        Brand brand = new Brand(null,"zara","www.zara.com","The Zara brand is one of the largest brands of women's, men's and children's clothing in the world, which began its serious activity in Spain in 1975. This brand does not spend any money on advertising and marketing, and from the very beginning, it has spent all its energy and capital on opening different stores in all parts of the world.");
        int result = brandRepository.save(brand);
        if(result != 0)
            System.out.println(brand.getName() + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }
}
