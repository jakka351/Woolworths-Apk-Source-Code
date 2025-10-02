package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesBroadcastBannerData;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesCategoryItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFullfilmentStatusItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesHeaderGroupItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesListKt {
    public static final void a(final List list, final Function1 onFilterSelect, final Function1 onFulfilmentStatusClick, final Function1 onProductItemClick, final Function1 onProductSubstitutionItemClick, final Function2 onRatingSelected, final Map ratingUpMap, final Function0 onUnhappySubstitutedBannerDisplayed, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(list, "list");
        Intrinsics.h(onFilterSelect, "onFilterSelect");
        Intrinsics.h(onFulfilmentStatusClick, "onFulfilmentStatusClick");
        Intrinsics.h(onProductItemClick, "onProductItemClick");
        Intrinsics.h(onProductSubstitutionItemClick, "onProductSubstitutionItemClick");
        Intrinsics.h(onRatingSelected, "onRatingSelected");
        Intrinsics.h(ratingUpMap, "ratingUpMap");
        Intrinsics.h(onUnhappySubstitutedBannerDisplayed, "onUnhappySubstitutedBannerDisplayed");
        ComposerImpl composerImplV = composer.v(1131705210);
        int i2 = (composerImplV.I(list) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onFilterSelect) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onFulfilmentStatusClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onProductItemClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onProductSubstitutionItemClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onRatingSelected) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(ratingUpMap) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(onUnhappySubstitutedBannerDisplayed) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            FillElement fillElement = SizeKt.c;
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(0);
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(list) | ((i2 & 896) == 256) | ((29360128 & i2) == 8388608) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((i2 & 458752) == 131072) | composerImplV.I(ratingUpMap);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                Function1 function1 = new Function1() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final List list2 = list;
                        final int i3 = 0;
                        for (Object obj2 : list2) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            final YourGroceriesContract.YourGroceriesItem yourGroceriesItem = (YourGroceriesContract.YourGroceriesItem) obj2;
                            final Function1 function12 = onFulfilmentStatusClick;
                            final Function0 function0 = onUnhappySubstitutedBannerDisplayed;
                            final Function1 function13 = onProductItemClick;
                            final Function1 function14 = onProductSubstitutionItemClick;
                            final Function2 function2 = onRatingSelected;
                            final Map map = ratingUpMap;
                            final Function1 function15 = onFilterSelect;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesListKt$YourGroceriesList$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    LazyItemScope item = (LazyItemScope) obj3;
                                    Composer composer2 = (Composer) obj4;
                                    int iIntValue = ((Number) obj5).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        Object obj6 = yourGroceriesItem;
                                        if (obj6 instanceof YourGroceriesHeaderGroupItem) {
                                            composer2.o(963688591);
                                            YourGroceriesFilterGroupItem yourGroceriesFilterGroupItem = ((YourGroceriesHeaderGroupItem) obj6).f7706a;
                                            if (yourGroceriesFilterGroupItem != null) {
                                                YourGroceriesFilterRowKt.a(yourGroceriesFilterGroupItem, function15, composer2, 0);
                                            }
                                            composer2.l();
                                        } else {
                                            boolean z = obj6 instanceof YourGroceriesFullfilmentStatusItem;
                                            Object obj7 = Composer.Companion.f1624a;
                                            int i5 = i3;
                                            List list3 = list2;
                                            if (z) {
                                                composer2.o(-190038520);
                                                String str = ((YourGroceriesFullfilmentStatusItem) obj6).f7705a;
                                                composer2.o(-1633490746);
                                                Object obj8 = function12;
                                                boolean zN = composer2.n(obj8) | composer2.I(obj6);
                                                Object objG2 = composer2.G();
                                                if (zN || objG2 == obj7) {
                                                    objG2 = new au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f(5, obj8, obj6);
                                                    composer2.A(objG2);
                                                }
                                                composer2.l();
                                                YourGroceriesFulfilmentStatusKt.a(str, (Function0) objG2, CollectionsKt.J(i5 - 1, list3) instanceof YourGroceriesHeaderGroupItem, composer2, 0, 0);
                                                composer2.l();
                                            } else if (obj6 instanceof YourGroceriesBroadcastBannerData) {
                                                composer2.o(-189573086);
                                                composer2.o(5004770);
                                                Function0 function02 = function0;
                                                boolean zN2 = composer2.n(function02);
                                                Object objG3 = composer2.G();
                                                if (zN2 || objG3 == obj7) {
                                                    objG3 = new YourGroceriesListKt$YourGroceriesList$1$1$1$1$3$1(function02, null);
                                                    composer2.A(objG3);
                                                }
                                                composer2.l();
                                                EffectsKt.e(composer2, obj6, (Function2) objG3);
                                                float f = 16;
                                                Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, f, BitmapDescriptorFactory.HUE_RED, f, f, 2);
                                                YourGroceriesBroadcastBannerData yourGroceriesBroadcastBannerData = (YourGroceriesBroadcastBannerData) obj6;
                                                BroadcastBannerKt.a(BroadcastBannerType.d, yourGroceriesBroadcastBannerData.f7701a, yourGroceriesBroadcastBannerData.g, modifierJ, null, null, null, yourGroceriesBroadcastBannerData.b, null, composer2, 3078, 368);
                                                composer2.l();
                                            } else if (obj6 instanceof YourGroceriesCategoryItem) {
                                                composer2.o(-188843501);
                                                YourGroceriesCategoryItemKt.a(((YourGroceriesCategoryItem) obj6).f7702a, ((YourGroceriesContract.YourGroceriesItem) CollectionsKt.J(i5 - 1, list3)) instanceof YourGroceriesProductItem, composer2, 0, 0);
                                                composer2.l();
                                            } else if (obj6 instanceof YourGroceriesProductItem) {
                                                composer2.o(-188456435);
                                                YourGroceriesContract.YourGroceriesItem yourGroceriesItem2 = (YourGroceriesContract.YourGroceriesItem) CollectionsKt.J(i5 - 1, list3);
                                                YourGroceriesProductItemKt.f((YourGroceriesProductItem) obj6, function13, function14, function2, map, yourGroceriesItem2 instanceof YourGroceriesProductItem, !(((YourGroceriesContract.YourGroceriesItem) CollectionsKt.J(i5 + 1, list3)) instanceof YourGroceriesProductItem), composer2, 0, 0);
                                                composer2.l();
                                            } else {
                                                composer2.o(-187721673);
                                                composer2.l();
                                            }
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 1542900523), 3);
                            i3 = i4;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function1);
                objG = function1;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyDslKt.b(fillElement, null, null, false, spacedAlignedG, null, null, false, null, (Function1) objG, composerImpl, 24582, 494);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.broadcastbanner.b(list, onFilterSelect, onFulfilmentStatusClick, onProductItemClick, onProductSubstitutionItemClick, onRatingSelected, ratingUpMap, onUnhappySubstitutedBannerDisplayed, i);
        }
    }
}
