package com.mygdx.game;

public abstract class RangersUnit implements Airplane {
	int ranger_blood = 200;
	int ranger_atk = 20;
	RangersUnit(int atk, int plus_hp){}
	public void HP(int atk){ // ลดเลือด	
		ranger_blood -= atk;
	}
	public void Plus_hp(int plus_hp){ // ลดเลือด	
		ranger_blood -= plus_hp;
	}
}
