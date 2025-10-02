package au.com.woolworths.feature.shop.recipes.details.ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterExitTransitionKt$expandIn$1;
import androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.IntSize;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeNutritionTileData;
import au.com.woolworths.feature.shop.recipes.details.data.TabContents;
import au.com.woolworths.feature.shop.recipes.details.data.UserInteractionData;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt;
import au.com.woolworths.foundation.shop.model.recipes.RecipeBylineData;
import au.com.woolworths.sdui.legacy.scrollablelist.MoreCardTileUiKt;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfigKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCostPerServeData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeMoreCard;
import au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipe-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeDetailsContentKt {
    public static final void a(final HorizontalListData horizontalListData, final Function2 function2, final Function1 function1, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(274285528);
        int i2 = (composerImplV.I(horizontalListData) ? 4 : 2) | i | (composerImplV.I(function2) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = au.com.woolworths.dynamic.page.ui.content.d.f(composerImplV);
            }
            final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) objG;
            composerImplV.V(false);
            Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 76, 5);
            String d = horizontalListData.getD();
            String e = horizontalListData.getE();
            String f = horizontalListData.getF();
            String g = horizontalListData.getG();
            ScrollableListActionState scrollableListActionState = (g == null || g.length() == 0) ? ScrollableListActionState.f : ScrollableListActionState.d;
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(horizontalListData);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new c(function1, horizontalListData, 0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            ScrollableListUiKt.c(d, e, f, (Function0) objG2, scrollableListActionState, modifierJ, false, ComposableLambdaKt.c(-1416252085, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$LatestRecipesList$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierH = PaddingKt.h(Modifier.Companion.d, 10, BitmapDescriptorFactory.HUE_RED, 2);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(12);
                        composer2.o(-1746271574);
                        final HorizontalListData horizontalListData2 = horizontalListData;
                        boolean zI2 = composer2.I(horizontalListData2);
                        final Function2 function22 = function2;
                        boolean zN = zI2 | composer2.n(function22);
                        Object objG3 = composer2.G();
                        if (zN || objG3 == Composer.Companion.f1624a) {
                            final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                            objG3 = new Function1() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.g
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    LazyListScope LazyRow = (LazyListScope) obj3;
                                    Intrinsics.h(LazyRow, "$this$LazyRow");
                                    final HorizontalListData horizontalListData3 = horizontalListData2;
                                    List<Object> h = horizontalListData3.getH();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj4 : h) {
                                        if (obj4 instanceof RecipeCardSummaryData) {
                                            arrayList.add(obj4);
                                        }
                                    }
                                    final RecipeCardSummaryConfig recipeCardSummaryConfigA = RecipeCardSummaryConfigKt.a(arrayList);
                                    for (Object obj5 : horizontalListData3.getH()) {
                                        boolean z = obj5 instanceof RecipeCardSummaryData;
                                        final Function2 function23 = function22;
                                        final SharedIntrinsicHeightState sharedIntrinsicHeightState3 = sharedIntrinsicHeightState2;
                                        if (z) {
                                            final RecipeCardSummaryData recipeCardSummaryData = (RecipeCardSummaryData) obj5;
                                            LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$LatestRecipesList$2$1$1$1$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    LazyItemScope item = (LazyItemScope) obj6;
                                                    Composer composer3 = (Composer) obj7;
                                                    int iIntValue = ((Number) obj8).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue & 17) == 16 && composer3.c()) {
                                                        composer3.j();
                                                    } else {
                                                        final HorizontalListData horizontalListData4 = horizontalListData3;
                                                        final SharedIntrinsicHeightState sharedIntrinsicHeightState4 = sharedIntrinsicHeightState3;
                                                        final RecipeCardSummaryData recipeCardSummaryData2 = recipeCardSummaryData;
                                                        final RecipeCardSummaryConfig recipeCardSummaryConfig = recipeCardSummaryConfigA;
                                                        final Function2 function24 = function23;
                                                        CoreThemeKt.c(6, composer3, ComposableLambdaKt.c(-2031703713, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$LatestRecipesList$2$1$1$1$1.1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                Composer composer4 = (Composer) obj9;
                                                                if ((((Number) obj10).intValue() & 3) == 2 && composer4.c()) {
                                                                    composer4.j();
                                                                } else {
                                                                    composer4.o(-1746271574);
                                                                    Function2 function25 = function24;
                                                                    boolean zN2 = composer4.n(function25);
                                                                    HorizontalListData horizontalListData5 = horizontalListData4;
                                                                    boolean zI3 = zN2 | composer4.I(horizontalListData5);
                                                                    RecipeCardSummaryData recipeCardSummaryData3 = recipeCardSummaryData2;
                                                                    boolean zI4 = zI3 | composer4.I(recipeCardSummaryData3);
                                                                    Object objG4 = composer4.G();
                                                                    if (zI4 || objG4 == Composer.Companion.f1624a) {
                                                                        objG4 = new h(function25, horizontalListData5, recipeCardSummaryData3, 0);
                                                                        composer4.A(objG4);
                                                                    }
                                                                    composer4.l();
                                                                    RecipeCardKt.a(recipeCardSummaryData3, recipeCardSummaryConfig, (Function0) objG4, null, false, sharedIntrinsicHeightState4, composer4, 196616, 24);
                                                                }
                                                                return Unit.f24250a;
                                                            }
                                                        }, composer3));
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, 677693499), 3);
                                        } else if (obj5 instanceof RecipeMoreCard) {
                                            final RecipeMoreCard recipeMoreCard = (RecipeMoreCard) obj5;
                                            LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$LatestRecipesList$2$1$1$1$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    LazyItemScope item = (LazyItemScope) obj6;
                                                    Composer composer3 = (Composer) obj7;
                                                    int iIntValue = ((Number) obj8).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue & 17) == 16 && composer3.c()) {
                                                        composer3.j();
                                                    } else {
                                                        String strC = StringResources_androidKt.c(composer3, R.string.recipe_horizontal_list_see_all_content_description);
                                                        composer3.o(-1746271574);
                                                        Function2 function24 = function23;
                                                        boolean zN2 = composer3.n(function24);
                                                        HorizontalListData horizontalListData4 = horizontalListData3;
                                                        boolean zI3 = zN2 | composer3.I(horizontalListData4);
                                                        RecipeMoreCard recipeMoreCard2 = recipeMoreCard;
                                                        boolean zI4 = zI3 | composer3.I(recipeMoreCard2);
                                                        Object objG4 = composer3.G();
                                                        if (zI4 || objG4 == Composer.Companion.f1624a) {
                                                            objG4 = new h(function24, horizontalListData4, recipeMoreCard2, 1);
                                                            composer3.A(objG4);
                                                        }
                                                        composer3.l();
                                                        MoreCardTileUiKt.a(strC, null, sharedIntrinsicHeightState3, BitmapDescriptorFactory.HUE_RED, (Function0) objG4, composer3, KyberEngine.KyberPolyBytes, 10);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, -933755804), 3);
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG3);
                        }
                        composer2.l();
                        LazyDslKt.d(modifierH, null, null, false, spacedAlignedG, null, null, false, null, (Function1) objG3, composer2, 24582, 494);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12779520, 64);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(function2, function1, i) { // from class: au.com.woolworths.feature.shop.recipes.details.ui.d
                public final /* synthetic */ Function2 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    RecipeDetailsContentKt.a(this.d, this.e, this.f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final RecipeDetailData recipeDetailsData, final LazyListState lazyListState, final Function0 onSaveRecipeClick, final Function1 onServesQuantityIncreased, final Function1 onServesQuantityDecreased, final Function1 onCostPerServeFaqBannerClick, final Function1 onDynamicSizeCardClicked, final Function1 onDynamicSizeCardImpression, final Function2 onHorizontalListItemClick, final Function1 onHorizontalListActionClick, final Function0 onShopIngredientClick, final Function0 onVideoPlayClick, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier.Companion companion;
        ComposerImpl composerImpl;
        final RecipeDetailData recipeDetailData;
        final Function0 function0;
        ComposerImpl composerImpl2;
        Intrinsics.h(recipeDetailsData, "recipeDetailsData");
        Intrinsics.h(lazyListState, "lazyListState");
        Intrinsics.h(onSaveRecipeClick, "onSaveRecipeClick");
        Intrinsics.h(onServesQuantityIncreased, "onServesQuantityIncreased");
        Intrinsics.h(onServesQuantityDecreased, "onServesQuantityDecreased");
        Intrinsics.h(onCostPerServeFaqBannerClick, "onCostPerServeFaqBannerClick");
        Intrinsics.h(onDynamicSizeCardClicked, "onDynamicSizeCardClicked");
        Intrinsics.h(onDynamicSizeCardImpression, "onDynamicSizeCardImpression");
        Intrinsics.h(onHorizontalListItemClick, "onHorizontalListItemClick");
        Intrinsics.h(onHorizontalListActionClick, "onHorizontalListActionClick");
        Intrinsics.h(onShopIngredientClick, "onShopIngredientClick");
        Intrinsics.h(onVideoPlayClick, "onVideoPlayClick");
        ComposerImpl composerImplV = composer.v(-1982447927);
        int i4 = (composerImplV.I(recipeDetailsData) ? 4 : 2) | i | (composerImplV.n(lazyListState) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(onSaveRecipeClick) ? 256 : 128;
        }
        int i5 = i4 | (composerImplV.I(onServesQuantityIncreased) ? 2048 : 1024) | (composerImplV.I(onServesQuantityDecreased) ? 16384 : 8192) | (composerImplV.I(onCostPerServeFaqBannerClick) ? 131072 : 65536) | (composerImplV.I(onDynamicSizeCardClicked) ? 1048576 : 524288) | (composerImplV.I(onDynamicSizeCardImpression) ? 8388608 : 4194304);
        if ((i & 100663296) == 0) {
            i5 |= composerImplV.I(onHorizontalListItemClick) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= composerImplV.I(onHorizontalListActionClick) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerImplV.I(onShopIngredientClick) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i6 = i3 | (composerImplV.I(onVideoPlayClick) ? 32 : 16);
        if ((i5 & 306783379) == 306783378 && (i6 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            recipeDetailData = recipeDetailsData;
            composerImpl2 = composerImplV;
            function0 = onShopIngredientClick;
        } else {
            final Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotIntStateKt.a(TabContents.e.ordinal());
                composerImplV.A(objG);
            }
            final MutableIntState mutableIntState = (MutableIntState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objD);
            }
            MutableState mutableState = (MutableState) objD;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            int i7 = i5 & 112;
            boolean z = i7 == 32;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new RecipeDetailsContentKt$RecipeDetailsContent$1$1(lazyListState, mutableState, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, lazyListState, (Function2) objG2);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierA = TestTagKt.a(companion2, "recipe content list");
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(context) | composerImplV.I(recipeDetailsData) | ((i6 & 112) == 32) | ((i5 & 896) == 256) | ((3670016 & i5) == 1048576) | ((29360128 & i5) == 8388608) | ((i5 & 7168) == 2048) | ((57344 & i5) == 16384) | ((i6 & 14) == 4) | ((458752 & i5) == 131072) | ((234881024 & i5) == 67108864) | ((1879048192 & i5) == 536870912);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                companion = companion2;
                composerImpl = composerImplV;
                Function1 function1 = new Function1() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final BasicCoreBroadcastBannerModel faqBanner;
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final Context context2 = context;
                        final RecipeDetailData recipeDetailData2 = recipeDetailsData;
                        final Function0 function03 = onVideoPlayClick;
                        final Function0 function04 = onSaveRecipeClick;
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.f1719a, false);
                                    int p = composer2.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                    Modifier.Companion companion3 = Modifier.Companion.d;
                                    Modifier modifierD2 = ComposedModifierKt.d(composer2, companion3);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function05 = ComposeUiNode.Companion.b;
                                    if (composer2.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer2.i();
                                    if (composer2.getO()) {
                                        composer2.K(function05);
                                    } else {
                                        composer2.e();
                                    }
                                    Updater.b(composer2, measurePolicyD2, ComposeUiNode.Companion.g);
                                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function22 = ComposeUiNode.Companion.j;
                                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer2, p, function22);
                                    }
                                    Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                                    final Context context3 = context2;
                                    ImageRequest.Builder builder = new ImageRequest.Builder(context3);
                                    RecipeDetailData recipeDetailData3 = recipeDetailData2;
                                    builder.c = recipeDetailData3.d;
                                    ImageRequests_androidKt.d(builder, R.drawable.ic_recipe_image_placeholder);
                                    ImageRequests_androidKt.a(builder, R.drawable.ic_recipe_image_placeholder);
                                    builder.j = CachePolicy.f;
                                    SingletonAsyncImageKt.a(builder.a(), null, TestTagKt.a(SizeKt.g(SizeKt.e(companion3, 1.0f), RecipeDetailsPageKt.f8026a), "hero image"), null, ContentScale.Companion.f1880a, composer2, 1573296, 1976);
                                    composer2.o(191410079);
                                    if (recipeDetailData3.r != null) {
                                        Modifier modifierA2 = TestTagKt.a(BackgroundKt.b(BoxScopeInstance.f944a.g(companion3, Alignment.Companion.e), Color.f, RoundedCornerShapeKt.f1100a), "video start cta");
                                        ImageVector imageVectorD = PlayArrowKt.f1366a;
                                        if (imageVectorD == null) {
                                            ImageVector.Builder builder2 = new ImageVector.Builder("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                            int i9 = VectorKt.f1820a;
                                            SolidColor solidColor = new SolidColor(Color.b);
                                            PathBuilder pathBuilder = new PathBuilder();
                                            pathBuilder.i(8.0f, 5.0f);
                                            pathBuilder.m(14.0f);
                                            pathBuilder.h(11.0f, -7.0f);
                                            pathBuilder.a();
                                            builder2.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
                                            imageVectorD = builder2.d();
                                            PlayArrowKt.f1366a = imageVectorD;
                                        }
                                        IconButtonKt.c(imageVectorD, StringResources_androidKt.c(composer2, R.string.video_play_button_content_description), function03, modifierA2, false, 0L, composer2, 0, 48);
                                        composer2 = composer2;
                                    }
                                    composer2.l();
                                    UserInteractionData userInteractionData = recipeDetailData3.o;
                                    composer2.o(191434788);
                                    if (userInteractionData != null) {
                                        final boolean zC = Intrinsics.c(userInteractionData.f8024a, Boolean.TRUE);
                                        final Function0 function06 = function04;
                                        CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(-1939832840, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj5, Object obj6) throws Resources.NotFoundException {
                                                ImageVector imageVector;
                                                Composer composer3 = (Composer) obj5;
                                                if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                                    composer3.j();
                                                } else {
                                                    float f = 16;
                                                    Modifier modifierA3 = TestTagKt.a(AlphaKt.a(BackgroundKt.b(BoxScopeInstance.f944a.g(PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f, 3), Alignment.Companion.i), CoreTheme.b(composer3).e.f4848a.b.b, RoundedCornerShapeKt.b(8)), 0.9f), "save cta");
                                                    boolean z2 = zC;
                                                    if (z2) {
                                                        composer3.o(-774476993);
                                                        imageVector = CoreTheme.e(composer3).f4879a.d;
                                                        composer3.l();
                                                    } else {
                                                        composer3.o(-774365021);
                                                        imageVector = CoreTheme.e(composer3).f4879a.c;
                                                        composer3.l();
                                                    }
                                                    ImageVector imageVector2 = imageVector;
                                                    long j = CoreTheme.b(composer3).f4782a.c.b.f4793a;
                                                    Boolean boolValueOf = Boolean.valueOf(z2);
                                                    Context context4 = context3;
                                                    Intrinsics.h(context4, "context");
                                                    String string = context4.getResources().getString(boolValueOf.equals(Boolean.TRUE) ? R.string.recipe_detail_unsave_content_description : R.string.recipe_detail_save_content_description);
                                                    Intrinsics.g(string, "getString(...)");
                                                    au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt.c(imageVector2, string, function06, modifierA3, false, null, j, composer3, 0, 48);
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, composer2));
                                    }
                                    composer2.l();
                                    composer2.f();
                                }
                                return Unit.f24250a;
                            }
                        }, true, -835956402), 3);
                        final RecipeBylineData recipeBylineData = recipeDetailData2.f;
                        final RecipeCostPerServeData recipeCostPerServeData = recipeDetailData2.s;
                        if (recipeBylineData != null) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$2$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        RecipeDetailsBylineKt.a(recipeBylineData, TestTagKt.a(PaddingKt.j(PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), "byline"), composer2, 48);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 1901170300), 3);
                        }
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    float f = 16;
                                    TextKt.b(recipeDetailData2.c, TestTagKt.a(PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), f, f, f, BitmapDescriptorFactory.HUE_RED, 8), "recipe title"), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer2).v, composer2, 0, 0, 65020);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1279568777), 3);
                        if (recipeCostPerServeData != null) {
                            final Modifier modifier2 = modifier;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$4$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        final RecipeCostPerServeData recipeCostPerServeData2 = recipeCostPerServeData;
                                        final Modifier modifier3 = modifier2;
                                        CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(-50723147, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$4$1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj5, Object obj6) {
                                                Composer composer3 = (Composer) obj5;
                                                if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                                    composer3.j();
                                                } else {
                                                    RecipeCostPerServeData recipeCostPerServeData3 = recipeCostPerServeData2;
                                                    String strB = StringResources_androidKt.b(R.string.cost_per_serve_price_content_description, new Object[]{Double.valueOf(recipeCostPerServeData3.getPrice())}, composer3);
                                                    float f = 16;
                                                    float f2 = 2;
                                                    Modifier modifierB = BackgroundKt.b(PaddingKt.j(SizeKt.A(modifier3, (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false), f, f, f, BitmapDescriptorFactory.HUE_RED, 8), CoreTheme.b(composer3).c.f4812a.f4813a.f4814a.b, RoundedCornerShapeKt.b(f2));
                                                    MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.e, false);
                                                    int p = composer3.getP();
                                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                                    Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierB);
                                                    ComposeUiNode.e3.getClass();
                                                    Function0 function05 = ComposeUiNode.Companion.b;
                                                    if (composer3.w() == null) {
                                                        ComposablesKt.b();
                                                        throw null;
                                                    }
                                                    composer3.i();
                                                    if (composer3.getO()) {
                                                        composer3.K(function05);
                                                    } else {
                                                        composer3.e();
                                                    }
                                                    Updater.b(composer3, measurePolicyD2, ComposeUiNode.Companion.g);
                                                    Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                                    Function2 function22 = ComposeUiNode.Companion.j;
                                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                                        androidx.camera.core.impl.b.z(p, composer3, p, function22);
                                                    }
                                                    Updater.b(composer3, modifierD2, ComposeUiNode.Companion.d);
                                                    String strB2 = StringResources_androidKt.b(R.string.cost_per_serve_price, new Object[]{Double.valueOf(recipeCostPerServeData3.getPrice())}, composer3);
                                                    Modifier modifierA2 = TestTagKt.a(PaddingKt.g(SizeKt.A(Modifier.Companion.d, (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false), 8, f2), "costPerServePrice");
                                                    composer3.o(5004770);
                                                    boolean zN = composer3.n(strB);
                                                    Object objG4 = composer3.G();
                                                    if (zN || objG4 == Composer.Companion.f1624a) {
                                                        objG4 = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(strB, 13);
                                                        composer3.A(objG4);
                                                    }
                                                    composer3.l();
                                                    TextKt.b(strB2, SemanticsModifierKt.b(modifierA2, false, (Function1) objG4), CoreTheme.b(composer3).e.d.d, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composer3).b.f5125a.f5126a, composer3, 0, 0, 65016);
                                                    composer3.f();
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, composer2));
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -1284372335), 3);
                        }
                        if (!recipeDetailData2.e.isEmpty()) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$5
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        RecipeDetailsFeaturesKt.b(recipeDetailData2.e, TestTagKt.a(PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), "features"), composer2, 48);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 1226707155), 3);
                        }
                        Object obj2 = recipeDetailData2.p;
                        final DynamicSizeCardData dynamicSizeCardData = obj2 instanceof DynamicSizeCardData ? (DynamicSizeCardData) obj2 : null;
                        if ((dynamicSizeCardData instanceof ActionableCard) || ((dynamicSizeCardData instanceof GoogleAdBannerCard) && GoogleAdBannerCardKt.c((GoogleAdBannerCard) dynamicSizeCardData))) {
                            final Function1 function12 = onDynamicSizeCardClicked;
                            final Function1 function13 = onDynamicSizeCardImpression;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$6
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    LazyItemScope item = (LazyItemScope) obj3;
                                    Composer composer2 = (Composer) obj4;
                                    int iIntValue = ((Number) obj5).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        float f = 16;
                                        DynamicSizeCardKt.b(dynamicSizeCardData, PaddingKt.i(SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false), f, 24, f, 4), function12, function13, null, BitmapDescriptorFactory.HUE_RED, composer2, 0, 48);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 960186044), 3);
                        }
                        final MutableIntState mutableIntState2 = mutableIntState;
                        final Function1 function14 = onServesQuantityIncreased;
                        final Function1 function15 = onServesQuantityDecreased;
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$7
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LazyItemScope item = (LazyItemScope) obj3;
                                Composer composer2 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    Modifier modifierH = PaddingKt.h(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 16, 1);
                                    MutableIntState mutableIntState3 = mutableIntState2;
                                    int iD = mutableIntState3.d();
                                    composer2.o(5004770);
                                    Object objG4 = composer2.G();
                                    if (objG4 == Composer.Companion.f1624a) {
                                        objG4 = new au.com.woolworths.feature.product.list.compose.productsearch.b(10, mutableIntState3);
                                        composer2.A(objG4);
                                    }
                                    composer2.l();
                                    RecipeDetailsTabsKt.a(iD, recipeDetailData2, (Function1) objG4, function14, function15, modifierH, composer2, 196992);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -708339434), 3);
                        final Function0 function05 = onShopIngredientClick;
                        LazyListScope.i(LazyColumn, "NON_STICKY_SHOP_INGREDIENT_BUTTON", null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$8
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LazyItemScope item = (LazyItemScope) obj3;
                                Composer composer2 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    Modifier modifierA2 = TestTagKt.a(PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, 7), "shop ingredient non-sticky");
                                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.j, composer2, 6);
                                    int p = composer2.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                    Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierA2);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function06 = ComposeUiNode.Companion.b;
                                    if (composer2.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer2.i();
                                    if (composer2.getO()) {
                                        composer2.K(function06);
                                    } else {
                                        composer2.e();
                                    }
                                    Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function22 = ComposeUiNode.Companion.j;
                                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer2, p, function22);
                                    }
                                    Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                                    final RecipeDetailData recipeDetailData3 = recipeDetailData2;
                                    PrimaryButtonKt.b(function05, null, false, null, ComposableLambdaKt.c(-708595724, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$8$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            RowScope PrimaryButton = (RowScope) obj6;
                                            Composer composer3 = (Composer) obj7;
                                            int iIntValue2 = ((Number) obj8).intValue();
                                            Intrinsics.h(PrimaryButton, "$this$PrimaryButton");
                                            if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                                composer3.j();
                                            } else {
                                                String upperCase = recipeDetailData3.q.f8023a.getLabel().toUpperCase(Locale.ROOT);
                                                Intrinsics.g(upperCase, "toUpperCase(...)");
                                                TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer2), composer2, 24576, 14);
                                    composer2.f();
                                }
                                return Unit.f24250a;
                            }
                        }, true, -137110091), 2);
                        final RecipeNutritionTileData recipeNutritionTileData = recipeDetailData2.l;
                        if (recipeNutritionTileData != null) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$9$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    LazyItemScope item = (LazyItemScope) obj3;
                                    Composer composer2 = (Composer) obj4;
                                    int iIntValue = ((Number) obj5).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        RecipeDetailsNutritionTileKt.b(recipeNutritionTileData, TestTagKt.a(PaddingKt.f(Modifier.Companion.d, 16), "nutrition tile"), composer2, 48);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -1184667815), 3);
                        }
                        if (recipeCostPerServeData != null && (faqBanner = recipeCostPerServeData.getFaqBanner()) != null) {
                            final Function1 function16 = onCostPerServeFaqBannerClick;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$10$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    LazyItemScope item = (LazyItemScope) obj3;
                                    Composer composer2 = (Composer) obj4;
                                    int iIntValue = ((Number) obj5).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        final BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel = faqBanner;
                                        final Function1 function17 = function16;
                                        CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(1350961421, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$10$1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                Composer composer3 = (Composer) obj6;
                                                if ((((Number) obj7).intValue() & 3) == 2 && composer3.c()) {
                                                    composer3.j();
                                                } else {
                                                    BroadcastBannerKt.a(basicCoreBroadcastBannerModel, function17, PaddingKt.g(Modifier.Companion.d, 16, 8), null, null, null, composer3, 392, 56);
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, composer2));
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 163411889), 3);
                        }
                        final HorizontalListData horizontalListData = recipeDetailData2.k;
                        if (horizontalListData != null) {
                            final Function2 function22 = onHorizontalListItemClick;
                            final Function1 function17 = onHorizontalListActionClick;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$1$1$11$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    LazyItemScope item = (LazyItemScope) obj3;
                                    Composer composer2 = (Composer) obj4;
                                    int iIntValue = ((Number) obj5).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        RecipeDetailsContentKt.a(horizontalListData, function22, function17, composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 743530937), 3);
                        }
                        return Unit.f24250a;
                    }
                };
                recipeDetailData = recipeDetailsData;
                function0 = onShopIngredientClick;
                composerImpl.A(function1);
                objG3 = function1;
            } else {
                recipeDetailData = recipeDetailsData;
                composerImpl = composerImplV;
                companion = companion2;
                function0 = onShopIngredientClick;
            }
            composerImpl.V(false);
            ComposerImpl composerImpl3 = composerImpl;
            LazyDslKt.b(modifierA, lazyListState, null, false, null, null, null, false, null, (Function1) objG3, composerImpl3, i7 | 6, 508);
            composerImpl2 = composerImpl3;
            AnimatedVisibilityKt.d(mutableIntState.d() == TabContents.e.ordinal() && !((Boolean) mutableState.getD()).booleanValue(), TestTagKt.a(PaddingKt.f(BoxScopeInstance.f944a.g(companion, Alignment.Companion.h), 16), "shop ingredient sticky"), EnterExitTransitionKt.e(null, 3).b(EnterExitTransitionKt.b(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), (15 & 2) != 0 ? Alignment.Companion.i : Alignment.Companion.h, EnterExitTransitionKt$expandIn$1.h)), EnterExitTransitionKt.j(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), (15 & 2) != 0 ? Alignment.Companion.i : Alignment.Companion.h, EnterExitTransitionKt$shrinkOut$1.h).b(EnterExitTransitionKt.f(null, 3)), null, ComposableLambdaKt.c(765592107, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    final RecipeDetailData recipeDetailData2 = recipeDetailData;
                    PrimaryButtonKt.b(function0, null, false, null, ComposableLambdaKt.c(-535225586, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$2$2.1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            RowScope PrimaryButton = (RowScope) obj4;
                            Composer composer3 = (Composer) obj5;
                            int iIntValue = ((Number) obj6).intValue();
                            Intrinsics.h(PrimaryButton, "$this$PrimaryButton");
                            if ((iIntValue & 17) == 16 && composer3.c()) {
                                composer3.j();
                            } else {
                                String upperCase = recipeDetailData2.q.f8023a.getLabel().toUpperCase(Locale.ROOT);
                                Intrinsics.g(upperCase, "toUpperCase(...)");
                                TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                            }
                            return Unit.f24250a;
                        }
                    }, composer2), composer2, 24576, 14);
                    return Unit.f24250a;
                }
            }, composerImpl2), composerImpl2, 200064, 16);
            composerImpl2.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            final RecipeDetailData recipeDetailData2 = recipeDetailData;
            final Function0 function03 = function0;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    RecipeDetailsContentKt.b(recipeDetailData2, lazyListState, onSaveRecipeClick, onServesQuantityIncreased, onServesQuantityDecreased, onCostPerServeFaqBannerClick, onDynamicSizeCardClicked, onDynamicSizeCardImpression, onHorizontalListItemClick, onHorizontalListActionClick, function03, onVideoPlayClick, modifier, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
