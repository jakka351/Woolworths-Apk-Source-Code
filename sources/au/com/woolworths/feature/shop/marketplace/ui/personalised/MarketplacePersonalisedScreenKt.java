package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
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
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.marketplace.data.models.InfoHeader;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceHorizontalList;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplacePersonalised;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplacePersonalisedSegment;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplacePromotionSegment;
import au.com.woolworths.feature.shop.marketplace.ui.facet.ErrorScreenKt;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedContract;
import au.com.woolworths.product.ProductFeature;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
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
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$ViewState;", "viewState", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$ViewState;", "marketplaceViewState", "marketplace_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplacePersonalisedScreenKt {
    public static final void a(MarketplacePersonalisedViewModel viewModel, MarketplaceViewModel marketplaceViewModel, FeatureToggleManager featureToggleManager, Composer composer, int i) {
        ComposerImpl composerImpl;
        boolean z;
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(-1454683687);
        int i2 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(marketplaceViewModel) ? 32 : 16) | (composerImplV.I(featureToggleManager) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            MutableState mutableStateA = FlowExtKt.a(viewModel.l, composerImplV);
            MutableState mutableStateA2 = FlowExtKt.a(marketplaceViewModel.h, composerImplV);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(viewModel) | composerImplV.n(mutableStateA2);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new MarketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$1$1(viewModel, mutableStateA2, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG);
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
            MarketplacePersonalisedContract.ViewState viewState = (MarketplacePersonalisedContract.ViewState) mutableStateA.getD();
            if (viewState.d != null) {
                composerImplV.o(-214078219);
                MarketplaceErrorState marketplaceErrorState = viewState.d;
                composerImplV.o(5004770);
                boolean zI2 = composerImplV.I(viewModel);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    MarketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$2$1$1 marketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$2$1$1 = new MarketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$2$1$1(0, viewModel, MarketplacePersonalisedViewModel.class, "onSecondaryActionClicked", "onSecondaryActionClicked()V", 0);
                    composerImplV.A(marketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$2$1$1);
                    objG2 = marketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$2$1$1;
                }
                composerImplV.V(false);
                ErrorScreenKt.a(marketplaceErrorState, (Function0) ((KFunction) objG2), composerImplV, 0);
                composerImplV.V(false);
                composerImpl = composerImplV;
                z = true;
            } else if (viewState.f7507a) {
                composerImplV.o(-214074834);
                ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e));
                composerImpl = composerImplV;
                composerImpl.V(false);
                z = true;
            } else {
                composerImpl = composerImplV;
                if (viewState.c != null) {
                    composerImpl.o(-214071562);
                    z = true;
                    b(viewState.b, viewState.c, viewModel, featureToggleManager, composerImpl, ((i2 << 6) & 896) | ((i2 << 3) & 7168));
                    composerImpl.V(false);
                } else {
                    z = true;
                    composerImpl.o(1953944239);
                    composerImpl.V(false);
                }
            }
            composerImpl.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(viewModel, marketplaceViewModel, featureToggleManager, i, 0);
        }
    }

    public static final void b(final InfoHeader infoHeader, final MarketplacePersonalised marketplacePersonalised, final MarketplacePersonalisedViewModel listener, FeatureToggleManager featureToggleManager, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Intrinsics.h(listener, "listener");
        ComposerImpl composerImplV = composer.v(-1635372435);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(infoHeader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(marketplacePersonalised) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(listener) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(featureToggleManager) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final boolean zC = featureToggleManager.c(ProductFeature.e);
            final ProductCardConfig productCardConfig = new ProductCardConfig(false, true, false, false, false, false, null, 124, null);
            FillElement fillElement = SizeKt.c;
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            PaddingValuesImpl paddingValuesImplB = PaddingKt.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, WindowInsetsKt.d(WindowInsets_androidKt.c(composerImplV), composerImplV).getD(), 7);
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(infoHeader) | composerImplV.I(listener) | composerImplV.I(marketplacePersonalised) | composerImplV.I(productCardConfig) | composerImplV.p(zC);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                Function1 function1 = new Function1() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        InfoHeader infoHeader2 = infoHeader;
                        final String str = infoHeader2 != null ? infoHeader2.b : null;
                        final InfoSection infoSection = infoHeader2 != null ? infoHeader2.c : null;
                        final MarketplacePersonalisedViewModel marketplacePersonalisedViewModel = listener;
                        if (str != null && infoSection != null) {
                            LazyColumn.a(str, InfoHeader.class, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedScreenKt$MarketplacePersonalisedUi$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        composer2.o(-1633490746);
                                        MarketplacePersonalisedViewModel marketplacePersonalisedViewModel2 = marketplacePersonalisedViewModel;
                                        boolean zI2 = composer2.I(marketplacePersonalisedViewModel2);
                                        InfoSection infoSection2 = infoSection;
                                        boolean zI3 = zI2 | composer2.I(infoSection2);
                                        Object objG2 = composer2.G();
                                        if (zI3 || objG2 == Composer.Companion.f1624a) {
                                            objG2 = new n(19, marketplacePersonalisedViewModel2, infoSection2);
                                            composer2.A(objG2);
                                        }
                                        composer2.l();
                                        HowItWorksCardKt.a(str, (Function0) objG2, composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 87372605));
                        }
                        MarketplacePersonalised marketplacePersonalised2 = marketplacePersonalised;
                        if (marketplacePersonalised2 != null) {
                            for (MarketplacePersonalisedSegment marketplacePersonalisedSegment : marketplacePersonalised2.c) {
                                if (marketplacePersonalisedSegment instanceof MarketplacePromotionSegment) {
                                    final MarketplacePromotionSegment marketplacePromotionSegment = (MarketplacePromotionSegment) marketplacePersonalisedSegment;
                                    LazyListScope.i(LazyColumn, null, MarketplacePromotionSegment.class, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedScreenKt$MarketplacePersonalisedUi$1$1$2$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            LazyItemScope item = (LazyItemScope) obj2;
                                            Composer composer2 = (Composer) obj3;
                                            int iIntValue = ((Number) obj4).intValue();
                                            Intrinsics.h(item, "$this$item");
                                            if ((iIntValue & 17) == 16 && composer2.c()) {
                                                composer2.j();
                                            } else {
                                                Modifier modifierG = PaddingKt.g(Modifier.Companion.d, 16, 8);
                                                MarketplacePromotionSegment marketplacePromotionSegment2 = marketplacePromotionSegment;
                                                InsetBannerData insetBannerData = marketplacePromotionSegment2.d.f9341a;
                                                composer2.o(-1633490746);
                                                Object obj5 = marketplacePersonalisedViewModel;
                                                boolean zI2 = composer2.I(obj5) | composer2.I(marketplacePromotionSegment2);
                                                Object objG2 = composer2.G();
                                                if (zI2 || objG2 == Composer.Companion.f1624a) {
                                                    objG2 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(8, obj5, marketplacePromotionSegment2);
                                                    composer2.A(objG2);
                                                }
                                                composer2.l();
                                                InsetBannerUiKt.b(insetBannerData, modifierG, false, (Function1) objG2, composer2, 48, 12);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, -1885580973), 1);
                                } else if (marketplacePersonalisedSegment instanceof MarketplaceHorizontalList) {
                                    final MarketplaceHorizontalList marketplaceHorizontalList = (MarketplaceHorizontalList) marketplacePersonalisedSegment;
                                    final ProductCardConfig productCardConfig2 = productCardConfig;
                                    final boolean z = zC;
                                    LazyListScope.i(LazyColumn, null, MarketplaceHorizontalList.class, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedScreenKt$MarketplacePersonalisedUi$1$1$2$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            LazyItemScope item = (LazyItemScope) obj2;
                                            Composer composer2 = (Composer) obj3;
                                            int iIntValue = ((Number) obj4).intValue();
                                            Intrinsics.h(item, "$this$item");
                                            if ((iIntValue & 17) == 16 && composer2.c()) {
                                                composer2.j();
                                            } else {
                                                MarketplaceHorizontalList marketplaceHorizontalList2 = marketplaceHorizontalList;
                                                String str2 = marketplaceHorizontalList2.d;
                                                String str3 = marketplaceHorizontalList2.e;
                                                List list = marketplaceHorizontalList2.h;
                                                composer2.o(1849434622);
                                                Object objG2 = composer2.G();
                                                if (objG2 == Composer.Companion.f1624a) {
                                                    objG2 = new h(20);
                                                    composer2.A(objG2);
                                                }
                                                composer2.l();
                                                int i3 = ProductCardConfig.$stable | 199680;
                                                MarketplaceProductCarouselUiKt.a(productCardConfig2, str2, str3, null, list, (Function0) objG2, marketplacePersonalisedViewModel, z, composer2, i3);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, 1909284668), 1);
                                }
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function1);
                objG = function1;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyDslKt.b(fillElement, lazyListStateA, paddingValuesImplB, false, null, null, null, false, null, (Function1) objG, composerImpl, 6, 504);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(infoHeader, marketplacePersonalised, listener, featureToggleManager, i, 20);
        }
    }
}
