package dev.cammiescorner.arcanus.core.config;

import dev.cammiescorner.arcanus.Arcanus;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = Arcanus.MOD_ID)
public class ArcanusConfig implements ConfigData
{
	public boolean doBurnout = true;
	public int manaCooldown = 20;
	public int burnoutCooldown = 60;
	public int lungeCastingCost = 3;
	public int fissureCastingCost = 6;
	public int magicMissileCastingCost = 1;
	public int vanishCastingCost = 3;
	public int healCastingCost = 3;
	public int meteorCastingCost = 6;
	public int solarStrikeCastingCost = 20;
	public int mineCastingCost = 2;
}
