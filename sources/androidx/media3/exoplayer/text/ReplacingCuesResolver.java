package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class ReplacingCuesResolver implements CuesResolver {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3160a = new ArrayList();

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final ImmutableList a(long j) {
        int iF = f(j);
        if (iF == 0) {
            return ImmutableList.t();
        }
        CuesWithTiming cuesWithTiming = (CuesWithTiming) this.f3160a.get(iF - 1);
        long j2 = cuesWithTiming.d;
        return (j2 == -9223372036854775807L || j < j2) ? cuesWithTiming.f3353a : ImmutableList.t();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final long b(long j) {
        ArrayList arrayList = this.f3160a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((CuesWithTiming) arrayList.get(0)).b) {
            return ((CuesWithTiming) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            CuesWithTiming cuesWithTiming = (CuesWithTiming) arrayList.get(i);
            long j2 = cuesWithTiming.b;
            long j3 = cuesWithTiming.b;
            if (j < j2) {
                long j4 = ((CuesWithTiming) arrayList.get(i - 1)).d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((CuesWithTiming) Iterables.c(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final void c(long j) {
        int iF = f(j);
        if (iF == 0) {
            return;
        }
        ArrayList arrayList = this.f3160a;
        long j2 = ((CuesWithTiming) arrayList.get(iF - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iF--;
        }
        arrayList.subList(0, iF).clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final void clear() {
        this.f3160a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(androidx.media3.extractor.text.CuesWithTiming r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            androidx.media3.common.util.Assertions.b(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f3160a
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            androidx.media3.extractor.text.CuesWithTiming r7 = (androidx.media3.extractor.text.CuesWithTiming) r7
            long r7 = r7.b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            androidx.media3.extractor.text.CuesWithTiming r7 = (androidx.media3.extractor.text.CuesWithTiming) r7
            long r7 = r7.b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.ReplacingCuesResolver.d(androidx.media3.extractor.text.CuesWithTiming, long):boolean");
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final long e(long j) {
        ArrayList arrayList = this.f3160a;
        if (arrayList.isEmpty() || j < ((CuesWithTiming) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((CuesWithTiming) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) arrayList.get(i - 1);
                long j3 = cuesWithTiming.d;
                return (j3 == -9223372036854775807L || j3 > j) ? cuesWithTiming.b : j3;
            }
        }
        CuesWithTiming cuesWithTiming2 = (CuesWithTiming) Iterables.c(arrayList);
        long j4 = cuesWithTiming2.d;
        return (j4 == -9223372036854775807L || j < j4) ? cuesWithTiming2.b : j4;
    }

    public final int f(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3160a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((CuesWithTiming) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }
}
