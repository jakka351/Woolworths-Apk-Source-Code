package androidx.media3.exoplayer.source.ads;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.ForwardingTimeline;

@VisibleForTesting
@UnstableApi
/* loaded from: classes2.dex */
public final class SinglePeriodAdTimeline extends ForwardingTimeline {
    public final AdPlaybackState c;

    public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        super(timeline);
        Assertions.f(timeline.h() == 1);
        Assertions.f(timeline.o() == 1);
        this.c = adPlaybackState;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public final Timeline.Period f(int i, Timeline.Period period, boolean z) {
        long j;
        this.b.f(i, period, z);
        long j2 = period.d;
        if (j2 == -9223372036854775807L) {
            this.c.getClass();
            j = -9223372036854775807L;
        } else {
            j = j2;
        }
        period.h(period.f2877a, period.b, period.c, j, period.e, this.c, period.f);
        return period;
    }
}
