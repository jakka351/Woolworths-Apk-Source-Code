package au.com.woolworths.feature.product.list;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdUnitKt;
import au.com.woolworths.product.composeui.ProductCardButtonsHorizontalKt;
import au.com.woolworths.product.composeui.ProductCardHorizontalUiKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.VideoAdUnitData;
import au.com.woolworths.product.tile.ProductClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$ViewState;", "viewState", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideoAdUnitComposeViewKt {
    public static final void a(final ProductCard productCard, final ProductCardConfig productCardConfig, final ProductClickListener productClickListener, final List list, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.h(productClickListener, "productClickListener");
        ComposerImpl composerImplV = composer.v(2012177732);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(productCardConfig) : composerImplV.I(productCardConfig) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(productClickListener) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(list) ? 2048 : 1024;
        }
        if (((i2 | 24576) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1090102276, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.VideoAdUnitComposeViewKt$VideoAdProductCard$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
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
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composer2, null);
                        final ProductCardConfig productCardConfig2 = productCardConfig;
                        boolean zIsInstoreMode = productCardConfig2.isInstoreMode();
                        boolean zIsInlineLabelEnabled = productCardConfig2.isInlineLabelEnabled();
                        boolean zIsWatchlistEnabled = productCardConfig2.isWatchlistEnabled();
                        final ProductCard productCard2 = productCard;
                        boolean zT = ProductCardExtKt.t(productCard2, list);
                        composer2.o(-1633490746);
                        final ProductClickListener productClickListener2 = productClickListener;
                        boolean zI = composer2.I(productClickListener2) | composer2.I(productCard2);
                        Object objG = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (zI || objG == obj3) {
                            final int i3 = 0;
                            objG = new Function0() { // from class: au.com.woolworths.feature.product.list.e0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i3) {
                                        case 0:
                                            productClickListener2.J1(productCard2, "");
                                            break;
                                        default:
                                            productClickListener2.g6(productCard2, "");
                                            break;
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierF = PaddingKt.f(ClickableKt.d(companion, false, null, null, (Function0) objG, 7), 16);
                        composer2.o(-1633490746);
                        boolean zI2 = composer2.I(productClickListener2) | composer2.I(productCard2);
                        Object objG2 = composer2.G();
                        if (zI2 || objG2 == obj3) {
                            final int i4 = 1;
                            objG2 = new Function0() { // from class: au.com.woolworths.feature.product.list.e0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i4) {
                                        case 0:
                                            productClickListener2.J1(productCard2, "");
                                            break;
                                        default:
                                            productClickListener2.g6(productCard2, "");
                                            break;
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG2);
                        }
                        composer2.l();
                        ProductCardHorizontalUiKt.a(productCard2, zIsInlineLabelEnabled, true, modifierF, false, zIsWatchlistEnabled, zT, (Function0) objG2, false, false, zIsInstoreMode, false, false, false, null, null, null, ComposableLambdaKt.c(1462774336, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.VideoAdUnitComposeViewKt$VideoAdProductCard$1$1$3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    boolean zIsInstoreMode2 = productCardConfig2.isInstoreMode();
                                    ProductCard productCard3 = productCard2;
                                    ProductCardButtonsHorizontalKt.b(productCard3, "", productClickListener2, ProductCardExtKt.i(productCard3, zIsInstoreMode2, false, false, 14), PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, 11), false, composer3, ProductCard.$stable | 24624, 32);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, ProductCard.$stable | KyberEngine.KyberPolyBytes, 12583296, 125712);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(productCard, productCardConfig, productClickListener, list, modifier2, i, 0);
        }
    }

    public static final void b(final VideoAdUnitData videoAdUnitData, final ProductCardConfig productCardConfig, final ProductListViewModel viewModel, Composer composer, int i) {
        int i2;
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(-1837973660);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(videoAdUnitData) : composerImplV.I(videoAdUnitData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(productCardConfig) : composerImplV.I(productCardConfig) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(viewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(Modifier.Companion.d) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1320956552, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.VideoAdUnitComposeViewKt$VideoAdUnitCompose$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    VideoAdPlayerState videoAdPlayerState;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        MutableState mutableStateA = LiveDataAdapterKt.a(viewModel.C, composer2);
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.m, composer2, 6);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
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
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        VideoAdUnitData videoAdUnitData2 = videoAdUnitData;
                        VideoAdData videoAd = videoAdUnitData2.getVideoAd();
                        ProductListContract.ViewState viewState = (ProductListContract.ViewState) mutableStateA.getD();
                        if (viewState == null || (videoAdPlayerState = viewState.u) == null) {
                            videoAdPlayerState = VideoAdPlayerState.g;
                        }
                        composer2.o(5004770);
                        ProductListViewModel productListViewModel = viewModel;
                        boolean zN = composer2.n(productListViewModel);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zN || objG == composer$Companion$Empty$1) {
                            VideoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$1$1 videoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$1$1 = new VideoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$1$1(1, productListViewModel, ProductListViewModel.class, "onDisplayVideoAdBottomSheet", "onDisplayVideoAdBottomSheet(Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdBottomSheet;)V", 0);
                            composer2.A(videoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$1$1);
                            objG = videoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$1$1;
                        }
                        KFunction kFunction = (KFunction) objG;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zN2 = composer2.n(productListViewModel);
                        Object objG2 = composer2.G();
                        if (zN2 || objG2 == composer$Companion$Empty$1) {
                            objG2 = new VideoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$2$1(1, productListViewModel, ProductListViewModel.class, "onVideoAdPlayerStateChanged", "onVideoAdPlayerStateChanged(Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdPlayerState;)V", 0);
                            composer2.A(objG2);
                        }
                        KFunction kFunction2 = (KFunction) objG2;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zN3 = composer2.n(productListViewModel);
                        Object objG3 = composer2.G();
                        if (zN3 || objG3 == composer$Companion$Empty$1) {
                            VideoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$3$1 videoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$3$1 = new VideoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$3$1(3, productListViewModel, ProductListViewModel.class, "onVideoAdPositionChange", "onVideoAdPositionChange(FFF)V", 0);
                            composer2.A(videoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$3$1);
                            objG3 = videoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$3$1;
                        }
                        KFunction kFunction3 = (KFunction) objG3;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zN4 = composer2.n(productListViewModel);
                        Object objG4 = composer2.G();
                        if (zN4 || objG4 == composer$Companion$Empty$1) {
                            objG4 = new VideoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$4$1(1, productListViewModel, ProductListViewModel.class, "onVideoAdAnalyticsEvent", "onVideoAdAnalyticsEvent(Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/product/models/ProductCard;)V", 0);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        VideoAdUnitKt.b(videoAd, videoAdPlayerState, (Function1) kFunction, (Function3) kFunction3, (Function1) objG4, SizeKt.e(companion, 1.0f), (Function1) kFunction2, composer2, 196616);
                        ProductCard productCard = videoAdUnitData2.getProductCard();
                        composer2.o(1817433283);
                        if (productCard != null) {
                            ProductListContract.ViewState viewState2 = (ProductListContract.ViewState) mutableStateA.getD();
                            List list = viewState2 != null ? viewState2.r : null;
                            if (list == null) {
                                list = EmptyList.d;
                            }
                            VideoAdUnitComposeViewKt.a(productCard, productCardConfig, productListViewModel, list, null, composer2, ProductCard.$stable | (ProductCardConfig.$stable << 3));
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(videoAdUnitData, productCardConfig, viewModel, i);
        }
    }
}
