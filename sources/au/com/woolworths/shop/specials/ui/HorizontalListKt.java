package au.com.woolworths.shop.specials.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.feature.product.list.compose.productfinder.g;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.product.tile.PromotionClickInterceptor;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardData;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardDataKt;
import au.com.woolworths.shop.aem.components.ui.OfferCardKt;
import au.com.woolworths.shop.aem.components.ui.QuickLinkCardKt;
import au.com.woolworths.shop.aem.components.ui.contentcard.ContentCardKt;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"specials_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class HorizontalListKt {
    public static final void a(HorizontalListData horizontalListData, LazyListState lazyListState, Function2 function2, Function1 function1, Function1 function12, Composer composer, int i) {
        ComposerImpl composerImpl;
        Object horizontalListKt$Analytics$1$1;
        LazyListState lazyListState2 = lazyListState;
        ComposerImpl composerImplV = composer.v(1902369564);
        int i2 = i | (composerImplV.I(horizontalListData) ? 4 : 2) | (composerImplV.n(lazyListState2) ? 32 : 16) | (composerImplV.I(function2) ? 256 : 128) | (composerImplV.I(function1) ? 2048 : 1024) | (composerImplV.I(function12) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(horizontalListData);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new l(22, function2, horizontalListData);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            ListItemsSeenEffectKt.a(ListItemsSeenEffectKt.e(lazyListState2, 0.3f, (Function1) objG, composerImplV, ((i2 >> 3) & 14) | 48, 0), composerImpl, 0);
            composerImpl.o(5004770);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objG2 = composerImpl.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = SnapshotStateKt.f(new Pair(0, 0));
                composerImpl.A(objG2);
            }
            MutableState mutableState = (MutableState) objG2;
            composerImpl.V(false);
            composerImpl.o(-1224400529);
            boolean zN = (i3 == 32) | composerImpl.n(mutableState) | ((57344 & i2) == 16384) | composerImpl.I(horizontalListData) | ((i2 & 7168) == 2048);
            Object objG3 = composerImpl.G();
            if (zN || objG3 == composer$Companion$Empty$1) {
                horizontalListKt$Analytics$1$1 = new HorizontalListKt$Analytics$1$1(lazyListState, mutableState, function12, horizontalListData, function1, null);
                lazyListState2 = lazyListState;
                composerImpl.A(horizontalListKt$Analytics$1$1);
            } else {
                horizontalListKt$Analytics$1$1 = objG3;
                lazyListState2 = lazyListState;
            }
            composerImpl.V(false);
            EffectsKt.e(composerImpl, lazyListState2, (Function2) horizontalListKt$Analytics$1$1);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(horizontalListData, lazyListState2, function2, function1, function12, i, 18);
        }
    }

    public static final void b(final HorizontalListData horizontalListData, SpecialsHomeViewModel viewModel, final boolean z, final List watchlistedProductIds, Composer composer, int i) {
        SpecialsHomeViewModel specialsHomeViewModel;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
        ComposerImpl composerImplV = composer.v(-456194136);
        int i2 = i | (composerImplV.I(horizontalListData) ? 4 : 2) | (composerImplV.I(viewModel) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128) | (composerImplV.I(watchlistedProductIds) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(viewModel);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                HorizontalListKt$HorizontalList$1$1 horizontalListKt$HorizontalList$1$1 = new HorizontalListKt$HorizontalList$1$1(2, viewModel, SpecialsHomeViewModel.class, "onHorizontalListItemImpression", "onHorizontalListItemImpression(Lau/com/woolworths/android/onesite/data/HorizontalListData;Ljava/lang/Object;)V", 0);
                composerImplV.A(horizontalListKt$HorizontalList$1$1);
                objG = horizontalListKt$HorizontalList$1$1;
            }
            composerImplV.V(false);
            Function2 function2 = (Function2) ((KFunction) objG);
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(viewModel);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                HorizontalListKt$HorizontalList$2$1 horizontalListKt$HorizontalList$2$1 = new HorizontalListKt$HorizontalList$2$1(1, viewModel, SpecialsHomeViewModel.class, "onHorizontalListScrolledLeft", "onHorizontalListScrolledLeft(Lau/com/woolworths/android/onesite/data/HorizontalListData;)V", 0);
                composerImplV.A(horizontalListKt$HorizontalList$2$1);
                objG2 = horizontalListKt$HorizontalList$2$1;
            }
            composerImplV.V(false);
            Function1 function1 = (Function1) ((KFunction) objG2);
            composerImplV.o(5004770);
            boolean zI3 = composerImplV.I(viewModel);
            Object objG3 = composerImplV.G();
            if (zI3 || objG3 == composer$Companion$Empty$1) {
                HorizontalListKt$HorizontalList$3$1 horizontalListKt$HorizontalList$3$1 = new HorizontalListKt$HorizontalList$3$1(1, viewModel, SpecialsHomeViewModel.class, "onHorizontalListScrolledRight", "onHorizontalListScrolledRight(Lau/com/woolworths/android/onesite/data/HorizontalListData;)V", 0);
                specialsHomeViewModel = viewModel;
                composerImplV.A(horizontalListKt$HorizontalList$3$1);
                objG3 = horizontalListKt$HorizontalList$3$1;
            } else {
                specialsHomeViewModel = viewModel;
            }
            composerImplV.V(false);
            a(horizontalListData, lazyListStateA, function2, function1, (Function1) ((KFunction) objG3), composerImplV, i2 & 14);
            composerImplV.o(1849434622);
            Object objG4 = composerImplV.G();
            if (objG4 == composer$Companion$Empty$1) {
                objG4 = au.com.woolworths.dynamic.page.ui.content.d.f(composerImplV);
            }
            final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) objG4;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = au.com.woolworths.dynamic.page.ui.content.d.f(composerImplV);
            }
            final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = (SharedIntrinsicHeightState) objD;
            Object objD2 = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD2 == composer$Companion$Empty$1) {
                objD2 = au.com.woolworths.dynamic.page.ui.content.d.f(composerImplV);
            }
            final SharedIntrinsicHeightState sharedIntrinsicHeightState3 = (SharedIntrinsicHeightState) objD2;
            composerImplV.V(false);
            String d = horizontalListData.getD();
            String d2 = (d == null || StringsKt.D(d)) ? null : horizontalListData.getD();
            String e = horizontalListData.getE();
            String f = horizontalListData.getF();
            composerImplV.o(-1633490746);
            boolean zI4 = composerImplV.I(specialsHomeViewModel) | composerImplV.I(horizontalListData);
            Object objG5 = composerImplV.G();
            if (zI4 || objG5 == composer$Companion$Empty$1) {
                objG5 = new au.com.woolworths.shop.checkout.ui.details.c(26, specialsHomeViewModel, horizontalListData);
                composerImplV.A(objG5);
            }
            Function0 function0 = (Function0) objG5;
            composerImplV.V(false);
            ScrollableListActionState scrollableListActionState = ScrollableListActionState.d;
            String d3 = horizontalListData.getD();
            float f2 = (d3 == null || StringsKt.D(d3)) ? 0 : 14;
            final SpecialsHomeViewModel specialsHomeViewModel2 = specialsHomeViewModel;
            ScrollableListUiKt.c(d2, e, f, function0, scrollableListActionState, PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), false, ComposableLambdaKt.c(913217749, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.HorizontalListKt$HorizontalList$5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        PaddingValuesImpl paddingValuesImplA = PaddingKt.a(16, BitmapDescriptorFactory.HUE_RED, 2);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(8);
                        composer2.o(-1224400529);
                        final HorizontalListData horizontalListData2 = horizontalListData;
                        boolean zI5 = composer2.I(horizontalListData2) | composer2.I(specialsHomeViewModel2) | composer2.I(watchlistedProductIds) | composer2.p(z);
                        Object objG6 = composer2.G();
                        if (zI5 || objG6 == Composer.Companion.f1624a) {
                            final SpecialsHomeViewModel specialsHomeViewModel3 = specialsHomeViewModel2;
                            final List list = watchlistedProductIds;
                            final boolean z2 = z;
                            final SharedIntrinsicHeightState sharedIntrinsicHeightState4 = sharedIntrinsicHeightState;
                            final SharedIntrinsicHeightState sharedIntrinsicHeightState5 = sharedIntrinsicHeightState2;
                            final SharedIntrinsicHeightState sharedIntrinsicHeightState6 = sharedIntrinsicHeightState3;
                            Function1 function12 = new Function1() { // from class: au.com.woolworths.shop.specials.ui.a
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    LazyListScope LazyRow = (LazyListScope) obj3;
                                    Intrinsics.h(LazyRow, "$this$LazyRow");
                                    final HorizontalListData horizontalListData3 = horizontalListData2;
                                    List<Object> h = horizontalListData3.getH();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj4 : h) {
                                        if (obj4 instanceof OfferCardData) {
                                            arrayList.add(obj4);
                                        }
                                    }
                                    final boolean zA = OfferCardDataKt.a(arrayList);
                                    for (Object obj5 : horizontalListData3.getH()) {
                                        boolean z3 = obj5 instanceof QuickLinkCard;
                                        final SpecialsHomeViewModel specialsHomeViewModel4 = specialsHomeViewModel3;
                                        if (z3) {
                                            final QuickLinkCard quickLinkCard = (QuickLinkCard) obj5;
                                            LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.HorizontalListKt$HorizontalList$5$1$1$1$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    LazyItemScope item = (LazyItemScope) obj6;
                                                    Composer composer3 = (Composer) obj7;
                                                    int iIntValue = ((Number) obj8).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue & 17) == 16 && composer3.c()) {
                                                        composer3.j();
                                                    } else {
                                                        composer3.o(-1746271574);
                                                        SpecialsHomeViewModel specialsHomeViewModel5 = specialsHomeViewModel4;
                                                        boolean zI6 = composer3.I(specialsHomeViewModel5);
                                                        HorizontalListData horizontalListData4 = horizontalListData3;
                                                        boolean zI7 = zI6 | composer3.I(horizontalListData4);
                                                        QuickLinkCard quickLinkCard2 = quickLinkCard;
                                                        boolean zI8 = zI7 | composer3.I(quickLinkCard2);
                                                        Object objG7 = composer3.G();
                                                        if (zI8 || objG7 == Composer.Companion.f1624a) {
                                                            objG7 = new d(specialsHomeViewModel5, horizontalListData4, quickLinkCard2, 1);
                                                            composer3.A(objG7);
                                                        }
                                                        composer3.l();
                                                        QuickLinkCardKt.a(quickLinkCard2, (Function1) objG7, null, 0L, 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, composer3, 8, 124);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, 469858277), 3);
                                        } else {
                                            boolean z4 = obj5 instanceof ProductCard;
                                            final List list2 = list;
                                            final boolean z5 = z2;
                                            if (z4) {
                                                final ProductCard productCard = (ProductCard) obj5;
                                                final SharedIntrinsicHeightState sharedIntrinsicHeightState7 = sharedIntrinsicHeightState4;
                                                LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.HorizontalListKt$HorizontalList$5$1$1$1$2
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                        LazyItemScope item = (LazyItemScope) obj6;
                                                        Composer composer3 = (Composer) obj7;
                                                        int iIntValue = ((Number) obj8).intValue();
                                                        Intrinsics.h(item, "$this$item");
                                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                                            composer3.j();
                                                        } else {
                                                            String strA = YU.a.A("Carousel - ", horizontalListData3.getD());
                                                            List list3 = list2;
                                                            ProductCard productCard2 = productCard;
                                                            boolean zT = ProductCardExtKt.t(productCard2, list3);
                                                            SpecialsHomeViewModel specialsHomeViewModel5 = specialsHomeViewModel4;
                                                            boolean zB = specialsHomeViewModel5.e.b();
                                                            boolean zD = specialsHomeViewModel5.k.d();
                                                            boolean zC = specialsHomeViewModel5.h.c(BaseShopAppFeature.w);
                                                            composer3.o(-1633490746);
                                                            boolean zI6 = composer3.I(specialsHomeViewModel5) | composer3.I(productCard2);
                                                            Object objG7 = composer3.G();
                                                            if (zI6 || objG7 == Composer.Companion.f1624a) {
                                                                objG7 = new au.com.woolworths.shop.checkout.ui.details.c(27, specialsHomeViewModel5, productCard2);
                                                                composer3.A(objG7);
                                                            }
                                                            composer3.l();
                                                            ProductCardKt.a(productCard2, strA, specialsHomeViewModel4, z5, zT, sharedIntrinsicHeightState7, false, zB, zC, null, zD, (Function0) objG7, composer3, ProductCard.$stable | 1769472);
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, true, 1853307292), 3);
                                            } else if (obj5 instanceof OfferCardData) {
                                                final OfferCardData offerCardData = (OfferCardData) obj5;
                                                LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.HorizontalListKt$HorizontalList$5$1$1$1$3
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                        LazyItemScope item = (LazyItemScope) obj6;
                                                        Composer composer3 = (Composer) obj7;
                                                        int iIntValue = ((Number) obj8).intValue();
                                                        Intrinsics.h(item, "$this$item");
                                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                                            composer3.j();
                                                        } else {
                                                            composer3.o(-1746271574);
                                                            SpecialsHomeViewModel specialsHomeViewModel5 = specialsHomeViewModel4;
                                                            boolean zI6 = composer3.I(specialsHomeViewModel5);
                                                            HorizontalListData horizontalListData4 = horizontalListData3;
                                                            boolean zI7 = zI6 | composer3.I(horizontalListData4);
                                                            OfferCardData offerCardData2 = offerCardData;
                                                            boolean zI8 = zI7 | composer3.I(offerCardData2);
                                                            Object objG7 = composer3.G();
                                                            if (zI8 || objG7 == Composer.Companion.f1624a) {
                                                                objG7 = new d(specialsHomeViewModel5, horizontalListData4, offerCardData2, 2);
                                                                composer3.A(objG7);
                                                            }
                                                            composer3.l();
                                                            OfferCardKt.a(offerCardData2, (Function1) objG7, null, zA, null, composer3, 8, 20);
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, true, -1299312419), 3);
                                            } else if (obj5 instanceof ContentCardData) {
                                                final ContentCardData contentCardData = (ContentCardData) obj5;
                                                final SharedIntrinsicHeightState sharedIntrinsicHeightState8 = sharedIntrinsicHeightState5;
                                                LazyListScope.i(LazyRow, null, obj5, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.HorizontalListKt$HorizontalList$5$1$1$1$4
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                        LazyItemScope item = (LazyItemScope) obj6;
                                                        Composer composer3 = (Composer) obj7;
                                                        int iIntValue = ((Number) obj8).intValue();
                                                        Intrinsics.h(item, "$this$item");
                                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                                            composer3.j();
                                                        } else {
                                                            composer3.o(-1746271574);
                                                            SpecialsHomeViewModel specialsHomeViewModel5 = specialsHomeViewModel4;
                                                            boolean zI6 = composer3.I(specialsHomeViewModel5);
                                                            HorizontalListData horizontalListData4 = horizontalListData3;
                                                            boolean zI7 = zI6 | composer3.I(horizontalListData4);
                                                            ContentCardData contentCardData2 = contentCardData;
                                                            boolean zI8 = zI7 | composer3.I(contentCardData2);
                                                            Object objG7 = composer3.G();
                                                            if (zI8 || objG7 == Composer.Companion.f1624a) {
                                                                objG7 = new d(specialsHomeViewModel5, horizontalListData4, contentCardData2, 3);
                                                                composer3.A(objG7);
                                                            }
                                                            composer3.l();
                                                            ContentCardKt.a(contentCardData2, (Function1) objG7, null, sharedIntrinsicHeightState8, null, BitmapDescriptorFactory.HUE_RED, null, null, null, false, composer3, 3080, 1012);
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, true, -156964834), 1);
                                            } else if (obj5 instanceof PromotionCard) {
                                                final PromotionCard promotionCard = (PromotionCard) obj5;
                                                final SharedIntrinsicHeightState sharedIntrinsicHeightState9 = sharedIntrinsicHeightState6;
                                                LazyListScope.i(LazyRow, null, obj5, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.HorizontalListKt$HorizontalList$5$1$1$1$5
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                        LazyItemScope item = (LazyItemScope) obj6;
                                                        Composer composer3 = (Composer) obj7;
                                                        int iIntValue = ((Number) obj8).intValue();
                                                        Intrinsics.h(item, "$this$item");
                                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                                            composer3.j();
                                                        } else {
                                                            PromotionCard promotionCard2 = promotionCard;
                                                            ProductCard productCard2 = promotionCard2.getProductCard();
                                                            String d4 = horizontalListData3.getD();
                                                            SpecialsHomeViewModel specialsHomeViewModel5 = specialsHomeViewModel4;
                                                            PromotionClickInterceptor promotionClickInterceptor = new PromotionClickInterceptor(promotionCard2, specialsHomeViewModel5);
                                                            boolean zT = ProductCardExtKt.t(promotionCard2.getProductCard(), list2);
                                                            boolean zB = specialsHomeViewModel5.e.b();
                                                            boolean zD = specialsHomeViewModel5.k.d();
                                                            boolean zC = specialsHomeViewModel5.h.c(BaseShopAppFeature.w);
                                                            composer3.o(-1633490746);
                                                            boolean zI6 = composer3.I(specialsHomeViewModel5) | composer3.I(promotionCard2);
                                                            Object objG7 = composer3.G();
                                                            if (zI6 || objG7 == Composer.Companion.f1624a) {
                                                                objG7 = new au.com.woolworths.shop.checkout.ui.details.c(28, specialsHomeViewModel5, promotionCard2);
                                                                composer3.A(objG7);
                                                            }
                                                            composer3.l();
                                                            int i3 = ProductCard.$stable | 1769984;
                                                            ProductCardKt.a(productCard2, d4, promotionClickInterceptor, z5, zT, sharedIntrinsicHeightState9, true, zB, zC, null, zD, (Function0) objG7, composer3, i3);
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, true, 985382751), 1);
                                            }
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(function12);
                            objG6 = function12;
                        }
                        composer2.l();
                        LazyDslKt.d(null, lazyListStateA, paddingValuesImplA, false, spacedAlignedG, null, null, false, null, (Function1) objG6, composer2, 24960, 489);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12607488, 64);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.d(i, 6, horizontalListData, viewModel, watchlistedProductIds, z);
        }
    }
}
