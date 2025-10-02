package com.halilibo.richtext.ui.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.rewards.base.d;
import au.com.woolworths.shop.product.details.ui.linkdedicatedviews.a;
import com.halilibo.richtext.ui.BasicRichTextKt;
import com.halilibo.richtext.ui.RichTextStyle;
import com.halilibo.richtext.ui.RichTextThemeProviderKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui-material_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RichTextKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f16302a = new DynamicProvidableCompositionLocal(new d(20));

    public static final void a(final Modifier modifier, final RichTextStyle richTextStyle, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(747807126);
        if ((((composerImplV.n(modifier) ? 4 : 2) | i | (composerImplV.n(richTextStyle) ? 32 : 16)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            b(6, composerImplV, ComposableLambdaKt.c(241224612, new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.material.RichTextKt$RichText$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        BasicRichTextKt.a(modifier, richTextStyle, composableLambdaImpl, composer2, 0, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(modifier, richTextStyle, composableLambdaImpl, i, 4);
        }
    }

    public static final void b(int i, Composer composer, final ComposableLambdaImpl composableLambdaImpl) {
        ComposerImpl composerImplV = composer.v(-144995200);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else if (((Boolean) composerImplV.x(f16302a)).booleanValue()) {
            composerImplV.o(1934817993);
            composableLambdaImpl.invoke(composerImplV, 6);
            composerImplV.V(false);
        } else {
            composerImplV.o(1934304106);
            RichTextThemeProviderKt.a(RichTextKt$RichTextMaterialTheme$1.d, ComposableSingletons$RichTextKt.f16301a, RichTextKt$RichTextMaterialTheme$2.d, ComposableSingletons$RichTextKt.b, ComposableLambdaKt.c(-1463158563, new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.material.RichTextKt$RichTextMaterialTheme$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProvidedValue providedValueB = RichTextKt.f16302a.b(Boolean.TRUE);
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(1126964253, new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.material.RichTextKt$RichTextMaterialTheme$3.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    composableLambdaImpl2.invoke(composer3, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 56);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 27696);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new com.halilibo.richtext.ui.d(composableLambdaImpl, i, 1);
        }
    }
}
