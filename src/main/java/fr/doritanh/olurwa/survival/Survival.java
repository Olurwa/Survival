package fr.doritanh.olurwa.survival;

import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.plugin.java.JavaPlugin;

import fr.doritanh.olurwa.survival.listeners.PlayerListener;

public class Survival extends JavaPlugin {

	private static Survival instance;

	private World spawnWorld;

	public Survival() {
		instance = this;
	}

	@Override
	public void onEnable() {
		// Register events
		this.getServer().getPluginManager().registerEvents(new PlayerListener(), this);

		// Get spawn world
		for (World w : this.getServer().getWorlds()) {
			if (w.getEnvironment() == Environment.NORMAL) {
				this.spawnWorld = w;
			}
		}
	}

	/**
	 * Get an instance of survival
	 * 
	 * @return
	 */
	public static Survival get() {
		return Survival.instance;
	}

	public World getSpawnWorld() {
		return spawnWorld;
	}

}
