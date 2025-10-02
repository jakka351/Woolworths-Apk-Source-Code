package au.com.woolworths.android.onesite.modules.deliveryaddress.search;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DeliveryAddressSearchErrorState implements FullPageErrorCause {
    public static final DeliveryAddressSearchErrorState d;
    public static final DeliveryAddressSearchErrorState e;
    public static final DeliveryAddressSearchErrorState f;
    public static final /* synthetic */ DeliveryAddressSearchErrorState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        DeliveryAddressSearchErrorState deliveryAddressSearchErrorState = new DeliveryAddressSearchErrorState() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchErrorState.NO_RESULT_FOUND
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return 0;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.search_delivery_address_no_result_found_subtext);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.add_manual_address_title;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_search_result_found_heading);
            }
        };
        d = deliveryAddressSearchErrorState;
        DeliveryAddressSearchErrorState deliveryAddressSearchErrorState2 = new DeliveryAddressSearchErrorState() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchErrorState.CONNECTION_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.search_delivery_address_connection_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_network_heading);
            }
        };
        e = deliveryAddressSearchErrorState2;
        DeliveryAddressSearchErrorState deliveryAddressSearchErrorState3 = new DeliveryAddressSearchErrorState() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.search_delivery_address_server_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.server_error_heading);
            }
        };
        f = deliveryAddressSearchErrorState3;
        DeliveryAddressSearchErrorState[] deliveryAddressSearchErrorStateArr = {deliveryAddressSearchErrorState, deliveryAddressSearchErrorState2, deliveryAddressSearchErrorState3};
        g = deliveryAddressSearchErrorStateArr;
        h = EnumEntriesKt.a(deliveryAddressSearchErrorStateArr);
    }

    public static DeliveryAddressSearchErrorState valueOf(String str) {
        return (DeliveryAddressSearchErrorState) Enum.valueOf(DeliveryAddressSearchErrorState.class, str);
    }

    public static DeliveryAddressSearchErrorState[] values() {
        return (DeliveryAddressSearchErrorState[]) g.clone();
    }
}
