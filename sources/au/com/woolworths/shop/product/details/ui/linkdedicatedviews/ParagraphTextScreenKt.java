package au.com.woolworths.shop.product.details.ui.linkdedicatedviews;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.aem.components.ui.ParagraphMarkdownKt;
import au.com.woolworths.shop.lists.ui.magicmatch.ui.c;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ParagraphTextScreenKt {
    public static final void a(final String str, final ParagraphTextItemData paragraphTextItemData, final Function0 onNavigateUp, Composer composer, int i) {
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(1874519978);
        if ((((composerImplV.n(str) ? 4 : 2) | i | (composerImplV.n(paragraphTextItemData) ? 32 : 16) | (composerImplV.I(onNavigateUp) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1108807174, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.ParagraphTextScreenKt$ParagraphTextScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final String str2 = str;
                        final Function0 function0 = onNavigateUp;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(174013130, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.ParagraphTextScreenKt$ParagraphTextScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    final Function0 function02 = function0;
                                    TopNavBarKt.a(str2, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(1944937532, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.ParagraphTextScreenKt.ParagraphTextScreen.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ImageVector imageVector = CoreTheme.e(composer4).e.b;
                                                String strC = StringResources_androidKt.c(composer4, R.string.content_description_back_button);
                                                composer4.o(5004770);
                                                Function0 function03 = function02;
                                                boolean zN = composer4.n(function03);
                                                Object objG = composer4.G();
                                                if (zN || objG == Composer.Companion.f1624a) {
                                                    objG = new c(11, function03);
                                                    composer4.A(objG);
                                                }
                                                composer4.l();
                                                IconButtonKt.c(imageVector, strC, (Function0) objG, null, false, null, 0L, composer4, 0, 120);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), null, composer3, 100663296, 766);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final ParagraphTextItemData paragraphTextItemData2 = paragraphTextItemData;
                        ScaffoldKt.a(null, composableLambdaImplC, null, null, 0L, null, ComposableLambdaKt.c(-884407405, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.ParagraphTextScreenKt$ParagraphTextScreen$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                final PaddingValues paddingVals = (PaddingValues) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(paddingVals, "paddingVals");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.n(paddingVals) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    final ParagraphTextItemData paragraphTextItemData3 = paragraphTextItemData2;
                                    ThemeKt.b(6, composer3, ComposableLambdaKt.c(608865355, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.ParagraphTextScreenKt.ParagraphTextScreen.1.2.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer4 = (Composer) obj6;
                                            if ((((Number) obj7).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ParagraphMarkdownKt.a(paragraphTextItemData3, SizeKt.x(SizeKt.e(PaddingKt.e(PaddingKt.g(Modifier.Companion.d, 16, 8), paddingVals), 1.0f), Alignment.Companion.k, false), null, composer4, 0);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3));
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 12582960, 125);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(str, paragraphTextItemData, onNavigateUp, i, 0);
        }
    }
}
