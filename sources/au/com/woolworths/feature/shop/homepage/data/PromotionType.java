package au.com.woolworths.feature.shop.homepage.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/PromotionType;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PromotionType {
    public static final /* synthetic */ PromotionType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        PromotionType[] promotionTypeArr = {new PromotionType("PRODUCT_LIST", 0), new PromotionType("UNKNOWN", 1)};
        d = promotionTypeArr;
        e = EnumEntriesKt.a(promotionTypeArr);
    }

    public static PromotionType valueOf(String str) {
        return (PromotionType) Enum.valueOf(PromotionType.class, str);
    }

    public static PromotionType[] values() {
        return (PromotionType[]) d.clone();
    }
}
