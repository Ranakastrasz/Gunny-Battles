package data.shipsystems.scripts;

import com.fs.starfarer.api.combat.ShipAPI;


public class MineStrikeStationStats extends MineStrikeStats {
	
	public static float MINE_RANGE_STATION = 7000;
	
	@Override
	public float getMineRange(ShipAPI ship) {
		//return MINE_RANGE_STATION;
		if (ship == null) return MINE_RANGE_STATION;
		return ship.getMutableStats().getSystemRangeBonus().computeEffective(MINE_RANGE_STATION);
	}

	
}








