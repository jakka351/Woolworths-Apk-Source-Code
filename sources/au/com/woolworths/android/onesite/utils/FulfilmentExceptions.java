package au.com.woolworths.android.onesite.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.deliveryaddress.SaveAddressError;
import au.com.woolworths.android.onesite.modules.deliveryaddress.analytics.AddDeliveryAddressActions;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/utils/FulfilmentExceptions;", "", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FulfilmentExceptions {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkExceptions f4595a;
    public final AnalyticsManager b;

    public FulfilmentExceptions(NetworkExceptions networkExceptions, AnalyticsManager analyticsManager) {
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f4595a = networkExceptions;
        this.b = analyticsManager;
    }

    public final String a(Throwable throwable) {
        Intrinsics.h(throwable, "throwable");
        SaveAddressError saveAddressError = (SaveAddressError) this.f4595a.b(throwable, SaveAddressError.class);
        if (saveAddressError == null || !"SERVICE_NOT_AVAILABLE".equals(saveAddressError.getErrorDetail().getCode())) {
            return null;
        }
        this.b.c(AddDeliveryAddressActions.f);
        return saveAddressError.getErrorDetail().getMessage();
    }
}
