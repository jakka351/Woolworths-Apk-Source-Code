package au.com.woolworths.feature.shop.myorders.details.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/MyGroceriesProductListBadgeType;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MyGroceriesProductListBadgeType {
    public static final MyGroceriesProductListBadgeType d;
    public static final MyGroceriesProductListBadgeType e;
    public static final MyGroceriesProductListBadgeType f;
    public static final MyGroceriesProductListBadgeType g;
    public static final /* synthetic */ MyGroceriesProductListBadgeType[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        MyGroceriesProductListBadgeType myGroceriesProductListBadgeType = new MyGroceriesProductListBadgeType("SUPPLIED", 0);
        d = myGroceriesProductListBadgeType;
        MyGroceriesProductListBadgeType myGroceriesProductListBadgeType2 = new MyGroceriesProductListBadgeType("OUTOFSTOCK", 1);
        e = myGroceriesProductListBadgeType2;
        MyGroceriesProductListBadgeType myGroceriesProductListBadgeType3 = new MyGroceriesProductListBadgeType("SUBSTITUTED", 2);
        f = myGroceriesProductListBadgeType3;
        MyGroceriesProductListBadgeType myGroceriesProductListBadgeType4 = new MyGroceriesProductListBadgeType("TOTAL", 3);
        g = myGroceriesProductListBadgeType4;
        MyGroceriesProductListBadgeType[] myGroceriesProductListBadgeTypeArr = {myGroceriesProductListBadgeType, myGroceriesProductListBadgeType2, myGroceriesProductListBadgeType3, myGroceriesProductListBadgeType4};
        h = myGroceriesProductListBadgeTypeArr;
        i = EnumEntriesKt.a(myGroceriesProductListBadgeTypeArr);
    }

    public static MyGroceriesProductListBadgeType valueOf(String str) {
        return (MyGroceriesProductListBadgeType) Enum.valueOf(MyGroceriesProductListBadgeType.class, str);
    }

    public static MyGroceriesProductListBadgeType[] values() {
        return (MyGroceriesProductListBadgeType[]) h.clone();
    }
}
