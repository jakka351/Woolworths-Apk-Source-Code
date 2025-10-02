package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001\u0088\u0001\u0004\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/collection/ScopeMap;", "", "Key", "Scope", "map", "Landroidx/collection/MutableScatterMap;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScopeMap<Key, Scope> {
    public static final void a(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        int i = mutableScatterMap.i(obj);
        boolean z = i < 0;
        Object obj3 = z ? null : mutableScatterMap.c[i];
        if (obj3 != null) {
            if (obj3 instanceof MutableScatterSet) {
                ((MutableScatterSet) obj3).e(obj2);
            } else if (obj3 != obj2) {
                MutableScatterSet mutableScatterSet = new MutableScatterSet();
                mutableScatterSet.e(obj3);
                mutableScatterSet.e(obj2);
                obj2 = mutableScatterSet;
            }
            obj2 = obj3;
        }
        if (!z) {
            mutableScatterMap.c[i] = obj2;
            return;
        }
        int i2 = ~i;
        mutableScatterMap.b[i2] = obj;
        mutableScatterMap.c[i2] = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.HashMap b(androidx.collection.MutableScatterMap r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Object[] r1 = r15.b
            java.lang.Object[] r2 = r15.c
            long[] r15 = r15.f698a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L69
            r4 = 0
            r5 = r4
        L12:
            r6 = r15[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L64
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2c:
            if (r10 >= r8) goto L62
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r11 = r2[r11]
            java.lang.String r13 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap"
            kotlin.jvm.internal.Intrinsics.f(r12, r13)
            boolean r13 = r11 instanceof androidx.collection.MutableScatterSet
            if (r13 == 0) goto L4e
            androidx.collection.MutableScatterSet r11 = (androidx.collection.MutableScatterSet) r11
            java.util.Set r11 = r11.a()
            goto L5b
        L4e:
            java.lang.String r13 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"
            kotlin.jvm.internal.Intrinsics.f(r11, r13)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.util.LinkedHashSet r11 = kotlin.collections.SetsKt.f(r11)
        L5b:
            r0.put(r12, r11)
        L5e:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2c
        L62:
            if (r8 != r9) goto L69
        L64:
            if (r5 == r3) goto L69
            int r5 = r5 + 1
            goto L12
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.b(androidx.collection.MutableScatterMap):java.util.HashMap");
    }

    public static MutableScatterMap c() {
        long[] jArr = ScatterMapKt.f699a;
        return new MutableScatterMap();
    }

    public static final boolean d(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        Object objE = mutableScatterMap.e(obj);
        if (objE == null) {
            return false;
        }
        if (!(objE instanceof MutableScatterSet)) {
            if (!objE.equals(obj2)) {
                return false;
            }
            mutableScatterMap.k(obj);
            return true;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) objE;
        boolean zN = mutableScatterSet.n(obj2);
        if (zN && mutableScatterSet.c()) {
            mutableScatterMap.k(obj);
        }
        return zN;
    }

    public static final void e(MutableScatterMap mutableScatterMap, Object obj) {
        boolean zC;
        long[] jArr = mutableScatterMap.f698a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = mutableScatterMap.b[i4];
                        Object obj3 = mutableScatterMap.c[i4];
                        if (obj3 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
                            mutableScatterSet.n(obj);
                            zC = mutableScatterSet.c();
                        } else {
                            zC = obj3 == obj;
                        }
                        if (zC) {
                            mutableScatterMap.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ScopeMap) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ScopeMap(map=null)";
    }
}
