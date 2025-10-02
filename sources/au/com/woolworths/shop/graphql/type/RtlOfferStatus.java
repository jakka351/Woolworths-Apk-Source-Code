package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/RtlOfferStatus;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RtlOfferStatus {
    public static final Companion e;
    public static final EnumType f;
    public static final RtlOfferStatus g;
    public static final /* synthetic */ RtlOfferStatus[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/RtlOfferStatus$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        RtlOfferStatus rtlOfferStatus = new RtlOfferStatus("ACTIVE", 0, "ACTIVE");
        RtlOfferStatus rtlOfferStatus2 = new RtlOfferStatus("ENDED", 1, "ENDED");
        RtlOfferStatus rtlOfferStatus3 = new RtlOfferStatus("COMPLETED", 2, "COMPLETED");
        RtlOfferStatus rtlOfferStatus4 = new RtlOfferStatus("UNKNOWN__", 3, "UNKNOWN__");
        g = rtlOfferStatus4;
        RtlOfferStatus[] rtlOfferStatusArr = {rtlOfferStatus, rtlOfferStatus2, rtlOfferStatus3, rtlOfferStatus4};
        h = rtlOfferStatusArr;
        i = EnumEntriesKt.a(rtlOfferStatusArr);
        e = new Companion();
        f = new EnumType("RtlOfferStatus", CollectionsKt.R("ACTIVE", "ENDED", "COMPLETED"));
    }

    public RtlOfferStatus(String str, int i2, String str2) {
        this.d = str2;
    }

    public static RtlOfferStatus valueOf(String str) {
        return (RtlOfferStatus) Enum.valueOf(RtlOfferStatus.class, str);
    }

    public static RtlOfferStatus[] values() {
        return (RtlOfferStatus[]) h.clone();
    }
}
