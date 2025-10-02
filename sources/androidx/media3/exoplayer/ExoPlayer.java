package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Player;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.MediaSource;

/* loaded from: classes2.dex */
public interface ExoPlayer extends Player {

    @UnstableApi
    public interface AudioOffloadListener {
        default void A() {
        }
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3001a;
        public final SystemClock b;
        public final c c;
        public final c d;
        public final c e;
        public final c f;
        public final Looper g;
        public final int h;
        public final AudioAttributes i;
        public final int j;
        public final boolean k;
        public final SeekParameters l;
        public final long m;
        public final long n;
        public final long o;
        public final DefaultLivePlaybackSpeedControl p;
        public final long q;
        public final long r;
        public final boolean s;
        public boolean t;
        public final String u;
        public final SuitableOutputChecker v;

        public Builder(Context context) {
            c cVar = new c(context, 1);
            c cVar2 = new c(context, 2);
            c cVar3 = new c(context, 3);
            c cVar4 = new c(context, 4);
            context.getClass();
            this.f3001a = context;
            this.c = cVar;
            this.d = cVar2;
            this.e = cVar3;
            this.f = cVar4;
            int i = Util.f2928a;
            Looper looperMyLooper = Looper.myLooper();
            this.g = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.i = AudioAttributes.b;
            this.j = 1;
            this.k = true;
            this.l = SeekParameters.c;
            this.m = 5000L;
            this.n = 15000L;
            this.o = 3000L;
            this.p = new DefaultLivePlaybackSpeedControl(Util.I(20L), 0.999f, Util.I(500L));
            this.b = Clock.f2906a;
            this.q = 500L;
            this.r = 2000L;
            this.s = true;
            this.u = "";
            this.h = -1000;
            this.v = new DefaultSuitableOutputChecker();
        }

        public final ExoPlayer a() {
            Assertions.f(!this.t);
            this.t = true;
            return new ExoPlayerImpl(this);
        }
    }

    @UnstableApi
    public static class PreloadConfiguration {

        /* renamed from: a, reason: collision with root package name */
        public static final PreloadConfiguration f3002a = new PreloadConfiguration();
    }

    @Override // androidx.media3.common.Player
    ExoPlaybackException a();

    void b(MediaSource mediaSource);

    void release();

    @UnstableApi
    void setImageOutput(@Nullable ImageOutput imageOutput);
}
