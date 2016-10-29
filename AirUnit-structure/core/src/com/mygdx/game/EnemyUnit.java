package com.mygdx.game;

public abstract class EnemyUnit implements Airplane{
	int enemy_blood = 200;
	int enemy_atk = 20;
	EnemyUnit(int atk, int plus_hp){};
	public void HP(int atk){ // ลดเลือด	
		enemy_blood -= atk;
	}
	public void Plus_hp(int plus_hp){ // ลดเลือด	
		enemy_blood -= plus_hp;
	}

}
