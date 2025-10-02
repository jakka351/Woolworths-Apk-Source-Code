package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PressInteractionKt {
    public static final MutableState a(MutableInteractionSource mutableInteractionSource, Composer composer) {
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = SnapshotStateKt.f(Boolean.FALSE);
            composer.A(objG);
        }
        MutableState mutableState = (MutableState) objG;
        Object objG2 = composer.G();
        if (objG2 == composer$Companion$Empty$1) {
            objG2 = new PressInteractionKt$collectIsPressedAsState$1$1(mutableInteractionSource, mutableState, null);
            composer.A(objG2);
        }
        EffectsKt.e(composer, mutableInteractionSource, (Function2) objG2);
        return mutableState;
    }
}
