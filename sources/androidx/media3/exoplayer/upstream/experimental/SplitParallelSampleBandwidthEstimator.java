package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public class SplitParallelSampleBandwidthEstimator implements BandwidthEstimator {

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public SlidingWeightedAverageBandwidthStatistic f3187a;
        public SystemClock b;
    }
}
