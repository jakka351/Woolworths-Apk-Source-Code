package androidx.media3.exoplayer.source;

import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.ImmutableList;

@UnstableApi
/* loaded from: classes2.dex */
public class FilteringMediaSource extends WrappingMediaSource {

    public static final class FilteringMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
        public final MediaPeriod d;
        public MediaPeriod.Callback e;
        public TrackGroupArray f;

        public FilteringMediaPeriod(MediaPeriod mediaPeriod) {
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

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public final void f(MediaPeriod mediaPeriod) {
            TrackGroupArray trackGroupArrayI = mediaPeriod.i();
            ImmutableList.Builder builderM = ImmutableList.m();
            if (trackGroupArrayI.f3148a > 0) {
                int i = trackGroupArrayI.a(0).c;
                throw null;
            }
            this.f = new TrackGroupArray((TrackGroup[]) builderM.j().toArray(new TrackGroup[0]));
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
            TrackGroupArray trackGroupArray = this.f;
            trackGroupArray.getClass();
            return trackGroupArray;
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
            return this.d.p(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void r() {
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

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return new FilteringMediaPeriod(this.n.E(mediaPeriodId, allocator, j));
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        super.t(((FilteringMediaPeriod) mediaPeriod).d);
    }
}
