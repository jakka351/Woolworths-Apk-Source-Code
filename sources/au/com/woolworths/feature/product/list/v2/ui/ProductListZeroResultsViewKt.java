package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.product.list.v2.data.ProductListZeroResults;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListZeroResultsViewKt {
    public static final void a(ProductListZeroResults productListZeroResults, boolean z, ProductClickListener productClickListener, Function1 eventSink, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(eventSink, "eventSink");
        ComposerImpl composerImplV = composer.v(1724552864);
        int i2 = i | (composerImplV.n(productListZeroResults) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(productClickListener) ? 256 : 128) | (composerImplV.I(eventSink) ? 2048 : 1024) | 196608;
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            boolean z2 = productListZeroResults instanceof ProductListZeroResults.ProductListFullScreenError;
            Modifier.Companion companion = Modifier.Companion.d;
            if (z2) {
                composerImplV.o(-244021814);
                ProductListErrorScreenKt.a((ProductListZeroResults.ProductListFullScreenError) productListZeroResults, eventSink, companion, composerImplV, ((i2 >> 6) & 112) | KyberEngine.KyberPolyBytes);
                composerImplV.V(false);
            } else {
                if (!(productListZeroResults instanceof ProductListZeroResults.ZeroResultData)) {
                    throw au.com.woolworths.android.onesite.a.w(-562063566, composerImplV, false);
                }
                composerImplV.o(-243780572);
                ZeroResultContentViewKt.b((ProductListZeroResults.ZeroResultData) productListZeroResults, z, productClickListener, false, eventSink, companion, composerImplV, ((i2 << 3) & 57344) | (i2 & 1008) | 3072 | 196608, 0);
                composerImplV.V(false);
            }
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(productListZeroResults, z, productClickListener, eventSink, modifier2, i, 0);
        }
    }
}
