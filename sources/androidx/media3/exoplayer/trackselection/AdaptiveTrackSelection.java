package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public final BandwidthMeter f;

    public static final class AdaptationCheckpoint {

        /* renamed from: a, reason: collision with root package name */
        public final long f3162a;
        public final long b;

        public AdaptationCheckpoint(long j, long j2) {
            this.f3162a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.f3162a == adaptationCheckpoint.f3162a && this.b == adaptationCheckpoint.b;
        }

        public final int hashCode() {
            return (((int) this.f3162a) * 31) + ((int) this.b);
        }
    }

    public static class Factory implements ExoTrackSelection.Factory {
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter, long j, long j2, ImmutableList immutableList) {
        super(trackGroup, iArr);
        if (j2 < j) {
            Log.g("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f = bandwidthMeter;
        ImmutableList.o(immutableList);
    }

    public static void l(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ImmutableList.Builder builder = (ImmutableList.Builder) arrayList.get(i);
            if (builder != null) {
                builder.h(new AdaptationCheckpoint(j, jArr[i]));
            }
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int a() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final void disable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final void enable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final void j(float f) {
    }
}
