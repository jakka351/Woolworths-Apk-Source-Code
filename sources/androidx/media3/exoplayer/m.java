package androidx.media3.exoplayer;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.ExoPlayerImplInternal;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements ListenerSet.Event, ListenerSet.IterationFinishedEvent, ExoPlayerImplInternal.PlaybackInfoUpdateListener, BackgroundThreadStateHandler.StateChangeListener {
    public final /* synthetic */ ExoPlayerImpl d;

    public /* synthetic */ m(ExoPlayerImpl exoPlayerImpl) {
        this.d = exoPlayerImpl;
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public void a(Object obj, Object obj2) {
        ((Integer) obj).getClass();
        Integer num = (Integer) obj2;
        int iIntValue = num.intValue();
        int i = ExoPlayerImpl.k0;
        ExoPlayerImpl exoPlayerImpl = this.d;
        exoPlayerImpl.A0();
        exoPlayerImpl.t0(1, 10, num);
        exoPlayerImpl.t0(2, 10, num);
        exoPlayerImpl.m.f(21, new j(iIntValue, 1));
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void b(Object obj, FlagSet flagSet) {
        ((Player.Listener) obj).L(this.d.f, new Player.Events(flagSet));
    }

    public void c(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        ExoPlayerImpl exoPlayerImpl = this.d;
        exoPlayerImpl.j.post(new v(3, exoPlayerImpl, playbackInfoUpdate));
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).I(this.d.O);
    }
}
