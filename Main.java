package com.example.hello;

import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {

    @Override
    public void onEnable() {
        getLogger().info("Hello from HelloPlugin!");
    }
}