package au.com.woolworths.feature.shop.delivery.address.addaddressmanually;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AddDeliveryAddressScreen implements Screen {
    public static final AddDeliveryAddressScreen d;
    public static final /* synthetic */ AddDeliveryAddressScreen[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        AddDeliveryAddressScreen addDeliveryAddressScreen = new AddDeliveryAddressScreen() { // from class: au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressScreen.MANUALLY_ADD_DELIVERY_ADDRESS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Collection Mode";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Add Delivery Address Manually screen";
            }
        };
        d = addDeliveryAddressScreen;
        AddDeliveryAddressScreen[] addDeliveryAddressScreenArr = {addDeliveryAddressScreen};
        e = addDeliveryAddressScreenArr;
        f = EnumEntriesKt.a(addDeliveryAddressScreenArr);
    }

    public static AddDeliveryAddressScreen valueOf(String str) {
        return (AddDeliveryAddressScreen) Enum.valueOf(AddDeliveryAddressScreen.class, str);
    }

    public static AddDeliveryAddressScreen[] values() {
        return (AddDeliveryAddressScreen[]) e.clone();
    }
}
