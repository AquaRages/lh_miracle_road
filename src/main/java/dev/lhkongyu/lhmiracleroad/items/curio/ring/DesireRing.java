package dev.lhkongyu.lhmiracleroad.items.curio.ring;

import com.google.common.collect.ImmutableMultimap;
import dev.lhkongyu.lhmiracleroad.attributes.LHMiracleRoadAttributes;
import dev.lhkongyu.lhmiracleroad.items.curio.RingItem;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import java.util.UUID;

/**
 * 欲望戒指 的饰品功能
 */
public class DesireRing {

    public static RingItem addAttributeModifier(){
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(LHMiracleRoadAttributes.CRITICAL_HIT_DAMAGE, new AttributeModifier(UUID.fromString("ec347e65-4170-0671-11b4-73ea47966697"), "", .15, AttributeModifier.Operation.ADDITION));
        builder.put(LHMiracleRoadAttributes.INJURED, new AttributeModifier(UUID.fromString("fb7437a1-d2cd-d96f-33a4-ddf27faa733f"), "", .08, AttributeModifier.Operation.MULTIPLY_TOTAL));
        return new RingItem(new Item.Properties().rarity(Rarity.EPIC),builder.build());
    }

}