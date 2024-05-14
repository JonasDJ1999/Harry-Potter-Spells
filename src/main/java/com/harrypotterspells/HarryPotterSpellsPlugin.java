package com.harrypotterspells;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.api.events.GraphicChanged;

@Slf4j
@PluginDescriptor(
	name = "Harry Potter Spells"
)
public class HarryPotterSpellsPlugin extends Plugin {
	@Inject
	private Client client;

	@Inject
	private HarryPotterSpellsConfig config;

	@Override
	protected void startUp() throws Exception {
		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception {
		log.info("Example stopped!");
	}

	@Provides
	HarryPotterSpellsConfig provideConfig(ConfigManager configManager) {
		return configManager.getConfig(HarryPotterSpellsConfig.class);
	}

	@Subscribe
	public void onGraphicChanged(GraphicChanged e) {
		if (e.getActor().getName() != null) {
			log.info("{} graphic changed to {}", e.getActor().getName(), e.getActor().getGraphic());
		}
		// log.warn("Event graphic: '{}'", e.getActor().getGraphic());

		//Air Strike & Air Bolt
		if (e.getActor().getGraphic() == 90 || e.getActor().getGraphic() == 117) {
			e.getActor().setOverheadText("Ventus!");
			e.getActor().setOverheadCycle(75);
		}
		//Air Blast, Air Wave & Air Surge
		if (e.getActor().getGraphic() == 132 || e.getActor().getGraphic() == 158 || e.getActor().getGraphic() == 1455) {
			e.getActor().setOverheadText("Ventus Duo!");
			e.getActor().setOverheadCycle(75);
		}
		//Water Strike & Water Bolt
		if (e.getActor().getGraphic() == 93 || e.getActor().getGraphic() == 120) {
			e.getActor().setOverheadText("Aguamenti!");
			e.getActor().setOverheadCycle(75);
		}
		//Water Blast, Water Wave & Water Surge
		if (e.getActor().getGraphic() == 135 || e.getActor().getGraphic() == 161 || e.getActor().getGraphic() == 1458) {
			e.getActor().setOverheadText("Aqua Eructo!");
			e.getActor().setOverheadCycle(75);
		}
		//Earth Strike & Earth Bolt
		if (e.getActor().getGraphic() == 96 || e.getActor().getGraphic() == 123) {
			e.getActor().setOverheadText("Verdimillius!");
			e.getActor().setOverheadCycle(75);
		}
		//Earth Blast, Earth Wave & Earth Surge
		if (e.getActor().getGraphic() == 138 || e.getActor().getGraphic() == 164 || e.getActor().getGraphic() == 1463) {
			e.getActor().setOverheadText("Verdimillius Duo!");
			e.getActor().setOverheadCycle(75);
		}
		//Fire Strike
		if (e.getActor().getGraphic() == 99) {
			e.getActor().setOverheadText("Inflamare");
			e.getActor().setOverheadCycle(75);
		}
		//Fire Bolt
		if (e.getActor().getGraphic() == 126) {
			e.getActor().setOverheadText("Lacarnum Inflamari!");
			e.getActor().setOverheadCycle(75);
		}
		//Fire Blast
		if (e.getActor().getGraphic() == 129) {
			e.getActor().setOverheadText("Incendio!");
			e.getActor().setOverheadCycle(75);
		}
		//Fire Wave
		if (e.getActor().getGraphic() == 155) {
			e.getActor().setOverheadText("Incendio Duo!");
			e.getActor().setOverheadCycle(75);
		}
		//Fire Surge
		if (e.getActor().getGraphic() == 1464) {
			e.getActor().setOverheadText("Incendio Tria!");
			e.getActor().setOverheadCycle(75);
		}
		//Telegrab
		if (e.getActor().getGraphic() == 142) {
			e.getActor().setOverheadText("Accio!");
			e.getActor().setOverheadCycle(75);
		}
		//Vulnerability
		if (e.getActor().getGraphic() == 167) {
			e.getActor().setOverheadText("Stupefy!");
			e.getActor().setOverheadCycle(75);
		}
		//Entangle
		if (e.getActor().getGraphic() == 177) {
			e.getActor().setOverheadText("Petrificus Totalus!");
			e.getActor().setOverheadCycle(75);
		}
		//Stun
		if (e.getActor().getGraphic() == 173) {
			e.getActor().setOverheadText("Confundo!");
			e.getActor().setOverheadCycle(75);
		}
		//Greater Corruption
		if (e.getActor().getGraphic() == 1878) {
			e.getActor().setOverheadText("Morsmordre!");
			e.getActor().setOverheadCycle(75);
		}
	}
}

/*
		//Bind & Snare
		if (e.getActor().getGraphic() == MISSING ID (177 is also Entangle) || e.getActor().getGraphic() == MISSING ID (177 is also Entangle))
		{
			e.getActor().setOverheadText("Incarnerous!");
			e.getActor().setOverheadCycle(75);
		}
		//Ice Rush
		if (e.getActor().getGraphic() == MISSING ID)
		{
		e.getActor().setOverheadText("Glacius!");
			e.getActor().setOverheadCycle(75);
		}
		//Ice Burst
		if (e.getActor().getGraphic() == MISSING ID)
		{
		e.getActor().setOverheadText("Glacius Duo!");
			e.getActor().setOverheadCycle(75);
		}
		//Ice Blitz
		if (e.getActor().getGraphic() == MISSING ID)
		{
		e.getActor().setOverheadText("Glacius Tria!");
			e.getActor().setOverheadCycle(75);
		}
		//Ice Barrage
		if (e.getActor().getGraphic() == MISSING ID)
		{
		e.getActor().setOverheadText("Immobulus!");
			e.getActor().setOverheadCycle(75);
		}
		//ALL SHADOW SPELLS
		if (e.getActor().getGraphic() == MISSING ID)
		{
		e.getActor().setOverheadText("Crucio!");
			e.getActor().setOverheadCycle(75);
		}
		//HEAL OTHER
		if (e.getActor().getGraphic() == MISSING ID)
		{
		e.getActor().setOverheadText("Episkey!");
			e.getActor().setOverheadCycle(75);
		}
				if (e.getActor().getGraphic() == MISSING ID)
		//HEAL GROUP
		{
		e.getActor().setOverheadText("Vulnera Sanentuer!");
			e.getActor().setOverheadCycle(75);
		}
		//CURE OTHER, CURE ME & CURE GROUP
		if (e.getActor().getGraphic() == MISSING ID || e.getActor().getGraphic() == MISSING ID|| e.getActor().getGraphic() == MISSING ID)
				{
		e.getActor().setOverheadText("Reparifors!");
			e.getActor().setOverheadCycle(75);
		}
*/