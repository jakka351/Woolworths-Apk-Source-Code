package androidx.media3.exoplayer.upstream.experimental;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.SlidingPercentile;
import androidx.media3.exoplayer.upstream.experimental.PercentileTimeToFirstByteEstimator;
import com.google.common.collect.ImmutableList;
import java.util.ArrayDeque;
import java.util.HashMap;

@UnstableApi
/* loaded from: classes2.dex */
public final class ExperimentalBandwidthMeter implements BandwidthMeter, TransferListener {

    public static final class Builder {
        public Builder(Context context) {
            context.getApplicationContext();
            new PercentileTimeToFirstByteEstimator.FixedSizeLinkedHashMap();
            new SlidingPercentile(20);
            new ArrayDeque();
            new BandwidthMeter.EventListener.EventDispatcher();
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
        }
    }

    static {
        ImmutableList.u(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
        ImmutableList.u(1500000L, 980000L, 750000L, 520000L, 290000L);
        ImmutableList.u(2000000L, 1300000L, 1000000L, 860000L, 610000L);
        ImmutableList.u(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        ImmutableList.u(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        ImmutableList.u(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    }

    public static boolean h(DataSpec dataSpec, boolean z) {
        if (!z) {
            return false;
        }
        int i = dataSpec.i;
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public final synchronized void a(BandwidthMeter.EventListener eventListener) {
        throw null;
    }

    @Override // androidx.media3.datasource.TransferListener
    public final synchronized void b(DataSpec dataSpec, boolean z) {
        if (h(dataSpec, z)) {
            throw null;
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public final synchronized void c(DataSpec dataSpec, boolean z) {
        if (h(dataSpec, z)) {
            throw null;
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public final synchronized void d(DataSpec dataSpec, boolean z, int i) {
        if (h(dataSpec, z)) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public final synchronized void e(Handler handler, BandwidthMeter.EventListener eventListener) {
        eventListener.getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public final TransferListener f() {
        return this;
    }

    @Override // androidx.media3.datasource.TransferListener
    public final synchronized void g(DataSpec dataSpec, boolean z) {
        if (h(dataSpec, z)) {
            throw null;
        }
    }
}
