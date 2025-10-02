package au.com.woolworths.compose.utils.effect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "first", "compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ChangedEffectKt {
    public static final void a(Object obj, Function2 block, Composer composer, int i) {
        Intrinsics.h(block, "block");
        composer.o(192279228);
        composer.o(1849434622);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = SnapshotStateKt.f(Boolean.TRUE);
            composer.A(objG);
        }
        MutableState mutableState = (MutableState) objG;
        composer.l();
        composer.o(-1633490746);
        boolean zI = composer.I(block);
        Object objG2 = composer.G();
        if (zI || objG2 == composer$Companion$Empty$1) {
            objG2 = new ChangedEffectKt$ChangedEffect$1$1(block, mutableState, null);
            composer.A(objG2);
        }
        composer.l();
        EffectsKt.e(composer, obj, (Function2) objG2);
        composer.l();
    }
}
