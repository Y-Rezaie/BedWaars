package com.fuun_craft.bedwaars;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.*;

public class BWExcuter implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("BW") && sender instanceof Player) {
			
			if (args.length == 0) {
			   
			    sender.sendMessage("Please use /BW help for help /n BedWaars v1 ");
			    
			    return true;

			}

			if (args.length >= 1) {
				
			    if (args[0].equalsIgnoreCase("setcenter")) {
			    	
						 
					        Player player = (Player) sender;
					        
					        Location loc = player.getLocation();

					        double x = loc.getX();
					        
					        double y = loc.getY();
					        
					        double z = loc.getZ();
					        
					        int xInt = (int)x;
					        
					        int yInt = (int)y;
					        
					        int zInt = (int)z;
					        
					        World world = Bukkit.getWorld("world");
					        
					        WorldBorder border = world.getWorldBorder();

					        border.setCenter(xInt, yInt);
			    	
			    }
			 
			    if (args[0].equalsIgnoreCase("help")) {
			    	
			    	sender.sendMessage("This Command is exprimental !!! /n PLS W8 for it");
			    }
			return false;
		}
			if (args.length >= 2) {
				
				if (args[0].equalsIgnoreCase("setwidth")) {
					 
					int arenawidth = Integer.parseInt(args[1]);
					
					World world = Bukkit.getWorld("world");
			        
			        WorldBorder border = world.getWorldBorder();

			        border.setSize(arenawidth, 0);
			        
				 }
			}
		return false;
	}
		return false;
	
}
	
}
