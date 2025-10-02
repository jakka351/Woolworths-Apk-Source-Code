package androidx.media3.common;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class BasePlayer implements Player {

    /* renamed from: a, reason: collision with root package name */
    public final Timeline.Window f2847a = new Timeline.Window();

    @Override // androidx.media3.common.Player
    public final void A() {
        long currentPosition = getCurrentPosition() + w();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        f0(Math.max(currentPosition, 0L), S(), false);
    }

    @Override // androidx.media3.common.Player
    public final void C() {
        f0(-9223372036854775807L, S(), false);
    }

    @Override // androidx.media3.common.Player
    public final void D() {
        if (K().p() || e()) {
            b0(7);
            return;
        }
        boolean zA0 = a0();
        if (d0() && !e0()) {
            if (zA0) {
                g0(7);
                return;
            } else {
                b0(7);
                return;
            }
        }
        if (!zA0 || getCurrentPosition() > n()) {
            f0(0L, S(), false);
        } else {
            g0(7);
        }
    }

    @Override // androidx.media3.common.Player
    public final void M() {
        int iE;
        if (K().p() || e()) {
            b0(9);
            return;
        }
        if (!Z()) {
            if (d0() && c0()) {
                f0(-9223372036854775807L, S(), false);
                return;
            } else {
                b0(9);
                return;
            }
        }
        Timeline timelineK = K();
        if (timelineK.p()) {
            iE = -1;
        } else {
            int iS = S();
            int iR = r();
            if (iR == 1) {
                iR = 0;
            }
            iE = timelineK.e(iS, iR, V());
        }
        if (iE == -1) {
            b0(9);
        } else if (iE == S()) {
            f0(-9223372036854775807L, S(), true);
        } else {
            f0(-9223372036854775807L, iE, false);
        }
    }

    @Override // androidx.media3.common.Player
    public final void O(int i, long j) {
        f0(j, i, false);
    }

    @Override // androidx.media3.common.Player
    public final void W() {
        long currentPosition = getCurrentPosition() + (-Y());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        f0(Math.max(currentPosition, 0L), S(), false);
    }

    public final boolean Z() {
        int iE;
        Timeline timelineK = K();
        if (timelineK.p()) {
            iE = -1;
        } else {
            int iS = S();
            int iR = r();
            if (iR == 1) {
                iR = 0;
            }
            iE = timelineK.e(iS, iR, V());
        }
        return iE != -1;
    }

    public final boolean a0() {
        int iK;
        Timeline timelineK = K();
        if (timelineK.p()) {
            iK = -1;
        } else {
            int iS = S();
            int iR = r();
            if (iR == 1) {
                iR = 0;
            }
            iK = timelineK.k(iS, iR, V());
        }
        return iK != -1;
    }

    public final void b0(int i) {
        f0(-9223372036854775807L, -1, false);
    }

    public final boolean c0() {
        Timeline timelineK = K();
        return !timelineK.p() && timelineK.m(S(), this.f2847a, 0L).h;
    }

    public final boolean d0() {
        Timeline timelineK = K();
        return !timelineK.p() && timelineK.m(S(), this.f2847a, 0L).a();
    }

    public final boolean e0() {
        Timeline timelineK = K();
        return !timelineK.p() && timelineK.m(S(), this.f2847a, 0L).g;
    }

    public abstract void f0(long j, int i, boolean z);

    public final void g0(int i) {
        int iK;
        Timeline timelineK = K();
        if (timelineK.p()) {
            iK = -1;
        } else {
            int iS = S();
            int iR = r();
            if (iR == 1) {
                iR = 0;
            }
            iK = timelineK.k(iS, iR, V());
        }
        if (iK == -1) {
            b0(i);
        } else if (iK == S()) {
            f0(-9223372036854775807L, S(), true);
        } else {
            f0(-9223372036854775807L, iK, false);
        }
    }

    @Override // androidx.media3.common.Player
    public final boolean j(int i) {
        return P().f2872a.f2852a.get(i);
    }

    @Override // androidx.media3.common.Player
    public final long o() {
        Timeline timelineK = K();
        if (timelineK.p()) {
            return -9223372036854775807L;
        }
        return Util.U(timelineK.m(S(), this.f2847a, 0L).l);
    }

    @Override // androidx.media3.common.Player
    public final void pause() {
        E(false);
    }

    @Override // androidx.media3.common.Player
    public final void q() {
        E(true);
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(long j) {
        f0(j, S(), false);
    }

    @Override // androidx.media3.common.Player
    public final boolean x() {
        return s() == 3 && l() && I() == 0;
    }
}
