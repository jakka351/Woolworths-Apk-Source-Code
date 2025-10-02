package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LabelKt$HandleInteractions$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ TooltipState i;
    public final /* synthetic */ MutableInteractionSource j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelKt$HandleInteractions$2(boolean z, TooltipState tooltipState, MutableInteractionSource mutableInteractionSource, int i) {
        super(2);
        this.h = z;
        this.i = tooltipState;
        this.j = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(1);
        ComposerImpl composerImplV = ((Composer) obj).v(-627258109);
        boolean z = this.h;
        int i = (composerImplV.p(z) ? 4 : 2) | iA;
        TooltipState tooltipState = this.i;
        int i2 = i | (composerImplV.n(tooltipState) ? 32 : 16);
        MutableInteractionSource mutableInteractionSource = this.j;
        int i3 = i2 | (composerImplV.n(mutableInteractionSource) ? 256 : 128);
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else if (z) {
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new LabelKt$HandleInteractions$1$1(mutableInteractionSource, tooltipState, null);
                composerImplV.A(objG);
            }
            EffectsKt.e(composerImplV, mutableInteractionSource, (Function2) objG);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new LabelKt$HandleInteractions$2(z, tooltipState, mutableInteractionSource, iA);
        }
        return Unit.f24250a;
    }
}
