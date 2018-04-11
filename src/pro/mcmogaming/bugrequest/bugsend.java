package pro.mcmogaming.bugrequest;





import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;


public class bugsend implements CommandExecutor {
	
	//bugrequest config = new bugrequest();
	
	bugrequest plugin = bugrequest.getInstance();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {

		Player player = (Player) sender;
		
		if(sender instanceof Player) {
		
			ItemStack playerbook = player.getInventory().getItemInMainHand();
			BookMeta meta = (BookMeta)playerbook.getItemMeta();
		
			String page  =  meta.getPage(1); 
			String playername =  player.getName();
			
			for(int i = 0; i <= 10; i++) {
				if(plugin.getConfig().get(Integer.toString(i)).equals("")){	
					
					plugin.getConfig().set(Integer.toString(i), page);
					plugin.getConfig().set(Integer.toString(i) + "-player", playername);
					
					player.getInventory().removeItem(playerbook);
					
					player.sendMessage("The bug report was sent");
					
					plugin.saveConfig();
					
					break;
				}
				if(i == 10) {
					player.sendMessage("Bug request folder is full! Ask admin to clear it.");
				}
			}
			
		}
		
		
		
		return true;
	}
	
	
}
