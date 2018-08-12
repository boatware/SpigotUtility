package de.exodus.fp.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Food implements CommandExecutor{
	//	ItemStack​(Material type, int amount)
	@Override
	public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {
		Player p = (Player) sender;
		ItemStack melon = new ItemStack(Material.MELON, 5);
		ItemStack steak = new ItemStack(Material.COOKED_BEEF, 5);
		p.getInventory().addItem(melon);
		p.getInventory().addItem(steak);
		p.sendMessage("§1§a Du kannst nun essen!");
		
		return false;
	}

}
