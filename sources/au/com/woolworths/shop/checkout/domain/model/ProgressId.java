package au.com.woolworths.shop.checkout.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ProgressId;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgressId {
    public static final ProgressId d;
    public static final ProgressId e;
    public static final ProgressId f;
    public static final ProgressId g;
    public static final ProgressId h;
    public static final ProgressId i;
    public static final /* synthetic */ ProgressId[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        ProgressId progressId = new ProgressId("DETAILS", 0);
        d = progressId;
        ProgressId progressId2 = new ProgressId("PRODUCTS", 1);
        e = progressId2;
        ProgressId progressId3 = new ProgressId("SUMMARY", 2);
        f = progressId3;
        ProgressId progressId4 = new ProgressId("PAY", 3);
        g = progressId4;
        ProgressId progressId5 = new ProgressId("ReviewProducts", 4);
        h = progressId5;
        ProgressId progressId6 = new ProgressId("UNKNOWN", 5);
        i = progressId6;
        ProgressId[] progressIdArr = {progressId, progressId2, progressId3, progressId4, progressId5, progressId6};
        j = progressIdArr;
        k = EnumEntriesKt.a(progressIdArr);
    }

    public static ProgressId valueOf(String str) {
        return (ProgressId) Enum.valueOf(ProgressId.class, str);
    }

    public static ProgressId[] values() {
        return (ProgressId[]) j.clone();
    }
}
