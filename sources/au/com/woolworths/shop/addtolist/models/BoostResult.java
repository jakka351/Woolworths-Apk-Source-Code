package au.com.woolworths.shop.addtolist.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/models/BoostResult;", "", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BoostResult {
    public static final BoostResult d;
    public static final BoostResult e;
    public static final /* synthetic */ BoostResult[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        BoostResult boostResult = new BoostResult("Success", 0);
        d = boostResult;
        BoostResult boostResult2 = new BoostResult("Fail", 1);
        e = boostResult2;
        BoostResult[] boostResultArr = {boostResult, boostResult2};
        f = boostResultArr;
        g = EnumEntriesKt.a(boostResultArr);
    }

    public static BoostResult valueOf(String str) {
        return (BoostResult) Enum.valueOf(BoostResult.class, str);
    }

    public static BoostResult[] values() {
        return (BoostResult[]) f.clone();
    }
}
