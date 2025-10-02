package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.TitleTextItemUiKt;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TermsAndConditionsContentKt {
    public static final void a(String title, final String termsAndConditions, Composer composer, int i) {
        Intrinsics.h(title, "title");
        Intrinsics.h(termsAndConditions, "termsAndConditions");
        ComposerImpl composerImplV = composer.v(-347566444);
        int i2 = (composerImplV.n(title) ? 4 : 2) | i | (composerImplV.n(termsAndConditions) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImplV, null);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 32));
            TitleTextItemUiKt.b(title, composerImplV, i2 & 14);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 8));
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1087628345, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.TermsAndConditionsContentKt$TermsAndConditionsContent$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        MarkdownCompatKt.a(termsAndConditions, PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), new MarkdownTextViewStyle((Density) composer2.x(CompositionLocalsKt.h), WxTheme.a(composer2).c(), WxTheme.b(composer2).n, (TextAlign) null, 24), null, false, new Color(CoreTheme.b(composer2).f4782a.d.b.f4798a), null, false, null, null, composer2, 48, 984);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            SpacerKt.a(composerImplV, SizeKt.g(companion, 24));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.preferences.g(title, termsAndConditions, i, 1);
        }
    }
}
