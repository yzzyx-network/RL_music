package com.show_music;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ShowMusicTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ShowMusicPlugin.class);
		RuneLite.main(args);
	}
}