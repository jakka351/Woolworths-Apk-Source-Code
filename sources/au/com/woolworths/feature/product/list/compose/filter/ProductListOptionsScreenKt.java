package au.com.woolworths.feature.product.list.compose.filter;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.ProductListOptionsViewModel;
import au.com.woolworths.feature.product.list.ProductsDisplayMode;
import au.com.woolworths.feature.product.list.ui.ProductListOptionsItem;
import au.com.woolworths.feature.product.list.ui.ProductListOptionsSortOptionItem;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsContract$ViewState;", "viewState", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListOptionsScreenKt {
    public static final void a(final ProductListOptionsContract.ViewState viewState, final Function1 onFilterItemClicked, final Function1 onEverydayMarketSwitchClicked, final Function1 onSortOptionSelected, final Function0 onGetVisibleSortOptions, final Function0 onMarketplaceCtaClicked, Function0 onSeeResultButtonClick, final Function1 onDisplayModeClicked, final Function0 onCardDismissed, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onFilterItemClicked, "onFilterItemClicked");
        Intrinsics.h(onEverydayMarketSwitchClicked, "onEverydayMarketSwitchClicked");
        Intrinsics.h(onSortOptionSelected, "onSortOptionSelected");
        Intrinsics.h(onGetVisibleSortOptions, "onGetVisibleSortOptions");
        Intrinsics.h(onMarketplaceCtaClicked, "onMarketplaceCtaClicked");
        Intrinsics.h(onSeeResultButtonClick, "onSeeResultButtonClick");
        Intrinsics.h(onDisplayModeClicked, "onDisplayModeClicked");
        Intrinsics.h(onCardDismissed, "onCardDismissed");
        ComposerImpl composerImplV = composer.v(1159960418);
        int i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onFilterItemClicked) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onEverydayMarketSwitchClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onSortOptionSelected) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onGetVisibleSortOptions) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onMarketplaceCtaClicked) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onSeeResultButtonClick) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(onDisplayModeClicked) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.I(onCardDismissed) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if ((38347923 & i3) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ProductListOptionsContentSkeletonKt.a(viewState, onSeeResultButtonClick, ComposableLambdaKt.c(-2142996886, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptions$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ProductListOptionsContentSkeleton = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ProductListOptionsContentSkeleton, "$this$ProductListOptionsContentSkeleton");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(ProductListOptionsContentSkeleton) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierA = ProductListOptionsContentSkeleton.a(SizeKt.e(Modifier.Companion.d, 1.0f), 1.0f, true);
                        GridCells.Adaptive adaptive = new GridCells.Adaptive(140);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        float f = 8;
                        Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
                        Arrangement.SpacedAligned spacedAlignedG2 = Arrangement.g(f);
                        composer2.o(-1224400529);
                        boolean zI = composer2.I(viewState) | composer2.n(onDisplayModeClicked) | composer2.n(onCardDismissed) | composer2.n(onFilterItemClicked) | composer2.n(onEverydayMarketSwitchClicked) | composer2.n(onMarketplaceCtaClicked) | composer2.n(onGetVisibleSortOptions) | composer2.n(onSortOptionSelected);
                        Object objG = composer2.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            final ProductListOptionsContract.ViewState viewState2 = viewState;
                            final Function1 function1 = onDisplayModeClicked;
                            final Function0 function0 = onCardDismissed;
                            final Function1 function12 = onFilterItemClicked;
                            final Function1 function13 = onEverydayMarketSwitchClicked;
                            final Function0 function02 = onMarketplaceCtaClicked;
                            final Function0 function03 = onGetVisibleSortOptions;
                            final Function1 function14 = onSortOptionSelected;
                            Function1 function15 = new Function1() { // from class: au.com.woolworths.feature.product.list.compose.filter.j
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    LazyGridScope LazyVerticalGrid = (LazyGridScope) obj4;
                                    Intrinsics.h(LazyVerticalGrid, "$this$LazyVerticalGrid");
                                    for (ProductListOptionsItem productListOptionsItem : viewState2.e) {
                                        if (productListOptionsItem instanceof ProductListOptionsItem.DisplayMode) {
                                            final List listR = CollectionsKt.R(ProductsDisplayMode.e, ProductsDisplayMode.d);
                                            int size = listR.size();
                                            Function1<Integer, Object> function16 = new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptions$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$4
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj5) {
                                                    listR.get(((Number) obj5).intValue());
                                                    return null;
                                                }
                                            };
                                            final ProductListOptionsItem.DisplayMode displayMode = (ProductListOptionsItem.DisplayMode) productListOptionsItem;
                                            final Function1 function17 = function1;
                                            LazyVerticalGrid.d(size, null, null, function16, new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptions$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$5
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(4);
                                                }

                                                @Override // kotlin.jvm.functions.Function4
                                                public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                    int i4;
                                                    LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj5;
                                                    int iIntValue2 = ((Number) obj6).intValue();
                                                    Composer composer3 = (Composer) obj7;
                                                    int iIntValue3 = ((Number) obj8).intValue();
                                                    if ((iIntValue3 & 6) == 0) {
                                                        i4 = (composer3.n(lazyGridItemScope) ? 4 : 2) | iIntValue3;
                                                    } else {
                                                        i4 = iIntValue3;
                                                    }
                                                    if ((iIntValue3 & 48) == 0) {
                                                        i4 |= composer3.r(iIntValue2) ? 32 : 16;
                                                    }
                                                    if (composer3.z(i4 & 1, (i4 & 147) != 146)) {
                                                        ProductsDisplayMode productsDisplayMode = (ProductsDisplayMode) listR.get(iIntValue2);
                                                        composer3.o(-500256870);
                                                        DisplayModeItemKt.a(productsDisplayMode, productsDisplayMode == displayMode.f5391a, function17, composer3, 0);
                                                        composer3.l();
                                                    } else {
                                                        composer3.j();
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, 699646206));
                                        } else if (Intrinsics.c(productListOptionsItem, ProductListOptionsItem.FilterCard.f5392a)) {
                                            a aVar = new a(4);
                                            final Function0 function04 = function0;
                                            LazyVerticalGrid.f(aVar, new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptions$1$1$1$1$3
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    LazyGridItemScope item = (LazyGridItemScope) obj5;
                                                    Composer composer3 = (Composer) obj6;
                                                    int iIntValue2 = ((Number) obj7).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                                        composer3.j();
                                                    } else {
                                                        FilterCardItemKt.a(function04, composer3, 0);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, -2119986420));
                                        } else if (productListOptionsItem instanceof ProductListOptionsItem.FilterOptionItem) {
                                            a aVar2 = new a(5);
                                            final ProductListOptionsItem.FilterOptionItem filterOptionItem = (ProductListOptionsItem.FilterOptionItem) productListOptionsItem;
                                            final Function1 function18 = function12;
                                            LazyVerticalGrid.f(aVar2, new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptions$1$1$1$1$5
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    LazyGridItemScope item = (LazyGridItemScope) obj5;
                                                    Composer composer3 = (Composer) obj6;
                                                    int iIntValue2 = ((Number) obj7).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                                        composer3.j();
                                                    } else {
                                                        FilterItemKt.a(filterOptionItem, function18, composer3, 0);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, 1769693099));
                                        } else if (productListOptionsItem instanceof ProductListOptionsItem.SortOptionsInsetBanner) {
                                            final ProductListOptionsItem.SortOptionsInsetBanner sortOptionsInsetBanner = (ProductListOptionsItem.SortOptionsInsetBanner) productListOptionsItem;
                                            LazyVerticalGrid.f(new a(6), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptions$1$1$1$1$7
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    LazyGridItemScope item = (LazyGridItemScope) obj5;
                                                    Composer composer3 = (Composer) obj6;
                                                    int iIntValue2 = ((Number) obj7).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                                        composer3.j();
                                                    } else {
                                                        InsetBannerData insetBannerData = sortOptionsInsetBanner.f5396a;
                                                        composer3.o(1849434622);
                                                        Object objG2 = composer3.G();
                                                        if (objG2 == Composer.Companion.f1624a) {
                                                            objG2 = new a(9);
                                                            composer3.A(objG2);
                                                        }
                                                        composer3.l();
                                                        InsetBannerUiKt.b(insetBannerData, null, false, (Function1) objG2, composer3, 24576, 14);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, 1364405322));
                                        } else if (productListOptionsItem instanceof ProductListOptionsItem.Header) {
                                            final ProductListOptionsItem.Header header = (ProductListOptionsItem.Header) productListOptionsItem;
                                            LazyVerticalGrid.f(new a(7), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptions$1$1$1$1$9
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    LazyGridItemScope item = (LazyGridItemScope) obj5;
                                                    Composer composer3 = (Composer) obj6;
                                                    int iIntValue2 = ((Number) obj7).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                                        composer3.j();
                                                    } else {
                                                        HeadingKt.a(StringResources_androidKt.c(composer3, header.f5394a), composer3, 0);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, 959117545));
                                        } else if (productListOptionsItem instanceof ProductListOptionsItem.MarketplaceSwitch) {
                                            a aVar3 = new a(8);
                                            final ProductListOptionsItem.MarketplaceSwitch marketplaceSwitch = (ProductListOptionsItem.MarketplaceSwitch) productListOptionsItem;
                                            final Function1 function19 = function13;
                                            final Function0 function05 = function02;
                                            LazyVerticalGrid.f(aVar3, new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptions$1$1$1$1$11
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    LazyGridItemScope item = (LazyGridItemScope) obj5;
                                                    Composer composer3 = (Composer) obj6;
                                                    int iIntValue2 = ((Number) obj7).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                                        composer3.j();
                                                    } else {
                                                        EverydayMarketSwitchKt.a(marketplaceSwitch.f5395a, function19, function05, composer3, 0);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, 553829768));
                                        } else {
                                            if (!(productListOptionsItem instanceof ProductListOptionsItem.SortOptionsSection)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            final List list = ((ProductListOptionsItem.SortOptionsSection) productListOptionsItem).f5397a;
                                            int size2 = list.size();
                                            Function1<Integer, Object> function110 = new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptions$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$9
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj5) {
                                                    list.get(((Number) obj5).intValue());
                                                    return null;
                                                }
                                            };
                                            final Function0 function06 = function03;
                                            final Function1 function111 = function14;
                                            LazyVerticalGrid.d(size2, null, null, function110, new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptions$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$10
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(4);
                                                }

                                                @Override // kotlin.jvm.functions.Function4
                                                public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                    int i4;
                                                    LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj5;
                                                    int iIntValue2 = ((Number) obj6).intValue();
                                                    Composer composer3 = (Composer) obj7;
                                                    int iIntValue3 = ((Number) obj8).intValue();
                                                    if ((iIntValue3 & 6) == 0) {
                                                        i4 = (composer3.n(lazyGridItemScope) ? 4 : 2) | iIntValue3;
                                                    } else {
                                                        i4 = iIntValue3;
                                                    }
                                                    if ((iIntValue3 & 48) == 0) {
                                                        i4 |= composer3.r(iIntValue2) ? 32 : 16;
                                                    }
                                                    if (composer3.z(i4 & 1, (i4 & 147) != 146)) {
                                                        ProductListOptionsSortOptionItem productListOptionsSortOptionItem = (ProductListOptionsSortOptionItem) list.get(iIntValue2);
                                                        composer3.o(584458390);
                                                        FilterSortItemKt.a(productListOptionsSortOptionItem, function06, function111, composer3, 0);
                                                        composer3.l();
                                                    } else {
                                                        composer3.j();
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, 699646206));
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(function15);
                            objG = function15;
                        }
                        composer2.l();
                        LazyGridDslKt.b(adaptive, modifierA, null, null, false, spacedAlignedG, spacedAlignedG2, null, false, null, (Function1) objG, composer2, 1769472, 0, 924);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i3 & 14) | KyberEngine.KyberPolyBytes | ((i3 >> 15) & 112));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(viewState, onFilterItemClicked, onEverydayMarketSwitchClicked, onSortOptionSelected, onGetVisibleSortOptions, onMarketplaceCtaClicked, onSeeResultButtonClick, onDisplayModeClicked, onCardDismissed, i, 0);
        }
    }

    public static final void b(final ProductListOptionsViewModel viewModel, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(1216668209);
        if (((i | (composerImplV.I(viewModel) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final MutableState mutableStateA = FlowExtKt.a(viewModel.j, composerImplV);
            ScaffoldState scaffoldStateD = ScaffoldKt.d(null, composerImplV, 3);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            au.com.woolworths.design.wx.component.ScaffoldKt.a(SizeKt.c, scaffoldStateD, ComposableLambdaKt.c(966685132, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptionsScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.product_list_filter);
                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                        final ProductListOptionsViewModel productListOptionsViewModel = viewModel;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-732013093, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptionsScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = CloseKt.a();
                                    String strC2 = StringResources_androidKt.c(composer3, R.string.back);
                                    long jH = WxTheme.a(composer3).h();
                                    composer3.o(5004770);
                                    ProductListOptionsViewModel productListOptionsViewModel2 = productListOptionsViewModel;
                                    boolean zI = composer3.I(productListOptionsViewModel2);
                                    Object objG = composer3.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new k(productListOptionsViewModel2, 0);
                                        composer3.A(objG);
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC2, (Function0) objG, null, false, jH, composer3, 0, 24);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final State state = mutableStateA;
                        TopNavBarKt.b(strC, modifierE, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, composableLambdaImplC, ComposableLambdaKt.c(2144414209, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptionsScreen$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    State state2 = state;
                                    boolean z = ((ProductListOptionsContract.ViewState) state2.getD()).f5258a ? false : ((ProductListOptionsContract.ViewState) state2.getD()).g;
                                    composer3.o(5004770);
                                    ProductListOptionsViewModel productListOptionsViewModel2 = productListOptionsViewModel;
                                    boolean zI = composer3.I(productListOptionsViewModel2);
                                    Object objG = composer3.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        ProductListOptionsScreenKt$ProductListOptionsScreen$1$2$1$1 productListOptionsScreenKt$ProductListOptionsScreen$1$2$1$1 = new ProductListOptionsScreenKt$ProductListOptionsScreen$1$2$1$1(0, productListOptionsViewModel2, ProductListOptionsViewModel.class, "onResetFilterClicked", "onResetFilterClicked()V", 0);
                                        composer3.A(productListOptionsScreenKt$ProductListOptionsScreen$1$2$1$1);
                                        objG = productListOptionsScreenKt$ProductListOptionsScreen$1$2$1$1;
                                    }
                                    composer3.l();
                                    ButtonKt.c((Function0) ((KFunction) objG), null, z, null, null, null, null, null, ComposableSingletons$ProductListOptionsScreenKt.f5268a, composer3, 805306368, 506);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306416, 6, 508);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(-167784038, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt$ProductListOptionsScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProductListOptionsContract.ViewState viewState = (ProductListOptionsContract.ViewState) mutableStateA.getD();
                        composer2.o(5004770);
                        ProductListOptionsViewModel productListOptionsViewModel = viewModel;
                        boolean zI = composer2.I(productListOptionsViewModel);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zI || objG == composer$Companion$Empty$1) {
                            ProductListOptionsScreenKt$ProductListOptionsScreen$2$1$1 productListOptionsScreenKt$ProductListOptionsScreen$2$1$1 = new ProductListOptionsScreenKt$ProductListOptionsScreen$2$1$1(1, productListOptionsViewModel, ProductListOptionsViewModel.class, "onFilterOptionClicked", "onFilterOptionClicked(Ljava/lang/String;)V", 0);
                            composer2.A(productListOptionsScreenKt$ProductListOptionsScreen$2$1$1);
                            objG = productListOptionsScreenKt$ProductListOptionsScreen$2$1$1;
                        }
                        KFunction kFunction = (KFunction) objG;
                        composer2.l();
                        composer2.o(5004770);
                        ProductListOptionsViewModel productListOptionsViewModel2 = viewModel;
                        boolean zI2 = composer2.I(productListOptionsViewModel2);
                        Object objG2 = composer2.G();
                        if (zI2 || objG2 == composer$Companion$Empty$1) {
                            ProductListOptionsScreenKt$ProductListOptionsScreen$2$2$1 productListOptionsScreenKt$ProductListOptionsScreen$2$2$1 = new ProductListOptionsScreenKt$ProductListOptionsScreen$2$2$1(1, productListOptionsViewModel2, ProductListOptionsViewModel.class, "onMarketplaceCheckedChanged", "onMarketplaceCheckedChanged(Z)V", 0);
                            composer2.A(productListOptionsScreenKt$ProductListOptionsScreen$2$2$1);
                            objG2 = productListOptionsScreenKt$ProductListOptionsScreen$2$2$1;
                        }
                        KFunction kFunction2 = (KFunction) objG2;
                        composer2.l();
                        composer2.o(5004770);
                        ProductListOptionsViewModel productListOptionsViewModel3 = viewModel;
                        boolean zI3 = composer2.I(productListOptionsViewModel3);
                        Object objG3 = composer2.G();
                        if (zI3 || objG3 == composer$Companion$Empty$1) {
                            ProductListOptionsScreenKt$ProductListOptionsScreen$2$3$1 productListOptionsScreenKt$ProductListOptionsScreen$2$3$1 = new ProductListOptionsScreenKt$ProductListOptionsScreen$2$3$1(0, productListOptionsViewModel3, ProductListOptionsViewModel.class, "onMarketplaceCtaClicked", "onMarketplaceCtaClicked()V", 0);
                            composer2.A(productListOptionsScreenKt$ProductListOptionsScreen$2$3$1);
                            objG3 = productListOptionsScreenKt$ProductListOptionsScreen$2$3$1;
                        }
                        KFunction kFunction3 = (KFunction) objG3;
                        composer2.l();
                        composer2.o(5004770);
                        ProductListOptionsViewModel productListOptionsViewModel4 = viewModel;
                        boolean zI4 = composer2.I(productListOptionsViewModel4);
                        Object objG4 = composer2.G();
                        if (zI4 || objG4 == composer$Companion$Empty$1) {
                            ProductListOptionsScreenKt$ProductListOptionsScreen$2$4$1 productListOptionsScreenKt$ProductListOptionsScreen$2$4$1 = new ProductListOptionsScreenKt$ProductListOptionsScreen$2$4$1(0, productListOptionsViewModel4, ProductListOptionsViewModel.class, "onGetVisibleSortOptions", "onGetVisibleSortOptions()V", 0);
                            composer2.A(productListOptionsScreenKt$ProductListOptionsScreen$2$4$1);
                            objG4 = productListOptionsScreenKt$ProductListOptionsScreen$2$4$1;
                        }
                        KFunction kFunction4 = (KFunction) objG4;
                        composer2.l();
                        composer2.o(5004770);
                        ProductListOptionsViewModel productListOptionsViewModel5 = viewModel;
                        boolean zI5 = composer2.I(productListOptionsViewModel5);
                        Object objG5 = composer2.G();
                        if (zI5 || objG5 == composer$Companion$Empty$1) {
                            ProductListOptionsScreenKt$ProductListOptionsScreen$2$5$1 productListOptionsScreenKt$ProductListOptionsScreen$2$5$1 = new ProductListOptionsScreenKt$ProductListOptionsScreen$2$5$1(1, productListOptionsViewModel5, ProductListOptionsViewModel.class, "onSortOptionSelected", "onSortOptionSelected(Ljava/lang/String;)V", 0);
                            composer2.A(productListOptionsScreenKt$ProductListOptionsScreen$2$5$1);
                            objG5 = productListOptionsScreenKt$ProductListOptionsScreen$2$5$1;
                        }
                        KFunction kFunction5 = (KFunction) objG5;
                        composer2.l();
                        composer2.o(5004770);
                        ProductListOptionsViewModel productListOptionsViewModel6 = viewModel;
                        boolean zI6 = composer2.I(productListOptionsViewModel6);
                        Object objG6 = composer2.G();
                        if (zI6 || objG6 == composer$Companion$Empty$1) {
                            ProductListOptionsScreenKt$ProductListOptionsScreen$2$6$1 productListOptionsScreenKt$ProductListOptionsScreen$2$6$1 = new ProductListOptionsScreenKt$ProductListOptionsScreen$2$6$1(1, productListOptionsViewModel6, ProductListOptionsViewModel.class, "onDisplayModeClicked", "onDisplayModeClicked(Lau/com/woolworths/feature/product/list/ProductsDisplayMode;)V", 0);
                            composer2.A(productListOptionsScreenKt$ProductListOptionsScreen$2$6$1);
                            objG6 = productListOptionsScreenKt$ProductListOptionsScreen$2$6$1;
                        }
                        KFunction kFunction6 = (KFunction) objG6;
                        composer2.l();
                        composer2.o(5004770);
                        ProductListOptionsViewModel productListOptionsViewModel7 = viewModel;
                        boolean zI7 = composer2.I(productListOptionsViewModel7);
                        Object objG7 = composer2.G();
                        if (zI7 || objG7 == composer$Companion$Empty$1) {
                            objG7 = new ProductListOptionsScreenKt$ProductListOptionsScreen$2$7$1(0, productListOptionsViewModel7, ProductListOptionsViewModel.class, "onCardDismissed", "onCardDismissed()V", 0);
                            composer2.A(objG7);
                        }
                        KFunction kFunction7 = (KFunction) objG7;
                        composer2.l();
                        Function1 function1 = (Function1) kFunction;
                        Function1 function12 = (Function1) kFunction2;
                        Function1 function13 = (Function1) kFunction5;
                        Function0 function0 = (Function0) kFunction4;
                        Function0 function02 = (Function0) kFunction3;
                        composer2.o(5004770);
                        ProductListOptionsViewModel productListOptionsViewModel8 = viewModel;
                        boolean zI8 = composer2.I(productListOptionsViewModel8);
                        Object objG8 = composer2.G();
                        if (zI8 || objG8 == composer$Companion$Empty$1) {
                            objG8 = new k(productListOptionsViewModel8, 1);
                            composer2.A(objG8);
                        }
                        composer2.l();
                        ProductListOptionsScreenKt.a(viewState, function1, function12, function13, function0, function02, (Function0) objG8, (Function1) kFunction6, (Function0) kFunction7, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 390, 1016);
            composerImpl = composerImplV;
            composerImpl.o(-1746271574);
            boolean zI = composerImpl.I(viewModel) | composerImpl.n(scaffoldStateD) | composerImpl.I(context);
            Object objG = composerImpl.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new ProductListOptionsScreenKt$ProductListOptionsScreen$3$1(viewModel, scaffoldStateD, context, null);
                composerImpl.A(objG);
            }
            composerImpl.V(false);
            EffectsKt.e(composerImpl, Unit.f24250a, (Function2) objG);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.e(i, 5, viewModel);
        }
    }
}
