package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ListenerSet.Event {
    public final /* synthetic */ int d;
    public final /* synthetic */ AnalyticsListener.EventTime e;
    public final /* synthetic */ String f;

    public /* synthetic */ a(AnalyticsListener.EventTime eventTime, String str, int i) {
        this.d = i;
        this.e = eventTime;
        this.f = str;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.d) {
            case 0:
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.getClass();
                analyticsListener.R(this.e, this.f);
                break;
            case 1:
                ((AnalyticsListener) obj).N(this.e, this.f);
                break;
            case 2:
                AnalyticsListener analyticsListener2 = (AnalyticsListener) obj;
                analyticsListener2.getClass();
                analyticsListener2.n(this.e, this.f);
                break;
            default:
                ((AnalyticsListener) obj).M(this.e, this.f);
                break;
        }
    }

    public /* synthetic */ a(AnalyticsListener.EventTime eventTime, String str, long j, long j2, int i) {
        this.d = i;
        this.e = eventTime;
        this.f = str;
    }
}
