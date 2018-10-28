package boot.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import boot.model.Product;

@Repository
public class ProductDao {

	@Resource
	private JdbcTemplate jdbcTemplate;

	public int save(Product product) {
		String sql = "insert into product (name,price) values (?,?)";
		return jdbcTemplate.update(sql, product.getName(), product.getPrice());
	}
}
