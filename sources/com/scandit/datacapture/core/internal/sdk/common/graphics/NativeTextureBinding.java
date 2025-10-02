package com.scandit.datacapture.core.internal.sdk.common.graphics;

import YU.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeTextureBinding {
    final int target;
    final int texture;

    public NativeTextureBinding(int i, int i2) {
        this.target = i;
        this.texture = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeTextureBinding)) {
            return false;
        }
        NativeTextureBinding nativeTextureBinding = (NativeTextureBinding) obj;
        return this.target == nativeTextureBinding.target && this.texture == nativeTextureBinding.texture;
    }

    public int getTarget() {
        return this.target;
    }

    public int getTexture() {
        return this.texture;
    }

    public int hashCode() {
        return ((this.target + 527) * 31) + this.texture;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeTextureBinding{target=");
        sb.append(this.target);
        sb.append(",texture=");
        return a.m(sb, this.texture, "}");
    }
}
