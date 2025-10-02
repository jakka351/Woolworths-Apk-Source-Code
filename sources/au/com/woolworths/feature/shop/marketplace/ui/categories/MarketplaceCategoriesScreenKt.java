package au.com.woolworths.feature.shop.marketplace.ui.categories;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceCategories;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceCategory;
import au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesContract;
import au.com.woolworths.feature.shop.marketplace.ui.facet.ErrorScreenKt;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesContract$ViewState;", "viewState", "marketplace_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceCategoriesScreenKt {
    public static final void a(MarketplaceCategoriesViewModel viewModel, Composer composer, int i) {
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(2117827145);
        int i2 = (composerImplV.I(viewModel) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MutableState mutableStateA = FlowExtKt.a(viewModel.j, composerImplV);
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            MarketplaceCategoriesContract.ViewState viewState = (MarketplaceCategoriesContract.ViewState) mutableStateA.getD();
            MarketplaceErrorState marketplaceErrorState = viewState.c;
            MarketplaceCategories marketplaceCategories = viewState.b;
            if (marketplaceErrorState != null) {
                composerImplV.o(2123015141);
                MarketplaceErrorState marketplaceErrorState2 = viewState.c;
                composerImplV.o(5004770);
                boolean zI = composerImplV.I(viewModel);
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    MarketplaceCategoriesScreenKt$MarketplaceCategoriesScreen$1$1$1 marketplaceCategoriesScreenKt$MarketplaceCategoriesScreen$1$1$1 = new MarketplaceCategoriesScreenKt$MarketplaceCategoriesScreen$1$1$1(0, viewModel, MarketplaceCategoriesViewModel.class, "onSecondaryActionClicked", "onSecondaryActionClicked()V", 0);
                    composerImplV.A(marketplaceCategoriesScreenKt$MarketplaceCategoriesScreen$1$1$1);
                    objG = marketplaceCategoriesScreenKt$MarketplaceCategoriesScreen$1$1$1;
                }
                composerImplV.V(false);
                ErrorScreenKt.a(marketplaceErrorState2, (Function0) ((KFunction) objG), composerImplV, 0);
                composerImplV.V(false);
            } else if (viewState.f7483a) {
                composerImplV.o(2123018526);
                ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e));
                composerImplV.V(false);
            } else if (marketplaceCategories != null) {
                composerImplV.o(2123021688);
                b(marketplaceCategories, viewModel, composerImplV, (i2 << 3) & 112);
                composerImplV.V(false);
            } else {
                composerImplV.o(1389285247);
                composerImplV.V(false);
            }
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 4, viewModel);
        }
    }

    public static final void b(final MarketplaceCategories content, final MarketplaceCategoriesListener listener, Composer composer, int i) {
        int i2;
        Intrinsics.h(content, "content");
        Intrinsics.h(listener, "listener");
        ComposerImpl composerImplV = composer.v(-1023028636);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(listener) : composerImplV.I(listener) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final List listW = CollectionsKt.w(content.e);
            Modifier modifierF = PaddingKt.f(Modifier.Companion.d, 12);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            PaddingValuesImpl paddingValuesImplB = PaddingKt.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, WindowInsetsKt.d(WindowInsets_androidKt.c(composerImplV), composerImplV).getD(), 7);
            composerImplV.o(-1746271574);
            boolean zI = ((i2 & 112) == 32 || ((i2 & 64) != 0 && composerImplV.I(listener))) | composerImplV.I(listW) | composerImplV.I(content);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1() { // from class: au.com.woolworths.feature.shop.marketplace.ui.categories.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                        Intrinsics.h(LazyVerticalGrid, "$this$LazyVerticalGrid");
                        final List list = listW;
                        int size = list.size();
                        d dVar = new d(list, 0);
                        au.com.woolworths.feature.shop.homepage.presentation.modeselector.d dVar2 = new au.com.woolworths.feature.shop.homepage.presentation.modeselector.d(25);
                        final MarketplaceCategoriesListener marketplaceCategoriesListener = listener;
                        final MarketplaceCategories marketplaceCategories = content;
                        LazyGridScope.h(LazyVerticalGrid, size, dVar, null, dVar2, new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesScreenKt$MarketplaceCategoriesUi$1$1$3
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                LazyGridItemScope items = (LazyGridItemScope) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                Intrinsics.h(items, "$this$items");
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= composer2.r(iIntValue) ? 32 : 16;
                                }
                                if ((iIntValue2 & 145) == 144 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    MarketplaceCategory marketplaceCategory = (MarketplaceCategory) list.get(iIntValue);
                                    String str = marketplaceCategory.b;
                                    String str2 = marketplaceCategory.c;
                                    composer2.o(-1746271574);
                                    MarketplaceCategoriesListener marketplaceCategoriesListener2 = marketplaceCategoriesListener;
                                    boolean zI2 = composer2.I(marketplaceCategoriesListener2) | composer2.n(marketplaceCategory);
                                    MarketplaceCategories marketplaceCategories2 = marketplaceCategories;
                                    boolean zI3 = zI2 | composer2.I(marketplaceCategories2);
                                    Object objG2 = composer2.G();
                                    if (zI3 || objG2 == Composer.Companion.f1624a) {
                                        objG2 = new a(marketplaceCategoriesListener2, marketplaceCategory, marketplaceCategories2, 1);
                                        composer2.A(objG2);
                                    }
                                    composer2.l();
                                    CategoryTileKt.a(str, str2, (Function0) objG2, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1208977513), 4);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyGridDslKt.b(fixed, modifierF, null, paddingValuesImplB, false, null, null, null, false, null, (Function1) objG, composerImplV, 48, 0, 1012);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(content, i, 10, listener);
        }
    }
}
