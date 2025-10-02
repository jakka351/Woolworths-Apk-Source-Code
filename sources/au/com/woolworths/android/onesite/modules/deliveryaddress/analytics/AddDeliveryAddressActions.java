package au.com.woolworths.android.onesite.modules.deliveryaddress.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/analytics/AddDeliveryAddressActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AddDeliveryAddressActions implements Action {
    public static final AddDeliveryAddressActions e;
    public static final AddDeliveryAddressActions f;
    public static final /* synthetic */ AddDeliveryAddressActions[] g;
    public static final /* synthetic */ EnumEntries h;
    public final Screen d = Screens.d;

    static {
        AddDeliveryAddressActions addDeliveryAddressActions = new AddDeliveryAddressActions() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.analytics.AddDeliveryAddressActions.ADD_DELIVERY_ADDRESS_MANUALLY_CLICK
            public final Category i = Category.m;
            public final String j = "Add Address Manually";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        };
        e = addDeliveryAddressActions;
        AddDeliveryAddressActions addDeliveryAddressActions2 = new AddDeliveryAddressActions() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.analytics.AddDeliveryAddressActions.UNSUPPORTED_DELIVERY_ADDRESS_ERROR_IMPRESSION
            public final Category i = Category.g0;
            public final String j = "Unsupported Address Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        };
        f = addDeliveryAddressActions2;
        AddDeliveryAddressActions[] addDeliveryAddressActionsArr = {addDeliveryAddressActions, addDeliveryAddressActions2};
        g = addDeliveryAddressActionsArr;
        h = EnumEntriesKt.a(addDeliveryAddressActionsArr);
    }

    public AddDeliveryAddressActions(String str, int i) {
    }

    public static AddDeliveryAddressActions valueOf(String str) {
        return (AddDeliveryAddressActions) Enum.valueOf(AddDeliveryAddressActions.class, str);
    }

    public static AddDeliveryAddressActions[] values() {
        return (AddDeliveryAddressActions[]) g.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
