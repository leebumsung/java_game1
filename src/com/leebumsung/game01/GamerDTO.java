package com.leebumsung.game01;

public class GamerDTO {

	private int gamerNum;
	private String nicName;
	private char gender;
	
	public GamerDTO() {}

	public GamerDTO(int gamerNum, String nicName, char gender) {
		super();
		this.gamerNum = gamerNum;
		this.nicName = nicName;
		this.gender = gender;
	}

	public int getGamerNum() {
		return gamerNum;
	}

	public void setGamerNum(int gamerNum) {
		this.gamerNum = gamerNum;
	}

	public String getNicName() {
		return nicName;
	}

	public void setNicName(String nicName) {
		this.nicName = nicName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
//		return "GamerDTO [gamerNum=" + gamerNum + ", nicName=" + nicName + ", gender=" + gender + "]";
		return "게이머번호: " + gamerNum + "번 , 닉네임: " + nicName + ", 성별 : " + gender;
	}

}
