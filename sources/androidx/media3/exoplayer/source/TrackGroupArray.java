package androidx.media3.exoplayer.source;

import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;

@UnstableApi
/* loaded from: classes2.dex */
public final class TrackGroupArray {
    public static final TrackGroupArray d = new TrackGroupArray(new TrackGroup[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f3148a;
    public final ImmutableList b;
    public int c;

    static {
        Util.E(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackGroupArray(TrackGroup... trackGroupArr) {
        ImmutableList immutableListQ = ImmutableList.q(trackGroupArr);
        this.b = immutableListQ;
        this.f3148a = trackGroupArr.length;
        int i = 0;
        while (i < immutableListQ.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < immutableListQ.size(); i3++) {
                if (((TrackGroup) immutableListQ.get(i)).equals(immutableListQ.get(i3))) {
                    Log.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TrackGroup a(int i) {
        return (TrackGroup) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroupArray.class == obj.getClass()) {
            TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
            if (this.f3148a == trackGroupArray.f3148a && this.b.equals(trackGroupArray.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
