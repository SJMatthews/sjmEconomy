package sjmatthews.sjmEconomy;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerListener;

public class sjmEconomyPlayerListener extends PlayerListener {
	public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
		String[] split = event.getMessage().split(" ");
		Player player = event.getPlayer();
		if (split[0].equalsIgnoreCase("/sjmcnm")) {
			try {
				if (split[1].equalsIgnoreCase("-p")) {
					// pay
					event.setCancelled(true);
				}
				if (split[1].equalsIgnoreCase("-b")) {
					// balance
					event.setCancelled(true);
				}
			} catch (Exception ex) {

			}
		}
	}
}