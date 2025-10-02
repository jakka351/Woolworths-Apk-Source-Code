package au.com.woolworths.foundation.shop.cart.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/UpdateCartProductQuantityFailedReason;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpdateCartProductQuantityFailedReason {
    public static final UpdateCartProductQuantityFailedReason d;
    public static final UpdateCartProductQuantityFailedReason e;
    public static final UpdateCartProductQuantityFailedReason f;
    public static final /* synthetic */ UpdateCartProductQuantityFailedReason[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReason = new UpdateCartProductQuantityFailedReason("LOG_IN_REQUIRED", 0);
        d = updateCartProductQuantityFailedReason;
        UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReason2 = new UpdateCartProductQuantityFailedReason("AGE_RESTRICTION", 1);
        e = updateCartProductQuantityFailedReason2;
        UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReason3 = new UpdateCartProductQuantityFailedReason("UNSPECIFIED", 2);
        f = updateCartProductQuantityFailedReason3;
        UpdateCartProductQuantityFailedReason[] updateCartProductQuantityFailedReasonArr = {updateCartProductQuantityFailedReason, updateCartProductQuantityFailedReason2, updateCartProductQuantityFailedReason3};
        g = updateCartProductQuantityFailedReasonArr;
        h = EnumEntriesKt.a(updateCartProductQuantityFailedReasonArr);
    }

    public static UpdateCartProductQuantityFailedReason valueOf(String str) {
        return (UpdateCartProductQuantityFailedReason) Enum.valueOf(UpdateCartProductQuantityFailedReason.class, str);
    }

    public static UpdateCartProductQuantityFailedReason[] values() {
        return (UpdateCartProductQuantityFailedReason[]) g.clone();
    }
}
