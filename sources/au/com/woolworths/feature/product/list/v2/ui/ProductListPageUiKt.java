package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.v2.ProductListUiState;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListPageUiKt {
    public static final void a(final LazyPagingItems paginatedList, Function1 eventSink, final ProductListUiState uiState, final ProductClickListener productClickListener, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(paginatedList, "paginatedList");
        Intrinsics.h(eventSink, "eventSink");
        Intrinsics.h(uiState, "uiState");
        ComposerImpl composerImplV = composer.v(611759754);
        int i2 = i | (composerImplV.I(paginatedList) ? 4 : 2) | (composerImplV.I(uiState) ? 256 : 128) | (composerImplV.I(productClickListener) ? 2048 : 1024);
        if ((i2 & 1155) == 1154 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier modifierJ = PaddingKt.j(SizeKt.c, BitmapDescriptorFactory.HUE_RED, 20, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            composerImplV.o(-1746271574);
            boolean zI = ((i2 & 14) == 4 || composerImplV.I(paginatedList)) | composerImplV.I(uiState) | composerImplV.I(productClickListener);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1() { // from class: au.com.woolworths.feature.product.list.v2.ui.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                        Intrinsics.h(LazyVerticalGrid, "$this$LazyVerticalGrid");
                        final LazyPagingItems lazyPagingItems = paginatedList;
                        int iB = lazyPagingItems.b();
                        d dVar = new d(4);
                        final ProductListUiState productListUiState = uiState;
                        androidx.navigation.compose.d dVar2 = new androidx.navigation.compose.d(15, lazyPagingItems, productListUiState);
                        final ProductClickListener productClickListener2 = productClickListener;
                        LazyGridScope.h(LazyVerticalGrid, iB, dVar, dVar2, null, new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.v2.ui.ProductListPageUiKt$ProductListPageUi$1$1$3

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            public /* synthetic */ class WhenMappings {
                                static {
                                    int[] iArr = new int[ProductsDisplayMode.values().length];
                                    try {
                                        iArr[0] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        ProductsDisplayMode productsDisplayMode = ProductsDisplayMode.d;
                                        iArr[1] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                }
                            }

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
                                    LazyPagingItems lazyPagingItems2 = lazyPagingItems;
                                    Object objA = lazyPagingItems2.a(iIntValue);
                                    if (objA instanceof ProductCard) {
                                        ProductListUiState productListUiState2 = productListUiState;
                                        ProductsDisplayMode productsDisplayMode = productListUiState2.g;
                                        List list = productListUiState2.i;
                                        int iOrdinal = productsDisplayMode.ordinal();
                                        ProductClickListener productClickListener3 = productClickListener2;
                                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                        if (iOrdinal == 0) {
                                            composer2.o(1226046145);
                                            ProductCardConfig productCardConfig = productListUiState2.h;
                                            ProductCard productCard = (ProductCard) objA;
                                            composer2.o(1849434622);
                                            Object objG2 = composer2.G();
                                            if (objG2 == composer$Companion$Empty$1) {
                                                objG2 = new au.com.woolworths.android.onesite.deeplink.h(20);
                                                composer2.A(objG2);
                                            }
                                            composer2.l();
                                            ProductCardListTileUiKt.a(productCard, productClickListener3, productCardConfig, list, (Function0) objG2, composer2, ProductCard.$stable | 24576 | (ProductCardConfig.$stable << 6), 0);
                                            if (iIntValue < lazyPagingItems2.b() - 1) {
                                                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composer2).e.b.e, composer2, null);
                                            }
                                            composer2.l();
                                        } else {
                                            if (iOrdinal != 1) {
                                                throw au.com.woolworths.android.onesite.a.x(composer2, 1563569730);
                                            }
                                            composer2.o(1226790455);
                                            long j = CoreTheme.b(composer2).e.b.e;
                                            FillElement fillElement = SizeKt.c;
                                            composer2.o(5004770);
                                            boolean zS = composer2.s(j);
                                            Object objG3 = composer2.G();
                                            if (zS || objG3 == composer$Companion$Empty$1) {
                                                objG3 = new au.com.woolworths.feature.product.list.compose.filter.e(j, 2);
                                                composer2.A(objG3);
                                            }
                                            composer2.l();
                                            Modifier modifierB = DrawModifierKt.b(fillElement, (Function1) objG3);
                                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
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
                                            Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                            Function2 function2 = ComposeUiNode.Companion.j;
                                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                                androidx.camera.core.impl.b.z(p, composer2, p, function2);
                                            }
                                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                            ProductCardConfig productCardConfig2 = productListUiState2.h;
                                            ProductCard productCard2 = (ProductCard) objA;
                                            composer2.o(1849434622);
                                            Object objG4 = composer2.G();
                                            if (objG4 == composer$Companion$Empty$1) {
                                                objG4 = new au.com.woolworths.android.onesite.deeplink.h(20);
                                                composer2.A(objG4);
                                            }
                                            composer2.l();
                                            ProductCardGridTileUiKt.a(productCard2, productClickListener3, productCardConfig2, list, null, (Function0) objG4, null, composer2, 196608 | ProductCard.$stable | (ProductCardConfig.$stable << 6), 80);
                                            composer2.f();
                                            composer2.l();
                                        }
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1772672689), 8);
                        LoadState loadState = lazyPagingItems.d().c;
                        if (loadState instanceof LoadState.Loading) {
                            LazyVerticalGrid.f(new d(5), ComposableSingletons$ProductListPageUiKt.f5642a);
                        } else if (!(loadState instanceof LoadState.Error) && !(loadState instanceof LoadState.NotLoading)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyGridDslKt.b(fixed, modifierJ, null, null, false, null, null, null, false, null, (Function1) objG, composerImpl, 48, 0, 1020);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(paginatedList, eventSink, uiState, productClickListener, i, 4);
        }
    }
}
