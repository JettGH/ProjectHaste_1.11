package net.sylver.projecthaste;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ProjectHaste.MOD_ID, name = ProjectHaste.MOD_NAME, version = ProjectHaste.VERSION)
public class ProjectHaste {
	
	// Constants
	public static final String MOD_ID = "projecthaste";
	public static final String MOD_NAME = "Project Haste";
	public static final String VERSION = "@VERSION@";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":"; // projecthaste
	
	// Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static ProjectHaste instance;
	
	@SidedProxy(clientSide = "net.sylver.projecthaste.ClientProxy", serverSide = "net.sylver.projecthaste.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
		proxy.init(event);
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		
		proxy.postInit(event);
	}
}
