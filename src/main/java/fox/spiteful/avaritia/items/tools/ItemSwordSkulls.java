package fox.spiteful.avaritia.items.tools;

import java.util.List;

import fox.spiteful.avaritia.Avaritia;
import fox.spiteful.avaritia.items.LudicrousItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.text.TextFormatting;


public class ItemSwordSkulls extends ItemSword {

    public ItemSwordSkulls(){
        super(ToolMaterial.EMERALD);
        setUnlocalizedName("skullfire_sword");
        setTextureName("avaritia:skull_sword");
        setCreativeTab(Avaritia.tab);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.epic;
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
    public void addInformation(ItemStack item, EntityPlayer player, List tooltip, boolean wut) {
    	tooltip.add(TextFormatting.DARK_GRAY +""+ TextFormatting.ITALIC + StatCollector.translateToLocal("tooltip.skullfire_sword.desc"));
    }
}
