package au.com.woolworths.foundation.shop.model.checkout;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/model/checkout/CheckoutRecognisedError;", "", "Companion", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutRecognisedError {
    public static final Companion e;
    public static final LinkedHashMap f;
    public static final CheckoutRecognisedError g;
    public static final CheckoutRecognisedError h;
    public static final CheckoutRecognisedError i;
    public static final /* synthetic */ CheckoutRecognisedError[] j;
    public static final /* synthetic */ EnumEntries k;
    public final int d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/shop/model/checkout/CheckoutRecognisedError$Companion;", "", "", "", "Lau/com/woolworths/foundation/shop/model/checkout/CheckoutRecognisedError;", "map", "Ljava/util/Map;", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static CheckoutRecognisedError a(int i) {
            return (CheckoutRecognisedError) CheckoutRecognisedError.f.get(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        CheckoutRecognisedError checkoutRecognisedError = new CheckoutRecognisedError("MINIMUM_SPEND", 0, 1001);
        CheckoutRecognisedError checkoutRecognisedError2 = new CheckoutRecognisedError("LIQUOR_CURFEW", 1, 1002);
        CheckoutRecognisedError checkoutRecognisedError3 = new CheckoutRecognisedError("WINDOW_NOT_SET", 2, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        g = checkoutRecognisedError3;
        CheckoutRecognisedError checkoutRecognisedError4 = new CheckoutRecognisedError("WINDOW_INVALID", 3, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
        h = checkoutRecognisedError4;
        CheckoutRecognisedError checkoutRecognisedError5 = new CheckoutRecognisedError("NO_AVAILABLE_ITEMS", 4, 1006);
        i = checkoutRecognisedError5;
        CheckoutRecognisedError[] checkoutRecognisedErrorArr = {checkoutRecognisedError, checkoutRecognisedError2, checkoutRecognisedError3, checkoutRecognisedError4, checkoutRecognisedError5, new CheckoutRecognisedError("WINDOW_RESTRICTED", 5, 1003), new CheckoutRecognisedError("UNAVAILABLE_ITEMS", 6, 1007), new CheckoutRecognisedError("RESTRICTED_ITEMS", 7, 1008), new CheckoutRecognisedError("INVALID_PRODUCT_GROUP_SUPPLY_LIMIT", 8, 1026), new CheckoutRecognisedError("INVALID_DELIVERY_METHOD", 9, 1027), new CheckoutRecognisedError("INVALID_SAP_PRODUCTS", 10, 1028), new CheckoutRecognisedError("ORDER_LIMIT_REACHED", 11, 1029), new CheckoutRecognisedError("DAILY_ORDER_LIMIT_REACHED", 12, 1031), new CheckoutRecognisedError("ADDRESS_INVALID", 13, 1009)};
        j = checkoutRecognisedErrorArr;
        EnumEntries enumEntriesA = EnumEntriesKt.a(checkoutRecognisedErrorArr);
        k = enumEntriesA;
        e = new Companion();
        int iH = MapsKt.h(CollectionsKt.s(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator it = ((AbstractList) enumEntriesA).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(Integer.valueOf(((CheckoutRecognisedError) next).d), next);
        }
        f = linkedHashMap;
    }

    public CheckoutRecognisedError(String str, int i2, int i3) {
        this.d = i3;
    }

    public static CheckoutRecognisedError valueOf(String str) {
        return (CheckoutRecognisedError) Enum.valueOf(CheckoutRecognisedError.class, str);
    }

    public static CheckoutRecognisedError[] values() {
        return (CheckoutRecognisedError[]) j.clone();
    }
}
