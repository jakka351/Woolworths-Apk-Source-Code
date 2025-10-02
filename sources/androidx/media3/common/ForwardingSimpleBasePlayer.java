package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public class ForwardingSimpleBasePlayer extends SimpleBasePlayer {

    /* renamed from: androidx.media3.common.ForwardingSimpleBasePlayer$1, reason: invalid class name */
    class AnonymousClass1 implements Player.Listener {
        @Override // androidx.media3.common.Player.Listener
        public final void K(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void L(Player player, Player.Events events) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void Y() {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void h0(int i, boolean z) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void u(Metadata metadata) {
            throw null;
        }
    }

    public static final class LivePositionSuppliers {
    }
}
