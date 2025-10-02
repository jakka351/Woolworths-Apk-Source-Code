package androidx.media3.datasource.cache;

import androidx.camera.core.impl.b;
import androidx.media3.common.util.Assertions;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes2.dex */
final class CachedContent {

    /* renamed from: a, reason: collision with root package name */
    public final int f2978a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public DefaultContentMetadata e;

    public static final class Range {

        /* renamed from: a, reason: collision with root package name */
        public final long f2979a;
        public final long b;

        public Range(long j, long j2) {
            this.f2979a = j;
            this.b = j2;
        }
    }

    public CachedContent(int i, String str, DefaultContentMetadata defaultContentMetadata) {
        this.f2978a = i;
        this.b = str;
        this.e = defaultContentMetadata;
    }

    public final long a(long j, long j2) {
        Assertions.b(j >= 0);
        Assertions.b(j2 >= 0);
        SimpleCacheSpan simpleCacheSpanB = b(j, j2);
        long j3 = simpleCacheSpanB.f;
        if (!simpleCacheSpanB.g) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long jMax = simpleCacheSpanB.e + j3;
        if (jMax < j5) {
            for (SimpleCacheSpan simpleCacheSpan : this.c.tailSet(simpleCacheSpanB, false)) {
                long j6 = simpleCacheSpan.e;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + simpleCacheSpan.f);
                if (jMax >= j5) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final SimpleCacheSpan b(long j, long j2) {
        long jMin = j2;
        SimpleCacheSpan simpleCacheSpan = new SimpleCacheSpan(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        SimpleCacheSpan simpleCacheSpan2 = (SimpleCacheSpan) treeSet.floor(simpleCacheSpan);
        if (simpleCacheSpan2 != null && simpleCacheSpan2.e + simpleCacheSpan2.f > j) {
            return simpleCacheSpan2;
        }
        SimpleCacheSpan simpleCacheSpan3 = (SimpleCacheSpan) treeSet.ceiling(simpleCacheSpan);
        if (simpleCacheSpan3 != null) {
            long j3 = simpleCacheSpan3.e - j;
            jMin = jMin == -1 ? j3 : Math.min(j3, jMin);
        }
        return new SimpleCacheSpan(this.b, j, jMin, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            Range range = (Range) arrayList.get(i);
            long j3 = range.f2979a;
            long j4 = range.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CachedContent.class == obj.getClass()) {
            CachedContent cachedContent = (CachedContent) obj;
            if (this.f2978a == cachedContent.f2978a && this.b.equals(cachedContent.b) && this.c.equals(cachedContent.c) && this.e.equals(cachedContent.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + b.c(this.f2978a * 31, 31, this.b);
    }
}
