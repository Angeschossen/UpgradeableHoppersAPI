package me.angeschossen.upgradeablehoppers.api.stacking;

import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ItemStackerProvider {

    /**
     * The name of your plugin.
     *
     * @return the unique name of the plugin
     */
    @NotNull
    String getName();

    /**
     * Get item stack from your custom stacked item. Your integration must handle the creation of the ItemStack object.
     * That means that you need to set the correct ItemStack amount {@param item} and other values like NBT data.
     * You may want to use .clone to create the ItemStack.
     *
     * @param item      the item entity
     * @param maxAmount the returned ItemStack's amount should not be higher than this. Usually the value is 64
     * @return null, if the item is not a stacked item of your plugin.
     */
    @Nullable
    ItemStack getItemStack(@NotNull Item item, final int maxAmount);

    /**
     * Get a stacked item from the item entity
     * @param item item entity to lookup
     * @return null, if this item isn't stacked
     */
    @Nullable
    ItemStackWrapper getItemStack(@NotNull Item item);

    /**
     * Add amount to a stacked item of your plugin.
     *
     * @param item   the item entity
     * @param amount the amount to add
     * @return false, if the item is not a stacked item of your plugin
     */
    boolean addAmountToItem(@NotNull Item item, final int amount);
}
