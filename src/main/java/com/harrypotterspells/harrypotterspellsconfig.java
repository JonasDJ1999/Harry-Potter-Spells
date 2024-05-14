package com.harrypotterspells;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.api.events.GraphicChanged;

@Slf4j
@PluginDescriptor(
	name = "Example"
)
public class harrypotterspellsconfig extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private harrypotterspells config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
		}
	}

	@Provides
	harrypotterspells provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(harrypotterspells.class);
	}
	@Subscribe
	public void onGraphicChanged(GraphicChanged e)
	{
		if (client.getLocalPlayer() == e.getActor() && e.getActor().getGraphic() == 142)
		{
			e.getActor().setOverheadText("Accio!");
			e.getActor().setOverheadCycle(1);
		}
	}
}
