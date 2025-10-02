package au.com.woolworths.feature.product.list.compose.errorscreen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.product.list.data.ProductListZeroResults;
import au.com.woolworths.feature.product.list.data.ProductListZeroResultsKt;
import au.com.woolworths.feature.product.list.data.ZeroResultPageData;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListZeroResultsViewKt {
    public static final void a(final ProductListZeroResults productListZeroResults, final ZeroResultPageData zeroResultPageData, final boolean z, final ProductClickListener productClickListener, final Function1 onBrowseAllAislesClick, final Function1 onProductCategoryTileClick, final Function0 onZeroResultVisible, final Function1 onZeroResultHorizontalListVisible, final Function1 onChatEntryBannerClicked, final boolean z2, Modifier modifier, Composer composer, final int i) {
        ZeroResultPageData zeroResultPageData2;
        final Modifier modifier2;
        Intrinsics.h(productClickListener, "productClickListener");
        Intrinsics.h(onBrowseAllAislesClick, "onBrowseAllAislesClick");
        Intrinsics.h(onProductCategoryTileClick, "onProductCategoryTileClick");
        Intrinsics.h(onZeroResultVisible, "onZeroResultVisible");
        Intrinsics.h(onZeroResultHorizontalListVisible, "onZeroResultHorizontalListVisible");
        Intrinsics.h(onChatEntryBannerClicked, "onChatEntryBannerClicked");
        ComposerImpl composerImplV = composer.v(-175424991);
        int i2 = i | (composerImplV.n(productListZeroResults) ? 4 : 2) | (composerImplV.I(zeroResultPageData) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128) | (composerImplV.I(productClickListener) ? 2048 : 1024) | (composerImplV.I(onBrowseAllAislesClick) ? 16384 : 8192) | (composerImplV.I(onProductCategoryTileClick) ? 131072 : 65536) | (composerImplV.I(onZeroResultVisible) ? 1048576 : 524288) | (composerImplV.I(onZeroResultHorizontalListVisible) ? 8388608 : 4194304) | (composerImplV.I(onChatEntryBannerClicked) ? 67108864 : 33554432) | (composerImplV.p(z2) ? 536870912 : 268435456);
        if ((306783379 & i2) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            if (zeroResultPageData != null || (productListZeroResults != null && (productListZeroResults instanceof ProductListZeroResults.ZeroResultData))) {
                composerImplV.o(889980429);
                if (zeroResultPageData == null) {
                    Intrinsics.f(productListZeroResults, "null cannot be cast to non-null type au.com.woolworths.feature.product.list.data.ProductListZeroResults.ZeroResultData");
                    zeroResultPageData2 = ProductListZeroResultsKt.toZeroResultPageData((ProductListZeroResults.ZeroResultData) productListZeroResults);
                } else {
                    zeroResultPageData2 = zeroResultPageData;
                }
                ZeroResultContentViewKt.b(zeroResultPageData2, z, productClickListener, onBrowseAllAislesClick, onProductCategoryTileClick, onZeroResultVisible, onZeroResultHorizontalListVisible, z2, onChatEntryBannerClicked, companion, composerImplV, (i2 & 234881024) | ((i2 >> 3) & 4194288) | ((i2 >> 6) & 29360128) | 805306368, 0);
                composerImplV.V(false);
            } else {
                composerImplV.o(890689554);
                if (productListZeroResults != null) {
                    ProductListErrorScreenKt.a((ProductListZeroResults.ProductListFullScreenError) productListZeroResults, companion, composerImplV, 56);
                }
                composerImplV.V(false);
            }
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(zeroResultPageData, z, productClickListener, onBrowseAllAislesClick, onProductCategoryTileClick, onZeroResultVisible, onZeroResultHorizontalListVisible, onChatEntryBannerClicked, z2, modifier2, i) { // from class: au.com.woolworths.feature.product.list.compose.errorscreen.a
                public final /* synthetic */ ZeroResultPageData e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ ProductClickListener g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ Function1 l;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ Modifier n;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    ProductListZeroResultsViewKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
