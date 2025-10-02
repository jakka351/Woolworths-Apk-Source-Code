package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PickUpLocatorPageErrorState implements FullPageErrorCause {
    public static final PickUpLocatorPageErrorState d;
    public static final PickUpLocatorPageErrorState e;
    public static final PickUpLocatorPageErrorState f;
    public static final PickUpLocatorPageErrorState g;
    public static final PickUpLocatorPageErrorState h;
    public static final PickUpLocatorPageErrorState i;
    public static final PickUpLocatorPageErrorState j;
    public static final PickUpLocatorPageErrorState k;
    public static final /* synthetic */ PickUpLocatorPageErrorState[] l;
    public static final /* synthetic */ EnumEntries m;

    static {
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState = new PickUpLocatorPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorPageErrorState.NEARBY_LOCATIONS_NO_CONNECTIVITY
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.pick_up_nearby_locations_connection_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.pick_up_locator_connection_error_heading);
            }
        };
        d = pickUpLocatorPageErrorState;
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState2 = new PickUpLocatorPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorPageErrorState.NEARBY_LOCATIONS_SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.pick_up_nearby_locations_server_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.pick_up_locator_server_error_heading);
            }
        };
        e = pickUpLocatorPageErrorState2;
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState3 = new PickUpLocatorPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorPageErrorState.SUBURB_SEARCH_NO_CONNECTIVITY
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.pick_up_suburb_search_connection_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.pick_up_locator_connection_error_heading);
            }
        };
        f = pickUpLocatorPageErrorState3;
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState4 = new PickUpLocatorPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorPageErrorState.SUBURB_SEARCH_SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.pick_up_suburb_search_server_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.pick_up_locator_server_error_heading);
            }
        };
        g = pickUpLocatorPageErrorState4;
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState5 = new PickUpLocatorPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorPageErrorState.NO_RESULT_FOUND
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_pick_up_location_no_result_found;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.no_result_found_subtext);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_search_result_found_heading);
            }
        };
        h = pickUpLocatorPageErrorState5;
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState6 = new PickUpLocatorPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorPageErrorState.NO_LOCATION_PERMISSION
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.pickup_location;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.pick_up_locator_no_location_permission_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getPrimaryActionRes() {
                return R.string.permission_allow;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.search_pick_up_location;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.pick_up_locator_no_location_permission_title);
            }
        };
        i = pickUpLocatorPageErrorState6;
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState7 = new PickUpLocatorPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorPageErrorState.NO_LOCATION_PERMISSION_PERMANENT
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.pickup_location;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.pick_up_locator_no_location_permission_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getPrimaryActionRes() {
                return R.string.permission_go_to_settings;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.search_pick_up_location;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.pick_up_locator_no_location_permission_title);
            }
        };
        j = pickUpLocatorPageErrorState7;
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState8 = new PickUpLocatorPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorPageErrorState.DEVICE_LOCATION_DISABLED
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.pickup_location;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.pick_up_locator_device_location_off_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getPrimaryActionRes() {
                return R.string.permission_go_to_settings;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.search_pick_up_location;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.pick_up_locator_device_location_off_title);
            }
        };
        k = pickUpLocatorPageErrorState8;
        PickUpLocatorPageErrorState[] pickUpLocatorPageErrorStateArr = {pickUpLocatorPageErrorState, pickUpLocatorPageErrorState2, pickUpLocatorPageErrorState3, pickUpLocatorPageErrorState4, pickUpLocatorPageErrorState5, pickUpLocatorPageErrorState6, pickUpLocatorPageErrorState7, pickUpLocatorPageErrorState8};
        l = pickUpLocatorPageErrorStateArr;
        m = EnumEntriesKt.a(pickUpLocatorPageErrorStateArr);
    }

    public static PickUpLocatorPageErrorState valueOf(String str) {
        return (PickUpLocatorPageErrorState) Enum.valueOf(PickUpLocatorPageErrorState.class, str);
    }

    public static PickUpLocatorPageErrorState[] values() {
        return (PickUpLocatorPageErrorState[]) l.clone();
    }
}
