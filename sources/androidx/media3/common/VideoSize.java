package androidx.media3.common;

import androidx.media3.common.util.Util;

/* loaded from: classes2.dex */
public final class VideoSize {
    public static final VideoSize d = new VideoSize(0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f2887a;
    public final int b;
    public final float c;

    static {
        Util.E(0);
        Util.E(1);
        Util.E(3);
    }

    public VideoSize(int i, int i2, float f) {
        this.f2887a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoSize) {
            VideoSize videoSize = (VideoSize) obj;
            if (this.f2887a == videoSize.f2887a && this.b == videoSize.b && this.c == videoSize.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.f2887a) * 31) + this.b) * 31);
    }
}
