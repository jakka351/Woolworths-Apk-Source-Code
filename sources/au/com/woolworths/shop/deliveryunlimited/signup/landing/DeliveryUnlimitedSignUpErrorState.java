package au.com.woolworths.shop.deliveryunlimited.signup.landing;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DeliveryUnlimitedSignUpErrorState implements FullPageErrorCause {
    public static final DeliveryUnlimitedSignUpErrorState d;
    public static final DeliveryUnlimitedSignUpErrorState e;
    public static final /* synthetic */ DeliveryUnlimitedSignUpErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState = new DeliveryUnlimitedSignUpErrorState() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpErrorState.NETWORK_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.delivery_unlimited_network_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_network_heading);
            }
        };
        d = deliveryUnlimitedSignUpErrorState;
        DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState2 = new DeliveryUnlimitedSignUpErrorState() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.delivery_unlimited_server_error_message);
            }

            @Override // au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }
        };
        e = deliveryUnlimitedSignUpErrorState2;
        DeliveryUnlimitedSignUpErrorState[] deliveryUnlimitedSignUpErrorStateArr = {deliveryUnlimitedSignUpErrorState, deliveryUnlimitedSignUpErrorState2};
        f = deliveryUnlimitedSignUpErrorStateArr;
        g = EnumEntriesKt.a(deliveryUnlimitedSignUpErrorStateArr);
    }

    public static DeliveryUnlimitedSignUpErrorState valueOf(String str) {
        return (DeliveryUnlimitedSignUpErrorState) Enum.valueOf(DeliveryUnlimitedSignUpErrorState.class, str);
    }

    public static DeliveryUnlimitedSignUpErrorState[] values() {
        return (DeliveryUnlimitedSignUpErrorState[]) f.clone();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public int getSecondaryActionRes() {
        return R.string.try_again_button_text;
    }
}
