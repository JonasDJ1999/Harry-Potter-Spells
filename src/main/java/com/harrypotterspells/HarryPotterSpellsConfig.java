package com.harrypotterspells;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup("harrypotterspells")
public interface HarryPotterSpellsConfig extends Config
{
	@ConfigItem(
			keyName = "frequency",
			name = "Harry Potter line frequency",
			description = "How often you want to see the overhead text"
	)
	@Range(
			min = 1,
			max = 100
	)
	default int frequency() {
		return 50;
	}
	@ConfigItem(
			keyName = "airStrikeAndBoltText",
			name = "Basic air spells",
			description = "Basic air spells"
	)
	default String airStrikeAndBoltText()
	{
		return "I Fart In Your General Direction!";
	}
	@ConfigItem(
			keyName = "airBlastWaveAndSurgeText",
			name = "Advanced air spells",
			description = "Advanced air spells"
	)
	default String airBlastWaveAndSurgeText()
	{
		return "I Shart In Your General Direction!";
	}
	@ConfigItem(
		keyName = "waterStrikeAndBoltText",
		name = "Basic water spells",
		description = "Basic water spells"
	)
	default String waterStrikeAndBoltText()
	{
	return "Get Wekt!";
	}
	@ConfigItem(
			keyName = "waterBlastWaveAndSurgeText",
			name = "Basic water spells",
			description = "Basic water spells"
	)
	default String waterBlastWaveAndSurgeText()
	{
		return "Get More Wekt!";
	}
	@ConfigItem(
			keyName = "earthStrikeAndBoltText",
			name = "Basic water spells",
			description = "Basic water spells"
	)
	default String earthStrikeAndBoltText()
	{
		return "Get dirty for me!";
	}
	@ConfigItem(
			keyName = "earthBlastWaveAndSurgeText",
			name = "Basic water spells",
			description = "Basic water spells"
	)
	default String earthBlastWaveAndSurgeText()
	{
		return "Im Gonna Put Some Dirt In Your Eye!";
	}
	@ConfigItem(
			keyName = "fireStrike",
			name = "Tier 1 Fire Spell",
			description = "Tier 1 Fire Spell"
	)
	default String fireStrike()
	{
		return "Burn!";
	}
	@ConfigItem(
			keyName = "fireBolt",
			name = "Tier 2 Fire Spell",
			description = "Tier 2 Fire Spell"
	)
	default String fireBolt()
	{
		return "Burn Burn!";
	}
	@ConfigItem(
			keyName = "fireBlast",
			name = "Tier 3 Fire Spell",
			description = "Tier 3 Fire Spell"
	)
	default String fireBlast()
	{
		return "Burn Burn Burn!";
	}
	@ConfigItem(
			keyName = "fireWave",
			name = "Tier 4 Fire Spell",
			description = "Tier 4 Fire Spell"
	)
	default String fireWave()
	{
		return "Burn Baby Burn!";
	}
	@ConfigItem(
			keyName = "fireSurge",
			name = "Tier 5 Fire Spell",
			description = "Tier 5 Fire Spell"
	)
	default String fireSurge()
	{
		return "Burn Burn Baby Burn Burn!";
	}
	@ConfigItem(
			keyName = "telegrab",
			name = "Telegrab Spell",
			description = "Telegrab Spell"
	)
	default String telegrab()
	{
		return "GET OVER HERE!";
	}
	@ConfigItem(
			keyName = "vulnerability",
			name = "Vulnerability Spell",
			description = "Vulnerability Spell"
	)
	default String vulnerability()
	{
		return "An Arrow To Your Knee!";
	}
	@ConfigItem(
			keyName = "entangle",
			name = "Engtangle Spell",
			description = "Entangle Spell"
	)
	default String entangle()
	{
		return "Where Do You Think Your Going!";
	}
	@ConfigItem(
			keyName = "stun",
			name = "Stun Spell",
			description = "Stun Spell"
	)
	default String stun()
	{
		return "Bonk!";
	}
	@ConfigItem(
			keyName = "superheat",
			name = "Superheart",
			description = "Superheat Spell"
	)
	default String superheat()
	{
		return "Melting!";
	}
	@ConfigItem(
			keyName = "bakePie",
			name = "Bake Pie",
			description = "Bake Pie Spell"
	)
	default String bakePie()
	{
		return "Hmmmmm A Delicious Pie";
	}
	@ConfigItem(
			keyName = "humidify",
			name = "Humidify",
			description = "Humidify Spell"
	)
	default String humidify()
	{
		return "Time for a refill!";
	}
	@ConfigItem(
			keyName = "plankMake",
			name = "Plank Make",
			description = "Plank Make Spell"
	)
	default String plankMake()
	{
		return "BZZZZZZZZZZ!";
	}
	@ConfigItem(
			keyName = "greaterCorruption",
			name = "Greater Corruption",
			description = "Greater Corruption Spell"
	)
	default String greaterCorruption()
	{
		return "Darkness Withing Me!!";
	}
}