package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ShoppingModeType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingModeType {
    public static final Companion e;
    public static final EnumType f;
    public static final ShoppingModeType g;
    public static final ShoppingModeType h;
    public static final ShoppingModeType i;
    public static final ShoppingModeType j;
    public static final ShoppingModeType k;
    public static final /* synthetic */ ShoppingModeType[] l;
    public static final /* synthetic */ EnumEntries m;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ShoppingModeType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ShoppingModeType shoppingModeType = new ShoppingModeType("DELIVERY", 0, "DELIVERY");
        g = shoppingModeType;
        ShoppingModeType shoppingModeType2 = new ShoppingModeType("PICKUP", 1, "PICKUP");
        h = shoppingModeType2;
        ShoppingModeType shoppingModeType3 = new ShoppingModeType("INSTORE", 2, "INSTORE");
        i = shoppingModeType3;
        ShoppingModeType shoppingModeType4 = new ShoppingModeType("NOTSET", 3, "NOTSET");
        j = shoppingModeType4;
        ShoppingModeType shoppingModeType5 = new ShoppingModeType("UNKNOWN__", 4, "UNKNOWN__");
        k = shoppingModeType5;
        ShoppingModeType[] shoppingModeTypeArr = {shoppingModeType, shoppingModeType2, shoppingModeType3, shoppingModeType4, shoppingModeType5};
        l = shoppingModeTypeArr;
        m = EnumEntriesKt.a(shoppingModeTypeArr);
        e = new Companion();
        f = new EnumType("ShoppingModeType", CollectionsKt.R("DELIVERY", "PICKUP", "INSTORE", "NOTSET"));
    }

    public ShoppingModeType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ShoppingModeType valueOf(String str) {
        return (ShoppingModeType) Enum.valueOf(ShoppingModeType.class, str);
    }

    public static ShoppingModeType[] values() {
        return (ShoppingModeType[]) l.clone();
    }
}
