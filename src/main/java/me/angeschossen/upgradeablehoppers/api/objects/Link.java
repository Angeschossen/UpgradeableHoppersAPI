package me.angeschossen.upgradeablehoppers.api.objects;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public interface Link {

    boolean exists();

    @Nullable
    HashMap<Integer, ItemStack> addItem(ItemStack itemStack) throws NullPointerException;

    @Nullable
    HashMap<Integer, ItemStack> removeItem(ItemStack itemStack);

    Inventory getDestination();

    boolean isLoaded();

    boolean canTransfer(Material material);

    Coordinate getCoordinate();

    Material getType();

    int getID();
}
