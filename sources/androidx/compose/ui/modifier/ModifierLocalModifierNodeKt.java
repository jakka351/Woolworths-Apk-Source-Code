package androidx.compose.ui.modifier;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ModifierLocalModifierNodeKt {
    public static final SingleLocalMap a(Pair pair) {
        Object obj = pair.d;
        SingleLocalMap singleLocalMap = new SingleLocalMap((ModifierLocal) obj);
        singleLocalMap.c((ModifierLocal) obj, pair.e);
        return singleLocalMap;
    }
}
