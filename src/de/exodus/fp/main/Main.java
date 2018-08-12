package de.exodus.fp.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.exodus.fp.commands.Food;
import de.exodus.fp.commands.HealCommand;
import de.exodus.fp.listener.ScoreboardListener;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		
		System.out.println("Firstplugin loaded...");
		getCommand("heilen").setExecutor(new HealCommand());
		getCommand("food").setExecutor(new Food());
		
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new ScoreboardListener(), this);
		
	}
	
}
