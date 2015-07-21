package com.schmince.game.model;

import com.schmince.gldraw.*;
import dopengl.drawable.GLDrawable;
import dopengl.drawable.GLDrawableProvider;

/**
 * @author Derek Mulvihill - Jan 18, 2014
 */
public enum ItemType implements GLDrawableProvider {
    Flare(GLFlare.class),
    Locator(GLLocator.class),
    Boots(GLBoots.class),
    Pick(GLPick.class),
    Gun(GLGun.class),
    Armor(GLArmor.class),
    MedicKit(GLMedicKit.class),
    //
    ;

    private final Class<? extends GLDrawable> clazz;

    private ItemType(Class<? extends GLDrawable> clazz) {
        this.clazz = clazz;
    }

    @Override
    public Class<? extends GLDrawable> getDrawClass() {
        return clazz;
    }
}
