import com.marist.enums.CoffeeSize;

class CoffeeBean{
	CoffeeSize beanSize;

	@Override
	public String toString() {
		return "CoffeeBean [beanSize=" + beanSize + "]";
	}

}

public class TestEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CoffeeBean bean = new CoffeeBean();
		bean.beanSize = bean.beanSize.BIG;
		
		System.out.println(bean.beanSize.getWeight());
		
	}

}
