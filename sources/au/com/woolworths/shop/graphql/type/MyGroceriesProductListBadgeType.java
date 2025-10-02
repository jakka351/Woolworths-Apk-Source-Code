package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/MyGroceriesProductListBadgeType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MyGroceriesProductListBadgeType {
    public static final Companion e;
    public static final EnumType f;
    public static final MyGroceriesProductListBadgeType g;
    public static final /* synthetic */ MyGroceriesProductListBadgeType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/MyGroceriesProductListBadgeType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static EnumType a() {
            return MyGroceriesProductListBadgeType.f;
        }
    }

    static {
        MyGroceriesProductListBadgeType myGroceriesProductListBadgeType = new MyGroceriesProductListBadgeType("SUPPLIED", 0, "SUPPLIED");
        MyGroceriesProductListBadgeType myGroceriesProductListBadgeType2 = new MyGroceriesProductListBadgeType("OUTOFSTOCK", 1, "OUTOFSTOCK");
        MyGroceriesProductListBadgeType myGroceriesProductListBadgeType3 = new MyGroceriesProductListBadgeType("SUBSTITUTED", 2, "SUBSTITUTED");
        MyGroceriesProductListBadgeType myGroceriesProductListBadgeType4 = new MyGroceriesProductListBadgeType("TOTAL", 3, "TOTAL");
        MyGroceriesProductListBadgeType myGroceriesProductListBadgeType5 = new MyGroceriesProductListBadgeType("UNKNOWN__", 4, "UNKNOWN__");
        g = myGroceriesProductListBadgeType5;
        MyGroceriesProductListBadgeType[] myGroceriesProductListBadgeTypeArr = {myGroceriesProductListBadgeType, myGroceriesProductListBadgeType2, myGroceriesProductListBadgeType3, myGroceriesProductListBadgeType4, myGroceriesProductListBadgeType5};
        h = myGroceriesProductListBadgeTypeArr;
        i = EnumEntriesKt.a(myGroceriesProductListBadgeTypeArr);
        e = new Companion();
        f = new EnumType("MyGroceriesProductListBadgeType", CollectionsKt.R("SUPPLIED", "OUTOFSTOCK", "SUBSTITUTED", "TOTAL"));
    }

    public MyGroceriesProductListBadgeType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static MyGroceriesProductListBadgeType valueOf(String str) {
        return (MyGroceriesProductListBadgeType) Enum.valueOf(MyGroceriesProductListBadgeType.class, str);
    }

    public static MyGroceriesProductListBadgeType[] values() {
        return (MyGroceriesProductListBadgeType[]) h.clone();
    }
}
