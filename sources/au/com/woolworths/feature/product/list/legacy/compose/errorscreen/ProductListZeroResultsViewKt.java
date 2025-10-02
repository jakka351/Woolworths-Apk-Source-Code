package au.com.woolworths.feature.product.list.legacy.compose.errorscreen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.product.list.legacy.data.ProductListZeroResults;
import au.com.woolworths.feature.product.list.legacy.data.ZeroResultPageData;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListZeroResultsViewKt {
    public static final void a(final ProductListZeroResults productListZeroResults, final ZeroResultPageData zeroResultPageData, final boolean z, final ProductClickListener productClickListener, final Function1 onBrowseAllAislesClick, final Function1 onProductCategoryTileClick, final Function0 onZeroResultVisible, final Function1 onZeroResultHorizontalListVisible, final Function2 onClearFiltersClicked, final Function1 onChatEntryBannerClicked, final boolean z2, Modifier modifier, Composer composer, final int i) {
        final Modifier modifier2;
        ZeroResultPageData zeroResultPageData2;
        Intrinsics.h(productClickListener, "productClickListener");
        Intrinsics.h(onBrowseAllAislesClick, "onBrowseAllAislesClick");
        Intrinsics.h(onProductCategoryTileClick, "onProductCategoryTileClick");
        Intrinsics.h(onZeroResultVisible, "onZeroResultVisible");
        Intrinsics.h(onZeroResultHorizontalListVisible, "onZeroResultHorizontalListVisible");
        Intrinsics.h(onClearFiltersClicked, "onClearFiltersClicked");
        Intrinsics.h(onChatEntryBannerClicked, "onChatEntryBannerClicked");
        ComposerImpl composerImplV = composer.v(1426809156);
        int i2 = i | (composerImplV.n(productListZeroResults) ? 4 : 2) | (composerImplV.I(zeroResultPageData) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128) | (composerImplV.I(productClickListener) ? 2048 : 1024) | (composerImplV.I(onBrowseAllAislesClick) ? 16384 : 8192) | (composerImplV.I(onProductCategoryTileClick) ? 131072 : 65536) | (composerImplV.I(onZeroResultVisible) ? 1048576 : 524288) | (composerImplV.I(onZeroResultHorizontalListVisible) ? 8388608 : 4194304) | (composerImplV.I(onClearFiltersClicked) ? 67108864 : 33554432) | (composerImplV.I(onChatEntryBannerClicked) ? 536870912 : 268435456);
        int i3 = (composerImplV.p(z2) ? 4 : 2) | 48;
        if ((306783379 & i2) == 306783378 && (i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = Modifier.Companion.d;
            if (zeroResultPageData != null || (productListZeroResults != null && (productListZeroResults instanceof ProductListZeroResults.ZeroResultData))) {
                composerImplV.o(-1219009558);
                if (zeroResultPageData == null) {
                    Intrinsics.f(productListZeroResults, "null cannot be cast to non-null type au.com.woolworths.feature.product.list.legacy.data.ProductListZeroResults.ZeroResultData");
                    ProductListZeroResults.ZeroResultData zeroResultData = (ProductListZeroResults.ZeroResultData) productListZeroResults;
                    zeroResultPageData2 = new ZeroResultPageData(zeroResultData.f5368a, zeroResultData.b, zeroResultData.c, zeroResultData.d);
                } else {
                    zeroResultPageData2 = zeroResultPageData;
                }
                int i4 = i2 >> 3;
                ZeroResultContentViewKt.b(zeroResultPageData2, z, productClickListener, onBrowseAllAislesClick, onProductCategoryTileClick, onZeroResultVisible, onZeroResultHorizontalListVisible, z2, onChatEntryBannerClicked, modifier2, composerImplV, (i4 & 234881024) | (4194288 & i4) | (29360128 & (i3 << 21)) | 805306368, 0);
                composerImplV.V(false);
            } else {
                composerImplV.o(-1218298480);
                if (productListZeroResults != null) {
                    ProductListErrorScreenKt.a((ProductListZeroResults.ProductListFullScreenError) productListZeroResults, onClearFiltersClicked, modifier2, composerImplV, ((i2 >> 21) & 112) | KyberEngine.KyberPolyBytes);
                }
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(zeroResultPageData, z, productClickListener, onBrowseAllAislesClick, onProductCategoryTileClick, onZeroResultVisible, onZeroResultHorizontalListVisible, onClearFiltersClicked, onChatEntryBannerClicked, z2, modifier2, i) { // from class: au.com.woolworths.feature.product.list.legacy.compose.errorscreen.a
                public final /* synthetic */ ZeroResultPageData e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ ProductClickListener g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ Function2 l;
                public final /* synthetic */ Function1 m;
                public final /* synthetic */ boolean n;
                public final /* synthetic */ Modifier o;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ProductListZeroResultsViewKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, RecomposeScopeImplKt.a(1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
