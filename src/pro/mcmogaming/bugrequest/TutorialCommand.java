package pro.mcmogaming.bugrequest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TutorialCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		Player player = (Player) sender;
		
		if(sender instanceof Player) {
			player.sendMessage("hi");
			
		}
		
			
		
		
			return true;
	}

}
