package au.com.woolworths.feature.product.list.legacy.compose;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.tag.d;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopBarLiftOnScrollElevationKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.compose.e;
import au.com.woolworths.feature.product.list.legacy.ProductListViewModel;
import au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData;
import au.com.woolworths.feature.product.list.legacy.y;
import au.com.woolworths.product.models.ProductCardConfig;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AlternativeProductsPageKt {
    public static final void a(IngredientCardApiData ingredientCardApiData, ProductCardConfig productCardConfig, LazyGridState lazyGridState, Function1 function1, Function2 function2, Function1 function12, Composer composer, int i) {
        int i2;
        Function1 function13;
        Function1 function14;
        GridCells.Fixed fixed;
        boolean z;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1474052349);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(ingredientCardApiData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(productCardConfig) : composerImplV.I(productCardConfig) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(lazyGridState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function13 = function1;
            i2 |= composerImplV.I(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function14 = function12;
            i2 |= composerImplV.I(function14) ? 131072 : 65536;
        } else {
            function14 = function12;
        }
        int i3 = i2;
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnapshotStateMap();
                composerImplV.A(objG);
            }
            SnapshotStateMap snapshotStateMap = (SnapshotStateMap) objG;
            composerImplV.V(false);
            GridCells.Fixed fixed2 = new GridCells.Fixed(2);
            FillElement fillElement = SizeKt.c;
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(ingredientCardApiData) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerImplV.I(productCardConfig))) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                fixed = fixed2;
                Function1 function15 = function14;
                z = false;
                e eVar = new e(ingredientCardApiData, snapshotStateMap, function13, productCardConfig, function2, function15, 1);
                composerImplV.A(eVar);
                objG2 = eVar;
            } else {
                fixed = fixed2;
                z = false;
            }
            composerImplV.V(z);
            composerImpl = composerImplV;
            LazyGridDslKt.b(fixed, fillElement, lazyGridState, null, false, null, null, null, false, null, (Function1) objG2, composerImpl, (i3 & 896) | 48, 0, 1016);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(ingredientCardApiData, productCardConfig, lazyGridState, function1, function2, function12, i, 2);
        }
    }

    public static final void b(final IngredientCardApiData ingredientCard, final Function0 onNavigateUp, final ProductCardConfig productCardConfig, ProductListViewModel productListViewModel, Composer composer, int i) {
        int i2;
        final ProductListViewModel productListViewModel2;
        ComposerImpl composerImpl;
        Intrinsics.h(ingredientCard, "ingredientCard");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(1501553508);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(ingredientCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onNavigateUp) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? composerImplV.n(productCardConfig) : composerImplV.I(productCardConfig) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            productListViewModel2 = productListViewModel;
            i2 |= composerImplV.I(productListViewModel2) ? 2048 : 1024;
        } else {
            productListViewModel2 = productListViewModel;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final LazyGridState lazyGridStateA = LazyGridStateKt.a(0, 3, composerImplV);
            composerImpl = composerImplV;
            ScaffoldKt.a(null, null, ComposableLambdaKt.c(-1149608407, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsPageKt$AlternativeProductsPage$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function0 function0 = onNavigateUp;
                        TopNavBarKt.b(StringResources_androidKt.c(composer2, R.string.product_list_alternative_products_title), null, null, null, 0L, 0L, 0L, null, 0, ComposableLambdaKt.c(-1081995526, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsPageKt$AlternativeProductsPage$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = CloseKt.a();
                                    String strC = StringResources_androidKt.c(composer3, R.string.close_button);
                                    composer3.o(5004770);
                                    Function0 function02 = function0;
                                    boolean zN = composer3.n(function02);
                                    Object objG = composer3.G();
                                    if (zN || objG == Composer.Companion.f1624a) {
                                        objG = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(7, function02);
                                        composer3.A(objG);
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC, (Function0) objG, null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 905969664, 0, 1278);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(576757275, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsPageKt$AlternativeProductsPage$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierD = ComposedModifierKt.d(composer2, companion);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        Object obj4 = Composer.Companion.f1624a;
                        if (objG == obj4) {
                            objG = new y(5);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierD2 = DrawModifierKt.d(modifierE, (Function1) objG);
                        long jB = WxTheme.a(composer2).b();
                        LazyGridState lazyGridState = lazyGridStateA;
                        float fB = TopBarLiftOnScrollElevationKt.b(lazyGridState, composer2);
                        final IngredientCardApiData ingredientCardApiData = ingredientCard;
                        SurfaceKt.a(modifierD2, null, jB, 0L, null, fB, ComposableLambdaKt.c(-289429043, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsPageKt$AlternativeProductsPage$2$1$2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                Composer composer3 = (Composer) obj5;
                                if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    TextKt.b(ingredientCardApiData.d, PaddingKt.g(Modifier.Companion.d, 16, 8), WxTheme.a(composer3).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).n, composer3, 0, 0, 65528);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1572864, 26);
                        composer2.o(5004770);
                        Object obj5 = productListViewModel2;
                        boolean zI = composer2.I(obj5);
                        Object objG2 = composer2.G();
                        if (zI || objG2 == obj4) {
                            objG2 = new androidx.navigation.fragment.e(obj5, 16);
                            composer2.A(objG2);
                        }
                        Function1 function1 = (Function1) objG2;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI2 = composer2.I(obj5);
                        Object objG3 = composer2.G();
                        if (zI2 || objG3 == obj4) {
                            objG3 = new au.com.woolworths.design.core.ui.component.experimental.chip.e(obj5, 6);
                            composer2.A(objG3);
                        }
                        Function2 function22 = (Function2) objG3;
                        composer2.l();
                        composer2.o(-1746271574);
                        Object obj6 = onNavigateUp;
                        boolean zN = composer2.n(obj6) | composer2.I(obj5) | composer2.I(ingredientCardApiData);
                        Object objG4 = composer2.G();
                        if (zN || objG4 == obj4) {
                            objG4 = new androidx.lifecycle.compose.b(6, obj6, obj5, ingredientCardApiData);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        int i3 = ProductCardConfig.$stable << 3;
                        AlternativeProductsPageKt.a(ingredientCardApiData, productCardConfig, lazyGridState, function1, function22, (Function1) objG4, composer2, i3);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, KyberEngine.KyberPolyBytes, 1019);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(ingredientCard, onNavigateUp, productCardConfig, productListViewModel, i, 2);
        }
    }
}
