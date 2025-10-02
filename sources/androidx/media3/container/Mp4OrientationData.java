package androidx.media3.container;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class Mp4OrientationData implements Metadata.Entry {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof Mp4OrientationData);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + 527;
    }

    public final String toString() {
        return "Orientation= 0";
    }
}
