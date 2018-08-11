package de.exodus.fp.main;

import org.bukkit.plugin.java.JavaPlugin;
import de.exodus.fp.commands.HealCommand;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		
		System.out.println("Firstplugin loaded...");
		getCommand("heilen").setExecutor(new HealCommand());
		
	}
	
}
