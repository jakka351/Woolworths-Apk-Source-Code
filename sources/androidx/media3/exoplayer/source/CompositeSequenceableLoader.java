package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;
import com.google.common.collect.ImmutableList;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class CompositeSequenceableLoader implements SequenceableLoader {
    public final ImmutableList d;
    public long e;

    public static final class SequenceableLoaderWithTrackTypes implements SequenceableLoader {
        public final SequenceableLoader d;
        public final ImmutableList e;

        public SequenceableLoaderWithTrackTypes(SequenceableLoader sequenceableLoader, List list) {
            this.d = sequenceableLoader;
            this.e = ImmutableList.o(list);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean b() {
            return this.d.b();
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
    }

    public CompositeSequenceableLoader(List list, List list2) {
        ImmutableList.Builder builderM = ImmutableList.m();
        Assertions.b(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            builderM.h(new SequenceableLoaderWithTrackTypes((SequenceableLoader) list.get(i), (List) list2.get(i)));
        }
        this.d = builderM.j();
        this.e = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean b() {
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.d;
            if (i >= immutableList.size()) {
                return false;
            }
            if (((SequenceableLoaderWithTrackTypes) immutableList.get(i)).b()) {
                return true;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long k() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.d;
            if (i >= immutableList.size()) {
                break;
            }
            SequenceableLoaderWithTrackTypes sequenceableLoaderWithTrackTypes = (SequenceableLoaderWithTrackTypes) immutableList.get(i);
            long jK = sequenceableLoaderWithTrackTypes.k();
            ImmutableList immutableList2 = sequenceableLoaderWithTrackTypes.e;
            if ((immutableList2.contains(1) || immutableList2.contains(2) || immutableList2.contains(4)) && jK != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jK);
            }
            if (jK != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jK);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.e = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.e;
        return j != -9223372036854775807L ? j : jMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void l(long j) {
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.d;
            if (i >= immutableList.size()) {
                return;
            }
            ((SequenceableLoaderWithTrackTypes) immutableList.get(i)).l(j);
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean n(LoadingInfo loadingInfo) {
        boolean zN;
        boolean z = false;
        do {
            long jO = o();
            if (jO == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zN = false;
            while (true) {
                ImmutableList immutableList = this.d;
                if (i >= immutableList.size()) {
                    break;
                }
                long jO2 = ((SequenceableLoaderWithTrackTypes) immutableList.get(i)).d.o();
                boolean z2 = jO2 != Long.MIN_VALUE && jO2 <= loadingInfo.f3011a;
                if (jO2 == jO || z2) {
                    zN |= ((SequenceableLoaderWithTrackTypes) immutableList.get(i)).d.n(loadingInfo);
                }
                i++;
            }
            z |= zN;
        } while (zN);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long o() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.d;
            if (i >= immutableList.size()) {
                break;
            }
            long jO = ((SequenceableLoaderWithTrackTypes) immutableList.get(i)).o();
            if (jO != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jO);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
