package com.gmail.codst3r.basicplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class BasicPlugin extends JavaPlugin{
	
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new GeneralListener(), this);
		getLogger().info("BasicPlugin Enabled.");
	}
	
	@Override
	public void onDisable(){
		getLogger().info("BasicPlugin Disabled");
	}

}