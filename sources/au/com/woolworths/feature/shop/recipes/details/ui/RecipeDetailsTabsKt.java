package au.com.woolworths.feature.shop.recipes.details.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TabKt;
import androidx.compose.material.TabPosition;
import androidx.compose.material.TabRowDefaults;
import androidx.compose.material.TabRowKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.shop.recipes.details.data.IngredientsSectionData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData;
import au.com.woolworths.feature.shop.recipes.details.data.TabContents;
import au.com.woolworths.shop.aem.components.ui.method.MethodUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipe-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeDetailsTabsKt {
    public static final void a(final int i, RecipeDetailData recipeDetailData, final Function1 onTabClick, Function1 onServesQuantityIncreased, Function1 onServesQuantityDecreased, Modifier modifier, Composer composer, int i2) {
        int i3;
        Intrinsics.h(recipeDetailData, "recipeDetailData");
        Intrinsics.h(onTabClick, "onTabClick");
        Intrinsics.h(onServesQuantityIncreased, "onServesQuantityIncreased");
        Intrinsics.h(onServesQuantityDecreased, "onServesQuantityDecreased");
        ComposerImpl composerImplV = composer.v(1542933550);
        int i4 = i2 | (composerImplV.r(i) ? 4 : 2) | (composerImplV.I(recipeDetailData) ? 32 : 16) | (composerImplV.I(onServesQuantityIncreased) ? 2048 : 1024) | (composerImplV.I(onServesQuantityDecreased) ? 16384 : 8192);
        if ((i4 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
            i3 = i;
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            TabRowKt.b(i, PaddingKt.f(companion, f), WxTheme.a(composerImplV).a(), WxTheme.a(composerImplV).c(), ComposableLambdaKt.c(385252832, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsTabsKt$RecipeDetailsTabs$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    List tabPositions = (List) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(tabPositions, "tabPositions");
                    TabRowDefaults.f1337a.b(BitmapDescriptorFactory.HUE_RED, 0, 2, WxTheme.a(composer2).h(), composer2, TabRowDefaults.c((TabPosition) tabPositions.get(i)));
                    return Unit.f24250a;
                }
            }, composerImplV), null, ComposableLambdaKt.c(-243102752, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsTabsKt$RecipeDetailsTabs$1$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        for (final TabContents tabContents : TabContents.values()) {
                            int iOrdinal = TabContents.valueOf(tabContents.name()).ordinal();
                            Modifier modifierA = TestTagKt.a(IntrinsicKt.b(SizeKt.g(Modifier.Companion.d, 48), IntrinsicSize.e), tabContents.name());
                            boolean z = i == iOrdinal;
                            long jH = WxTheme.a(composer2).h();
                            long jF = WxTheme.a(composer2).f();
                            composer2.o(-1633490746);
                            Function1 function1 = onTabClick;
                            boolean zN = composer2.n(function1) | composer2.r(iOrdinal);
                            Object objG = composer2.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons.b(iOrdinal, 2, function1);
                                composer2.A(objG);
                            }
                            composer2.l();
                            TabKt.b(z, (Function0) objG, modifierA, false, jH, jF, ComposableLambdaKt.c(-1949224747, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsTabsKt$RecipeDetailsTabs$1$2$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    ColumnScope Tab = (ColumnScope) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int iIntValue = ((Number) obj5).intValue();
                                    Intrinsics.h(Tab, "$this$Tab");
                                    if ((iIntValue & 17) == 16 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        TextKt.b(StringResources_androidKt.c(composer3, tabContents.d), PaddingKt.f(Modifier.Companion.d, 8), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).o, composer3, 48, 0, 65532);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 12582912, 24);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i4 & 14) | 1597488, 32);
            i3 = i;
            if (i3 == TabContents.e.ordinal()) {
                composerImplV.o(343802104);
                IngredientsSectionData ingredientsSectionData = recipeDetailData.h;
                if (ingredientsSectionData != null) {
                    Modifier modifierH = PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2);
                    int i6 = i4 >> 6;
                    RecipeDetailsIngredientTabKt.a(ingredientsSectionData, onServesQuantityIncreased, onServesQuantityDecreased, modifierH, composerImplV, (i6 & 112) | 3072 | (i6 & 896));
                }
                composerImplV.V(false);
            } else if (i3 == TabContents.f.ordinal()) {
                composerImplV.o(2068438910);
                MethodUiKt.b(recipeDetailData.j, null, composerImplV, 8);
                composerImplV.V(false);
            } else {
                composerImplV.o(2068552618);
                composerImplV.V(false);
            }
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(i3, recipeDetailData, onTabClick, onServesQuantityIncreased, onServesQuantityDecreased, modifier, i2);
        }
    }
}
