package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RichTextThemeProviderKt {
    public static final void a(Function2 function2, Function4 function4, Function2 function22, Function4 function42, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-2090131479);
        if ((((composerImplV.I(function2) ? 4 : 2) | i | (composerImplV.I(function22) ? 256 : 128)) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CompositionLocalKt.a(RichTextThemeConfigurationKt.f16293a.b(new RichTextThemeConfiguration(function2 == null ? RichTextThemeConfiguration.e.f16292a : function2, function4 == null ? RichTextThemeConfiguration.e.b : function4, function22 == null ? RichTextThemeConfiguration.e.c : function22, function42 == null ? RichTextThemeConfiguration.e.d : function42)), ComposableLambdaKt.c(-1030900567, new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.RichTextThemeProviderKt$RichTextThemeProvider$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composableLambdaImpl.invoke(composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productfinder.g(function2, function4, function22, function42, composableLambdaImpl, i, 19);
        }
    }
}
