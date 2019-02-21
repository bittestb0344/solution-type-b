package problem03;

public class Money {

	//
	// 클래스 구현을 완성 하십시오.
	//

	private int amount;

	public Money(int amount) {
	}

	public Money add(Money money) {
		return money;
	}

	public Money minus(Money money) {
		return money;
	}

	public Money multiply(Money money) {
		return money;
	}

	public Money devide(Money money) {
		return money;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof Money) {
			return getAmount() == (((Money) arg0).getAmount());
		}
		return super.equals(arg0);
	}
}