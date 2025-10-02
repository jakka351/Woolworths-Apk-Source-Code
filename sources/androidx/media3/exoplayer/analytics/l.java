package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements ListenerSet.Event, Consumer {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ l(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener.EventTime eventTime) {
        this.e = eventTime;
        this.d = i;
        this.f = positionInfo;
        this.g = positionInfo2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        MediaSourceEventListener.EventDispatcher eventDispatcher = (MediaSourceEventListener.EventDispatcher) this.e;
        ((MediaSourceEventListener) obj).a0(eventDispatcher.f3131a, eventDispatcher.b, (LoadEventInfo) this.f, (MediaLoadData) this.g, this.d);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) this.e;
        Player.PositionInfo positionInfo = (Player.PositionInfo) this.f;
        Player.PositionInfo positionInfo2 = (Player.PositionInfo) this.g;
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.getClass();
        analyticsListener.e(this.d, positionInfo, positionInfo2, eventTime);
    }

    public /* synthetic */ l(MediaSourceEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.e = eventDispatcher;
        this.f = loadEventInfo;
        this.g = mediaLoadData;
        this.d = i;
    }
}
