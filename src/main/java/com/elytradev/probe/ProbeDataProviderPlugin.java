package com.elytradev.probe;

import net.minecraft.fluid.Fluid;

import com.elytradev.probe.api.UnitDictionary;
import com.elytradev.probe.api.impl.SIUnit;
import com.elytradev.probe.api.impl.Unit;
import org.dimdev.rift.listener.MinecraftStartListener;

public class ProbeDataProviderPlugin implements MinecraftStartListener {
	@Override
	public void onMinecraftStart() {
		UnitDictionary dict = UnitDictionary.getInstance();
		for(Fluid fluid : Fluid.REGISTRY) {
			Unit fluidUnit = new SIUnit("buckets_"+Fluid.REGISTRY.getNameForObject(fluid), "B", 0x283593);
			dict.register(fluidUnit, fluid);
		}
	}
}
