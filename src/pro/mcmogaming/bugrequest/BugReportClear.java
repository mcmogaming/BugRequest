package pro.mcmogaming.bugrequest;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BugReportClear implements CommandExecutor{
	
	bugrequest plugin = bugrequest.getInstance();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		
		Player player = (Player)sender;
		
		
		
		if(sender instanceof Player) {
		
		File configFile = new File(plugin.getDataFolder(), "config.yml");
		configFile.delete();
		player.sendMessage("Deleting All Bug Reports...");
		}
		
		plugin.configCreate();
		player.sendMessage("Cleared!");
		
		
		
		return true;
	}
	
	
}
