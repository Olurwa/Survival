package fr.doritanh.olurwa.survival.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {

	public void onPlayerJoin(PlayerJoinEvent e) {
		if (e.getPlayer().hasPermission("survival.play")) {
			e.getPlayer().setGameMode(GameMode.SURVIVAL);
		} else {
			e.getPlayer().setGameMode(GameMode.SPECTATOR);
		}
	}

}
