package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class TrackSelectionOverride {

    /* renamed from: a, reason: collision with root package name */
    public final TrackGroup f2880a;
    public final ImmutableList b;

    static {
        Util.E(0);
        Util.E(1);
    }

    public TrackSelectionOverride(TrackGroup trackGroup, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= trackGroup.f2879a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f2880a = trackGroup;
        this.b = ImmutableList.o(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackSelectionOverride.class == obj.getClass()) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) obj;
            if (this.f2880a.equals(trackSelectionOverride.f2880a) && this.b.equals(trackSelectionOverride.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.f2880a.hashCode();
    }
}
