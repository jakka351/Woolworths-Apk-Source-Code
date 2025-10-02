package au.com.woolworths.sdui.shop.broadcastbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/broadcastbanner/NoOpDismissableBannerState;", "Lau/com/woolworths/sdui/shop/broadcastbanner/DismissableBannerState;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NoOpDismissableBannerState implements DismissableBannerState {
    @Override // au.com.woolworths.sdui.shop.broadcastbanner.DismissableBannerState
    public final boolean a() {
        return false;
    }

    @Override // au.com.woolworths.sdui.shop.broadcastbanner.DismissableBannerState
    public final Object b(Continuation continuation) {
        return Unit.f24250a;
    }
}
