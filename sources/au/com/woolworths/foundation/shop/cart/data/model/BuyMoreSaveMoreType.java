package au.com.woolworths.foundation.shop.cart.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/BuyMoreSaveMoreType;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BuyMoreSaveMoreType {
    public static final BuyMoreSaveMoreType d;
    public static final BuyMoreSaveMoreType e;
    public static final /* synthetic */ BuyMoreSaveMoreType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        BuyMoreSaveMoreType buyMoreSaveMoreType = new BuyMoreSaveMoreType("MEMBER", 0);
        d = buyMoreSaveMoreType;
        BuyMoreSaveMoreType buyMoreSaveMoreType2 = new BuyMoreSaveMoreType("ONLINE", 1);
        e = buyMoreSaveMoreType2;
        BuyMoreSaveMoreType[] buyMoreSaveMoreTypeArr = {buyMoreSaveMoreType, buyMoreSaveMoreType2};
        f = buyMoreSaveMoreTypeArr;
        g = EnumEntriesKt.a(buyMoreSaveMoreTypeArr);
    }

    public static BuyMoreSaveMoreType valueOf(String str) {
        return (BuyMoreSaveMoreType) Enum.valueOf(BuyMoreSaveMoreType.class, str);
    }

    public static BuyMoreSaveMoreType[] values() {
        return (BuyMoreSaveMoreType[]) f.clone();
    }
}
