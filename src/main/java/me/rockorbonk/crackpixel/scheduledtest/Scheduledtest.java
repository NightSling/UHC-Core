package me.rockorbonk.crackpixel.scheduledtest;

import me.rockorbonk.crackpixel.scheduledtest.tasks.CoolTask;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import java.util.*;

public class Scheduledtest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        BukkitTask CoolTask = new CoolTask(this).runTaskTimer(this, 0L, 900_000L);
        BukkitTask CoolTask = new CoolTask(this).runTaskTimer(this, 0L, 1_800_000L);
        BukkitTask CoolTask = new CoolTask(this).runTaskTimer(this, 0L, 2_400_000L);
        Bukkit.addRecipe(Apprentice_Sword());
    }

        public ShapedRecipe Apprentice_Sword() {

            ItemStack item = new ItemStack(Material.IRON_SWORD);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.GREEN + "Apprentice Sword");
            List<String> lore = new ArrayList<>();

            lore.add(ChatColor.AQUA + "→ Gains Sharpness I After 15 Minutes In");

            lore.add(ChatColor.AQUA + "→ Gains Sharpness II After 30 Minutes In");

            lore.add(ChatColor.AQUA + "→ Gains Sharpness III After 45 Minutes In");

            meta.setLore(lore);

            item.setItemMeta(meta);

            NamespacedKey key = new NamespacedKey(this, "Apprentice_Sword");

            ShapedRecipe recipe = new ShapedRecipe(key, item);

            recipe.shape("XRX", "XIX", "XRX");
            recipe.setIngredient('R', Material.REDSTONE_BLOCK);
            recipe.setIngredient('I', Material.IRON_SWORD);
            return recipe;
    }
}
