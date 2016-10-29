package com.mygdx.game;

public abstract class ExplorerUint implements Airplane{
	int explorer_blood = 700;
	ExplorerUint(int atk, int  plus_hp){}
	public void HP(int atk){ // ลดเลือด	
		explorer_blood -= atk;
	}
	public void Plus_hp(int plus_hp){ // ลดเลือด	
		explorer_blood -= plus_hp;
	}

}
