package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class TrackSelectionArray {

    /* renamed from: a, reason: collision with root package name */
    public int f3168a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackSelectionArray.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals((Object[]) null, (Object[]) null);
    }

    public final int hashCode() {
        if (this.f3168a == 0) {
            this.f3168a = Arrays.hashCode((Object[]) null) + 527;
        }
        return this.f3168a;
    }
}
