package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements ListenerSet.Event {
    public final /* synthetic */ int d;
    public final /* synthetic */ AnalyticsListener.EventTime e;

    public /* synthetic */ d(AnalyticsListener.EventTime eventTime, int i) {
        this.d = i;
        this.e = eventTime;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.d) {
            case 0:
                ((AnalyticsListener) obj).F(this.e);
                break;
            case 1:
                ((AnalyticsListener) obj).A(this.e);
                break;
            case 2:
                ((AnalyticsListener) obj).d(this.e);
                break;
            case 3:
                ((AnalyticsListener) obj).s(this.e);
                break;
            case 4:
                ((AnalyticsListener) obj).x(this.e);
                break;
            default:
                ((AnalyticsListener) obj).P(this.e);
                break;
        }
    }

    public /* synthetic */ d(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i) {
        this.d = i;
        this.e = eventTime;
    }
}
