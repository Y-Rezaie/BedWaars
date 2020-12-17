package com.fuun_craft.bedwaars;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	
	public void onEnable(){

		        // Register our command "bw" (set an instance of your command class as executor)
			 
		        this.getCommand("bw").setExecutor(new BWExcuter());
		 
	}
	
	@Override
	
	public void onDisable() {
		
	}
	    
}
	

