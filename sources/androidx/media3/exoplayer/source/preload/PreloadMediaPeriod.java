package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* loaded from: classes2.dex */
final class PreloadMediaPeriod implements MediaPeriod {
    public final MediaPeriod d;
    public boolean e;
    public boolean f;
    public MediaPeriod.Callback g;
    public PreloadTrackSelectionHolder h;

    public static class PreloadTrackSelectionHolder {
    }

    public PreloadMediaPeriod(MediaPeriod mediaPeriod) {
        this.d = mediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean b() {
        return this.d.b();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        return this.d.c(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(long j) {
        return this.d.d(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long e() {
        return this.d.e();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray i() {
        return this.d.i();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long k() {
        return this.d.k();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void l(long j) {
        this.d.l(j);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean n(LoadingInfo loadingInfo) {
        return this.d.n(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long o() {
        return this.d.o();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long p(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        if (this.h == null) {
            return this.d.p(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }
        int length = sampleStreamArr.length;
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void r() {
        this.d.r();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void s(MediaPeriod.Callback callback, long j) {
        this.g = callback;
        if (this.e) {
            callback.f(this);
        } else {
            if (this.f) {
                return;
            }
            this.f = true;
            this.d.s(new MediaPeriod.Callback() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.1
                @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
                public final void f(MediaPeriod mediaPeriod) {
                    PreloadMediaPeriod preloadMediaPeriod = PreloadMediaPeriod.this;
                    preloadMediaPeriod.e = true;
                    MediaPeriod.Callback callback2 = preloadMediaPeriod.g;
                    callback2.getClass();
                    callback2.f(preloadMediaPeriod);
                }

                @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
                public final void g(SequenceableLoader sequenceableLoader) {
                    PreloadMediaPeriod preloadMediaPeriod = PreloadMediaPeriod.this;
                    MediaPeriod.Callback callback2 = preloadMediaPeriod.g;
                    callback2.getClass();
                    callback2.g(preloadMediaPeriod);
                }
            }, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void u(long j, boolean z) {
        this.d.u(j, z);
    }
}
