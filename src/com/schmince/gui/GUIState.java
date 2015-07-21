package com.schmince.gui;

/**
 * @author Derek Mulvihill - Jan 15, 2014
 */
public enum GUIState {
    None(false),
    //
    ;

    private boolean paused;

    private GUIState(boolean paused) {
        this.paused = paused;
    }

    public boolean getPaused() {
        return this.paused;
    }
}
