package fr.doritanh.olurwa.survival.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.doritanh.olurwa.survival.Survival;

public class PlayerListener implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		if (e.getPlayer().hasPermission("survival.play")) {
			e.getPlayer().setGameMode(GameMode.SURVIVAL);
		} else {
			e.getPlayer().setGameMode(GameMode.SPECTATOR);
			e.getPlayer().teleport(Survival.get().getSpawnWorld().getSpawnLocation());
		}
	}

}
