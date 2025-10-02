package androidx.media3.exoplayer;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import java.util.HashMap;
import java.util.Iterator;

@UnstableApi
/* loaded from: classes2.dex */
public class DefaultLoadControl implements LoadControl {

    /* renamed from: a, reason: collision with root package name */
    public final DefaultAllocator f2996a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final HashMap h;
    public long i;

    public static final class Builder {
    }

    public static class PlayerLoadingState {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2997a;
        public int b;
    }

    public DefaultLoadControl() {
        DefaultAllocator defaultAllocator = new DefaultAllocator();
        k(1000, 0, "bufferForPlaybackMs", "0");
        k(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        k(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(50000, 50000, "maxBufferMs", "minBufferMs");
        k(0, 0, "backBufferDurationMs", "0");
        this.f2996a = defaultAllocator;
        long j = 50000;
        this.b = Util.I(j);
        this.c = Util.I(j);
        this.d = Util.I(1000);
        this.e = Util.I(2000);
        this.f = -1;
        this.g = Util.I(0);
        this.h = new HashMap();
        this.i = -1L;
    }

    public static void k(int i, int i2, String str, String str2) {
        Assertions.a(str + " cannot be less than " + str2, i >= i2);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final boolean a() {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.LoadControl
    public final void b(LoadControl.Parameters parameters, ExoTrackSelection[] exoTrackSelectionArr) {
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) this.h.get(parameters.f3010a);
        playerLoadingState.getClass();
        int iMax = this.f;
        if (iMax == -1) {
            int length = exoTrackSelectionArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
                    if (exoTrackSelection != null) {
                        switch (exoTrackSelection.e().c) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        playerLoadingState.b = iMax;
        m();
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final void c(PlayerId playerId) {
        long id = Thread.currentThread().getId();
        long j = this.i;
        Assertions.e("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.i = id;
        HashMap map = this.h;
        if (!map.containsKey(playerId)) {
            map.put(playerId, new PlayerLoadingState());
        }
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) map.get(playerId);
        playerLoadingState.getClass();
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        playerLoadingState.b = i;
        playerLoadingState.f2997a = false;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final boolean d(LoadControl.Parameters parameters) {
        int i;
        long j = this.c;
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) this.h.get(parameters.f3010a);
        playerLoadingState.getClass();
        DefaultAllocator defaultAllocator = this.f2996a;
        synchronized (defaultAllocator) {
            i = defaultAllocator.e * defaultAllocator.b;
        }
        boolean z = i >= l();
        long jMin = this.b;
        float f = parameters.c;
        if (f > 1.0f) {
            jMin = Math.min(Util.v(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = parameters.b;
        if (j2 < jMax) {
            playerLoadingState.f2997a = !z;
            if (z && j2 < 500000) {
                Log.g("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z) {
            playerLoadingState.f2997a = false;
        }
        return playerLoadingState.f2997a;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final boolean e() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            if (((PlayerLoadingState) it.next()).f2997a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final boolean f(LoadControl.Parameters parameters) {
        int i;
        long jRound = parameters.b;
        float f = parameters.c;
        int i2 = Util.f2928a;
        if (f != 1.0f) {
            jRound = Math.round(jRound / f);
        }
        long jMin = parameters.d ? this.e : this.d;
        long j = parameters.e;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin <= 0 || jRound >= jMin) {
            return true;
        }
        DefaultAllocator defaultAllocator = this.f2996a;
        synchronized (defaultAllocator) {
            i = defaultAllocator.e * defaultAllocator.b;
        }
        return i >= l();
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final long g() {
        return this.g;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final DefaultAllocator h() {
        return this.f2996a;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final void i(PlayerId playerId) {
        HashMap map = this.h;
        if (map.remove(playerId) != null) {
            m();
        }
        if (map.isEmpty()) {
            this.i = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final void j(PlayerId playerId) {
        if (this.h.remove(playerId) != null) {
            m();
        }
    }

    public final int l() {
        Iterator it = this.h.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((PlayerLoadingState) it.next()).b;
        }
        return i;
    }

    public final void m() {
        if (!this.h.isEmpty()) {
            this.f2996a.f(l());
            return;
        }
        DefaultAllocator defaultAllocator = this.f2996a;
        synchronized (defaultAllocator) {
            if (defaultAllocator.f3178a) {
                defaultAllocator.f(0);
            }
        }
    }
}
