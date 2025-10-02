package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutMessageType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutMessageType {
    public static final Companion e;
    public static final CheckoutMessageType f;
    public static final /* synthetic */ CheckoutMessageType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutMessageType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CheckoutMessageType checkoutMessageType = new CheckoutMessageType("Error", 0, "Error");
        CheckoutMessageType checkoutMessageType2 = new CheckoutMessageType("Warning", 1, "Warning");
        CheckoutMessageType checkoutMessageType3 = new CheckoutMessageType("Info", 2, "Info");
        CheckoutMessageType checkoutMessageType4 = new CheckoutMessageType("UNKNOWN__", 3, "UNKNOWN__");
        f = checkoutMessageType4;
        CheckoutMessageType[] checkoutMessageTypeArr = {checkoutMessageType, checkoutMessageType2, checkoutMessageType3, checkoutMessageType4};
        g = checkoutMessageTypeArr;
        h = EnumEntriesKt.a(checkoutMessageTypeArr);
        e = new Companion();
        CollectionsKt.R("Error", "Warning", "Info");
    }

    public CheckoutMessageType(String str, int i, String str2) {
        this.d = str2;
    }

    public static CheckoutMessageType valueOf(String str) {
        return (CheckoutMessageType) Enum.valueOf(CheckoutMessageType.class, str);
    }

    public static CheckoutMessageType[] values() {
        return (CheckoutMessageType[]) g.clone();
    }
}
