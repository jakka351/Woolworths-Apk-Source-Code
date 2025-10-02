package androidx.paging;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SeparatorsKt {
    public static final void a(List list, Object obj, TransformablePage transformablePage, TransformablePage transformablePage2, int i, int i2) {
        Intrinsics.h(list, "<this>");
        int[] iArrF0 = transformablePage != null ? transformablePage.f3590a : null;
        int[] iArr = transformablePage2 != null ? transformablePage2.f3590a : null;
        if (iArrF0 != null && iArr != null) {
            int[] iArrA0 = ArraysKt.a0(iArrF0, iArr);
            LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(iArrA0.length));
            for (int i3 : iArrA0) {
                linkedHashSet.add(Integer.valueOf(i3));
            }
            iArrF0 = CollectionsKt.F0(CollectionsKt.t0(CollectionsKt.G0(linkedHashSet)));
        } else if (iArrF0 == null && iArr != null) {
            iArrF0 = iArr;
        } else if (iArrF0 == null || iArr != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        if (obj == null) {
            return;
        }
        list.add(new TransformablePage(iArrF0, CollectionsKt.Q(obj), i, CollectionsKt.Q(Integer.valueOf(i2))));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ab -> B:27:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.paging.TransformablePage r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt.b(androidx.paging.TransformablePage, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
