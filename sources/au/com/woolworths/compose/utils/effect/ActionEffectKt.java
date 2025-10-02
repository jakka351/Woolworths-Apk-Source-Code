package au.com.woolworths.compose.utils.effect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.navigation.compose.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ActionEffectKt {
    public static final void a(Object obj, Function3 block, Composer composer, int i) {
        Intrinsics.h(block, "block");
        ComposerImpl composerImplV = composer.v(-223358357);
        int i2 = (composerImplV.n(obj) ? 4 : 2) | i | (composerImplV.I(block) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 14) == 4) | composerImplV.I(block);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new ActionEffectKt$ActionEffect$1$1(obj, block, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, obj, (Function2) objG);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(obj, i, 5, block);
        }
    }
}
