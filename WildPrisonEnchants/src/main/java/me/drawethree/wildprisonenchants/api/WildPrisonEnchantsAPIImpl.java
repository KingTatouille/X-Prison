package me.drawethree.wildprisonenchants.api;

import me.drawethree.wildprisonenchants.enchants.WildPrisonEnchantment;
import me.drawethree.wildprisonenchants.managers.EnchantsManager;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class WildPrisonEnchantsAPIImpl implements WildPrisonEnchantsAPI {

    private EnchantsManager enchantsManager;

    public WildPrisonEnchantsAPIImpl(EnchantsManager enchantsManager) {

        this.enchantsManager = enchantsManager;
    }

    @Override
    public HashMap<WildPrisonEnchantment, Integer> getPlayerEnchants(ItemStack pickAxe) {
        return this.enchantsManager.getPlayerEnchants(pickAxe);
    }

    @Override
    public boolean hasEnchant(Player p, int id) {
        return this.enchantsManager.hasEnchant(p, id);
    }

    @Override
    public synchronized int getEnchantLevel(Player p, int id) {
        return this.enchantsManager.getEnchantLevel(p, id);
    }

    @Override
    public boolean addEnchant(Player p, int id, int level) {
        return this.enchantsManager.addEnchant(p,id,level);
    }

    @Override
    public boolean removeEnchnt(Player p, int id) {
        return this.enchantsManager.removeEnchant(p,id);
    }
}
