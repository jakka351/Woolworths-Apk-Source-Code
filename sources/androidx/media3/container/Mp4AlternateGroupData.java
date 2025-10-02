package androidx.media3.container;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class Mp4AlternateGroupData implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final int f2930a;

    public Mp4AlternateGroupData(int i) {
        this.f2930a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mp4AlternateGroupData) && this.f2930a == ((Mp4AlternateGroupData) obj).f2930a;
    }

    public final int hashCode() {
        return this.f2930a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f2930a;
    }
}
