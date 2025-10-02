package androidx.media3.exoplayer.analytics;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class o {
    public static /* bridge */ /* synthetic */ MediaMetricsManager b(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder d() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder j(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }
}
