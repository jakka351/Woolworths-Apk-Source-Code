package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectListKt;
import androidx.compose.runtime.MovableContent;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001\u0088\u0001\u0004\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/collection/MultiValueMap;", "", "K", "V", "map", "Landroidx/collection/MutableScatterMap;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MultiValueMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableScatterMap f1678a;

    public /* synthetic */ MultiValueMap(MutableScatterMap mutableScatterMap) {
        this.f1678a = mutableScatterMap;
    }

    public static final void a(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        int i = mutableScatterMap.i(obj);
        boolean z = i < 0;
        Object obj3 = z ? null : mutableScatterMap.c[i];
        if (obj3 != null) {
            if (obj3 instanceof MutableObjectList) {
                MutableObjectList mutableObjectList = (MutableObjectList) obj3;
                mutableObjectList.g(obj2);
                obj2 = mutableObjectList;
            } else {
                Object[] objArr = ObjectListKt.f695a;
                MutableObjectList mutableObjectList2 = new MutableObjectList(2);
                mutableObjectList2.g(obj3);
                mutableObjectList2.g(obj2);
                obj2 = mutableObjectList2;
            }
        }
        if (!z) {
            mutableScatterMap.c[i] = obj2;
            return;
        }
        int i2 = ~i;
        mutableScatterMap.b[i2] = obj;
        mutableScatterMap.c[i2] = obj2;
    }

    public static final Object b(MutableScatterMap mutableScatterMap, MovableContent movableContent) {
        Object objE = mutableScatterMap.e(movableContent);
        if (objE == null) {
            return null;
        }
        if (!(objE instanceof MutableObjectList)) {
            mutableScatterMap.k(movableContent);
            return objE;
        }
        MutableObjectList mutableObjectList = (MutableObjectList) objE;
        Object objA = ExtensionsKt.a(mutableObjectList);
        Intrinsics.f(objA, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (mutableObjectList.d()) {
            mutableScatterMap.k(movableContent);
        }
        if (mutableObjectList.b == 1) {
            mutableScatterMap.m(movableContent, mutableObjectList.a());
        }
        return objA;
    }

    public static final void c(MutableScatterMap mutableScatterMap, MovableContent movableContent, Function1 function1) {
        Object objE = mutableScatterMap.e(movableContent);
        if (objE != null) {
            if (!(objE instanceof MutableObjectList)) {
                if (((Boolean) function1.invoke(objE)).booleanValue()) {
                    mutableScatterMap.k(movableContent);
                    return;
                }
                return;
            }
            MutableObjectList mutableObjectList = (MutableObjectList) objE;
            int i = mutableObjectList.b;
            Object[] objArr = mutableObjectList.f694a;
            int i2 = 0;
            IntRange intRangeO = RangesKt.o(0, i);
            int i3 = intRangeO.d;
            int i4 = intRangeO.e;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) function1.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            ArraysKt.B(objArr, i - i2, i, null);
            mutableObjectList.b -= i2;
            if (mutableObjectList.d()) {
                mutableScatterMap.k(movableContent);
            }
            if (mutableObjectList.b == 0) {
                mutableScatterMap.m(movableContent, mutableObjectList.a());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.collection.MutableObjectList d(androidx.collection.MutableScatterMap r15) {
        /*
            boolean r0 = r15.f()
            if (r0 == 0) goto Le
            androidx.collection.MutableObjectList r15 = androidx.collection.ObjectListKt.b
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            kotlin.jvm.internal.Intrinsics.f(r15, r0)
            return r15
        Le:
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            r0.<init>()
            java.lang.Object[] r1 = r15.c
            long[] r15 = r15.f698a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L88
            r3 = 0
            r4 = r3
        L1e:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L83
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L38:
            if (r9 >= r7) goto L81
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L7d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof androidx.collection.MutableObjectList
            if (r11 == 0) goto L75
            androidx.collection.MutableObjectList r10 = (androidx.collection.MutableObjectList) r10
            boolean r11 = r10.d()
            if (r11 == 0) goto L55
            goto L7d
        L55:
            int r11 = r0.b
            int r12 = r10.b
            int r11 = r11 + r12
            java.lang.Object[] r12 = r0.f694a
            int r13 = r12.length
            if (r13 >= r11) goto L62
            r0.n(r11, r12)
        L62:
            java.lang.Object[] r11 = r0.f694a
            java.lang.Object[] r12 = r10.f694a
            int r13 = r0.b
            int r14 = r10.b
            kotlin.collections.ArraysKt.t(r12, r13, r11, r3, r14)
            int r11 = r0.b
            int r10 = r10.b
            int r11 = r11 + r10
            r0.b = r11
            goto L7d
        L75:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            kotlin.jvm.internal.Intrinsics.f(r10, r11)
            r0.g(r10)
        L7d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L38
        L81:
            if (r7 != r8) goto L88
        L83:
            if (r4 == r2) goto L88
            int r4 = r4 + 1
            goto L1e
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.MultiValueMap.d(androidx.collection.MutableScatterMap):androidx.collection.MutableObjectList");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MultiValueMap) {
            return Intrinsics.c(this.f1678a, ((MultiValueMap) obj).f1678a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1678a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f1678a + ')';
    }
}
