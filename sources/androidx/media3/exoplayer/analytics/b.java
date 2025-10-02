package androidx.media3.exoplayer.analytics;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements ListenerSet.Event {
    public final /* synthetic */ int d;
    public final /* synthetic */ AnalyticsListener.EventTime e;
    public final /* synthetic */ int f;

    public /* synthetic */ b(int i, long j, AnalyticsListener.EventTime eventTime) {
        this.d = 0;
        this.e = eventTime;
        this.f = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.d) {
            case 0:
                ((AnalyticsListener) obj).r(this.e, this.f);
                break;
            case 1:
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.getClass();
                analyticsListener.i(this.e, this.f);
                break;
            case 2:
                ((AnalyticsListener) obj).I(this.e, this.f);
                break;
            case 3:
                ((AnalyticsListener) obj).g(this.e, this.f);
                break;
            case 4:
                ((AnalyticsListener) obj).p(this.e, this.f);
                break;
            case 5:
                ((AnalyticsListener) obj).k(this.e, this.f);
                break;
            case 6:
                ((AnalyticsListener) obj).Q(this.e, this.f);
                break;
            default:
                ((AnalyticsListener) obj).l(this.e, this.f);
                break;
        }
    }

    public /* synthetic */ b(AnalyticsListener.EventTime eventTime, int i, int i2) {
        this.d = i2;
        this.e = eventTime;
        this.f = i;
    }

    public /* synthetic */ b(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
        this.d = 3;
        this.e = eventTime;
        this.f = i;
    }
}
