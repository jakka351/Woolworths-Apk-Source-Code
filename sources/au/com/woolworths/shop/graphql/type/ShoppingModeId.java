package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ShoppingModeId;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingModeId {
    public static final Companion e;
    public static final EnumType f;
    public static final ShoppingModeId g;
    public static final ShoppingModeId h;
    public static final ShoppingModeId i;
    public static final ShoppingModeId j;
    public static final ShoppingModeId k;
    public static final /* synthetic */ ShoppingModeId[] l;
    public static final /* synthetic */ EnumEntries m;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ShoppingModeId$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ShoppingModeId shoppingModeId = new ShoppingModeId("DELIVERY", 0, "DELIVERY");
        g = shoppingModeId;
        ShoppingModeId shoppingModeId2 = new ShoppingModeId("DELIVERY_NOW", 1, "DELIVERY_NOW");
        h = shoppingModeId2;
        ShoppingModeId shoppingModeId3 = new ShoppingModeId("PICKUP", 2, "PICKUP");
        i = shoppingModeId3;
        ShoppingModeId shoppingModeId4 = new ShoppingModeId("INSTORE", 3, "INSTORE");
        j = shoppingModeId4;
        ShoppingModeId shoppingModeId5 = new ShoppingModeId("UNKNOWN__", 4, "UNKNOWN__");
        k = shoppingModeId5;
        ShoppingModeId[] shoppingModeIdArr = {shoppingModeId, shoppingModeId2, shoppingModeId3, shoppingModeId4, shoppingModeId5};
        l = shoppingModeIdArr;
        m = EnumEntriesKt.a(shoppingModeIdArr);
        e = new Companion();
        f = new EnumType("ShoppingModeId", CollectionsKt.R("DELIVERY", "DELIVERY_NOW", "PICKUP", "INSTORE"));
    }

    public ShoppingModeId(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ShoppingModeId valueOf(String str) {
        return (ShoppingModeId) Enum.valueOf(ShoppingModeId.class, str);
    }

    public static ShoppingModeId[] values() {
        return (ShoppingModeId[]) l.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
