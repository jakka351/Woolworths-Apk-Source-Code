package au.com.woolworths.feature.shared.feedback.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.ThemeContext;
import au.com.woolworths.feature.product.list.compose.d;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"feedback_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorPageKt {
    public static final void a(final Function0 onRetry, final Function0 onClose, ThemeContext themeContext, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.h(onRetry, "onRetry");
        Intrinsics.h(onClose, "onClose");
        Intrinsics.h(themeContext, "themeContext");
        ComposerImpl composerImplV = composer.v(-654514828);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onRetry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onClose) ? 32 : 16;
        }
        int i3 = i2 | (composerImplV.r(themeContext.ordinal()) ? 256 : 128) | 3072;
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.a(themeContext, ComposableLambdaKt.c(880662674, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.feedback.ui.ErrorPageKt$ErrorPage$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        AndroidWindowInsets androidWindowInsetsB = WindowInsets_androidKt.b(composer2);
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierB = BackgroundKt.b(WindowInsetsPaddingKt.d(companion, androidWindowInsetsB).x0(SizeKt.c), CoreTheme.b(composer2).e.f4848a.c, RectangleShapeKt.f1779a);
                        BiasAlignment biasAlignment = Alignment.Companion.f1719a;
                        MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, measurePolicyD, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        FullPageMessageUiKt.a(FullPageMessageSpec.Companion.c(null, null, StringResources_androidKt.c(composer2, R.string.feedback_form_error_message), null, onRetry, composer2, 23), null, null, composer2, 0, 6);
                        Modifier modifierG = BoxScopeInstance.f944a.g(companion, Alignment.Companion.c);
                        MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierG);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        IconButtonKt.c(CoreTheme.e(composer2).f4879a.G, StringResources_androidKt.c(composer2, R.string.close_button), onClose, null, false, null, CoreTheme.b(composer2).f4782a.c.c.c, composer2, 0, 56);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i3 >> 6) & 14) | 48);
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(onRetry, onClose, (Object) themeContext, modifier2, i, 11);
        }
    }
}
