package androidx.media3.exoplayer.analytics;

import android.media.AudioProfile;
import android.media.MediaDrm;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class p {
    public static /* bridge */ /* synthetic */ AudioProfile c(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent e(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* synthetic */ PlaybackMetrics.Builder g() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder h() {
        return new PlaybackStateEvent.Builder();
    }
}
