package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
class RawTypeImpl$$Lambda$0 implements Function1 {
    public static final RawTypeImpl$$Lambda$0 d = new RawTypeImpl$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        return "(raw) ".concat(it);
    }
}
