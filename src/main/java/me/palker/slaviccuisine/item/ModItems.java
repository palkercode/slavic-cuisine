package me.palker.slaviccuisine.item;

import me.palker.slaviccuisine.SlavicCuisine;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SlavicCuisine.MODID);

    public static final RegistryObject<Item> BORSCHT = ITEMS.register("borscht",
            () -> new ConsumableItem(
                    new Item.Properties().food(new FoodProperties.Builder().nutrition(13).saturationMod(0.75F)
                                    .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1.0F).build())
                    .craftRemainder(Items.BOWL), true));

    public static final RegistryObject<Item> RASSOLNIK = ITEMS.register("rassolnik",
            () -> new ConsumableItem(
                    new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(0.65F)
                                    .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1.0F).build())
                            .craftRemainder(Items.BOWL), true));

    public static final RegistryObject<Item> CABBAGE_SOUP = ITEMS.register("cabbage_soup",
            () -> new ConsumableItem(
                    new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(0.65F)
                                    .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1.0F).build())
                            .craftRemainder(Items.BOWL), true));

    public static final RegistryObject<Item> UKHA = ITEMS.register("ukha",
            () -> new ConsumableItem(
                    new Item.Properties().food(new FoodProperties.Builder().nutrition(13).saturationMod(0.75F)
                                    .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1.0F).build())
                            .craftRemainder(Items.BOWL), true));

    public static final RegistryObject<Item> ZUREK = ITEMS.register("zurek",
            () -> new ConsumableItem(
                    new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(0.75F)
                                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1.0F).build())
                            .craftRemainder(Items.BOWL), true));

    public static final RegistryObject<Item> COMPOTE = ITEMS.register("compote",
            () -> new DrinkableItem(
                    new Item.Properties().food(new FoodProperties.Builder().alwaysEat()
                            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 3200, 0), 1.0F).build())
                            .craftRemainder(Items.GLASS_BOTTLE).stacksTo(16), true, false));

    public static final RegistryObject<Item> MORS = ITEMS.register("mors",
            () -> new DrinkableItem(
                    new Item.Properties().food(new FoodProperties.Builder().alwaysEat()
                                    .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 3200, 0), 1.0F).build())
                            .craftRemainder(Items.GLASS_BOTTLE).stacksTo(16), true, false));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
