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

	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}

	public CelPhone[] getCelPhones() {
		return celPhones;
	}

	public void setCelPhones(CelPhone[] celPhones) {
		this.celPhones = celPhones;
	}
	
	public void addCelPhone(CelPhone phone) {
		celPhones[count] = phone;
		count++;
	}

	public Iphone[] getIphones() {
		return iphones;
	}

	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}
	
	public void addIphone(Iphone phone) {
		iphones[count] = phone;
		count++;
	}

	public GalaxyNote[] getGalaxyNotes() {
		return galaxyNotes;
	}

	public void setGalaxyNotes(GalaxyNote[] galaxyNotes) {
		this.galaxyNotes = galaxyNotes;
	}
	
	public void addGalxyNote(GalaxyNote phone) {
		galaxyNotes[count] = phone;
		count++;
	}
}
