package au.com.woolworths.shop.checkout.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/DirectToBootNowStatus;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DirectToBootNowStatus {
    public static final DirectToBootNowStatus d;
    public static final DirectToBootNowStatus e;
    public static final DirectToBootNowStatus f;
    public static final DirectToBootNowStatus g;
    public static final DirectToBootNowStatus h;
    public static final DirectToBootNowStatus i;
    public static final /* synthetic */ DirectToBootNowStatus[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        DirectToBootNowStatus directToBootNowStatus = new DirectToBootNowStatus("Open", 0);
        d = directToBootNowStatus;
        DirectToBootNowStatus directToBootNowStatus2 = new DirectToBootNowStatus("Closed", 1);
        e = directToBootNowStatus2;
        DirectToBootNowStatus directToBootNowStatus3 = new DirectToBootNowStatus("Exhausted", 2);
        f = directToBootNowStatus3;
        DirectToBootNowStatus directToBootNowStatus4 = new DirectToBootNowStatus("Error", 3);
        g = directToBootNowStatus4;
        DirectToBootNowStatus directToBootNowStatus5 = new DirectToBootNowStatus("Ineligible", 4);
        h = directToBootNowStatus5;
        DirectToBootNowStatus directToBootNowStatus6 = new DirectToBootNowStatus("UNKNOWN", 5);
        i = directToBootNowStatus6;
        DirectToBootNowStatus[] directToBootNowStatusArr = {directToBootNowStatus, directToBootNowStatus2, directToBootNowStatus3, directToBootNowStatus4, directToBootNowStatus5, directToBootNowStatus6};
        j = directToBootNowStatusArr;
        k = EnumEntriesKt.a(directToBootNowStatusArr);
    }

    public static DirectToBootNowStatus valueOf(String str) {
        return (DirectToBootNowStatus) Enum.valueOf(DirectToBootNowStatus.class, str);
    }

    public static DirectToBootNowStatus[] values() {
        return (DirectToBootNowStatus[]) j.clone();
    }
}
