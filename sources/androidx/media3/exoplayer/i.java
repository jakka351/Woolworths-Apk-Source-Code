package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import com.google.common.base.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements ListenerSet.Event, Function {
    public final /* synthetic */ int d;

    public /* synthetic */ i(int i) {
        this.d = i;
    }

    @Override // com.google.common.base.Function
    public Object apply(Object obj) {
        return new DefaultAnalyticsCollector((Clock) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        Player.Listener listener = (Player.Listener) obj;
        switch (this.d) {
            case 0:
                int i = ExoPlayerImpl.k0;
                listener.G(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), 1003));
                break;
            default:
                listener.Y();
                break;
        }
    }
}
