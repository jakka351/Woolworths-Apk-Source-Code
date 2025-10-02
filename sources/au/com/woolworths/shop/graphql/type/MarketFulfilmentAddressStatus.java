package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/MarketFulfilmentAddressStatus;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MarketFulfilmentAddressStatus {
    public static final Companion e;
    public static final EnumType f;
    public static final MarketFulfilmentAddressStatus g;
    public static final /* synthetic */ MarketFulfilmentAddressStatus[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/MarketFulfilmentAddressStatus$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static EnumType a() {
            return MarketFulfilmentAddressStatus.f;
        }
    }

    static {
        MarketFulfilmentAddressStatus marketFulfilmentAddressStatus = new MarketFulfilmentAddressStatus("ADDRESS_SET", 0, "ADDRESS_SET");
        MarketFulfilmentAddressStatus marketFulfilmentAddressStatus2 = new MarketFulfilmentAddressStatus("ADDRESS_REQUIRED", 1, "ADDRESS_REQUIRED");
        MarketFulfilmentAddressStatus marketFulfilmentAddressStatus3 = new MarketFulfilmentAddressStatus("ADDRESS_NOT_REQUIRED", 2, "ADDRESS_NOT_REQUIRED");
        MarketFulfilmentAddressStatus marketFulfilmentAddressStatus4 = new MarketFulfilmentAddressStatus("UNKNOWN__", 3, "UNKNOWN__");
        g = marketFulfilmentAddressStatus4;
        MarketFulfilmentAddressStatus[] marketFulfilmentAddressStatusArr = {marketFulfilmentAddressStatus, marketFulfilmentAddressStatus2, marketFulfilmentAddressStatus3, marketFulfilmentAddressStatus4};
        h = marketFulfilmentAddressStatusArr;
        i = EnumEntriesKt.a(marketFulfilmentAddressStatusArr);
        e = new Companion();
        f = new EnumType("MarketFulfilmentAddressStatus", CollectionsKt.R("ADDRESS_SET", "ADDRESS_REQUIRED", "ADDRESS_NOT_REQUIRED"));
    }

    public MarketFulfilmentAddressStatus(String str, int i2, String str2) {
        this.d = str2;
    }

    public static MarketFulfilmentAddressStatus valueOf(String str) {
        return (MarketFulfilmentAddressStatus) Enum.valueOf(MarketFulfilmentAddressStatus.class, str);
    }

    public static MarketFulfilmentAddressStatus[] values() {
        return (MarketFulfilmentAddressStatus[]) h.clone();
    }
}
