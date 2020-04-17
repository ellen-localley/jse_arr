package com.jse.phone;

import lombok.Data;

@Data
public class Phone {
	private String phoneNumber, name, company;
}

class CelPhone extends Phone {
	private boolean portable;
	private String move;

	public CelPhone(String phoneNumber, String name, String company, boolean portable) {
//		super(phoneNumber, name, company);
		setPortable(portable);
	}

	public boolean isPortable() {
		return portable;
	}

	public void setPortable(boolean portable) {
		this.move = (portable) ? "휴대 가능" : "휴대 불가능";
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	@Override
	public String toString() {
		return super.toString() + ", move = " + move;
	}

}

class Iphone extends CelPhone {
	private String search;

	public Iphone(String phoneNumber, String name, String company, boolean portable, String search) {
		super(phoneNumber, name, company, portable);
		this.search = search;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return super.toString() + ", search = " + search;
	}
}

class GalaxyNote extends Iphone {
	private String bigSize;

	public GalaxyNote(String phoneNumber, String name, String company, boolean portable, String search,
			String bigSize) {
		super(phoneNumber, name, company, portable, search);
		this.bigSize = bigSize;
	}

	public String getBigSize() {
		return bigSize;
	}

	public void setBigSize(String bigSize) {
		this.bigSize = bigSize;
	}

	@Override
	public String toString() {
		return super.toString() + ", bigSize = " + bigSize;
	}

}
