package com.schmince.gldraw;

import dopengl.shared.GLSimpleBufferDrawer;

/**
 * @author Derek Mulvihill - Jan 18, 2014
 */
public class GLBoots extends GLSimpleBufferDrawer {
    public GLBoots() {
        super(14);
        buffer.tvcb(-0.999, -0.113, -0.952, -0.594, -0.207, -0.659, 0.504f, 0.528f, 0.531f)
                .tvcb(-0.186, -0.663, -0.225, 1.000, -0.654, 0.939, 0.462f, 0.473f, 0.473f)
                .tvcb(-0.169, -0.720, -1.000, -0.124, -0.356, 0.083, 0.504f, 0.528f, 0.531f)
                .tvcb(-0.962, -0.623, -0.168, -0.743, -0.177, -0.573, 0.196f, 0.188f, 0.189f)
                .tvcb(-0.982, -0.641, -0.710, -0.703, -0.894, -0.869, 0.000f, 0.984f, 0.989f)
                .tvcb(-0.659, -0.726, -0.555, -0.962, -0.444, -0.733, 0.000f, 0.984f, 0.989f)
                .tvcb(-0.356, -0.739, -0.254, -0.958, -0.165, -0.723, 0.000f, 0.984f, 0.989f)
                .tvcb(0.108, 0.938, 0.090, -0.684, 0.462, 0.903, 0.462f, 0.473f, 0.473f)
                .tvcb(0.291, 0.140, 0.084, -0.718, 1.000, -0.061, 0.504f, 0.528f, 0.531f)
                .tvcb(0.984, -0.041, 0.947, -0.703, 0.071, -0.667, 0.504f, 0.528f, 0.531f)
                .tvcb(0.099, -0.691, 0.949, -0.705, 0.098, -0.818, 0.196f, 0.188f, 0.189f)
                .tvcb(0.106, -0.848, 0.349, -0.817, 0.248, -0.987, 0.000f, 0.984f, 0.989f)
                .tvcb(0.407, -0.820, 0.605, -0.766, 0.539, -1.000, 0.000f, 0.984f, 0.989f)
                .tvcb(0.725, -0.767, 0.955, -0.715, 0.831, -0.967, 0.000f, 0.984f, 0.989f);
        vertexBuffer.pushStaticBuffer();
        colorBuffer.pushStaticBuffer();
    }
}
