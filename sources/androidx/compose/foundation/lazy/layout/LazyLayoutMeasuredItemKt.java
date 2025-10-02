package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyLayoutMeasuredItemKt {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1047a = new a(0);

    public static final List a(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return EmptyList.d;
        }
        ArrayList arrayListJ0 = CollectionsKt.J0(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) arrayList.get(i3);
            int f1015a = lazyLayoutMeasuredItem.getF1015a();
            if (i <= f1015a && f1015a <= i2) {
                arrayListJ0.add(lazyLayoutMeasuredItem);
            }
        }
        CollectionsKt.s0(arrayListJ0, f1047a);
        return arrayListJ0;
    }
}
