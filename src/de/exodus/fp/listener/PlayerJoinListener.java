package de.exodus.fp.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerJoinListener implements Listener{

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		ItemStack willkommen = new ItemStack(Material.COOKED_CHICKEN, 3);
		ItemMeta willkommenessen = willkommen.getItemMeta();
		willkommenessen.setDisplayName("§cWillkommensfleisch");
		willkommen.setItemMeta(willkommenessen);
		e.setJoinMessage("§7Der Spieler §a" + p.getName() + "§7 hat erfolgreich den Server betreten !");
		p.sendMessage("§3 Willkommen §6" + p.getName());
		p.sendMessage("§7 Du kannst keine neuen Nachrichten");
		p.getInventory().addItem(willkommen);
		
	}
	
}
