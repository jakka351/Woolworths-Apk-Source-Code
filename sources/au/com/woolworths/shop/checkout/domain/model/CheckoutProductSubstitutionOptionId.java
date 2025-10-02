package au.com.woolworths.shop.checkout.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutProductSubstitutionOptionId;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutProductSubstitutionOptionId {
    public static final CheckoutProductSubstitutionOptionId d;
    public static final CheckoutProductSubstitutionOptionId e;
    public static final CheckoutProductSubstitutionOptionId f;
    public static final CheckoutProductSubstitutionOptionId g;
    public static final /* synthetic */ CheckoutProductSubstitutionOptionId[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        CheckoutProductSubstitutionOptionId checkoutProductSubstitutionOptionId = new CheckoutProductSubstitutionOptionId("ALLOW_ALL", 0);
        d = checkoutProductSubstitutionOptionId;
        CheckoutProductSubstitutionOptionId checkoutProductSubstitutionOptionId2 = new CheckoutProductSubstitutionOptionId("ALLOW_CERTAIN", 1);
        e = checkoutProductSubstitutionOptionId2;
        CheckoutProductSubstitutionOptionId checkoutProductSubstitutionOptionId3 = new CheckoutProductSubstitutionOptionId("DO_NOT_ALLOW", 2);
        f = checkoutProductSubstitutionOptionId3;
        CheckoutProductSubstitutionOptionId checkoutProductSubstitutionOptionId4 = new CheckoutProductSubstitutionOptionId("UNKNOWN", 3);
        g = checkoutProductSubstitutionOptionId4;
        CheckoutProductSubstitutionOptionId[] checkoutProductSubstitutionOptionIdArr = {checkoutProductSubstitutionOptionId, checkoutProductSubstitutionOptionId2, checkoutProductSubstitutionOptionId3, checkoutProductSubstitutionOptionId4};
        h = checkoutProductSubstitutionOptionIdArr;
        i = EnumEntriesKt.a(checkoutProductSubstitutionOptionIdArr);
    }

    public static CheckoutProductSubstitutionOptionId valueOf(String str) {
        return (CheckoutProductSubstitutionOptionId) Enum.valueOf(CheckoutProductSubstitutionOptionId.class, str);
    }

    public static CheckoutProductSubstitutionOptionId[] values() {
        return (CheckoutProductSubstitutionOptionId[]) h.clone();
    }
}
