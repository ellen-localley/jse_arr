package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private CelPhone[] celPhones;
	private int count;
	private Iphone[] iphones;
	private GalaxyNote[] galaxyNotes;
	

	public PhoneService() {
		phones = new Phone[3];
		celPhones = new CelPhone[3];
		iphones = new Iphone[3];
		galaxyNotes = new GalaxyNote[3];
		count = 0;
	}

	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	
	public void add(CelPhone phone) {
		celPhones[count] = phone;
		count++;
	}
	
	public void add(Iphone phone) {
		iphones[count] = phone;
		count++;
	}
	
	public void add(GalaxyNote phone) {
		galaxyNotes[count] = phone;
		count++;
	}
	
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	public Phone[] getPhones() {
		return phones;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	

	public CelPhone[] getCelPhones() {
		return celPhones;
	}

	public void setCelPhones(CelPhone[] celPhones) {
		this.celPhones = celPhones;
	}
	
	

	public Iphone[] getIphones() {
		return iphones;
	}

	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}
	
	

	public GalaxyNote[] getGalaxyNotes() {
		return galaxyNotes;
	}

	public void setGalaxyNotes(GalaxyNote[] galaxyNotes) {
		this.galaxyNotes = galaxyNotes;
	}
	
	
}
