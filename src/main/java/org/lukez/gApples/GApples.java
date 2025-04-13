package org.lukez.gApples;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class GApples extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        say("GApples插件已启用！");
        say("正在加载自定义附魔金苹果配方1...");
        LoadRecipeWithApple();
        say("正在加载自定义附魔金苹果配方2...");
        LoadRecipeWithGoldenApple();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void say(String msg) {
        CommandSender sender = Bukkit.getConsoleSender();
        String prefix = "[GApples] ";
        msg = prefix + msg;
        sender.sendMessage(msg);
    }

    public void LoadRecipeWithApple() {
        // 创建附魔金苹果
        ItemStack enchantedGoldenApple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);

        // 创建配方
        NamespacedKey key = new NamespacedKey(this, "custom_enchanted_golden_apple_1");
        ShapedRecipe recipe = new ShapedRecipe(key, enchantedGoldenApple);
        recipe.shape("GGG", "GAG", "GGG"); // 配方形状
        recipe.setIngredient('G', Material.GOLD_BLOCK); // 使用金块
        recipe.setIngredient('A', Material.APPLE); // 使用普通苹果

        // 注册配方
        Bukkit.addRecipe(recipe);

        getLogger().info("自定义附魔金苹果配方已加载！");
    }

    public void LoadRecipeWithGoldenApple() {
        // 创建附魔金苹果
        ItemStack enchantedGoldenApple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);

        // 创建配方
        NamespacedKey key = new NamespacedKey(this, "custom_enchanted_golden_apple_2");
        ShapedRecipe recipe = new ShapedRecipe(key, enchantedGoldenApple);
        recipe.shape("GBG", "GAG", "GGG"); // 配方形状
        recipe.setIngredient('G', Material.GOLD_BLOCK); // 使用金块
        recipe.setIngredient('A', Material.GOLDEN_APPLE); // 使用金苹果
        recipe.setIngredient('B', Material.GOLD_INGOT); // 使用金锭

        // 注册配方
        Bukkit.addRecipe(recipe);

        getLogger().info("自定义附魔金苹果配方已加载！");
    }
}
