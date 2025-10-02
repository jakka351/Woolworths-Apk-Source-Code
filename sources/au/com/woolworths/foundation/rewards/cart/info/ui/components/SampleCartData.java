package au.com.woolworths.foundation.rewards.cart.info.ui.components;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.rewards.cart.info.domain.model.CartInfoResponse;
import au.com.woolworths.rewards.base.data.IconAsset;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/info/ui/components/SampleCartData;", "", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SampleCartData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8553a;
    public final IconAsset b;

    public SampleCartData(String str, CartInfoResponse cartInfoResponse, IconAsset iconAsset) {
        this.f8553a = str;
        this.b = iconAsset;
    }

    /* renamed from: toString, reason: from getter */
    public final String getF8553a() {
        return this.f8553a;
    }
}
