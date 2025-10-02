package au.com.woolworths.foundation.shop.nhp.model.edr;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/model/edr/RtlOfferStatus;", "", "nhp-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RtlOfferStatus {
    public static final RtlOfferStatus d;
    public static final RtlOfferStatus e;
    public static final RtlOfferStatus f;
    public static final /* synthetic */ RtlOfferStatus[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        RtlOfferStatus rtlOfferStatus = new RtlOfferStatus("ACTIVE", 0);
        d = rtlOfferStatus;
        RtlOfferStatus rtlOfferStatus2 = new RtlOfferStatus("ENDED", 1);
        e = rtlOfferStatus2;
        RtlOfferStatus rtlOfferStatus3 = new RtlOfferStatus("COMPLETED", 2);
        f = rtlOfferStatus3;
        RtlOfferStatus[] rtlOfferStatusArr = {rtlOfferStatus, rtlOfferStatus2, rtlOfferStatus3};
        g = rtlOfferStatusArr;
        h = EnumEntriesKt.a(rtlOfferStatusArr);
    }

    public static RtlOfferStatus valueOf(String str) {
        return (RtlOfferStatus) Enum.valueOf(RtlOfferStatus.class, str);
    }

    public static RtlOfferStatus[] values() {
        return (RtlOfferStatus[]) g.clone();
    }
}
