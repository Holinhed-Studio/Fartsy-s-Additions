
package com.firehostredux.fartsysadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

import com.firehostredux.fartsysadditions.itemgroup.StinkyThingsItemGroup;
import com.firehostredux.fartsysadditions.FartsysAdditionsModElements;

@FartsysAdditionsModElements.ModElement.Tag
public class ALandLongDeadItem extends FartsysAdditionsModElements.ModElement {
	@ObjectHolder("fartsys_additions:a_land_long_dead")
	public static final Item block = null;

	public ALandLongDeadItem(FartsysAdditionsModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FartsysAdditionsModElements.sounds.get(new ResourceLocation("fartsys_additions:alandlongdead")),
					new Item.Properties().group(StinkyThingsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("a_land_long_dead");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("The Burn dungeon theme"));
		}
	}
}
