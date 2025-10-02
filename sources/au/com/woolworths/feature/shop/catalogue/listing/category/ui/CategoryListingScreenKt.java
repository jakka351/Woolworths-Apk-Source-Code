package au.com.woolworths.feature.shop.catalogue.listing.category.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.compose.utils.extensions.ColorExtKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.bundles.ui.k;
import au.com.woolworths.feature.shop.catalogue.common.ui.BottomSheetResultKt;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingContract;
import au.com.woolworths.feature.shop.catalogue.listing.category.model.ListingHeader;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shared.ui.compose.shop.CartIconButtonKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import me.onebone.toolbar.CollapsingToolbarScaffoldKt;
import me.onebone.toolbar.CollapsingToolbarScaffoldScope;
import me.onebone.toolbar.CollapsingToolbarScaffoldState;
import me.onebone.toolbar.CollapsingToolbarScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "collapsed", "catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CategoryListingScreenKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6879a = ColorKt.b(1140850688);
    public static final float b = 160;
    public static final float c = 56;

    public static final void a(final CategoryListingContract.ViewState viewState, final Function0 onNavigateUp, final Function0 onCartButton, final ProductClickListener productClickListener, Function0 onSnackbarDismissed, Function1 onViewShoppingListAction, Composer composer, int i) {
        CombinedLoadStates combinedLoadStatesD;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onCartButton, "onCartButton");
        Intrinsics.h(productClickListener, "productClickListener");
        Intrinsics.h(onSnackbarDismissed, "onSnackbarDismissed");
        Intrinsics.h(onViewShoppingListAction, "onViewShoppingListAction");
        ComposerImpl composerImplV = composer.v(160675806);
        int i2 = i | (composerImplV.I(viewState) ? 4 : 2) | (composerImplV.I(onNavigateUp) ? 32 : 16) | (composerImplV.I(onCartButton) ? 256 : 128) | (composerImplV.I(productClickListener) ? 2048 : 1024) | (composerImplV.I(onSnackbarDismissed) ? 16384 : 8192) | (composerImplV.I(onViewShoppingListAction) ? 131072 : 65536);
        if ((i2 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final CollapsingToolbarScaffoldState collapsingToolbarScaffoldStateB = CollapsingToolbarScaffoldKt.b(null, composerImplV, 1);
            Flow flow = viewState.e;
            composerImplV.o(-209360200);
            final LazyPagingItems lazyPagingItemsA = flow == null ? null : LazyPagingItemsKt.a(flow, composerImplV);
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            Object obj = Composer.Companion.f1624a;
            if (objD == obj) {
                objD = new FocusRequester();
                composerImplV.A(objD);
            }
            final FocusRequester focusRequester = (FocusRequester) objD;
            composerImplV.V(false);
            FillElement fillElement = SizeKt.c;
            LazyPagingItems lazyPagingItems = lazyPagingItemsA;
            CollapsingToolbarScaffoldKt.a(WindowInsetsPadding_androidKt.a(fillElement), collapsingToolbarScaffoldStateB, false, null, ComposableLambdaKt.c(-1145914888, new Function3<CollapsingToolbarScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt$CategoryListingScreen$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    CollapsingToolbarScope CollapsingToolbarScaffold = (CollapsingToolbarScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(CollapsingToolbarScaffold, "$this$CollapsingToolbarScaffold");
                    CategoryListingContract.ViewState viewState2 = viewState;
                    int i3 = iIntValue & 14;
                    CategoryListingScreenKt.f(CollapsingToolbarScaffold, viewState2.d, composer2, i3);
                    CategoryListingScreenKt.i(onNavigateUp, onCartButton, viewState2.c, viewState2.b, focusRequester, composer2, 24576);
                    CategoryListingScreenKt.h(CollapsingToolbarScaffold, collapsingToolbarScaffoldStateB, viewState2.d, composer2, i3);
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-1862625501, new Function3<CollapsingToolbarScaffoldScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt$CategoryListingScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    CollapsingToolbarScaffoldScope CollapsingToolbarScaffold = (CollapsingToolbarScaffoldScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(CollapsingToolbarScaffold, "$this$CollapsingToolbarScaffold");
                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
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
                    CategoryListingScreenKt.c(lazyPagingItemsA, productClickListener, viewState.f6869a, composer2, 8);
                    composer2.f();
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1769856, 24);
            BottomSheetResultKt.a(viewState.f, onSnackbarDismissed, onViewShoppingListAction, composerImplV, (i2 >> 9) & 1008);
            LoadState loadState = (lazyPagingItems == null || (combinedLoadStatesD = lazyPagingItems.d()) == null) ? null : combinedLoadStatesD.f3529a;
            if (loadState instanceof LoadState.Loading) {
                composerImplV.o(2100816659);
                if (lazyPagingItems.b() == 0) {
                    e(6, 0, composerImplV, fillElement);
                }
                composerImplV.V(false);
            } else if (loadState instanceof LoadState.NotLoading) {
                composerImplV.o(2100965552);
                composerImplV.o(5004770);
                Object objG = composerImplV.G();
                if (objG == obj) {
                    objG = new CategoryListingScreenKt$CategoryListingScreen$3$1(focusRequester, null);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, focusRequester, (Function2) objG);
                composerImplV.V(false);
            } else if (loadState instanceof LoadState.Error) {
                composerImplV.o(2101111872);
                LoadState.Error error = (LoadState.Error) loadState;
                composerImplV.o(5004770);
                boolean zI = composerImplV.I(lazyPagingItems);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == obj) {
                    objG2 = new k(lazyPagingItems, 1);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                b(error, (Function0) objG2, composerImplV, 0);
                composerImplV.V(false);
            } else {
                composerImplV.o(2101225890);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productsearch.c(viewState, onNavigateUp, onCartButton, productClickListener, onSnackbarDismissed, onViewShoppingListAction, i);
        }
    }

    public static final void b(LoadState.Error error, Function0 function0, Composer composer, int i) {
        ComposerImpl composerImpl;
        FullPageMessageSpec fullPageMessageSpecE;
        ComposerImpl composerImplV = composer.v(-277079017);
        if ((((composerImplV.I(error) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (error.b instanceof NoConnectivityException) {
                composerImplV.o(15044687);
                fullPageMessageSpecE = FullPageMessageSpec.Companion.b(null, StringResources_androidKt.c(composerImplV, R.string.catalogue_listing_connection_error), function0, composerImplV, 7);
                composerImplV.V(false);
                composerImpl = composerImplV;
            } else {
                composerImplV.o(15051911);
                composerImpl = composerImplV;
                fullPageMessageSpecE = FullPageMessageSpec.Companion.e(null, null, StringResources_androidKt.c(composerImplV, R.string.catalogue_listing_server_error), null, function0, composerImpl, 23);
                composerImpl.V(false);
            }
            composerImplV = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecE, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(error, function0, i, 0);
        }
    }

    public static final void c(final LazyPagingItems lazyPagingItems, final ProductClickListener productClickListener, final boolean z, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(1481594899);
        int i2 = i | (composerImplV.I(lazyPagingItems) ? 4 : 2) | (composerImplV.I(productClickListener) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (lazyPagingItems == null || (lazyPagingItems.d().f3529a instanceof LoadState.Error)) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2(lazyPagingItems, productClickListener, z, i, i3) { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.ui.f
                        public final /* synthetic */ int d;
                        public final /* synthetic */ LazyPagingItems e;
                        public final /* synthetic */ ProductClickListener f;
                        public final /* synthetic */ boolean g;

                        {
                            this.d = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.d;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    CategoryListingScreenKt.c(this.e, this.f, this.g, composer2, RecomposeScopeImplKt.a(9));
                                    break;
                                default:
                                    CategoryListingScreenKt.c(this.e, this.f, this.g, composer2, RecomposeScopeImplKt.a(9));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = au.com.woolworths.dynamic.page.ui.content.d.f(composerImplV);
            }
            final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) objG;
            composerImplV.V(false);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            float f = 8;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
            Arrangement.SpacedAligned spacedAlignedG2 = Arrangement.g(f);
            float f2 = 10;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, f2, f2, f2);
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 14) == 4 || composerImplV.I(lazyPagingItems)) | composerImplV.I(productClickListener) | ((i2 & 896) == 256);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.ui.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                        float f3 = CategoryListingScreenKt.b;
                        Intrinsics.h(LazyVerticalGrid, "$this$LazyVerticalGrid");
                        final LazyPagingItems lazyPagingItems2 = lazyPagingItems;
                        int iB = lazyPagingItems2.b();
                        byte b2 = 0;
                        d dVar = new d(lazyPagingItems2, b2, b2);
                        final ProductClickListener productClickListener2 = productClickListener;
                        final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                        final boolean z2 = z;
                        LazyGridScope.h(LazyVerticalGrid, iB, null, dVar, null, new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt$Listing$2$1$2
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
                                    Object objA = lazyPagingItems2.a(iIntValue);
                                    if (objA instanceof ProductCard) {
                                        ProductCardKt.a((ProductCard) objA, productClickListener2, sharedIntrinsicHeightState2, z2, composer2, ProductCard.$stable | KyberEngine.KyberPolyBytes);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1399132562), 10);
                        LoadState loadState = lazyPagingItems2.d().c;
                        if (loadState instanceof LoadState.Loading) {
                            LazyVerticalGrid.f(new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(5), ComposableSingletons$CategoryListingScreenKt.f6880a);
                        } else if (loadState instanceof LoadState.Error) {
                            LazyVerticalGrid.f(new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(6), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt$Listing$2$1$5
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyGridItemScope item = (LazyGridItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        composer2.o(5004770);
                                        LazyPagingItems lazyPagingItems3 = lazyPagingItems2;
                                        boolean zI2 = composer2.I(lazyPagingItems3);
                                        Object objG3 = composer2.G();
                                        if (zI2 || objG3 == Composer.Companion.f1624a) {
                                            objG3 = new k(lazyPagingItems3, 2);
                                            composer2.A(objG3);
                                        }
                                        composer2.l();
                                        CategoryListingScreenKt.d((Function0) objG3, composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -376633560));
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            LazyGridDslKt.b(fixed, null, null, paddingValuesImpl, false, spacedAlignedG, spacedAlignedG2, null, false, null, (Function1) objG2, composerImplV, 1772544, 0, 918);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i4 = 1;
            recomposeScopeImplX2.d = new Function2(lazyPagingItems, productClickListener, z, i, i4) { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.ui.f
                public final /* synthetic */ int d;
                public final /* synthetic */ LazyPagingItems e;
                public final /* synthetic */ ProductClickListener f;
                public final /* synthetic */ boolean g;

                {
                    this.d = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.d;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            CategoryListingScreenKt.c(this.e, this.f, this.g, composer2, RecomposeScopeImplKt.a(9));
                            break;
                        default:
                            CategoryListingScreenKt.c(this.e, this.f, this.g, composer2, RecomposeScopeImplKt.a(9));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(Function0 function0, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1178110235);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierF = PaddingKt.f(SizeKt.e(Modifier.Companion.d, 1.0f), 16);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.catalogue_listing_append_error), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65534);
            TertiaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.try_again_button_text), function0, null, false, false, null, null, composerImplV, (i2 << 3) & 112, 124);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.d(i, 2, function0);
        }
    }

    public static final void e(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        ComposerImpl composerImplV = composer.v(-1405668003);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            if (i4 != 0) {
                modifier = companion;
            }
            Modifier modifierF = PaddingKt.f(modifier, 32);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, BoxScopeInstance.f944a.g(companion, Alignment.Companion.e));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.settings.v2.ui.d(modifier, i, i2, 1);
        }
    }

    public static final void f(CollapsingToolbarScope collapsingToolbarScope, final ListingHeader listingHeader, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-652389774);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(collapsingToolbarScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(listingHeader) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SingletonSubcomposeAsyncImageKt.a(listingHeader != null ? listingHeader.b : null, collapsingToolbarScope.b(SizeKt.g(Modifier.Companion.d, b).x0(SizeKt.c)), ComposableLambdaKt.c(1184900883, new Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt$ToolbarImage$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(SubcomposeAsyncImage) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        SubcomposeAsyncImageKt.b(SubcomposeAsyncImage, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, false, composer2, iIntValue & 14);
                        if (SubcomposeAsyncImage.getB().x instanceof AsyncImagePainter.State.Error) {
                            composer2.o(-953896116);
                            int i3 = Color.l;
                            ListingHeader listingHeader2 = listingHeader;
                            CategoryListingScreenKt.g(ColorExtKt.a(CategoryListingScreenKt.f6879a, listingHeader2 != null ? listingHeader2.c : null), composer2, 0);
                            composer2.l();
                        } else {
                            composer2.o(-953762351);
                            CategoryListingScreenKt.g(CategoryListingScreenKt.f6879a, composer2, 6);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(collapsingToolbarScope, i, 23, listingHeader);
        }
    }

    public static final void g(long j, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-80040439);
        if ((i & 6) == 0) {
            i2 = (composerImplV.s(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = BackgroundKt.b(SizeKt.g(Modifier.Companion.d, b).x0(SizeKt.c), j, RectangleShapeKt.f1779a);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(4);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            BoxKt.a(SemanticsModifierKt.b(modifierB, false, (Function1) objG), composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 0, j);
        }
    }

    public static final void h(final CollapsingToolbarScope collapsingToolbarScope, final CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, final ListingHeader listingHeader, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-909358071);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(collapsingToolbarScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(collapsingToolbarScaffoldState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(listingHeader) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            if (listingHeader == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 1;
                    recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.ui.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i4) {
                                case 0:
                                    CategoryListingScreenKt.h(collapsingToolbarScope, collapsingToolbarScaffoldState, listingHeader, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                default:
                                    CategoryListingScreenKt.h(collapsingToolbarScope, collapsingToolbarScaffoldState, listingHeader, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            float fJ = collapsingToolbarScaffoldState.f24914a.j();
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = SnapshotStateKt.d(new h(collapsingToolbarScaffoldState, 0));
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            TextKt.b(listingHeader.f6878a, collapsingToolbarScope.a(SizeKt.x(SizeKt.g(PaddingKt.j(WindowInsetsPadding_androidKt.b(Modifier.Companion.d), MathHelpersKt.b(56, 0, fJ), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), c), Alignment.Companion.k, false), Alignment.Companion.h), WxTheme.a(composerImplV).e(), TextUnitKt.d(WxTheme.b(composerImplV).h.f2068a.fontSize, fJ, WxTheme.b(composerImplV).e.f2068a.fontSize), ((Boolean) ((State) objG).getD()).booleanValue() ? FontWeight.j : FontWeight.m, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).g, composerImpl, 0, 0, 65488);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImpl.X();
        if (recomposeScopeImplX2 != null) {
            final int i4 = 0;
            recomposeScopeImplX2.d = new Function2() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.ui.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i4;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i42) {
                        case 0:
                            CategoryListingScreenKt.h(collapsingToolbarScope, collapsingToolbarScaffoldState, listingHeader, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                        default:
                            CategoryListingScreenKt.h(collapsingToolbarScope, collapsingToolbarScaffoldState, listingHeader, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void i(final Function0 function0, final Function0 function02, final Integer num, final boolean z, final FocusRequester focusRequester, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1628615031);
        if (((i | (composerImplV.I(function0) ? 4 : 2) | (composerImplV.I(function02) ? 32 : 16) | (composerImplV.n(num) ? 256 : 128) | (composerImplV.p(z) ? 2048 : 1024)) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            TopNavBarKt.b(null, WindowInsetsPadding_androidKt.b(Modifier.Companion.d), null, null, 0L, Color.j, 0L, null, 0, ComposableLambdaKt.c(-184870950, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt$ToolbarTopNavBar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ImageVector imageVectorA = ArrowBackKt.a();
                        String strC = StringResources_androidKt.c(composer2, R.string.content_description_back_button);
                        long jE = WxTheme.a(composer2).e();
                        IconButtonKt.c(imageVectorA, strC, function0, FocusableKt.a(FocusRequesterModifierKt.a(Modifier.Companion.d, focusRequester), true, null), false, jE, composer2, 0, 16);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(1514462068, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt$ToolbarTopNavBar$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope TopNavBar = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(TopNavBar, "$this$TopNavBar");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else if (z) {
                        CartIconButtonKt.a(num, function02, null, WxTheme.a(composer2).e(), composer2, 0, 4);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 906166278, 6, 220);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(function0, function02, num, z, focusRequester, i, 0);
        }
    }
}
