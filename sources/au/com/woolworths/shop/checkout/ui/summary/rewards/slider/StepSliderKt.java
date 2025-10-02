package au.com.woolworths.shop.checkout.ui.summary.rewards.slider;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.shop.instore.presence.presentation.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class StepSliderKt {
    public static final void a(ArrayList arrayList, Modifier modifier, int i, Function1 function1, Function0 function0, Composer composer, int i2) {
        ArrayList arrayList2;
        int i3;
        Function1 function12;
        Function0 function02;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1935189073);
        int i4 = (composerImplV.I(arrayList) ? 4 : 2) | i2 | 48 | (composerImplV.r(i) ? 256 : 128) | (composerImplV.I(function1) ? 2048 : 1024) | (composerImplV.I(function0) ? 16384 : 8192);
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            function02 = function0;
            function12 = function1;
            i3 = i;
            modifier2 = modifier;
            arrayList2 = arrayList;
        } else {
            long j = CoreTheme.b(composerImplV).e.f4848a.e;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            BaseStepSliderKt.a(arrayList, BackgroundKt.b(companion, j, rectangleShapeKt$RectangleShape$1), i, function1, function0, composerImplV, i4 & 65422);
            arrayList2 = arrayList;
            i3 = i;
            function12 = function1;
            function02 = function0;
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(arrayList2, modifier2, i3, function12, function02, i2);
        }
    }
}
