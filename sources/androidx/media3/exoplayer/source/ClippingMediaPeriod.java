package androidx.media3.exoplayer.source;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

@UnstableApi
/* loaded from: classes2.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public final MediaPeriod d;
    public MediaPeriod.Callback e;
    public ClippingSampleStream[] f = new ClippingSampleStream[0];
    public long g;
    public long h;
    public long i;
    public ClippingMediaSource.IllegalClippingException j;

    public final class ClippingSampleStream implements SampleStream {
        public final SampleStream d;
        public boolean e;

        public ClippingSampleStream(SampleStream sampleStream) {
            this.d = sampleStream;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int h(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
            if (clippingMediaPeriod.a()) {
                return -3;
            }
            if (this.e) {
                decoderInputBuffer.d = 4;
                return -4;
            }
            long jK = clippingMediaPeriod.k();
            int iH = this.d.h(formatHolder, decoderInputBuffer, i);
            if (iH != -5) {
                long j = clippingMediaPeriod.i;
                if (j == Long.MIN_VALUE || ((iH != -4 || decoderInputBuffer.i < j) && !(iH == -3 && jK == Long.MIN_VALUE && !decoderInputBuffer.h))) {
                    return iH;
                }
                decoderInputBuffer.l();
                decoderInputBuffer.d = 4;
                this.e = true;
                return -4;
            }
            Format format = formatHolder.b;
            format.getClass();
            int i2 = format.H;
            int i3 = format.G;
            if (i3 == 0 && i2 == 0) {
                return -5;
            }
            if (clippingMediaPeriod.h != 0) {
                i3 = 0;
            }
            if (clippingMediaPeriod.i != Long.MIN_VALUE) {
                i2 = 0;
            }
            Format.Builder builderA = format.a();
            builderA.F = i3;
            builderA.G = i2;
            formatHolder.b = new Format(builderA);
            return -5;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            return !ClippingMediaPeriod.this.a() && this.d.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void j() {
            this.d.j();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int q(long j) {
            if (ClippingMediaPeriod.this.a()) {
                return -3;
            }
            return this.d.q(j);
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z, long j, long j2) {
        this.d = mediaPeriod;
        this.g = z ? j : -9223372036854775807L;
        this.h = j;
        this.i = j2;
    }

    public final boolean a() {
        return this.g != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean b() {
        return this.d.b();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        long j2 = this.h;
        if (j == j2) {
            return j2;
        }
        long j3 = Util.j(seekParameters.f3025a, 0L, j - j2);
        long j4 = seekParameters.b;
        long j5 = this.i;
        long j6 = Util.j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (j3 != seekParameters.f3025a || j6 != seekParameters.b) {
            seekParameters = new SeekParameters(j3, j6);
        }
        return this.d.c(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(long j) {
        this.g = -9223372036854775807L;
        for (ClippingSampleStream clippingSampleStream : this.f) {
            if (clippingSampleStream != null) {
                clippingSampleStream.e = false;
            }
        }
        long jD = this.d.d(j);
        long j2 = this.h;
        long j3 = this.i;
        long jMax = Math.max(jD, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long e() {
        if (a()) {
            long j = this.g;
            this.g = -9223372036854775807L;
            long jE = e();
            return jE != -9223372036854775807L ? jE : j;
        }
        long jE2 = this.d.e();
        if (jE2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.h;
        long j3 = this.i;
        long jMax = Math.max(jE2, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void f(MediaPeriod mediaPeriod) {
        if (this.j != null) {
            return;
        }
        MediaPeriod.Callback callback = this.e;
        callback.getClass();
        callback.f(this);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public final void g(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.e;
        callback.getClass();
        callback.g(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray i() {
        return this.d.i();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long k() {
        long jK = this.d.k();
        if (jK != Long.MIN_VALUE) {
            long j = this.i;
            if (j == Long.MIN_VALUE || jK < j) {
                return jK;
            }
        }
        return Long.MIN_VALUE;
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
        long jO = this.d.o();
        if (jO != Long.MIN_VALUE) {
            long j = this.i;
            if (j == Long.MIN_VALUE || jO < j) {
                return jO;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long p(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        this.f = new ClippingSampleStream[sampleStreamArr.length];
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        for (int i = 0; i < sampleStreamArr.length; i++) {
            ClippingSampleStream[] clippingSampleStreamArr = this.f;
            ClippingSampleStream clippingSampleStream = (ClippingSampleStream) sampleStreamArr[i];
            clippingSampleStreamArr[i] = clippingSampleStream;
            sampleStreamArr2[i] = clippingSampleStream != null ? clippingSampleStream.d : null;
        }
        long jP = this.d.p(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j);
        long j3 = this.i;
        long jMax = Math.max(jP, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (a()) {
            if (jP >= j) {
                if (jP != 0) {
                    for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
                        if (exoTrackSelection != null) {
                            Format formatG = exoTrackSelection.g();
                            if (!MimeTypes.a(formatG.n, formatG.k)) {
                            }
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
            break;
        } else {
            j2 = -9223372036854775807L;
        }
        this.g = j2;
        for (int i2 = 0; i2 < sampleStreamArr.length; i2++) {
            SampleStream sampleStream = sampleStreamArr2[i2];
            if (sampleStream == null) {
                this.f[i2] = null;
            } else {
                ClippingSampleStream[] clippingSampleStreamArr2 = this.f;
                ClippingSampleStream clippingSampleStream2 = clippingSampleStreamArr2[i2];
                if (clippingSampleStream2 == null || clippingSampleStream2.d != sampleStream) {
                    clippingSampleStreamArr2[i2] = new ClippingSampleStream(sampleStream);
                }
            }
            sampleStreamArr[i2] = this.f[i2];
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void r() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.j;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.d.r();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void s(MediaPeriod.Callback callback, long j) {
        this.e = callback;
        this.d.s(this, j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void u(long j, boolean z) {
        this.d.u(j, z);
    }
}
