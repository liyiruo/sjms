package com.sjms.handler;

/*
 * 销售， 可以批准5%以内的折扣
 */
public class Sales extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount <= 0.05){
			System.out.format("%s��׼���ۿۣ�%.2f%n", this.getClass().getName(), discount);
		}else{
			successor.processDiscount(discount);
		}

	}

}
