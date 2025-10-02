package androidx.media3.exoplayer.analytics;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlaybackSessionManager;
import androidx.media3.exoplayer.source.MediaLoadData;
import java.io.IOException;

@UnstableApi
/* loaded from: classes2.dex */
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {

    public interface Callback {
    }

    public static final class PlaybackStatsTracker {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void H(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void e(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener.EventTime eventTime) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void f(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void q(int i, long j, AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void r(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void u(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void v(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void w(Player player, AnalyticsListener.Events events) {
        FlagSet flagSet = events.f3029a;
        if (flagSet.f2852a.size() == 0) {
            return;
        }
        if (flagSet.f2852a.size() <= 0) {
            throw null;
        }
        int iA = flagSet.a(0);
        events.b(iA);
        if (iA != 0 && iA != 11) {
            throw null;
        }
        throw null;
    }
}
