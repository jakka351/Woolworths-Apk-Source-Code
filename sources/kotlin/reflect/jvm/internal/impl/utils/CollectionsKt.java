package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class CollectionsKt {
    public static final void a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List b(ArrayList arrayList) {
        Intrinsics.h(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return EmptyList.d;
        }
        if (size == 1) {
            return kotlin.collections.CollectionsKt.Q(kotlin.collections.CollectionsKt.D(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
