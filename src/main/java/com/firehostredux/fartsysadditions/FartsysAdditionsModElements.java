/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package com.firehostredux.fartsysadditions;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class FartsysAdditionsModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();

	public FartsysAdditionsModElements() {
		sounds.put(new ResourceLocation("fartsys_additions", "emone"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "emone")));
		sounds.put(new ResourceLocation("fartsys_additions", "agentofinquiry"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "agentofinquiry")));
		sounds.put(new ResourceLocation("fartsys_additions", "alandlongdead"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "alandlongdead")));
		sounds.put(new ResourceLocation("fartsys_additions", "artificialsun"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "artificialsun")));
		sounds.put(new ResourceLocation("fartsys_additions", "atomicrenegade"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "atomicrenegade")));
		sounds.put(new ResourceLocation("fartsys_additions", "atomicrenegaderemake"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "atomicrenegaderemake")));
		sounds.put(new ResourceLocation("fartsys_additions", "badapple"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "badapple")));
		sounds.put(new ResourceLocation("fartsys_additions", "battleonthebigbridgev"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "battleonthebigbridgev")));
		sounds.put(new ResourceLocation("fartsys_additions", "battleonthebigbridgexiv"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "battleonthebigbridgexiv")));
		sounds.put(new ResourceLocation("fartsys_additions", "brutejustice"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "brutejustice")));
		sounds.put(new ResourceLocation("fartsys_additions", "brutejusticeprimals"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "brutejusticeprimals")));
		sounds.put(new ResourceLocation("fartsys_additions", "burythelightmission20"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "burythelightmission20")));
		sounds.put(new ResourceLocation("fartsys_additions", "cosmicmind"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "cosmicmind")));
		sounds.put(new ResourceLocation("fartsys_additions", "cruelangelsthesis"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "cruelangelsthesis")));
		sounds.put(new ResourceLocation("fartsys_additions", "deviltrigger"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "deviltrigger")));
		sounds.put(new ResourceLocation("fartsys_additions", "exponentialentropy"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "exponentialentropy")));
		sounds.put(new ResourceLocation("fartsys_additions", "exponentialentropyprimals"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "exponentialentropyprimals")));
		sounds.put(new ResourceLocation("fartsys_additions", "flameofnuclear"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "flameofnuclear")));
		sounds.put(new ResourceLocation("fartsys_additions", "goodkingmogglemog"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "goodkingmogglemog")));
		sounds.put(new ResourceLocation("fartsys_additions", "grandmadestruction"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "grandmadestruction")));
		sounds.put(new ResourceLocation("fartsys_additions", "knowledgeneversleeps"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "knowledgeneversleeps")));
		sounds.put(new ResourceLocation("fartsys_additions", "locus"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "locus")));
		sounds.put(new ResourceLocation("fartsys_additions", "locusprimals"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "locusprimals")));
		sounds.put(new ResourceLocation("fartsys_additions", "metalmetal"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "metalmetal")));
		sounds.put(new ResourceLocation("fartsys_additions", "necrofantasia"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "necrofantasia")));
		sounds.put(new ResourceLocation("fartsys_additions", "necrofantasiademetori"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "necrofantasiademetori")));
		sounds.put(new ResourceLocation("fartsys_additions", "nuclearfusion"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "nuclearfusion")));
		sounds.put(new ResourceLocation("fartsys_additions", "nuclearfusiondemetori"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "nuclearfusiondemetori")));
		sounds.put(new ResourceLocation("fartsys_additions", "orientaldarkflightdemetori"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "orientaldarkflightdemetori")));
		sounds.put(new ResourceLocation("fartsys_additions", "outoftime"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "outoftime")));
		sounds.put(new ResourceLocation("fartsys_additions", "silentregardofstars"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "silentregardofstars")));
		sounds.put(new ResourceLocation("fartsys_additions", "spookyscaryskeletonsdualmix"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "spookyscaryskeletonsdualmix")));
		sounds.put(new ResourceLocation("fartsys_additions", "thisishalloween"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "thisishalloween")));
		sounds.put(new ResourceLocation("fartsys_additions", "tornfromtheheavens"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "tornfromtheheavens")));
		sounds.put(new ResourceLocation("fartsys_additions", "tornfromtheheavenscolossus"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "tornfromtheheavenscolossus")));
		sounds.put(new ResourceLocation("fartsys_additions", "undertheweight"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "undertheweight")));
		sounds.put(new ResourceLocation("fartsys_additions", "undertheweightprimals"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "undertheweightprimals")));
		sounds.put(new ResourceLocation("fartsys_additions", "unowenwasher"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "unowenwasher")));
		sounds.put(new ResourceLocation("fartsys_additions", "unowenwasherdemetori"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "unowenwasherdemetori")));
		sounds.put(new ResourceLocation("fartsys_additions", "weinterruptthisprogramme"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "weinterruptthisprogramme")));
		sounds.put(new ResourceLocation("fartsys_additions", "weinterruptthisprogrammeremix"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "weinterruptthisprogrammeremix")));
		sounds.put(new ResourceLocation("fartsys_additions", "whodoneitdemetori"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "whodoneitdemetori")));
		sounds.put(new ResourceLocation("fartsys_additions", "whodoneitmaritumix"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "whodoneitmaritumix")));
		sounds.put(new ResourceLocation("fartsys_additions", "worldsend"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "worldsend")));
		sounds.put(new ResourceLocation("fartsys_additions", "freaks"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "freaks")));
		sounds.put(new ResourceLocation("fartsys_additions", "infinity"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "infinity")));
		sounds.put(new ResourceLocation("fartsys_additions", "rockandroll"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "rockandroll")));
		sounds.put(new ResourceLocation("fartsys_additions", "itwasagoodday"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsys_additions", "itwasagoodday")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("fartsys_additions").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == FartsysAdditionsModElements.ModElement.class)
						elements.add((FartsysAdditionsModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(FartsysAdditionsModElements.ModElement::initElements);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		FartsysAdditionsMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}

		protected final FartsysAdditionsModElements elements;
		protected final int sortid;

		public ModElement(FartsysAdditionsModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
