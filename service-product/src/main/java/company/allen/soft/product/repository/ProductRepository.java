package company.allen.soft.product.repository;

import company.allen.soft.product.entity.Category;
import company.allen.soft.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByCategory(Category category);
}
