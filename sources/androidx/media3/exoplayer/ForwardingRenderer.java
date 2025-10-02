package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;

@UnstableApi
/* loaded from: classes2.dex */
public class ForwardingRenderer implements Renderer {
    @Override // androidx.media3.exoplayer.Renderer
    public final void B(float f, float f2) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean b() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int e() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean f() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public final void i(int i, Object obj) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void j(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean k() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void l(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, boolean z, boolean z2, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void m(long j, long j2) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final SampleStream n() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long o() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void p(long j) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final MediaClock q() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void release() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void t(int i, PlayerId playerId, Clock clock) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void u() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void v() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void w() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void x(Timeline timeline) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities y() {
        throw null;
    }
}
