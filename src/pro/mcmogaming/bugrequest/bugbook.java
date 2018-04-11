package pro.mcmogaming.bugrequest;

import java.util.ArrayList;

import org.apache.commons.lang.StringEscapeUtils;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class bugbook implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {

		Player player = (Player) sender;
		
		if(sender instanceof Player) {
			
			player.sendMessage( ChatColor.DARK_GRAY + "[" + ChatColor.DARK_GREEN + StringEscapeUtils.unescapeJava("\\u1F40D") + ChatColor.DARK_GRAY + "] " 
			+ ChatColor.GREEN + "You have recieved bug-report book");
			
			ItemStack bugbook = new ItemStack(Material.BOOK_AND_QUILL); // Creates an Object bugbook
			ItemMeta bugbookmeta = bugbook.getItemMeta(); //Creates item meta for bugbook
			
			bugbookmeta.setDisplayName(ChatColor.GREEN + "Bug-Report Book");//Sets displayname of bug book
			
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.DARK_GRAY + "" +ChatColor.STRIKETHROUGH + "----------------------------------");
			lore.add(ChatColor.GOLD + "Write your bug report in here report here");
			lore.add(ChatColor.GOLD + "Afterwards do /bugsend while the book");
			lore.add(ChatColor.GOLD + "is in hand.");
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.STRIKETHROUGH + "---------------------------------");
			bugbookmeta.setLore(lore);
			
			
			bugbook.setItemMeta(bugbookmeta);
			bugbook.setAmount(1);
			
			player.getInventory().addItem(bugbook);
			
			
		}
		
		
		
		
		return true;
	}
		
	
}
