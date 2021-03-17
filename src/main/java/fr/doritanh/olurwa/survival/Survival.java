package fr.doritanh.olurwa.survival;

import org.bukkit.plugin.java.JavaPlugin;

import fr.doritanh.olurwa.survival.listeners.PlayerListener;

public class Survival extends JavaPlugin {

	private static Survival instance;

	public Survival() {
		instance = this;
	}

	@Override
	public void onEnable() {
		// Register events
		this.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
	}

	/**
	 * Get an instance of survival
	 * 
	 * @return
	 */
	public static Survival get() {
		return Survival.instance;
	}

}
