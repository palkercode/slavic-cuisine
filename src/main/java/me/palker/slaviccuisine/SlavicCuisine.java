package me.palker.slaviccuisine;

import com.mojang.logging.LogUtils;
import me.palker.slaviccuisine.item.ModCreativeModTabs;
import me.palker.slaviccuisine.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SlavicCuisine.MODID)
public class SlavicCuisine {

    public static final String MODID = "slaviccuisine";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SlavicCuisine() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
