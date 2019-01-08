/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.Classes;

/**
 *
 * @author kumar
 */
public class Classes {
    private int id;
    private String name;
    private int exameFee;
    private int annualFee;
    private int computer;
    private String code;
    private int session;
    
        public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
        
        public int getExameFee() {
		return exameFee;
	}

	public void setExameFee(int exameFee) {
		this.exameFee = exameFee;
	}

	public int getComputer() {
		return computer;
	}

	public void setComputer(int computer) {
		this.computer = computer;
	}

    /**
     * @return the annualFee
     */
    public int getAnnualFee() {
        return annualFee;
    }

    /**
     * @param annualFee the annualFee to set
     */
    public void setAnnualFee(int annualFee) {
        this.annualFee = annualFee;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the session
     */
    public int getSession() {
        return session;
    }

    /**
     * @param session the session to set
     */
    public void setSession(int session) {
        this.session = session;
    }
    
}
