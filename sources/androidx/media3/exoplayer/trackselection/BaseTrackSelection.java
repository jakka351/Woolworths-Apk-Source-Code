package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {

    /* renamed from: a, reason: collision with root package name */
    public final TrackGroup f3163a;
    public final int b;
    public final int[] c;
    public final Format[] d;
    public int e;

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr) {
        Assertions.f(iArr.length > 0);
        trackGroup.getClass();
        Format[] formatArr = trackGroup.d;
        this.f3163a = trackGroup;
        int length = iArr.length;
        this.b = length;
        this.d = new Format[length];
        for (int i = 0; i < iArr.length; i++) {
            this.d[i] = formatArr[iArr[i]];
        }
        Arrays.sort(this.d, new b(6));
        this.c = new int[this.b];
        int i2 = 0;
        while (true) {
            int i3 = this.b;
            if (i2 >= i3) {
                long[] jArr = new long[i3];
                return;
            }
            int[] iArr2 = this.c;
            Format format = this.d[i2];
            int i4 = 0;
            while (true) {
                if (i4 >= formatArr.length) {
                    i4 = -1;
                    break;
                } else if (format == formatArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            iArr2[i2] = i4;
            i2++;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int b(int i) {
        return this.c[i];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int d(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final TrackGroup e() {
        return this.f3163a;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
            if (this.f3163a.equals(baseTrackSelection.f3163a) && Arrays.equals(this.c, baseTrackSelection.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int f() {
        return this.c[a()];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final Format g() {
        return this.d[a()];
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.c) + (System.identityHashCode(this.f3163a) * 31);
        }
        return this.e;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final Format i(int i) {
        return this.d[i];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void j(float f) {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final void k(boolean z) {
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.c.length;
    }
}
