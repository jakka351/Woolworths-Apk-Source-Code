package au.com.woolworths.android.onesite.network;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/ShopAppPreemptiveTokenRefreshInterceptor;", "Lau/com/woolworths/android/onesite/network/PreemptiveTokenRefreshInterceptor;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShopAppPreemptiveTokenRefreshInterceptor extends PreemptiveTokenRefreshInterceptor {
    public final ShopAccountInteractor c;

    public ShopAppPreemptiveTokenRefreshInterceptor(ShopAccountInteractor accountInteractor) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        this.c = accountInteractor;
    }

    @Override // au.com.woolworths.android.onesite.network.PreemptiveTokenRefreshInterceptor
    public final boolean b() {
        Member memberN = this.c.n();
        return memberN != null && System.currentTimeMillis() >= memberN.getExpirySinceEpoch();
    }
}
