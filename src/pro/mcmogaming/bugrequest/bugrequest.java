package pro.mcmogaming.bugrequest;





import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class bugrequest extends JavaPlugin implements Listener{

	FileConfiguration config = this.getConfig();
	
	static bugrequest instance;
	
	@Override
	public void onEnable() {
		
		instance = this;
		
		
		this.getCommand("bugbook").setExecutor((CommandExecutor)new bugbook());
		this.getCommand("bugsend").setExecutor((CommandExecutor)new bugsend());		
		this.getCommand("bugreportclear").setExecutor((CommandExecutor)new BugReportClear());
		this.getCommand("bugreport").setExecutor((CommandExecutor)new BugReport());
		this.getCommand("getcpuspecs").setExecutor((CommandExecutor) new GetComputerSpecs());
		
		
		
		
		
		
		
		
		
		configCreate();
		
	}
	
	@Override
	public void onDisable() {
		instance = null;
	}

	public static bugrequest getInstance() {
		return instance;
	}

	public void configCreate() {
		for(int i = 0; i <= 10;i++) {
			 config.addDefault( Integer.toString(i) , "");
			 config.addDefault( Integer.toString(i) + "-player" , "");
		}
		
		config.options().copyDefaults(true);
		saveConfig();
		
	}
	
	
}
