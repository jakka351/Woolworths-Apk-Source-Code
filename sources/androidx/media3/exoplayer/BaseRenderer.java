package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {
    public final int e;
    public RendererConfiguration g;
    public int h;
    public PlayerId i;
    public Clock j;
    public int k;
    public SampleStream l;
    public Format[] m;
    public long n;
    public long o;
    public boolean q;
    public boolean r;
    public RendererCapabilities.Listener t;
    public final Object d = new Object();
    public final FormatHolder f = new FormatHolder();
    public long p = Long.MIN_VALUE;
    public Timeline s = Timeline.f2876a;

    public BaseRenderer(int i) {
        this.e = i;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int C() {
        return 0;
    }

    public final ExoPlaybackException D(Throwable th, Format format, boolean z, int i) {
        int iA;
        if (format == null || this.r) {
            iA = 4;
        } else {
            this.r = true;
            try {
                iA = a(format) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.r = false;
            }
        }
        return new ExoPlaybackException(1, th, i, getName(), this.h, format, format == null ? 4 : iA, z);
    }

    public void E() {
    }

    public void F(boolean z, boolean z2) {
    }

    public void G(long j, boolean z) {
    }

    public void H() {
    }

    public void I() {
    }

    public void J() {
    }

    public void K() {
    }

    public void L(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public final int M(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        SampleStream sampleStream = this.l;
        sampleStream.getClass();
        int iH = sampleStream.h(formatHolder, decoderInputBuffer, i);
        if (iH == -4) {
            if (decoderInputBuffer.f(4)) {
                this.p = Long.MIN_VALUE;
                return this.q ? -4 : -3;
            }
            long j = decoderInputBuffer.i + this.n;
            decoderInputBuffer.i = j;
            this.p = Math.max(this.p, j);
            return iH;
        }
        if (iH == -5) {
            Format format = formatHolder.b;
            format.getClass();
            long j2 = format.s;
            if (j2 != Long.MAX_VALUE) {
                Format.Builder builderA = format.a();
                builderA.r = j2 + this.n;
                formatHolder.b = new Format(builderA);
            }
        }
        return iH;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean b() {
        return f();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        Assertions.f(this.k == 1);
        this.f.a();
        this.k = 0;
        this.l = null;
        this.m = null;
        this.q = false;
        E();
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int e() {
        return this.e;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean f() {
        return this.p == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.k;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void i(int i, Object obj) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void j(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.f(!this.q);
        this.l = sampleStream;
        if (this.p == Long.MIN_VALUE) {
            this.p = j;
        }
        this.m = formatArr;
        this.n = j2;
        L(formatArr, j, j2, mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean k() {
        return this.q;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void l(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, boolean z, boolean z2, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.f(this.k == 0);
        this.g = rendererConfiguration;
        this.k = 1;
        F(z, z2);
        j(formatArr, sampleStream, j, j2, mediaPeriodId);
        this.q = false;
        this.o = j;
        this.p = j;
        G(j, z);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final SampleStream n() {
        return this.l;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long o() {
        return this.p;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void p(long j) {
        this.q = false;
        this.o = j;
        this.p = j;
        G(j, false);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public MediaClock q() {
        return null;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void r() {
        synchronized (this.d) {
            this.t = null;
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void release() {
        Assertions.f(this.k == 0);
        H();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        Assertions.f(this.k == 0);
        this.f.a();
        I();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() {
        Assertions.f(this.k == 1);
        this.k = 2;
        J();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        Assertions.f(this.k == 2);
        this.k = 1;
        K();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void t(int i, PlayerId playerId, Clock clock) {
        this.h = i;
        this.i = playerId;
        this.j = clock;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void v() {
        this.q = true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void w() {
        SampleStream sampleStream = this.l;
        sampleStream.getClass();
        sampleStream.j();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void x(Timeline timeline) {
        if (Objects.equals(this.s, timeline)) {
            return;
        }
        this.s = timeline;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities y() {
        return this;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void z(RendererCapabilities.Listener listener) {
        synchronized (this.d) {
            this.t = listener;
        }
    }
}
