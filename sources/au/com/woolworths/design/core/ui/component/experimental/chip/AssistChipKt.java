package au.com.woolworths.design.core.ui.component.experimental.chip;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.AssistChipSpec;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipVariant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AssistChipKt {
    public static final void a(String str, final ImageVector imageVector, Function0 onClick, Modifier modifier, ChipVariant chipVariant, Composer composer, int i, int i2) {
        int i3;
        ChipVariant chipVariant2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-2018038839);
        int i4 = (composerImplV.n(imageVector) ? 32 : 16) | i;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(onClick) ? 256 : 128;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
        } else {
            i3 = i4 | (composerImplV.r(chipVariant == null ? -1 : chipVariant.ordinal()) ? 16384 : 8192);
        }
        int i6 = i3 | 196608;
        if ((74899 & i6) == 74898 && composerImplV.c()) {
            composerImplV.j();
            chipVariant2 = chipVariant;
        } else {
            final ChipVariant chipVariant3 = i5 != 0 ? ChipVariant.d : chipVariant;
            ChipImplKt.b(false, new AssistChipSpec(chipVariant3), str, null, onClick, modifier, null, ComposableLambdaKt.c(137191401, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.experimental.chip.AssistChipKt$AssistChip$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ChipImplKt.a(imageVector, chipVariant3, null, null, composer2, 0, 12);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, composerImplV, ((i6 << 6) & 57344) | 14355846, 768);
            chipVariant2 = chipVariant3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(str, imageVector, onClick, modifier, chipVariant2, i, i2, 0);
        }
    }
}
