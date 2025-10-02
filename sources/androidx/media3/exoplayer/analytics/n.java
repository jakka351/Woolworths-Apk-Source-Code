package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements ListenerSet.Event {
    public final /* synthetic */ int d;
    public final /* synthetic */ AnalyticsListener.EventTime e;
    public final /* synthetic */ AudioSink.AudioTrackConfig f;

    public /* synthetic */ n(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.d = i;
        this.e = eventTime;
        this.f = audioTrackConfig;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.d) {
            case 0:
                ((AnalyticsListener) obj).L(this.e, this.f);
                break;
            default:
                ((AnalyticsListener) obj).o(this.e, this.f);
                break;
        }
    }
}
