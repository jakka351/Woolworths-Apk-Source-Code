package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements ListenerSet.Event {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ k(boolean z, int i) {
        this.d = i;
        this.e = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.d;
        boolean z = this.e;
        Player.Listener listener = (Player.Listener) obj;
        switch (i) {
            case 0:
                int i2 = ExoPlayerImpl.k0;
                listener.D(z);
                break;
            default:
                listener.o(z);
                break;
        }
    }
}
