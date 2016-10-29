package com.mygdx.game;

public abstract class MothershipUnit implements Airplane {
	int mother_blood = 400;
	int mother_atk = 50;
	MothershipUnit(int atk, int plus_hp){}
	public void HP(int atk){ // ลดเลือด,เพิ่มเลือด
		mother_blood -= atk;
	}
	public void Plus_hp(int plus_hp){
		mother_blood += plus_hp;
	}
}
