package au.com.woolworths.android.onesite.modules.checkout.common;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/common/CheckoutFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CheckoutFullPageErrorState implements FullPageErrorCause {
    public static final /* synthetic */ CheckoutFullPageErrorState[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        CheckoutFullPageErrorState[] checkoutFullPageErrorStateArr = {new CheckoutFullPageErrorState() { // from class: au.com.woolworths.android.onesite.modules.checkout.common.CheckoutFullPageErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.checkout_no_network_subtext);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_network_heading);
            }
        }, new CheckoutFullPageErrorState() { // from class: au.com.woolworths.android.onesite.modules.checkout.common.CheckoutFullPageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.checkout_server_error_subtext);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.server_error_heading);
            }
        }};
        d = checkoutFullPageErrorStateArr;
        e = EnumEntriesKt.a(checkoutFullPageErrorStateArr);
    }

    public static CheckoutFullPageErrorState valueOf(String str) {
        return (CheckoutFullPageErrorState) Enum.valueOf(CheckoutFullPageErrorState.class, str);
    }

    public static CheckoutFullPageErrorState[] values() {
        return (CheckoutFullPageErrorState[]) d.clone();
    }
}
