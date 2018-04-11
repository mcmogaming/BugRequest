package pro.mcmogaming.bugrequest;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class BugReport implements CommandExecutor{
	
	bugrequest plugin = bugrequest.getInstance();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		Player player = (Player)sender;
		
		if(sender instanceof Player) {
			
			
			
			ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
			BookMeta meta = (BookMeta) book.getItemMeta();
			
			meta.setTitle("BugReport Book");
			meta.setAuthor("BugReport V1.1");
			
			for(int i = 0; i <= 2; i++) {
			meta.addPage(plugin.getConfig().getString(Integer.toString(i)) + "[Player:" + plugin.getConfig().getString(Integer.toString(i)+"-player")+"]");
			}
			
			book.setItemMeta(meta);
			
			player.getInventory().addItem(book);
			
			player.sendMessage("You recieved a book");
			
			
			
			
			
			
			
		}
		
		
		
		
		return true;
	}
	
	

}
