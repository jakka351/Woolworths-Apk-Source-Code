package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.ClippingMediaPeriod;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;

/* loaded from: classes2.dex */
final class MediaPeriodHolder {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3013a;
    public final Object b;
    public final SampleStream[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public MediaPeriodInfo g;
    public boolean h;
    public final boolean[] i;
    public final RendererCapabilities[] j;
    public final TrackSelector k;
    public final MediaSourceList l;
    public MediaPeriodHolder m;
    public TrackGroupArray n;
    public TrackSelectorResult o;
    public long p;

    public interface Factory {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.source.ClippingMediaPeriod] */
    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, long j, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult) {
        this.j = rendererCapabilitiesArr;
        this.p = j;
        this.k = trackSelector;
        this.l = mediaSourceList;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f3014a;
        this.b = mediaPeriodId.f3130a;
        this.g = mediaPeriodInfo;
        this.n = TrackGroupArray.d;
        this.o = trackSelectorResult;
        this.c = new SampleStream[rendererCapabilitiesArr.length];
        this.i = new boolean[rendererCapabilitiesArr.length];
        long j2 = mediaPeriodInfo.b;
        long j3 = mediaPeriodInfo.d;
        boolean z = mediaPeriodInfo.f;
        mediaSourceList.getClass();
        Object obj = mediaPeriodId.f3130a;
        int i = AbstractConcatenatedTimeline.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        MediaSource.MediaPeriodId mediaPeriodIdA = mediaPeriodId.a(pair.second);
        MediaSourceList.MediaSourceHolder mediaSourceHolder = (MediaSourceList.MediaSourceHolder) mediaSourceList.d.get(obj2);
        mediaSourceHolder.getClass();
        mediaSourceList.g.add(mediaSourceHolder);
        MediaSourceList.MediaSourceAndListener mediaSourceAndListener = (MediaSourceList.MediaSourceAndListener) mediaSourceList.f.get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.f3017a.K(mediaSourceAndListener.b);
        }
        mediaSourceHolder.c.add(mediaPeriodIdA);
        MaskingMediaPeriod maskingMediaPeriodE = mediaSourceHolder.f3018a.E(mediaPeriodIdA, allocator, j2);
        mediaSourceList.c.put(maskingMediaPeriodE, mediaSourceHolder);
        mediaSourceList.c();
        this.f3013a = j3 != -9223372036854775807L ? new ClippingMediaPeriod(maskingMediaPeriodE, !z, 0L, j3) : maskingMediaPeriodE;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    public final long a(TrackSelectorResult trackSelectorResult, long j, boolean z, boolean[] zArr) {
        RendererCapabilities[] rendererCapabilitiesArr;
        SampleStream[] sampleStreamArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= trackSelectorResult.f3170a) {
                break;
            }
            if (z || !trackSelectorResult.a(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            rendererCapabilitiesArr = this.j;
            int length = rendererCapabilitiesArr.length;
            sampleStreamArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (rendererCapabilitiesArr[i2].e() == -2) {
                sampleStreamArr[i2] = null;
            }
            i2++;
        }
        b();
        this.o = trackSelectorResult;
        c();
        long jP = this.f3013a.p(trackSelectorResult.c, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < rendererCapabilitiesArr.length; i3++) {
            if (rendererCapabilitiesArr[i3].e() == -2 && this.o.b(i3)) {
                sampleStreamArr[i3] = new EmptySampleStream();
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < sampleStreamArr.length; i4++) {
            if (sampleStreamArr[i4] != null) {
                Assertions.f(trackSelectorResult.b(i4));
                if (rendererCapabilitiesArr[i4].e() != -2) {
                    this.f = true;
                }
            } else {
                Assertions.f(trackSelectorResult.c[i4] == null);
            }
        }
        return jP;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.o;
            if (i >= trackSelectorResult.f3170a) {
                return;
            }
            boolean zB = trackSelectorResult.b(i);
            ExoTrackSelection exoTrackSelection = this.o.c[i];
            if (zB && exoTrackSelection != null) {
                exoTrackSelection.disable();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.o;
            if (i >= trackSelectorResult.f3170a) {
                return;
            }
            boolean zB = trackSelectorResult.b(i);
            ExoTrackSelection exoTrackSelection = this.o.c[i];
            if (zB && exoTrackSelection != null) {
                exoTrackSelection.enable();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long jK = this.f ? this.f3013a.k() : Long.MIN_VALUE;
        return jK == Long.MIN_VALUE ? this.g.e : jK;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    public final void f(float f, Timeline timeline, boolean z) {
        this.e = true;
        this.n = this.f3013a.i();
        TrackSelectorResult trackSelectorResultJ = j(f, timeline, z);
        MediaPeriodInfo mediaPeriodInfo = this.g;
        long jMax = mediaPeriodInfo.b;
        long j = mediaPeriodInfo.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(trackSelectorResultJ, jMax, false, new boolean[this.j.length]);
        long j2 = this.p;
        MediaPeriodInfo mediaPeriodInfo2 = this.g;
        this.p = (mediaPeriodInfo2.b - jA) + j2;
        this.g = mediaPeriodInfo2.b(jA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    public final boolean g() {
        if (this.e) {
            return !this.f || this.f3013a.k() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    public final void i() {
        b();
        ?? r0 = this.f3013a;
        try {
            boolean z = r0 instanceof ClippingMediaPeriod;
            MediaSourceList mediaSourceList = this.l;
            if (z) {
                mediaSourceList.f(((ClippingMediaPeriod) r0).d);
            } else {
                mediaSourceList.f(r0);
            }
        } catch (RuntimeException e) {
            Log.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final TrackSelectorResult j(float f, Timeline timeline, boolean z) {
        ExoTrackSelection[] exoTrackSelectionArr;
        TrackGroupArray trackGroupArray = this.n;
        MediaSource.MediaPeriodId mediaPeriodId = this.g.f3014a;
        TrackSelector trackSelector = this.k;
        RendererCapabilities[] rendererCapabilitiesArr = this.j;
        TrackSelectorResult trackSelectorResultF = trackSelector.f(rendererCapabilitiesArr, trackGroupArray, mediaPeriodId, timeline);
        int i = 0;
        while (true) {
            int i2 = trackSelectorResultF.f3170a;
            exoTrackSelectionArr = trackSelectorResultF.c;
            if (i >= i2) {
                break;
            }
            if (trackSelectorResultF.b(i)) {
                if (exoTrackSelectionArr[i] == null && rendererCapabilitiesArr[i].e() != -2) {
                    z = false;
                }
                Assertions.f(z);
            } else {
                Assertions.f(exoTrackSelectionArr[i] == null);
            }
            i++;
        }
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                exoTrackSelection.j(f);
                exoTrackSelection.k(z);
            }
        }
        return trackSelectorResultF;
    }

    public final void k() {
        Object obj = this.f3013a;
        if (obj instanceof ClippingMediaPeriod) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) obj;
            clippingMediaPeriod.h = 0L;
            clippingMediaPeriod.i = j;
        }
    }
}
