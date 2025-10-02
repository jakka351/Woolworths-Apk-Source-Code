package me.onebone.toolbar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lib_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class CollapsingToolbarKt {
    public static final void a(final Modifier modifier, final CollapsingToolbarState collapsingToolbarState, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        Intrinsics.h(collapsingToolbarState, "collapsingToolbarState");
        ComposerImpl composerImplV = composer.v(-144157879);
        if ((i & 14) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerImplV.n(collapsingToolbarState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerImplV.n(composableLambdaImpl) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i3 = i2 >> 3;
            composerImplV.F(1157296644);
            boolean zN = composerImplV.n(collapsingToolbarState);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new CollapsingToolbarMeasurePolicy(collapsingToolbarState);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            CollapsingToolbarMeasurePolicy collapsingToolbarMeasurePolicy = (CollapsingToolbarMeasurePolicy) objG;
            Modifier modifierB = ClipKt.b(modifier);
            composerImplV.F(-1323940314);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            LayoutDirection layoutDirection = (LayoutDirection) composerImplV.x(CompositionLocalsKt.n);
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerImplV.x(CompositionLocalsKt.s);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            ComposableLambdaImpl composableLambdaImplC = LayoutKt.c(modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            composerImplV.x = false;
            Updater.b(composerImplV, collapsingToolbarMeasurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, density, ComposeUiNode.Companion.e);
            Updater.b(composerImplV, layoutDirection, ComposeUiNode.Companion.h);
            Updater.b(composerImplV, viewConfiguration, ComposeUiNode.Companion.i);
            composerImplV.U();
            composableLambdaImplC.invoke(new SkippableUpdater(composerImplV), composerImplV, 0);
            composerImplV.F(2058660585);
            composableLambdaImpl.invoke(CollapsingToolbarScopeInstance.f24915a, composerImplV, Integer.valueOf((i3 & 112) | 6));
            composerImplV.V(false);
            composerImplV.V(true);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX == null) {
            return;
        }
        recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: me.onebone.toolbar.CollapsingToolbarKt$CollapsingToolbar$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ((Number) obj2).intValue();
                int i4 = i | 1;
                CollapsingToolbarKt.a(modifier, collapsingToolbarState, composableLambdaImpl, (Composer) obj, i4);
                return Unit.f24250a;
            }
        };
    }

    public static final CollapsingToolbarState b(int i, int i2, Composer composer) {
        composer.F(-955586446);
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        composer.F(-492369756);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = new CollapsingToolbarState(i);
            composer.A(objG);
        }
        composer.N();
        CollapsingToolbarState collapsingToolbarState = (CollapsingToolbarState) objG;
        composer.N();
        return collapsingToolbarState;
    }
}
