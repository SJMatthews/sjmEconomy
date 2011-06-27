package sjmatthews.sjmEconomy;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class sjmEconomy extends JavaPlugin {
	private final sjmEconomyBlockListener blockListener = new sjmEconomyBlockListener();
	private final sjmEconomyPlayerListener playerListener = new sjmEconomyPlayerListener();
	Logger log = Logger.getLogger("Minecraft");

	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_COMMAND_PREPROCESS,
				this.playerListener, Event.Priority.Normal, this);
		log.info(this.getDescription().getName() + " v"
				+ this.getDescription().getVersion() + " enabled.");
	}

	public void onDisable() {
		log.info(this.getDescription().getName() + " v"
				+ this.getDescription().getVersion() + " disabled.");
	}
}