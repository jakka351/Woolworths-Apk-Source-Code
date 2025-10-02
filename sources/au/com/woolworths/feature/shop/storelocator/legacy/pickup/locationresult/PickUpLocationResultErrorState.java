package au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/locationresult/PickUpLocationResultErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PickUpLocationResultErrorState implements FullPageErrorCause {
    public static final PickUpLocationResultErrorState d;
    public static final PickUpLocationResultErrorState e;
    public static final /* synthetic */ PickUpLocationResultErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        PickUpLocationResultErrorState pickUpLocationResultErrorState = new PickUpLocationResultErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.pick_up_location_result_connection_error_message);
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
        d = pickUpLocationResultErrorState;
        PickUpLocationResultErrorState pickUpLocationResultErrorState2 = new PickUpLocationResultErrorState() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.pick_up_location_result_server_error_message);
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
        e = pickUpLocationResultErrorState2;
        PickUpLocationResultErrorState[] pickUpLocationResultErrorStateArr = {pickUpLocationResultErrorState, pickUpLocationResultErrorState2};
        f = pickUpLocationResultErrorStateArr;
        g = EnumEntriesKt.a(pickUpLocationResultErrorStateArr);
    }

    public static PickUpLocationResultErrorState valueOf(String str) {
        return (PickUpLocationResultErrorState) Enum.valueOf(PickUpLocationResultErrorState.class, str);
    }

    public static PickUpLocationResultErrorState[] values() {
        return (PickUpLocationResultErrorState[]) f.clone();
    }
}
