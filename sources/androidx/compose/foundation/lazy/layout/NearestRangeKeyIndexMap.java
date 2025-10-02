package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {

    /* renamed from: a, reason: collision with root package name */
    public final MutableObjectIntMap f1059a;
    public final Object[] b;
    public final int c;

    public NearestRangeKeyIndexMap(IntRange intRange, LazyLayoutIntervalContent lazyLayoutIntervalContent) {
        MutableIntervalList f1066a = lazyLayoutIntervalContent.getF993a();
        final int i = intRange.d;
        if (i < 0) {
            InlineClassHelperKt.c("negative nearestRange.first");
        }
        final int iMin = Math.min(intRange.e, f1066a.b - 1);
        if (iMin < i) {
            MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.f693a;
            Intrinsics.f(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f1059a = mutableObjectIntMap;
            this.b = new Object[0];
            this.c = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.b = new Object[i2];
        this.c = i;
        final MutableObjectIntMap mutableObjectIntMap2 = new MutableObjectIntMap(i2);
        Function1<IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval>, Unit> function1 = new Function1<IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0041 A[LOOP:0: B:4:0x001d->B:10:0x0041, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[EDGE_INSN: B:13:0x0044->B:11:0x0044 BREAK  A[LOOP:0: B:4:0x001d->B:10:0x0041], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r7) {
                /*
                    r6 = this;
                    androidx.compose.foundation.lazy.layout.IntervalList$Interval r7 = (androidx.compose.foundation.lazy.layout.IntervalList.Interval) r7
                    androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval r0 = r7.c
                    kotlin.jvm.functions.Function1 r0 = r0.getF1010a()
                    int r1 = r7.f1033a
                    int r2 = r1
                    int r2 = java.lang.Math.max(r2, r1)
                    int r7 = r7.b
                    int r7 = r7 + r1
                    int r7 = r7 + (-1)
                    int r3 = r2
                    int r7 = java.lang.Math.min(r3, r7)
                    if (r2 > r7) goto L44
                L1d:
                    if (r0 == 0) goto L2b
                    int r3 = r2 - r1
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    java.lang.Object r3 = r0.invoke(r3)
                    if (r3 != 0) goto L30
                L2b:
                    androidx.compose.foundation.lazy.layout.DefaultLazyKey r3 = new androidx.compose.foundation.lazy.layout.DefaultLazyKey
                    r3.<init>(r2)
                L30:
                    androidx.collection.MutableObjectIntMap r4 = r3
                    r4.h(r2, r3)
                    androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r4 = r4
                    java.lang.Object[] r5 = r4.b
                    int r4 = r4.c
                    int r4 = r2 - r4
                    r5[r4] = r3
                    if (r2 == r7) goto L44
                    int r2 = r2 + 1
                    goto L1d
                L44:
                    kotlin.Unit r7 = kotlin.Unit.f24250a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1.invoke(java.lang.Object):java.lang.Object");
            }
        };
        MutableVector mutableVector = f1066a.f1058a;
        if (i < 0 || i >= f1066a.b) {
            StringBuilder sbR = YU.a.r(i, "Index ", ", size ");
            sbR.append(f1066a.b);
            InlineClassHelperKt.e(sbR.toString());
        }
        if (iMin < 0 || iMin >= f1066a.b) {
            StringBuilder sbR2 = YU.a.r(iMin, "Index ", ", size ");
            sbR2.append(f1066a.b);
            InlineClassHelperKt.e(sbR2.toString());
        }
        if (iMin < i) {
            InlineClassHelperKt.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iA = IntervalListKt.a(i, mutableVector);
        int i3 = ((IntervalList.Interval) mutableVector.d[iA]).f1033a;
        while (i3 <= iMin) {
            IntervalList.Interval interval = (IntervalList.Interval) mutableVector.d[iA];
            function1.invoke(interval);
            i3 += interval.b;
            iA++;
        }
        this.f1059a = mutableObjectIntMap2;
    }

    public final Object a(int i) {
        int i2 = i - this.c;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.b;
        if (i2 <= ArraysKt.K(objArr)) {
            return objArr[i2];
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public final int c(Object obj) {
        MutableObjectIntMap mutableObjectIntMap = this.f1059a;
        int iA = mutableObjectIntMap.a(obj);
        if (iA >= 0) {
            return mutableObjectIntMap.c[iA];
        }
        return -1;
    }
}
