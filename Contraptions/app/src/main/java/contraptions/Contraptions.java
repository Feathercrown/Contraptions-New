package contraptions;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

import net.kyori.adventure.text.Component;

public class Contraptions extends JavaPlugin {

    @Override
    public void onLoad() {
        // https://docs.papermc.io/paper/dev/how-do-plugins-work#initialization
    }

    @Override
    public void onEnable() {
        // https://docs.papermc.io/paper/dev/how-do-plugins-work#enabling
        //Bukkit.getPluginManager().registerEvents(this, this);

        ItemStack wrench = createSpecialItem(Material.TRIPWIRE_HOOK, "Wrench", "Your gateway to contraptioning");
        ShapedRecipe wrenchRecipe = new ShapedRecipe(new NamespacedKey("contraptions", "wrenchrecipe"), wrench);
        wrenchRecipe.shape("NI", "NS", " S");
        wrenchRecipe.setIngredient('N', new ItemStack(Material.IRON_NUGGET));
        wrenchRecipe.setIngredient('I', new ItemStack(Material.IRON_INGOT));
        wrenchRecipe.setIngredient('S', new ItemStack(Material.STICK));
        Bukkit.addRecipe(wrenchRecipe);

        ItemStack contraptionCore = createSpecialItem(Material.PISTON, "Contraption Core", "What will it do");
        ShapedRecipe contraptionCoreRecipe = new ShapedRecipe(new NamespacedKey("contraptions", "corerecipe"), contraptionCore);
        contraptionCoreRecipe.shape("PDP", "HCH", "MRM");
        contraptionCoreRecipe.setIngredient('P', new ItemStack(Material.PISTON));
        contraptionCoreRecipe.setIngredient('D', new ItemStack(Material.DISPENSER));
        contraptionCoreRecipe.setIngredient('H', new ItemStack(Material.HOPPER));
        contraptionCoreRecipe.setIngredient('C', new ItemStack(Material.CRAFTING_TABLE));
        contraptionCoreRecipe.setIngredient('M', new ItemStack(Material.COMPARATOR));
        contraptionCoreRecipe.setIngredient('R', new ItemStack(Material.REDSTONE_BLOCK));
        Bukkit.addRecipe(contraptionCoreRecipe);

        ItemStack basicFrame = createSpecialItem(Material.DROPPER, "Basic Contraption Frame", "Looks like it could hold something...");
        ShapedRecipe basicFrameRecipe = new ShapedRecipe(new NamespacedKey("contraptions", "framerecipe"), basicFrame);
        basicFrameRecipe.shape("S", "B", "C");
        basicFrameRecipe.setIngredient('S', new ItemStack(Material.SCAFFOLDING));
        basicFrameRecipe.setIngredient('B', new ItemStack(Material.IRON_BARS));
        basicFrameRecipe.setIngredient('C', new ItemStack(Material.COMPOSTER));
        Bukkit.addRecipe(basicFrameRecipe);

    }

    @Override
    public void onDisable() {
        // https://docs.papermc.io/paper/dev/how-do-plugins-work#disabling
    }

    // @EventHandler
    // public void onPlayerJoin(PlayerJoinEvent event) {
    //     event.getPlayer().sendMessage(Component.text("Hello, " + event.getPlayer().getName() + "!"));
    // }

    private ItemStack createSpecialItem(Material material, String name, String lore){
        ItemStack item = new ItemStack(material);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.displayName(Component.text(name));
        ArrayList<Component> loreArray = new ArrayList<Component>();
        loreArray.add(Component.text(lore));
        itemMeta.lore(loreArray);
        item.setItemMeta(itemMeta);
        return item;
    }

}
