package androidx.media3.exoplayer.source;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes2.dex */
final class MergingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public final MediaPeriod[] d;
    public final boolean[] e;
    public final IdentityHashMap f;
    public final CompositeSequenceableLoaderFactory g;
    public final ArrayList h = new ArrayList();
    public final HashMap i = new HashMap();
    public MediaPeriod.Callback j;
    public TrackGroupArray k;
    public MediaPeriod[] l;
    public SequenceableLoader m;

    public static final class ForwardingTrackSelection implements ExoTrackSelection {

        /* renamed from: a, reason: collision with root package name */
        public final ExoTrackSelection f3133a;
        public final TrackGroup b;

        public ForwardingTrackSelection(ExoTrackSelection exoTrackSelection, TrackGroup trackGroup) {
            this.f3133a = exoTrackSelection;
            this.b = trackGroup;
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final int b(int i) {
            return this.f3133a.b(i);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void c() {
            this.f3133a.c();
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final int d(int i) {
            return this.f3133a.d(i);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void disable() {
            this.f3133a.disable();
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final TrackGroup e() {
            return this.b;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void enable() {
            this.f3133a.enable();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForwardingTrackSelection)) {
                return false;
            }
            ForwardingTrackSelection forwardingTrackSelection = (ForwardingTrackSelection) obj;
            return this.f3133a.equals(forwardingTrackSelection.f3133a) && this.b.equals(forwardingTrackSelection.b);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final int f() {
            return this.f3133a.f();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final Format g() {
            return this.b.d[this.f3133a.f()];
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void h() {
            this.f3133a.h();
        }

        public final int hashCode() {
            return this.f3133a.hashCode() + ((this.b.hashCode() + 527) * 31);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final Format i(int i) {
            return this.b.d[this.f3133a.b(i)];
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void j(float f) {
            this.f3133a.j(f);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void k(boolean z) {
            this.f3133a.k(z);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final int length() {
            return this.f3133a.length();
        }
    }

    public MergingMediaPeriod(DefaultCompositeSequenceableLoaderFactory defaultCompositeSequenceableLoaderFactory, long[] jArr, MediaPeriod... mediaPeriodArr) {
        this.g = defaultCompositeSequenceableLoaderFactory;
        this.d = mediaPeriodArr;
        defaultCompositeSequenceableLoaderFactory.getClass();
        this.m = new CompositeSequenceableLoader(ImmutableList.t(), ImmutableList.t());
        this.f = new IdentityHashMap();
        this.l = new MediaPeriod[0];
        this.e = new boolean[mediaPeriodArr.length];
        for (int i = 0; i < mediaPeriodArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.e[i] = true;
                this.d[i] = new TimeOffsetMediaPeriod(mediaPeriodArr[i], j);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean b() {
        return this.m.b();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        MediaPeriod[] mediaPeriodArr = this.l;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.d[0]).c(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(long j) {
        long jD = this.l[0].d(j);
        int i = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.l;
            if (i >= mediaPeriodArr.length) {
                return jD;
            }
            if (mediaPeriodArr[i].d(jD) != jD) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long e() {
        long j = -9223372036854775807L;
        for (MediaPeriod mediaPeriod : this.l) {
            long jE = mediaPeriod.e();
            if (jE == -9223372036854775807L) {
                if (j != -9223372036854775807L && mediaPeriod.d(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (MediaPeriod mediaPeriod2 : this.l) {
                    if (mediaPeriod2 == mediaPeriod) {
                        break;
                    }
                    if (mediaPeriod2.d(jE) != jE) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jE;
            } else if (jE != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void f(MediaPeriod mediaPeriod) {
        ArrayList arrayList = this.h;
        arrayList.remove(mediaPeriod);
        if (arrayList.isEmpty()) {
            MediaPeriod[] mediaPeriodArr = this.d;
            int i = 0;
            for (MediaPeriod mediaPeriod2 : mediaPeriodArr) {
                i += mediaPeriod2.i().f3148a;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i];
            int i2 = 0;
            for (int i3 = 0; i3 < mediaPeriodArr.length; i3++) {
                TrackGroupArray trackGroupArrayI = mediaPeriodArr[i3].i();
                int i4 = trackGroupArrayI.f3148a;
                int i5 = 0;
                while (i5 < i4) {
                    TrackGroup trackGroupA = trackGroupArrayI.a(i5);
                    Format[] formatArr = new Format[trackGroupA.f2879a];
                    for (int i6 = 0; i6 < trackGroupA.f2879a; i6++) {
                        Format format = trackGroupA.d[i6];
                        Format.Builder builderA = format.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = format.f2854a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        builderA.f2855a = sb.toString();
                        formatArr[i6] = new Format(builderA);
                    }
                    TrackGroup trackGroup = new TrackGroup(i3 + ":" + trackGroupA.b, formatArr);
                    this.i.put(trackGroup, trackGroupA);
                    trackGroupArr[i2] = trackGroup;
                    i5++;
                    i2++;
                }
            }
            this.k = new TrackGroupArray(trackGroupArr);
            MediaPeriod.Callback callback = this.j;
            callback.getClass();
            callback.f(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public final void g(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.j;
        callback.getClass();
        callback.g(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray i() {
        TrackGroupArray trackGroupArray = this.k;
        trackGroupArray.getClass();
        return trackGroupArray;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long k() {
        return this.m.k();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void l(long j) {
        this.m.l(j);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean n(LoadingInfo loadingInfo) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return this.m.n(loadingInfo);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((MediaPeriod) arrayList.get(i)).n(loadingInfo);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long o() {
        return this.m.o();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long p(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        int[] iArr3 = new int[exoTrackSelectionArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = exoTrackSelectionArr.length;
            identityHashMap = this.f;
            if (i2 >= length) {
                break;
            }
            SampleStream sampleStream = sampleStreamArr[i2];
            Integer num = sampleStream == null ? null : (Integer) identityHashMap.get(sampleStream);
            iArr2[i2] = num == null ? -1 : num.intValue();
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
            if (exoTrackSelection != null) {
                String str = exoTrackSelection.e().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length2];
        SampleStream[] sampleStreamArr3 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        MediaPeriod[] mediaPeriodArr = this.d;
        ArrayList arrayList = new ArrayList(mediaPeriodArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < mediaPeriodArr.length) {
            int i4 = i;
            while (i4 < exoTrackSelectionArr.length) {
                sampleStreamArr3[i4] = iArr2[i4] == i3 ? sampleStreamArr[i4] : null;
                if (iArr3[i4] == i3) {
                    ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr[i4];
                    exoTrackSelection2.getClass();
                    iArr = iArr2;
                    TrackGroup trackGroup = (TrackGroup) this.i.get(exoTrackSelection2.e());
                    trackGroup.getClass();
                    exoTrackSelectionArr2[i4] = new ForwardingTrackSelection(exoTrackSelection2, trackGroup);
                } else {
                    iArr = iArr2;
                    exoTrackSelectionArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            MediaPeriod[] mediaPeriodArr2 = mediaPeriodArr;
            int i5 = i3;
            long jP = mediaPeriodArr2[i3].p(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jP;
            } else if (jP != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < exoTrackSelectionArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    SampleStream sampleStream2 = sampleStreamArr3[i6];
                    sampleStream2.getClass();
                    sampleStreamArr2[i6] = sampleStreamArr3[i6];
                    identityHashMap.put(sampleStream2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    Assertions.f(sampleStreamArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(mediaPeriodArr2[i5]);
            }
            i3 = i5 + 1;
            mediaPeriodArr = mediaPeriodArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(sampleStreamArr2, i7, sampleStreamArr, i7, length2);
        this.l = (MediaPeriod[]) arrayList.toArray(new MediaPeriod[i7]);
        this.m = this.g.a(arrayList, Lists.d(arrayList, new l(2)));
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void r() {
        for (MediaPeriod mediaPeriod : this.d) {
            mediaPeriod.r();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void s(MediaPeriod.Callback callback, long j) {
        this.j = callback;
        ArrayList arrayList = this.h;
        MediaPeriod[] mediaPeriodArr = this.d;
        Collections.addAll(arrayList, mediaPeriodArr);
        for (MediaPeriod mediaPeriod : mediaPeriodArr) {
            mediaPeriod.s(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void u(long j, boolean z) {
        for (MediaPeriod mediaPeriod : this.l) {
            mediaPeriod.u(j, z);
        }
    }
}
