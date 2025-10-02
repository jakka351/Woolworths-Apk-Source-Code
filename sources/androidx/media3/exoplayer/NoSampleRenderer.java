package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class NoSampleRenderer implements Renderer, RendererCapabilities {
    public int d;
    public SampleStream e;
    public boolean f;

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int C() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) {
        return RendererCapabilities.g(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean b() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        Assertions.f(this.d == 1);
        this.d = 0;
        this.e = null;
        this.f = false;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int e() {
        return -2;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean f() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.d;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public final void i(int i, Object obj) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void j(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.f(!this.f);
        this.e = sampleStream;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean k() {
        return this.f;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void l(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, boolean z, boolean z2, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.f(this.d == 0);
        this.d = 1;
        j(formatArr, sampleStream, j, j2, mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final SampleStream n() {
        return this.e;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long o() {
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void p(long j) {
        this.f = false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final MediaClock q() {
        return null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        Assertions.f(this.d == 0);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() {
        Assertions.f(this.d == 1);
        this.d = 2;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        Assertions.f(this.d == 2);
        this.d = 1;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void t(int i, PlayerId playerId, Clock clock) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void v() {
        this.f = true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void w() {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void x(Timeline timeline) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities y() {
        return this;
    }
}
