package pro.mcmogaming.bugrequest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetComputerSpecs implements CommandExecutor{

	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		
		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			
			player.sendMessage(System.getProperty("os.name"));
			player.sendMessage(System.getProperty("sun.arch.data.model"));
			player.sendMessage(System.getProperty("java.vm.version"));
			player.sendMessage(System.getProperty("os.arch"));
			player.sendMessage(System.getProperty("user.home"));
			player.sendMessage(System.getProperty("user.name"));
			
		}
		
		
		
		
		
		
		
		
		
		return false;
	}
	
	

}
