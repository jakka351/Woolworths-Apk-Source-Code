package androidx.media3.container;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class Mp4LocationData implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final float f2932a;
    public final float b;

    public Mp4LocationData(float f, float f2) {
        Assertions.a("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.f2932a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Mp4LocationData.class == obj.getClass()) {
            Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
            if (this.f2932a == mp4LocationData.f2932a && this.b == mp4LocationData.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.f2932a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f2932a + ", longitude=" + this.b;
    }
}
