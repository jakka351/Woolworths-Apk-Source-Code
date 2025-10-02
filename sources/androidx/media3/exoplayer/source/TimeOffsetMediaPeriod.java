package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* loaded from: classes2.dex */
final class TimeOffsetMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public final MediaPeriod d;
    public final long e;
    public MediaPeriod.Callback f;

    public static final class TimeOffsetSampleStream implements SampleStream {
        public final SampleStream d;
        public final long e;

        public TimeOffsetSampleStream(SampleStream sampleStream, long j) {
            this.d = sampleStream;
            this.e = j;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int h(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            int iH = this.d.h(formatHolder, decoderInputBuffer, i);
            if (iH == -4) {
                decoderInputBuffer.i += this.e;
            }
            return iH;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            return this.d.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void j() {
            this.d.j();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int q(long j) {
            return this.d.q(j - this.e);
        }
    }

    public TimeOffsetMediaPeriod(MediaPeriod mediaPeriod, long j) {
        this.d = mediaPeriod;
        this.e = j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean b() {
        return this.d.b();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        long j2 = this.e;
        return this.d.c(j - j2, seekParameters) + j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(long j) {
        long j2 = this.e;
        return this.d.d(j - j2) + j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long e() {
        long jE = this.d.e();
        if (jE == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jE + this.e;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void f(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.f;
        callback.getClass();
        callback.f(this);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public final void g(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.f;
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
        if (jK == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jK + this.e;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void l(long j) {
        this.d.l(j - this.e);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean n(LoadingInfo loadingInfo) {
        LoadingInfo.Builder builder = new LoadingInfo.Builder();
        long j = loadingInfo.f3011a;
        builder.b = loadingInfo.b;
        builder.c = loadingInfo.c;
        builder.f3012a = j - this.e;
        return this.d.n(new LoadingInfo(builder));
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long o() {
        long jO = this.d.o();
        if (jO == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jO + this.e;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long p(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i >= sampleStreamArr.length) {
                break;
            }
            TimeOffsetSampleStream timeOffsetSampleStream = (TimeOffsetSampleStream) sampleStreamArr[i];
            if (timeOffsetSampleStream != null) {
                sampleStream = timeOffsetSampleStream.d;
            }
            sampleStreamArr2[i] = sampleStream;
            i++;
        }
        MediaPeriod mediaPeriod = this.d;
        long j2 = this.e;
        long jP = mediaPeriod.p(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < sampleStreamArr.length; i2++) {
            SampleStream sampleStream2 = sampleStreamArr2[i2];
            if (sampleStream2 == null) {
                sampleStreamArr[i2] = null;
            } else {
                SampleStream sampleStream3 = sampleStreamArr[i2];
                if (sampleStream3 == null || ((TimeOffsetSampleStream) sampleStream3).d != sampleStream2) {
                    sampleStreamArr[i2] = new TimeOffsetSampleStream(sampleStream2, j2);
                }
            }
        }
        return jP + j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void r() {
        this.d.r();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void s(MediaPeriod.Callback callback, long j) {
        this.f = callback;
        this.d.s(this, j - this.e);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void u(long j, boolean z) {
        this.d.u(j - this.e, z);
    }
}
