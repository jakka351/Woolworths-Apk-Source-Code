package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public final class SilenceMediaSource extends BaseMediaSource {
    public static final Format l;
    public static final byte[] m;
    public MediaItem k;

    public static final class Factory {
    }

    public static final class SilenceMediaPeriod implements MediaPeriod {
        public static final TrackGroupArray e = new TrackGroupArray(new TrackGroup("", SilenceMediaSource.l));
        public final ArrayList d = new ArrayList();

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean b() {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long c(long j, SeekParameters seekParameters) {
            return Util.j(j, 0L, 0L);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long d(long j) {
            long j2 = Util.j(j, 0L, 0L);
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i >= arrayList.size()) {
                    return j2;
                }
                ((SilenceSampleStream) arrayList.get(i)).a(j2);
                i++;
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long e() {
            return -9223372036854775807L;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final TrackGroupArray i() {
            return e;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final long k() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final void l(long j) {
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean n(LoadingInfo loadingInfo) {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final long o() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long p(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            long j2 = Util.j(j, 0L, 0L);
            for (int i = 0; i < exoTrackSelectionArr.length; i++) {
                SampleStream sampleStream = sampleStreamArr[i];
                ArrayList arrayList = this.d;
                if (sampleStream != null && (exoTrackSelectionArr[i] == null || !zArr[i])) {
                    arrayList.remove(sampleStream);
                    sampleStreamArr[i] = null;
                }
                if (sampleStreamArr[i] == null && exoTrackSelectionArr[i] != null) {
                    SilenceSampleStream silenceSampleStream = new SilenceSampleStream();
                    silenceSampleStream.a(j2);
                    arrayList.add(silenceSampleStream);
                    sampleStreamArr[i] = silenceSampleStream;
                    zArr2[i] = true;
                }
            }
            return j2;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void r() {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void s(MediaPeriod.Callback callback, long j) {
            callback.f(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void u(long j, boolean z) {
        }
    }

    public static final class SilenceSampleStream implements SampleStream {
        public final long d;
        public boolean e;
        public long f;

        public SilenceSampleStream() {
            Format format = SilenceMediaSource.l;
            Util.r(2);
            this.d = 0L;
            a(0L);
        }

        public final void a(long j) {
            Format format = SilenceMediaSource.l;
            this.f = Util.j(Util.r(2) * 2 * ((j * 44100) / 1000000), 0L, this.d);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int h(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            if (!this.e || (i & 2) != 0) {
                formatHolder.b = SilenceMediaSource.l;
                this.e = true;
                return -5;
            }
            long j = this.f;
            long j2 = this.d - j;
            if (j2 == 0) {
                decoderInputBuffer.e(4);
                return -4;
            }
            Format format = SilenceMediaSource.l;
            decoderInputBuffer.i = ((j / 4) * 1000000) / 44100;
            decoderInputBuffer.e(1);
            byte[] bArr = SilenceMediaSource.m;
            int iMin = (int) Math.min(bArr.length, j2);
            if ((i & 4) == 0) {
                decoderInputBuffer.n(iMin);
                decoderInputBuffer.g.put(bArr, 0, iMin);
            }
            if ((i & 1) == 0) {
                this.f += iMin;
            }
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            return true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void j() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int q(long j) {
            long j2 = this.f;
            a(j);
            return (int) ((this.f - j2) / SilenceMediaSource.m.length);
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.m = MimeTypes.m("audio/raw");
        builder.C = 2;
        builder.D = 44100;
        builder.E = 2;
        Format format = new Format(builder);
        l = format;
        MediaItem.Builder builder2 = new MediaItem.Builder();
        builder2.f2858a = "SilenceMediaSource";
        builder2.b = Uri.EMPTY;
        builder2.c = format.n;
        builder2.a();
        m = new byte[4096];
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return new SilenceMediaPeriod();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized void L(MediaItem mediaItem) {
        this.k = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void U(TransferListener transferListener) {
        W(new SinglePeriodTimeline(0L, true, false, o()));
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void X() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized MediaItem o() {
        return this.k;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void z() {
    }
}
