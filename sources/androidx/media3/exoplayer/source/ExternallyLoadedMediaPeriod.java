package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.common.util.concurrent.FutureCallback;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class ExternallyLoadedMediaPeriod implements MediaPeriod {
    public final TrackGroupArray d;
    public final byte[] e;
    public final AtomicBoolean f;
    public final AtomicReference g;

    /* renamed from: androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod$1, reason: invalid class name */
    class AnonymousClass1 implements FutureCallback<Object> {
        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onFailure(Throwable th) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    public final class SampleStreamImpl implements SampleStream {
        public int d = 0;

        public SampleStreamImpl() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int h(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            ExternallyLoadedMediaPeriod externallyLoadedMediaPeriod = ExternallyLoadedMediaPeriod.this;
            byte[] bArr = externallyLoadedMediaPeriod.e;
            int i2 = this.d;
            if (i2 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                formatHolder.b = externallyLoadedMediaPeriod.d.a(0).d[0];
                this.d = 1;
                return -5;
            }
            if (!externallyLoadedMediaPeriod.f.get()) {
                return -3;
            }
            int length = bArr.length;
            decoderInputBuffer.e(1);
            decoderInputBuffer.i = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.n(length);
                decoderInputBuffer.g.put(bArr, 0, length);
            }
            if ((i & 1) == 0) {
                this.d = 2;
            }
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            return ExternallyLoadedMediaPeriod.this.f.get();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void j() throws IOException {
            Throwable th = (Throwable) ExternallyLoadedMediaPeriod.this.g.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int q(long j) {
            return 0;
        }
    }

    public ExternallyLoadedMediaPeriod(Uri uri, String str) {
        Format.Builder builder = new Format.Builder();
        builder.m = MimeTypes.m(str);
        this.d = new TrackGroupArray(new TrackGroup("", new Format(builder)));
        this.e = uri.toString().getBytes(StandardCharsets.UTF_8);
        this.f = new AtomicBoolean();
        this.g = new AtomicReference();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean b() {
        return !this.f.get();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(long j) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long e() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray i() {
        return this.d;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long k() {
        return this.f.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void l(long j) {
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean n(LoadingInfo loadingInfo) {
        return !this.f.get();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long o() {
        return this.f.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long p(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            if (sampleStreamArr[i] != null && (exoTrackSelectionArr[i] == null || !zArr[i])) {
                sampleStreamArr[i] = null;
            }
            if (sampleStreamArr[i] == null && exoTrackSelectionArr[i] != null) {
                sampleStreamArr[i] = new SampleStreamImpl();
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void r() {
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void s(MediaPeriod.Callback callback, long j) {
        callback.f(this);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void u(long j, boolean z) {
    }
}
