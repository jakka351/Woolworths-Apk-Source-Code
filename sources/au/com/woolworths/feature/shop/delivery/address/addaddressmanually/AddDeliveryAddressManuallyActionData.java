package au.com.woolworths.feature.shop.delivery.address.addaddressmanually;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AddDeliveryAddressManuallyActionData implements Action {
    public static final AddDeliveryAddressManuallyActionData e;
    public static final AddDeliveryAddressManuallyActionData f;
    public static final AddDeliveryAddressManuallyActionData g;
    public static final AddDeliveryAddressManuallyActionData h;
    public static final /* synthetic */ AddDeliveryAddressManuallyActionData[] i;
    public static final /* synthetic */ EnumEntries j;
    public final Screen d = AddDeliveryAddressScreen.d;

    static {
        AddDeliveryAddressManuallyActionData addDeliveryAddressManuallyActionData = new AddDeliveryAddressManuallyActionData() { // from class: au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActionData.DATA_VALIDATION_ERROR
            public final Category k = Category.v;
            public final String l = "Data Validation Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        e = addDeliveryAddressManuallyActionData;
        AddDeliveryAddressManuallyActionData addDeliveryAddressManuallyActionData2 = new AddDeliveryAddressManuallyActionData() { // from class: au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActionData.FAILED_WITH_NETWORK_ERROR
            public final Category k = Category.v;
            public final String l = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        f = addDeliveryAddressManuallyActionData2;
        AddDeliveryAddressManuallyActionData addDeliveryAddressManuallyActionData3 = new AddDeliveryAddressManuallyActionData() { // from class: au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActionData.FAILED_WITH_SERVER_ERROR
            public final Category k = Category.v;
            public final String l = "API Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        g = addDeliveryAddressManuallyActionData3;
        AddDeliveryAddressManuallyActionData addDeliveryAddressManuallyActionData4 = new AddDeliveryAddressManuallyActionData() { // from class: au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActionData.SAVE_MANUAL_ADDRESS
            public final Category k = Category.m;
            public final String l = "Add Address Manually";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        h = addDeliveryAddressManuallyActionData4;
        AddDeliveryAddressManuallyActionData[] addDeliveryAddressManuallyActionDataArr = {addDeliveryAddressManuallyActionData, addDeliveryAddressManuallyActionData2, addDeliveryAddressManuallyActionData3, addDeliveryAddressManuallyActionData4};
        i = addDeliveryAddressManuallyActionDataArr;
        j = EnumEntriesKt.a(addDeliveryAddressManuallyActionDataArr);
    }

    public AddDeliveryAddressManuallyActionData(String str, int i2) {
    }

    public static AddDeliveryAddressManuallyActionData valueOf(String str) {
        return (AddDeliveryAddressManuallyActionData) Enum.valueOf(AddDeliveryAddressManuallyActionData.class, str);
    }

    public static AddDeliveryAddressManuallyActionData[] values() {
        return (AddDeliveryAddressManuallyActionData[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
