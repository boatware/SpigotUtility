package de.exodus.fp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		Player p = (Player) sender;
		p.setHealth(20);
		p.setFoodLevel(20);
		p.sendMessage("§3 Du wurdest geheilt!");
		
		
		return false;
	}

}
