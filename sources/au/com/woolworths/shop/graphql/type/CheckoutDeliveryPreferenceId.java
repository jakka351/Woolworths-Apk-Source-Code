package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutDeliveryPreferenceId;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutDeliveryPreferenceId {
    public static final Companion e;
    public static final EnumType f;
    public static final CheckoutDeliveryPreferenceId g;
    public static final CheckoutDeliveryPreferenceId h;
    public static final CheckoutDeliveryPreferenceId i;
    public static final CheckoutDeliveryPreferenceId j;
    public static final CheckoutDeliveryPreferenceId k;
    public static final CheckoutDeliveryPreferenceId l;
    public static final /* synthetic */ CheckoutDeliveryPreferenceId[] m;
    public static final /* synthetic */ EnumEntries n;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutDeliveryPreferenceId$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CheckoutDeliveryPreferenceId checkoutDeliveryPreferenceId = new CheckoutDeliveryPreferenceId("SelfIsolation", 0, "SelfIsolation");
        g = checkoutDeliveryPreferenceId;
        CheckoutDeliveryPreferenceId checkoutDeliveryPreferenceId2 = new CheckoutDeliveryPreferenceId("LeaveUnattended", 1, "LeaveUnattended");
        h = checkoutDeliveryPreferenceId2;
        CheckoutDeliveryPreferenceId checkoutDeliveryPreferenceId3 = new CheckoutDeliveryPreferenceId("DeliveryInstruction", 2, "DeliveryInstruction");
        i = checkoutDeliveryPreferenceId3;
        CheckoutDeliveryPreferenceId checkoutDeliveryPreferenceId4 = new CheckoutDeliveryPreferenceId("NominatedIdCheck", 3, "NominatedIdCheck");
        j = checkoutDeliveryPreferenceId4;
        CheckoutDeliveryPreferenceId checkoutDeliveryPreferenceId5 = new CheckoutDeliveryPreferenceId("ShopperInstruction", 4, "ShopperInstruction");
        k = checkoutDeliveryPreferenceId5;
        CheckoutDeliveryPreferenceId checkoutDeliveryPreferenceId6 = new CheckoutDeliveryPreferenceId("UNKNOWN__", 5, "UNKNOWN__");
        l = checkoutDeliveryPreferenceId6;
        CheckoutDeliveryPreferenceId[] checkoutDeliveryPreferenceIdArr = {checkoutDeliveryPreferenceId, checkoutDeliveryPreferenceId2, checkoutDeliveryPreferenceId3, checkoutDeliveryPreferenceId4, checkoutDeliveryPreferenceId5, checkoutDeliveryPreferenceId6};
        m = checkoutDeliveryPreferenceIdArr;
        n = EnumEntriesKt.a(checkoutDeliveryPreferenceIdArr);
        e = new Companion();
        f = new EnumType("CheckoutDeliveryPreferenceId", CollectionsKt.R("SelfIsolation", "LeaveUnattended", "DeliveryInstruction", "NominatedIdCheck", "ShopperInstruction"));
    }

    public CheckoutDeliveryPreferenceId(String str, int i2, String str2) {
        this.d = str2;
    }

    public static CheckoutDeliveryPreferenceId valueOf(String str) {
        return (CheckoutDeliveryPreferenceId) Enum.valueOf(CheckoutDeliveryPreferenceId.class, str);
    }

    public static CheckoutDeliveryPreferenceId[] values() {
        return (CheckoutDeliveryPreferenceId[]) m.clone();
    }
}
