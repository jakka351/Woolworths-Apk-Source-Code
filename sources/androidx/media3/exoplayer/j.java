package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements ListenerSet.Event {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ j(int i, int i2) {
        this.d = i2;
        this.e = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.d;
        int i2 = this.e;
        Player.Listener listener = (Player.Listener) obj;
        switch (i) {
            case 0:
                int i3 = ExoPlayerImpl.k0;
                listener.m0(i2);
                break;
            default:
                int i4 = ExoPlayerImpl.k0;
                listener.B(i2);
                break;
        }
    }
}
