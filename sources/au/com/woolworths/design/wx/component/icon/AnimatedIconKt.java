package au.com.woolworths.design.wx.component.icon;

import androidx.compose.animation.graphics.res.AnimatedVectorPainterResources_androidKt;
import androidx.compose.animation.graphics.res.AnimatedVectorResources_androidKt;
import androidx.compose.animation.graphics.vector.AnimatedImageVector;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "atEnd", "design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AnimatedIconKt {
    public static final void a(Modifier modifier, long j, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-2092707244);
        int i2 = i | (composerImplV.r(R.drawable.ic_pulse_animation_repeating) ? 4 : 2) | (composerImplV.s(j) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            AnimatedImageVector animatedImageVectorA = AnimatedVectorResources_androidKt.a(R.drawable.ic_pulse_animation_repeating, ((i2 << 3) & 112) | 6, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            IconKt.a(AnimatedVectorPainterResources_androidKt.a(animatedImageVectorA, ((Boolean) mutableState.getD()).booleanValue(), composerImplV), null, modifier, j, composerImplV, i2 & 8176, 0);
            composerImplV.o(5004770);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new AnimatedIconKt$AnimatedIcon$1$1(mutableState, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(modifier, j, i, 0);
        }
    }
}
