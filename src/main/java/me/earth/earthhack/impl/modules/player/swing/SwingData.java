package me.earth.earthhack.impl.modules.player.swing;

import me.earth.earthhack.api.module.data.DefaultData;

final class SwingData extends DefaultData<Swing> {
    public SwingData(Swing module) {
        super(module);
        register(module.swingSpeed, "The delay between your hand swings. 6 is default speed. Higher the speed is, longer it will take to swing.");

    }

    @Override
    public int getColor() {
        return 0xffaa001D;
    }

    @Override
    public String getDescription() {
        return "Modifies how swinging hands work.";
    }
}