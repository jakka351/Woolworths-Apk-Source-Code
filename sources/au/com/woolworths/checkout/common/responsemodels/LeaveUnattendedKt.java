package au.com.woolworths.checkout.common.responsemodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, d2 = {"isEnabled", "", "Lau/com/woolworths/checkout/common/responsemodels/LeaveUnattended;", "(Lau/com/woolworths/checkout/common/responsemodels/LeaveUnattended;)Z", "shop-checkout-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaveUnattendedKt {
    public static final boolean isEnabled(@NotNull LeaveUnattended leaveUnattended) {
        Intrinsics.h(leaveUnattended, "<this>");
        return !leaveUnattended.getDisableLeaveUnattended();
    }
}
