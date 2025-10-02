package androidx.media3.exoplayer.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class MergingCuesResolver implements CuesResolver {
    public static final Ordering b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3159a = new ArrayList();

    static {
        final int i = 0;
        final int i2 = 1;
        b = Ordering.c().f(new Function() { // from class: androidx.media3.exoplayer.text.a
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                switch (i) {
                    case 0:
                        Ordering ordering = MergingCuesResolver.b;
                        return Long.valueOf(cuesWithTiming.b);
                    default:
                        Ordering ordering2 = MergingCuesResolver.b;
                        return Long.valueOf(cuesWithTiming.c);
                }
            }
        }).a(Ordering.c().g().f(new Function() { // from class: androidx.media3.exoplayer.text.a
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                switch (i2) {
                    case 0:
                        Ordering ordering = MergingCuesResolver.b;
                        return Long.valueOf(cuesWithTiming.b);
                    default:
                        Ordering ordering2 = MergingCuesResolver.b;
                        return Long.valueOf(cuesWithTiming.c);
                }
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final ImmutableList a(long j) {
        ArrayList arrayList = this.f3159a;
        if (!arrayList.isEmpty()) {
            if (j >= ((CuesWithTiming) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    CuesWithTiming cuesWithTiming = (CuesWithTiming) arrayList.get(i);
                    if (j >= cuesWithTiming.b && j < cuesWithTiming.d) {
                        arrayList2.add(cuesWithTiming);
                    }
                    if (j < cuesWithTiming.b) {
                        break;
                    }
                }
                ImmutableList immutableListB = ImmutableList.B(b, arrayList2);
                ImmutableList.Builder builderM = ImmutableList.m();
                for (int i2 = 0; i2 < immutableListB.size(); i2++) {
                    builderM.f(((CuesWithTiming) immutableListB.get(i2)).f3353a);
                }
                return builderM.j();
            }
        }
        return ImmutableList.t();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final long b(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f3159a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((CuesWithTiming) arrayList.get(i)).b;
            long j3 = ((CuesWithTiming) arrayList.get(i)).d;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final void c(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3159a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((CuesWithTiming) arrayList.get(i)).b;
            if (j > j2 && j > ((CuesWithTiming) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final void clear() {
        this.f3159a.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final boolean d(CuesWithTiming cuesWithTiming, long j) {
        long j2 = cuesWithTiming.b;
        Assertions.b(j2 != -9223372036854775807L);
        Assertions.b(cuesWithTiming.c != -9223372036854775807L);
        boolean z = j2 <= j && j < cuesWithTiming.d;
        ArrayList arrayList = this.f3159a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((CuesWithTiming) arrayList.get(size)).b) {
                arrayList.add(size + 1, cuesWithTiming);
                return z;
            }
        }
        arrayList.add(0, cuesWithTiming);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final long e(long j) {
        ArrayList arrayList = this.f3159a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((CuesWithTiming) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((CuesWithTiming) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((CuesWithTiming) arrayList.get(i)).b;
            long j3 = ((CuesWithTiming) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }
}
