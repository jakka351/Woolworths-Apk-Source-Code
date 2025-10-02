package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.e;
import au.com.woolworths.feature.rewards.offers.ProductOfferTile;
import au.com.woolworths.feature.rewards.offers.ProductSectionViewItem;
import au.com.woolworths.feature.rewards.offers.ui.ProductOfferCardTileKt;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItemKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferCarouselViewKt {
    public static final void a(ProductSectionViewItem section, final Function1 onCardClick, final Function1 activateOffer, final Function2 onCtaButtonClick, final Function1 trackRewardsOfferImpression, Function0 onProductOffersSwipeStarted, Function1 onProductOffersSwipeEnded, int i, final boolean z, boolean z2, Composer composer, int i2, int i3) {
        boolean z3;
        int i4;
        boolean z4;
        String str;
        ComposerImpl composerImpl;
        Intrinsics.h(section, "section");
        List list = section.i;
        Intrinsics.h(onCardClick, "onCardClick");
        Intrinsics.h(activateOffer, "activateOffer");
        Intrinsics.h(onCtaButtonClick, "onCtaButtonClick");
        Intrinsics.h(trackRewardsOfferImpression, "trackRewardsOfferImpression");
        Intrinsics.h(onProductOffersSwipeStarted, "onProductOffersSwipeStarted");
        Intrinsics.h(onProductOffersSwipeEnded, "onProductOffersSwipeEnded");
        ComposerImpl composerImplV = composer.v(-3009186);
        int i5 = (composerImplV.I(section) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i5 |= composerImplV.I(onCardClick) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.I(activateOffer) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerImplV.I(onCtaButtonClick) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerImplV.I(trackRewardsOfferImpression) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= composerImplV.I(onProductOffersSwipeStarted) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= composerImplV.I(onProductOffersSwipeEnded) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= composerImplV.r(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= composerImplV.p(z) ? 67108864 : 33554432;
        }
        int i6 = i3 & 512;
        if (i6 != 0) {
            i4 = i5 | 805306368;
            z3 = z2;
        } else {
            z3 = z2;
            i4 = i5 | (composerImplV.p(z3) ? 536870912 : 268435456);
        }
        if ((i4 & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            z4 = z3;
        } else {
            z4 = i6 != 0 ? false : z3;
            final int iMin = Math.min(list.size(), i);
            int size = list.size() % iMin;
            int i7 = size != 0 ? iMin - size : 0;
            if (!z4 ? (str = section.e) == null : (str = section.f) == null) {
                str = "";
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                arrayList.add(new ProductOfferTile.DataTile(str, (OfferViewItem) it.next()));
            }
            ArrayList arrayList2 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList2.add(new ProductOfferTile.EmptyTile(str));
            }
            final ArrayList arrayListC0 = CollectionsKt.c0(arrayList2, arrayList);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(arrayListC0) | composerImplV.r(iMin);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new e(iMin, arrayListC0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            PagerState pagerStateC = PagerStateKt.c((Function0) objG, composerImplV, 0, 3);
            composerImplV.o(-1746271574);
            boolean zN = composerImplV.n(pagerStateC) | ((458752 & i4) == 131072) | ((i4 & 3670016) == 1048576);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                objG2 = new OfferCarouselViewKt$OfferCarouselView$1$1(pagerStateC, onProductOffersSwipeStarted, onProductOffersSwipeEnded, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, pagerStateC, (Function2) objG2);
            ProductOfferTile productOfferTile = (ProductOfferTile) CollectionsKt.J(pagerStateC.j() * iMin, arrayListC0);
            String f6230a = productOfferTile != null ? productOfferTile.getF6230a() : null;
            AnimatedContentKt.b(f6230a != null ? f6230a : "", null, null, null, "carousel_title", null, ComposableSingletons$OfferCarouselViewKt.f6381a, composerImplV, 1597440, 46);
            float f = 16;
            PagerKt.a(pagerStateC, null, PaddingKt.a(f, BitmapDescriptorFactory.HUE_RED, 2), new PageSize() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferCarouselViewKt$OfferCarouselView$2
                @Override // androidx.compose.foundation.pager.PageSize
                public final int a(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i9, int i10) {
                    Intrinsics.h(lazyLayoutMeasureScope, "<this>");
                    return arrayListC0.size() > 2 ? (int) ((i9 - (i10 * 2)) * 0.9f) : i9;
                }
            }, 0, f, Alignment.Companion.j, null, false, null, null, null, ComposableLambdaKt.c(-1062104771, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferCarouselViewKt$OfferCarouselView$3
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    PagerScope HorizontalPager = (PagerScope) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(HorizontalPager, "$this$HorizontalPager");
                    Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(16), Alignment.Companion.m, composer2, 6);
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
                    Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                    Function2 function2 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        androidx.camera.core.impl.b.z(p, composer2, p, function2);
                    }
                    Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                    composer2.o(53634656);
                    int i9 = 0;
                    while (true) {
                        int i10 = iMin;
                        if (i9 >= i10) {
                            composer2.l();
                            composer2.f();
                            return Unit.f24250a;
                        }
                        ProductOfferTile productOfferTile2 = (ProductOfferTile) CollectionsKt.J((i10 * iIntValue) + i9, arrayListC0);
                        composer2.o(53639664);
                        if (productOfferTile2 != null) {
                            OfferCarouselViewKt.b(productOfferTile2, z, onCardClick, activateOffer, onCtaButtonClick, trackRewardsOfferImpression, composer2, 0);
                        }
                        composer2.l();
                        i9++;
                    }
                }
            }, composerImplV), composerImplV, 1769856, 24576, 16274);
            composerImpl = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(section, onCardClick, activateOffer, onCtaButtonClick, trackRewardsOfferImpression, onProductOffersSwipeStarted, onProductOffersSwipeEnded, i, z, z4, i2, i3);
        }
    }

    public static final void b(ProductOfferTile productOfferTile, boolean z, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1119039046);
        int i2 = i | (composerImplV.n(productOfferTile) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128) | (composerImplV.I(function12) ? 2048 : 1024) | (composerImplV.I(function2) ? 16384 : 8192) | (composerImplV.I(function13) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else if (productOfferTile instanceof ProductOfferTile.DataTile) {
            OfferViewItem offerViewItem = ((ProductOfferTile.DataTile) productOfferTile).c;
            ProductOfferCardTileKt.a(offerViewItem.b, OfferViewItemKt.a(offerViewItem), function1, function12, function2, z, null, composerImplV, (65408 & i2) | ((i2 << 12) & 458752), 64);
            function13.invoke(offerViewItem.b);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.loadingbutton.a(productOfferTile, z, function1, function12, function2, function13, i);
        }
    }
}
