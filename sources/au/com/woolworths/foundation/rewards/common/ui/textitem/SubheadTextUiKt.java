package au.com.woolworths.foundation.rewards.common.ui.textitem;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SubheadTextUiKt {
    public static final void a(final String str, final Modifier modifier, long j, TextStyle textStyle, Composer composer, int i) {
        final long j2;
        final TextStyle textStyle2;
        ComposerImpl composerImplV = composer.v(706022360);
        if ((((composerImplV.n(str) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16) | 1152) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            j2 = j;
            textStyle2 = textStyle;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                j2 = CoreTheme.b(composerImplV).e.d.d;
                textStyle2 = CoreTheme.f(composerImplV).d.c.b;
            } else {
                composerImplV.j();
                j2 = j;
                textStyle2 = textStyle;
            }
            composerImplV.W();
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1420358917, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.textitem.SubheadTextUiKt$SubheadTextUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextKt.b(str, modifier, j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle2, composer2, 0, 0, 65528);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.a(str, modifier, j2, textStyle2, i, 1);
        }
    }
}
