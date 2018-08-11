package de.exodus.fp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Food implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {
		Player p = (Player) sender;
		p.getInventory().getItem(1);
		p.sendMessage("§a Du kannst nun essen!");
		
		return false;
	}

}
