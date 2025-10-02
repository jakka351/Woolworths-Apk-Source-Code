package au.com.woolworths.feature.shop.storelocator.legacy;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/StoreLocatorFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class StoreLocatorFullPageErrorState implements FullPageErrorCause {
    public static final StoreLocatorFullPageErrorState d;
    public static final StoreLocatorFullPageErrorState e;
    public static final StoreLocatorFullPageErrorState f;
    public static final StoreLocatorFullPageErrorState g;
    public static final StoreLocatorFullPageErrorState h;
    public static final StoreLocatorFullPageErrorState i;
    public static final /* synthetic */ StoreLocatorFullPageErrorState[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        StoreLocatorFullPageErrorState storeLocatorFullPageErrorState = new StoreLocatorFullPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorFullPageErrorState.DEVICE_LOCATION_DISABLED
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return com.woolworths.R.drawable.pickup_location;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.in_store_locator_device_location_off_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.permission_go_to_settings;
            }
        };
        d = storeLocatorFullPageErrorState;
        StoreLocatorFullPageErrorState storeLocatorFullPageErrorState2 = new StoreLocatorFullPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorFullPageErrorState.NETWORK_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return com.woolworths.R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.store_locator_connection_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.try_again_button_text;
            }
        };
        e = storeLocatorFullPageErrorState2;
        StoreLocatorFullPageErrorState storeLocatorFullPageErrorState3 = new StoreLocatorFullPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorFullPageErrorState.NO_LOCATION_PERMISSION
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return com.woolworths.R.drawable.pickup_location;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.store_locator_no_location_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.enable_location;
            }
        };
        f = storeLocatorFullPageErrorState3;
        StoreLocatorFullPageErrorState storeLocatorFullPageErrorState4 = new StoreLocatorFullPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorFullPageErrorState.NO_LOCATION_PERMISSION_PERMANENT
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return com.woolworths.R.drawable.pickup_location;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.store_locator_no_location_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.permission_go_to_settings;
            }
        };
        g = storeLocatorFullPageErrorState4;
        StoreLocatorFullPageErrorState storeLocatorFullPageErrorState5 = new StoreLocatorFullPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorFullPageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return com.woolworths.R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.store_locator_server_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.try_again_button_text;
            }
        };
        h = storeLocatorFullPageErrorState5;
        StoreLocatorFullPageErrorState storeLocatorFullPageErrorState6 = new StoreLocatorFullPageErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorFullPageErrorState.NO_RESULT_FOUND
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return com.woolworths.R.drawable.ic_pick_up_location_no_result_found;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.no_result_found_subtext);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(com.woolworths.R.string.no_search_result_found_heading);
            }
        };
        i = storeLocatorFullPageErrorState6;
        StoreLocatorFullPageErrorState[] storeLocatorFullPageErrorStateArr = {storeLocatorFullPageErrorState, storeLocatorFullPageErrorState2, storeLocatorFullPageErrorState3, storeLocatorFullPageErrorState4, storeLocatorFullPageErrorState5, storeLocatorFullPageErrorState6};
        j = storeLocatorFullPageErrorStateArr;
        k = EnumEntriesKt.a(storeLocatorFullPageErrorStateArr);
    }

    public static StoreLocatorFullPageErrorState valueOf(String str) {
        return (StoreLocatorFullPageErrorState) Enum.valueOf(StoreLocatorFullPageErrorState.class, str);
    }

    public static StoreLocatorFullPageErrorState[] values() {
        return (StoreLocatorFullPageErrorState[]) j.clone();
    }
}
