/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

/**
 *
 * @author kumar
 */
public class Transport {
       
	private int id;
	private String route;
	private int price;
        private String busno;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

        /**
         * @return the busno
         */
        public String getBusno() {
            return busno;
        }

        /**
         * @param busno the busno to set
         */
        public void setBusno(String busno) {
            this.busno = busno;
        }
}
