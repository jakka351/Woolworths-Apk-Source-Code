package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ MediaSourceList.ForwardingEventListener e;
    public final /* synthetic */ Pair f;
    public final /* synthetic */ LoadEventInfo g;
    public final /* synthetic */ MediaLoadData h;

    public /* synthetic */ u(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.d = i;
        this.e = forwardingEventListener;
        this.f = pair;
        this.g = loadEventInfo;
        this.h = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                AnalyticsCollector analyticsCollector = this.e.e.h;
                Pair pair = this.f;
                analyticsCollector.J(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, this.g, this.h);
                break;
            default:
                AnalyticsCollector analyticsCollector2 = this.e.e.h;
                Pair pair2 = this.f;
                analyticsCollector2.j0(((Integer) pair2.first).intValue(), (MediaSource.MediaPeriodId) pair2.second, this.g, this.h);
                break;
        }
    }
}
