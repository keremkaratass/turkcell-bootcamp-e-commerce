package kodlama.io.ecommerce.repository.abstracts;

import kodlama.io.ecommerce.entities.concretes.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAll();
    Product getById(int id);
    Product add(Product product);
    Product update(int id,Product product); //aslında tek Product yeterliydi ancak api standartları için bu önemli!!
    void delete(int id);
}
