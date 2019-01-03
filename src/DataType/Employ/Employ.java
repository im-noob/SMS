/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.Employ;

import java.util.Date;

/**
 *
 * @author kumar
 */
public class Employ {
    
        private String name;
	private int id;
	private String address;
	private String ph1;
	private String ph2;
        private String ph3;
	private String email;
	private String type;
        private String cast;
        private String religion;
        private String father;
        private String mother;
        private Date dob;
        private int gender;
        private int salary;
        private String aadhar;
        
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
        public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
        public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPh1() {
		return ph1;
	}
	public void setPh1(String ph1) {
		this.ph1 = ph1;
	}
	public String getPh2() {
		return ph2;
	}
	public void setPh2(String ph2) {
		this.ph2 = ph2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

    /**
     * @return the father
     */
    public String getFather() {
        return father;
    }

    /**
     * @param father the father to set
     */
    public void setFather(String father) {
        this.father = father;
    }

    /**
     * @return the mother
     */
    public String getMother() {
        return mother;
    }

    /**
     * @param mother the mother to set
     */
    public void setMother(String mother) {
        this.mother = mother;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return the gender
     */
    public int getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(int gender) {
        this.gender = gender;
    }
    
      /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the ph3
     */
    public String getPh3() {
        return ph3;
    }

    /**
     * @param ph3 the ph3 to set
     */
    public void setPh3(String ph3) {
        this.ph3 = ph3;
    }

    /**
     * @return the aadhar
     */
    public String getAadhar() {
        return aadhar;
    }

    /**
     * @param aadhar the aadhar to set
     */
    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }
}
