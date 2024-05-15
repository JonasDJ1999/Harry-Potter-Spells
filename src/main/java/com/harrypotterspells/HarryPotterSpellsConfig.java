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
}