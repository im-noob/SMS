/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author kumar
 */
public interface ProductDao {

    public Product[] getProduct();
    public int InsetProduct(Product prd);
    public int updateProduct(Product prd);
}
