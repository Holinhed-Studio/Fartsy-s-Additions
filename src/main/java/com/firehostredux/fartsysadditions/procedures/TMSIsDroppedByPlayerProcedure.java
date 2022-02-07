package com.firehostredux.fartsysadditions.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import java.util.Map;

import com.firehostredux.fartsysadditions.FartsysAdditionsMod;

public class TMSIsDroppedByPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FartsysAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure TMSIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FartsysAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure TMSIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FartsysAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure TMSIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FartsysAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure TMSIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FartsysAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure TMSIsDroppedByPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("selfdesharted").setDamageBypassesArmor(), (float) 100000);
		}
		if (world instanceof ServerWorld) {
			LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
			_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
			_ent.setEffectOnly(false);
			((World) world).addEntity(_ent);
		}
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z),
					Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"clear");
		}
	}
}
