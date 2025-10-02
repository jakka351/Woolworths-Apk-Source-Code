package au.com.woolworths.feature.shop.recipes.freshmag.home.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.sdui.legacy.scrollablelist.MoreCardTileUiKt;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfigKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeMoreCard;
import au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FreshMagHorizontalListKt {
    public static final void a(final HorizontalListData feedItem, final Function2 function2, final Function1 function1, Modifier modifier, Composer composer, final int i) {
        final Modifier modifier2;
        Intrinsics.h(feedItem, "feedItem");
        ComposerImpl composerImplV = composer.v(-771702940);
        int i2 = (composerImplV.I(feedItem) ? 4 : 2) | i | (composerImplV.I(function2) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128) | 27648;
        if ((i2 & 9363) != 9362 || !composerImplV.c()) {
            composerImplV.o(1422829258);
            List<Object> h = feedItem.getH();
            if (!(h instanceof Collection) || !h.isEmpty()) {
                for (Object obj : h) {
                    if (!(obj instanceof RecipeCardSummaryData) && !(obj instanceof RecipeMoreCard)) {
                        break;
                    }
                }
            }
            if (!feedItem.getH().isEmpty()) {
                Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (objD == composer$Companion$Empty$1) {
                    objD = au.com.woolworths.dynamic.page.ui.content.d.f(composerImplV);
                }
                final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) objD;
                composerImplV.V(false);
                Modifier.Companion companion = Modifier.Companion.d;
                Modifier modifierH = PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, 12, 1);
                String d = feedItem.getD();
                String e = feedItem.getE();
                String f = feedItem.getF();
                String g = feedItem.getG();
                ScrollableListActionState scrollableListActionState = (g == null || g.length() == 0) ? ScrollableListActionState.f : ScrollableListActionState.d;
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(feedItem) | ((i2 & 896) == 256);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    objG = new au.com.woolworths.feature.shop.recipes.details.ui.c(function1, feedItem, 1);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-2138787561, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHorizontalListKt$FreshMagHorizontalList$4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Composer composer2 = (Composer) obj2;
                        if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier modifierJ = PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(10, BitmapDescriptorFactory.HUE_RED, 2);
                            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(12);
                            composer2.o(-1746271574);
                            final HorizontalListData horizontalListData = feedItem;
                            boolean zI2 = composer2.I(horizontalListData);
                            final Function2 function22 = function2;
                            boolean zN = zI2 | composer2.n(function22);
                            Object objG2 = composer2.G();
                            if (zN || objG2 == Composer.Companion.f1624a) {
                                final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                                objG2 = new Function1() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        LazyListScope LazyRow = (LazyListScope) obj4;
                                        Intrinsics.h(LazyRow, "$this$LazyRow");
                                        final HorizontalListData horizontalListData2 = horizontalListData;
                                        List<Object> h2 = horizontalListData2.getH();
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj5 : h2) {
                                            if (obj5 instanceof RecipeCardSummaryData) {
                                                arrayList.add(obj5);
                                            }
                                        }
                                        final RecipeCardSummaryConfig recipeCardSummaryConfigA = RecipeCardSummaryConfigKt.a(arrayList);
                                        for (Object obj6 : horizontalListData2.getH()) {
                                            boolean z = obj6 instanceof RecipeCardSummaryData;
                                            final Function2 function23 = function22;
                                            final SharedIntrinsicHeightState sharedIntrinsicHeightState3 = sharedIntrinsicHeightState2;
                                            if (z) {
                                                final RecipeCardSummaryData recipeCardSummaryData = (RecipeCardSummaryData) obj6;
                                                LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHorizontalListKt$FreshMagHorizontalList$4$1$1$1$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                        LazyItemScope item = (LazyItemScope) obj7;
                                                        Composer composer3 = (Composer) obj8;
                                                        int iIntValue = ((Number) obj9).intValue();
                                                        Intrinsics.h(item, "$this$item");
                                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                                            composer3.j();
                                                        } else {
                                                            final HorizontalListData horizontalListData3 = horizontalListData2;
                                                            final SharedIntrinsicHeightState sharedIntrinsicHeightState4 = sharedIntrinsicHeightState3;
                                                            final RecipeCardSummaryData recipeCardSummaryData2 = recipeCardSummaryData;
                                                            final RecipeCardSummaryConfig recipeCardSummaryConfig = recipeCardSummaryConfigA;
                                                            final Function2 function24 = function23;
                                                            CoreThemeKt.c(6, composer3, ComposableLambdaKt.c(2122402859, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHorizontalListKt$FreshMagHorizontalList$4$1$1$1$1.1
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(Object obj10, Object obj11) {
                                                                    Composer composer4 = (Composer) obj10;
                                                                    if ((((Number) obj11).intValue() & 3) == 2 && composer4.c()) {
                                                                        composer4.j();
                                                                    } else {
                                                                        composer4.o(-1746271574);
                                                                        Function2 function25 = function24;
                                                                        boolean zN2 = composer4.n(function25);
                                                                        HorizontalListData horizontalListData4 = horizontalListData3;
                                                                        boolean zI3 = zN2 | composer4.I(horizontalListData4);
                                                                        RecipeCardSummaryData recipeCardSummaryData3 = recipeCardSummaryData2;
                                                                        boolean zI4 = zI3 | composer4.I(recipeCardSummaryData3);
                                                                        Object objG3 = composer4.G();
                                                                        if (zI4 || objG3 == Composer.Companion.f1624a) {
                                                                            objG3 = new f(function25, horizontalListData4, recipeCardSummaryData3, 0);
                                                                            composer4.A(objG3);
                                                                        }
                                                                        composer4.l();
                                                                        RecipeCardKt.a(recipeCardSummaryData3, recipeCardSummaryConfig, (Function0) objG3, null, false, sharedIntrinsicHeightState4, composer4, 196616, 24);
                                                                    }
                                                                    return Unit.f24250a;
                                                                }
                                                            }, composer3));
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, true, 297080839), 3);
                                            } else if (obj6 instanceof RecipeMoreCard) {
                                                final RecipeMoreCard recipeMoreCard = (RecipeMoreCard) obj6;
                                                LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHorizontalListKt$FreshMagHorizontalList$4$1$1$1$2
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                        LazyItemScope item = (LazyItemScope) obj7;
                                                        Composer composer3 = (Composer) obj8;
                                                        int iIntValue = ((Number) obj9).intValue();
                                                        Intrinsics.h(item, "$this$item");
                                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                                            composer3.j();
                                                        } else {
                                                            String strC = StringResources_androidKt.c(composer3, R.string.recipe_horizontal_list_see_all_content_description);
                                                            composer3.o(-1746271574);
                                                            Function2 function24 = function23;
                                                            boolean zN2 = composer3.n(function24);
                                                            HorizontalListData horizontalListData3 = horizontalListData2;
                                                            boolean zI3 = zN2 | composer3.I(horizontalListData3);
                                                            RecipeMoreCard recipeMoreCard2 = recipeMoreCard;
                                                            boolean zI4 = zI3 | composer3.I(recipeMoreCard2);
                                                            Object objG3 = composer3.G();
                                                            if (zI4 || objG3 == Composer.Companion.f1624a) {
                                                                objG3 = new f(function24, horizontalListData3, recipeMoreCard2, 1);
                                                                composer3.A(objG3);
                                                            }
                                                            composer3.l();
                                                            MoreCardTileUiKt.a(strC, null, sharedIntrinsicHeightState3, BitmapDescriptorFactory.HUE_RED, (Function0) objG3, composer3, KyberEngine.KyberPolyBytes, 10);
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, true, 525865200), 3);
                                            }
                                        }
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG2);
                            }
                            composer2.l();
                            LazyDslKt.d(modifierJ, null, paddingValuesImplA, false, spacedAlignedG, null, null, false, null, (Function1) objG2, composer2, 24966, 490);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV);
                modifier2 = companion;
                ScrollableListUiKt.c(d, e, f, (Function0) objG, scrollableListActionState, modifierH, false, composableLambdaImplC, composerImplV, 12582912, 64);
            }
            composerImplV.V(false);
            RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
            if (recomposeScopeImplX != null) {
                recomposeScopeImplX.d = new Function2(function2, function1, i) { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.c
                    public final /* synthetic */ Function2 e;
                    public final /* synthetic */ Function1 f;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iA = RecomposeScopeImplKt.a(1);
                        FreshMagHorizontalListKt.a(this.d, this.e, this.f, Modifier.Companion.d, (Composer) obj2, iA);
                        return Unit.f24250a;
                    }
                };
                return;
            }
            return;
        }
        composerImplV.j();
        modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            recomposeScopeImplX2.d = new Function2(function2, function1, modifier2, i) { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.d
                public final /* synthetic */ Function2 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Modifier g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    FreshMagHorizontalListKt.a(this.d, this.e, this.f, this.g, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
