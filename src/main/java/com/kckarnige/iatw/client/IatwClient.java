package com.kckarnige.iatw.client;

import com.kckarnige.iatw.Iatw;
import net.fabricmc.api.ClientModInitializer;

public class IatwClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Iatw.LOGGER.info("[It's About The...What?] We will be landing soon!");
    }
}
