package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;

@UnstableApi
/* loaded from: classes2.dex */
public final class MaskingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public final MediaSource.MediaPeriodId d;
    public final long e;
    public final Allocator f;
    public MediaSource g;
    public MediaPeriod h;
    public MediaPeriod.Callback i;
    public PrepareListener j;
    public boolean k;
    public long l = -9223372036854775807L;

    public interface PrepareListener {
        void a(MediaSource.MediaPeriodId mediaPeriodId);

        void b(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException);
    }

    public MaskingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        this.d = mediaPeriodId;
        this.f = allocator;
        this.e = j;
    }

    public final void a(MediaSource.MediaPeriodId mediaPeriodId) {
        long j = this.l;
        if (j == -9223372036854775807L) {
            j = this.e;
        }
        MediaSource mediaSource = this.g;
        mediaSource.getClass();
        MediaPeriod mediaPeriodE = mediaSource.E(mediaPeriodId, this.f, j);
        this.h = mediaPeriodE;
        if (this.i != null) {
            mediaPeriodE.s(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean b() {
        MediaPeriod mediaPeriod = this.h;
        return mediaPeriod != null && mediaPeriod.b();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        MediaPeriod mediaPeriod = this.h;
        int i = Util.f2928a;
        return mediaPeriod.c(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(long j) {
        MediaPeriod mediaPeriod = this.h;
        int i = Util.f2928a;
        return mediaPeriod.d(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long e() {
        MediaPeriod mediaPeriod = this.h;
        int i = Util.f2928a;
        return mediaPeriod.e();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void f(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.i;
        int i = Util.f2928a;
        callback.f(this);
        PrepareListener prepareListener = this.j;
        if (prepareListener == null) {
            return;
        }
        prepareListener.a(this.d);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public final void g(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.i;
        int i = Util.f2928a;
        callback.g(this);
    }

    public final void h() {
        if (this.h != null) {
            MediaSource mediaSource = this.g;
            mediaSource.getClass();
            mediaSource.t(this.h);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray i() {
        MediaPeriod mediaPeriod = this.h;
        int i = Util.f2928a;
        return mediaPeriod.i();
    }

    public final void j(MediaSource mediaSource) {
        Assertions.f(this.g == null);
        this.g = mediaSource;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long k() {
        MediaPeriod mediaPeriod = this.h;
        int i = Util.f2928a;
        return mediaPeriod.k();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void l(long j) {
        MediaPeriod mediaPeriod = this.h;
        int i = Util.f2928a;
        mediaPeriod.l(j);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean n(LoadingInfo loadingInfo) {
        MediaPeriod mediaPeriod = this.h;
        return mediaPeriod != null && mediaPeriod.n(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long o() {
        MediaPeriod mediaPeriod = this.h;
        int i = Util.f2928a;
        return mediaPeriod.o();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long p(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2 = this.l;
        long j3 = (j2 == -9223372036854775807L || j != this.e) ? j : j2;
        this.l = -9223372036854775807L;
        MediaPeriod mediaPeriod = this.h;
        int i = Util.f2928a;
        return mediaPeriod.p(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j3);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void r() throws IOException {
        try {
            MediaPeriod mediaPeriod = this.h;
            if (mediaPeriod != null) {
                mediaPeriod.r();
                return;
            }
            MediaSource mediaSource = this.g;
            if (mediaSource != null) {
                mediaSource.z();
            }
        } catch (IOException e) {
            PrepareListener prepareListener = this.j;
            if (prepareListener == null) {
                throw e;
            }
            if (this.k) {
                return;
            }
            this.k = true;
            prepareListener.b(this.d, e);
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void s(MediaPeriod.Callback callback, long j) {
        this.i = callback;
        MediaPeriod mediaPeriod = this.h;
        if (mediaPeriod != null) {
            long j2 = this.l;
            if (j2 == -9223372036854775807L) {
                j2 = this.e;
            }
            mediaPeriod.s(this, j2);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void u(long j, boolean z) {
        MediaPeriod mediaPeriod = this.h;
        int i = Util.f2928a;
        mediaPeriod.u(j, z);
    }
}
