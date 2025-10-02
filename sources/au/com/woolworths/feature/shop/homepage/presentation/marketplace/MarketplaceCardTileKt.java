package au.com.woolworths.feature.shop.homepage.presentation.marketplace;

import android.content.Context;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.feature.shop.homepage.data.MarketplaceCard;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceCardTileKt {
    public static final void a(final MarketplaceCard marketplaceCard, Function0 onClickListener, Composer composer, int i) {
        Intrinsics.h(onClickListener, "onClickListener");
        ComposerImpl composerImplV = composer.v(-1525718255);
        int i2 = i | (composerImplV.n(marketplaceCard) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onClickListener) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 16;
            CardKt.b(onClickListener, PaddingKt.j(Modifier.Companion.d, f, BitmapDescriptorFactory.HUE_RED, f, f, 2), false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(881630839, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.marketplace.MarketplaceCardTileKt$MarketplaceCardTile$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierA = AspectRatioKt.a(SizeKt.e(Modifier.Companion.d, 1.0f), 2.8583333f);
                        ImageRequest.Builder builder = new ImageRequest.Builder((Context) composer2.x(AndroidCompositionLocals_androidKt.b));
                        MarketplaceCard marketplaceCard2 = marketplaceCard;
                        builder.c = marketplaceCard2.f7199a;
                        ImageRequestsKt.a(builder);
                        builder.j = CachePolicy.g;
                        SingletonAsyncImageKt.b(builder.a(), marketplaceCard2.b, modifierA, null, PainterResources_androidKt.a(R.drawable.banner_marketplace, 0, composer2), null, null, null, null, null, ContentScale.Companion.g, null, composer2, KyberEngine.KyberPolyBytes, 6, 31720);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 3) & 14) | 805306416, 508);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(marketplaceCard, i, 3, onClickListener);
        }
    }
}
