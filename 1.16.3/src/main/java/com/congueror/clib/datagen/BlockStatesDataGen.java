package com.congueror.clib.datagen;

import net.minecraft.data.BlockStateProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStatesDataGen<T> extends BlockStateProvider 
{	
	public BlockStatesDataGen(DataGenerator gen, ExistingFileHelper exFileHelper)
    {
        super(gen);
    }
	
	protected void registerStatesAndModels() {
		
	}
}
