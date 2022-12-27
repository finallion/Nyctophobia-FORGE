package net.finallion.graveyard_biomes.init;


import com.mojang.serialization.Codec;
import net.finallion.graveyard_biomes.TheGraveyardBiomes;
import net.finallion.graveyard_biomes.world.structures.MushroomStructure;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TGStructures {

    public static final DeferredRegister<StructureType<?>> STRUCTURES = DeferredRegister.create(Registries.f_256938_, TheGraveyardBiomes.MOD_ID);

    public static final RegistryObject<StructureType<MushroomStructure>> MUSHROOM_STRUCTURE = STRUCTURES.register("mushroom_structure", () -> explicitStructureTypeTyping(MushroomStructure.CODEC));

    private static <T extends Structure> StructureType<T> explicitStructureTypeTyping(Codec<T> structureCodec) {
        return () -> structureCodec;
    }
}
