package au.com.woolworths.feature.shop.more.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/data/MoreTileType;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoreTileType {
    public static final MoreTileType d;
    public static final MoreTileType e;
    public static final MoreTileType f;
    public static final MoreTileType g;
    public static final MoreTileType h;
    public static final MoreTileType i;
    public static final MoreTileType j;
    public static final MoreTileType k;
    public static final MoreTileType l;
    public static final MoreTileType m;
    public static final MoreTileType n;
    public static final MoreTileType o;
    public static final MoreTileType p;
    public static final MoreTileType q;
    public static final MoreTileType r;
    public static final MoreTileType s;
    public static final MoreTileType t;
    public static final MoreTileType u;
    public static final /* synthetic */ MoreTileType[] v;
    public static final /* synthetic */ EnumEntries w;

    static {
        MoreTileType moreTileType = new MoreTileType("SNG", 0);
        d = moreTileType;
        MoreTileType moreTileType2 = new MoreTileType("FIND_A_STORE", 1);
        e = moreTileType2;
        MoreTileType moreTileType3 = new MoreTileType("REWARDS", 2);
        f = moreTileType3;
        MoreTileType moreTileType4 = new MoreTileType("E_RECEIPTS", 3);
        g = moreTileType4;
        MoreTileType moreTileType5 = new MoreTileType("EVERYDAY_EXTRA", 4);
        h = moreTileType5;
        MoreTileType moreTileType6 = new MoreTileType("MY_ORDERS", 5);
        i = moreTileType6;
        MoreTileType moreTileType7 = new MoreTileType("LIQUOR_PURCHASE_NOTICES", 6);
        j = moreTileType7;
        MoreTileType moreTileType8 = new MoreTileType("PRODUCT_RECALLS", 7);
        k = moreTileType8;
        MoreTileType moreTileType9 = new MoreTileType("FAQ", 8);
        l = moreTileType9;
        MoreTileType moreTileType10 = new MoreTileType("FOOD_SAFETY", 9);
        m = moreTileType10;
        MoreTileType moreTileType11 = new MoreTileType("TERMS_OF_USE", 10);
        n = moreTileType11;
        MoreTileType moreTileType12 = new MoreTileType("PRIVACY_POLICY", 11);
        o = moreTileType12;
        MoreTileType moreTileType13 = new MoreTileType("FEEDBACK", 12);
        p = moreTileType13;
        MoreTileType moreTileType14 = new MoreTileType("TWO_FACTOR_AUTH_SETTINGS", 13);
        MoreTileType moreTileType15 = new MoreTileType("LOGOUT", 14);
        q = moreTileType15;
        MoreTileType moreTileType16 = new MoreTileType("DEVELOPER_OPTIONS", 15);
        MoreTileType moreTileType17 = new MoreTileType("MY_ACCOUNT", 16);
        r = moreTileType17;
        MoreTileType moreTileType18 = new MoreTileType("LOGIN_AND_SECURITY", 17);
        s = moreTileType18;
        MoreTileType moreTileType19 = new MoreTileType("MESSAGE_US", 18);
        t = moreTileType19;
        MoreTileType moreTileType20 = new MoreTileType("CHANGE_COUNTRY", 19);
        u = moreTileType20;
        MoreTileType[] moreTileTypeArr = {moreTileType, moreTileType2, moreTileType3, moreTileType4, moreTileType5, moreTileType6, moreTileType7, moreTileType8, moreTileType9, moreTileType10, moreTileType11, moreTileType12, moreTileType13, moreTileType14, moreTileType15, moreTileType16, moreTileType17, moreTileType18, moreTileType19, moreTileType20};
        v = moreTileTypeArr;
        w = EnumEntriesKt.a(moreTileTypeArr);
    }

    public static MoreTileType valueOf(String str) {
        return (MoreTileType) Enum.valueOf(MoreTileType.class, str);
    }

    public static MoreTileType[] values() {
        return (MoreTileType[]) v.clone();
    }
}
