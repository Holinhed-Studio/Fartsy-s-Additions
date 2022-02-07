
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
public class BruteJusticeItem extends FartsysAdditionsModElements.ModElement {
	@ObjectHolder("fartsys_additions:brute_justice")
	public static final Item block = null;

	public BruteJusticeItem(FartsysAdditionsModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FartsysAdditionsModElements.sounds.get(new ResourceLocation("fartsys_additions:brutejustice")),
					new Item.Properties().group(StinkyThingsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("brute_justice");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Alexander Raid Music"));
		}
	}
}
