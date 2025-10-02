package com.skydoves.balloon.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
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
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"balloon-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BalloonKt {
    public static final void a(final Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1755950697);
        if ((i & 14) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.F(-1323940314);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            LayoutDirection layoutDirection = (LayoutDirection) composerImplV.x(CompositionLocalsKt.n);
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerImplV.x(CompositionLocalsKt.s);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            ComposableLambdaImpl composableLambdaImplC = LayoutKt.c(modifier);
            int i3 = (((((i2 << 3) & 112) | ((i2 >> 3) & 14)) << 9) & 7168) | 6;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, BalloonKt$BalloonLayout$1.f19019a, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, density, ComposeUiNode.Companion.e);
            Updater.b(composerImplV, layoutDirection, ComposeUiNode.Companion.h);
            Updater.b(composerImplV, viewConfiguration, ComposeUiNode.Companion.i);
            composableLambdaImplC.invoke(new SkippableUpdater(composerImplV), composerImplV, 0);
            composerImplV.F(2058660585);
            composableLambdaImpl.invoke(composerImplV, Integer.valueOf((i3 >> 9) & 14));
            composerImplV.V(false);
            composerImplV.V(true);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX == null) {
            return;
        }
        recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: com.skydoves.balloon.compose.BalloonKt$BalloonLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ((Number) obj2).intValue();
                int iA = RecomposeScopeImplKt.a(i | 1);
                BalloonKt.a(modifier, composableLambdaImpl, (Composer) obj, iA);
                return Unit.f24250a;
            }
        };
    }
}
