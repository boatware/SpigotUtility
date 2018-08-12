package de.exodus.fp.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public class ScoreboardListener implements Listener{
	@EventHandler
	public void handlePlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		Scoreboard sb = Bukkit.getScoreboardManager().getNewScoreboard();
		@SuppressWarnings("deprecation")
		Objective obj = sb.registerNewObjective("abd", "dd");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		obj.setDisplayName("§6-- SERVERNAME --");
		obj.getScore(" ").setScore(5);
		obj.getScore("§bTEST EXAMPLE").setScore(4);
		obj.getScore(" ").setScore(3);
		obj.getScore("§7Willkommen §a" + p.getName() + "§7 !").setScore(2);
		obj.getScore(" ").setScore(1);
		obj.getScore("§4 Viel Spass").setScore(0);
	}
	
	
	
}
