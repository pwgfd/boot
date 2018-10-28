package boot.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import boot.dao.ProductDao;
import boot.model.Product;

@Service
public class ProductService {

	@Resource
	private ProductDao productDao;

	public void save(Product product) {
		productDao.save(product);

	}
}
