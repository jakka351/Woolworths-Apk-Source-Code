package au.com.woolworths.feature.shop.homepage.presentation.carousel;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dev.chrisbanes.snapper.LazyListKt;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductCardsLazyRowUiKt {
    public static final void a(final List productCards, String str, LazyListState lazyListState, final ProductClickListener onProductClickListener, final ProductCardConfig productCardConfig, final List list, Composer composer, int i) {
        int i2;
        String str2;
        boolean z;
        Intrinsics.h(productCards, "productCards");
        Intrinsics.h(lazyListState, "lazyListState");
        Intrinsics.h(onProductClickListener, "onProductClickListener");
        ComposerImpl composerImplV = composer.v(965113593);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(productCards) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= composerImplV.n(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(lazyListState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onProductClickListener) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? composerImplV.n(productCardConfig) : composerImplV.I(productCardConfig) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(list) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = d.f(composerImplV);
            }
            final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) objG;
            composerImplV.V(false);
            composerImplV.o(-455747376);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.shared.instore.wifi.ui.b(18);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            SnapperFlingBehavior snapperFlingBehaviorA = LazyListKt.a(lazyListState, (Function2) objG2, composerImplV);
            composerImplV.V(false);
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                List list2 = productCards;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z = false;
                    objG3 = Boolean.valueOf(z);
                    composerImplV.A(objG3);
                } else {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (ProductCardExtKt.y((ProductCard) it.next())) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    objG3 = Boolean.valueOf(z);
                    composerImplV.A(objG3);
                }
            }
            final boolean zBooleanValue = ((Boolean) objG3).booleanValue();
            composerImplV.V(false);
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(16, BitmapDescriptorFactory.HUE_RED, 2);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(8);
            composerImplV.o(-1224400529);
            boolean zI = ((i3 & 112) == 32) | composerImplV.I(productCards) | composerImplV.I(onProductClickListener) | ((57344 & i3) == 16384 || ((i3 & 32768) != 0 && composerImplV.I(productCardConfig))) | composerImplV.I(list);
            Object objG4 = composerImplV.G();
            if (zI || objG4 == composer$Companion$Empty$1) {
                final String str3 = str2;
                Function1 function1 = new Function1() { // from class: au.com.woolworths.feature.shop.homepage.presentation.carousel.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyRow = (LazyListScope) obj;
                        Intrinsics.h(LazyRow, "$this$LazyRow");
                        for (final ProductCard productCard : productCards) {
                            final String str4 = str3;
                            final ProductClickListener productClickListener = onProductClickListener;
                            final ProductCardConfig productCardConfig2 = productCardConfig;
                            final boolean z2 = zBooleanValue;
                            final List list3 = list;
                            final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                            LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCardsLazyRowUiKt$ProductCardsLazyRowUi$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        ProductCardConfig productCardConfig3 = productCardConfig2;
                                        ProductCardUiKt.a(productCard, str4, productClickListener, productCardConfig3.isInstoreMode(), true, true, true, z2, productCardConfig3.isWatchlistEnabled(), ProductCardExtKt.t(productCard, list3), sharedIntrinsicHeightState2, null, composer2, ProductCard.$stable | 115040256, 48);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 160011044), 3);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function1);
                objG4 = function1;
            }
            composerImplV.V(false);
            LazyDslKt.d(null, lazyListState, paddingValuesImplA, false, spacedAlignedG, null, snapperFlingBehaviorA, false, null, (Function1) objG4, composerImplV, ((i3 >> 3) & 112) | 24960, 425);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.tag.d(productCards, str, lazyListState, onProductClickListener, productCardConfig, list, i);
        }
    }
}
