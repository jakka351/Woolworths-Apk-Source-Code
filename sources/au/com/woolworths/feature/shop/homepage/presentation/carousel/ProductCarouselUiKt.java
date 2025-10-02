package au.com.woolworths.feature.shop.homepage.presentation.carousel;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.j;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductCarouselUiKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[HorizontalListActionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HorizontalListActionState horizontalListActionState = HorizontalListActionState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                HorizontalListActionState horizontalListActionState2 = HorizontalListActionState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(final HorizontalListDataInterface listData, final LazyListState lazyListState, HorizontalListActionState horizontalListActionState, HorizontalListActionClickListener horizontalListActionClickListener, final ProductClickListener onProductClickListener, final ProductCardConfig productCardConfig, boolean z, final List list, Modifier modifier, Composer composer, int i) {
        int i2;
        boolean z2;
        ScrollableListActionState scrollableListActionState;
        ComposerImpl composerImpl;
        Intrinsics.h(listData, "listData");
        Intrinsics.h(lazyListState, "lazyListState");
        Intrinsics.h(horizontalListActionClickListener, "horizontalListActionClickListener");
        Intrinsics.h(onProductClickListener, "onProductClickListener");
        ComposerImpl composerImplV = composer.v(-1852074807);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(listData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(lazyListState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.r(horizontalListActionState.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(horizontalListActionClickListener) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onProductClickListener) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? composerImplV.n(productCardConfig) : composerImplV.I(productCardConfig) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z2 = z;
            i2 |= composerImplV.p(z2) ? 1048576 : 524288;
        } else {
            z2 = z;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerImplV.I(list) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if ((38347923 & i3) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            int iOrdinal = horizontalListActionState.ordinal();
            if (iOrdinal == 0) {
                scrollableListActionState = ScrollableListActionState.d;
            } else if (iOrdinal == 1) {
                scrollableListActionState = ScrollableListActionState.e;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                scrollableListActionState = ScrollableListActionState.f;
            }
            ScrollableListActionState scrollableListActionState2 = scrollableListActionState;
            String d = listData.getD();
            String e = listData.getE();
            String f = listData.getF();
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(horizontalListActionClickListener) | composerImplV.I(listData);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new n(6, horizontalListActionClickListener, listData);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            ScrollableListUiKt.c(d, e, f, (Function0) objG, scrollableListActionState2, modifier, z2, ComposableLambdaKt.c(908542774, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCarouselUiKt$ProductCarouselUi$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        HorizontalListDataInterface horizontalListDataInterface = listData;
                        String d2 = horizontalListDataInterface.getD();
                        List h = horizontalListDataInterface.getH();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : h) {
                            if (obj3 instanceof ProductCard) {
                                arrayList.add(obj3);
                            }
                        }
                        ProductCardsLazyRowUiKt.a(arrayList, d2, lazyListState, onProductClickListener, productCardConfig, list, composer2, ProductCardConfig.$stable << 12);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, ((i3 >> 9) & 458752) | 12582912 | (3670016 & i3), 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new j(listData, lazyListState, horizontalListActionState, horizontalListActionClickListener, onProductClickListener, productCardConfig, z, list, modifier, i);
        }
    }
}
