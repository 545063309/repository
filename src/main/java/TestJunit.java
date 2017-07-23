import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import yjh.domain.Cart;
import yjh.service.CartService;
public class TestJunit extends BaseJunit {
	@Autowired
	private CartService cartService;
	@Test
	public void test() {
		int a=1;
		int b=2;
		Cart cart=cartService.saveCart(a,b);
		System.out.println(cart);
	}

}
