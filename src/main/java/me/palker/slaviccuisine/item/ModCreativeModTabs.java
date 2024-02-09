package me.palker.slaviccuisine.item;

import me.palker.slaviccuisine.SlavicCuisine;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SlavicCuisine.MODID);

    public static final RegistryObject<CreativeModeTab> SLAVIC_CUISINE_TAB = CREATIVE_MODE_TABS.register("slavic_cuisine_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BORSCHT.get())).title(Component.translatable("creativetab.slavic_cuisine_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.BORSCHT.get());
                        output.accept(ModItems.RASSOLNIK.get());
                        output.accept(ModItems.CABBAGE_SOUP.get());
                        output.accept(ModItems.UKHA.get());
                        output.accept(ModItems.ZUREK.get());
                        output.accept(ModItems.COMPOTE.get());
                        output.accept(ModItems.MORS.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
