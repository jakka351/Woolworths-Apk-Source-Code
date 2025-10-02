package au.com.woolworths.shop.checkout.domain.model.address;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/address/MarketFulfilmentAddressStatus;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MarketFulfilmentAddressStatus {
    public static final MarketFulfilmentAddressStatus d;
    public static final MarketFulfilmentAddressStatus e;
    public static final MarketFulfilmentAddressStatus f;
    public static final MarketFulfilmentAddressStatus g;
    public static final /* synthetic */ MarketFulfilmentAddressStatus[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        MarketFulfilmentAddressStatus marketFulfilmentAddressStatus = new MarketFulfilmentAddressStatus("ADDRESS_SET", 0);
        d = marketFulfilmentAddressStatus;
        MarketFulfilmentAddressStatus marketFulfilmentAddressStatus2 = new MarketFulfilmentAddressStatus("ADDRESS_REQUIRED", 1);
        e = marketFulfilmentAddressStatus2;
        MarketFulfilmentAddressStatus marketFulfilmentAddressStatus3 = new MarketFulfilmentAddressStatus("ADDRESS_NOT_REQUIRED", 2);
        f = marketFulfilmentAddressStatus3;
        MarketFulfilmentAddressStatus marketFulfilmentAddressStatus4 = new MarketFulfilmentAddressStatus("UNKNOWN", 3);
        g = marketFulfilmentAddressStatus4;
        MarketFulfilmentAddressStatus[] marketFulfilmentAddressStatusArr = {marketFulfilmentAddressStatus, marketFulfilmentAddressStatus2, marketFulfilmentAddressStatus3, marketFulfilmentAddressStatus4};
        h = marketFulfilmentAddressStatusArr;
        i = EnumEntriesKt.a(marketFulfilmentAddressStatusArr);
    }

    public static MarketFulfilmentAddressStatus valueOf(String str) {
        return (MarketFulfilmentAddressStatus) Enum.valueOf(MarketFulfilmentAddressStatus.class, str);
    }

    public static MarketFulfilmentAddressStatus[] values() {
        return (MarketFulfilmentAddressStatus[]) h.clone();
    }
}
