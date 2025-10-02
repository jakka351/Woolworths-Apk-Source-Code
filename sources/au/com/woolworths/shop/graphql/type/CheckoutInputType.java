package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutInputType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutInputType {
    public static final Companion e;
    public static final CheckoutInputType f;
    public static final /* synthetic */ CheckoutInputType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutInputType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CheckoutInputType checkoutInputType = new CheckoutInputType("SegmentIndex", 0, "SegmentIndex");
        CheckoutInputType checkoutInputType2 = new CheckoutInputType("CollectionMode", 1, "CollectionMode");
        CheckoutInputType checkoutInputType3 = new CheckoutInputType("FulfilmentWindow", 2, "FulfilmentWindow");
        CheckoutInputType checkoutInputType4 = new CheckoutInputType("Packaging", 3, "Packaging");
        CheckoutInputType checkoutInputType5 = new CheckoutInputType("UNKNOWN__", 4, "UNKNOWN__");
        f = checkoutInputType5;
        CheckoutInputType[] checkoutInputTypeArr = {checkoutInputType, checkoutInputType2, checkoutInputType3, checkoutInputType4, checkoutInputType5};
        g = checkoutInputTypeArr;
        h = EnumEntriesKt.a(checkoutInputTypeArr);
        e = new Companion();
        CollectionsKt.R("SegmentIndex", "CollectionMode", "FulfilmentWindow", "Packaging");
    }

    public CheckoutInputType(String str, int i, String str2) {
        this.d = str2;
    }

    public static CheckoutInputType valueOf(String str) {
        return (CheckoutInputType) Enum.valueOf(CheckoutInputType.class, str);
    }

    public static CheckoutInputType[] values() {
        return (CheckoutInputType[]) g.clone();
    }
}
