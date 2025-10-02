package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TypeEnhancementUtilsKt {
    public static final Object a(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        if (!z) {
            if (r4 != null) {
                set = CollectionsKt.L0(SetsKt.h(set, r4));
            }
            return CollectionsKt.o0(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (Intrinsics.c(r1, r2) && Intrinsics.c(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }
}
