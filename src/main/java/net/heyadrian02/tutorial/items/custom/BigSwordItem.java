package net.heyadrian02.tutorial.items.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class BigSwordItem extends SwordItem {


    public BigSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (user.getWorld().isClient()) {  // only run this code on the server
            return ActionResult.SUCCESS;
        }
        user.getWorld().createExplosion(user, entity.getX(), entity.getY(), entity.getZ(), 8.0F, World.ExplosionSourceType.TNT);
        return ActionResult.SUCCESS;
    }
}
