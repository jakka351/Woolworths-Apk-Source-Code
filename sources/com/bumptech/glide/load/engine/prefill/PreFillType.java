package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class PreFillType {

    public static class Builder {
    }

    static {
        Bitmap.Config config = Bitmap.Config.RGB_565;
    }

    public final boolean equals(Object obj) {
        return obj instanceof PreFillType;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "PreFillSize{width=0, height=0, config=null, weight=0}";
    }
}
