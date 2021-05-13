package me.rockorbonk.crackpixel.scheduledtest.tasks;

import me.rockorbonk.crackpixel.scheduledtest.Scheduledtest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

public class CoolTask extends BukkitRunnable {

    Scheduledtest plugin;
    Player player;

    public CoolTask(Scheduledtest plugin) {
        this.plugin = plugin;
    }

    public CoolTask(Scheduledtest plugin, Player player){
        this.plugin = plugin;
        this.player = player;
    }

    @Override
    public void run() {
        for(int i = 0; 1 < player.getInventory().getSize(); ++i) {
            ItemStack item = player.getInventory().getItem(i);
            if (item == null) {
            if (!item.hasItemMeta()) {
                ItemMeta meta = item.getItemMeta();
                meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
                item.setItemMeta(meta);

                }
            }
        }
    }
}
