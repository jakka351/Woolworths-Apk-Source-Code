package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.ui.platform.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
class SignatureBuildingComponents$$Lambda$0 implements Function1 {
    public static final SignatureBuildingComponents$$Lambda$0 d = new SignatureBuildingComponents$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        return it.length() > 1 ? i.a(';', "L", it) : it;
    }
}
