package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class FulfilmentWindowErrorState implements FullPageErrorCause {
    public static final FulfilmentWindowErrorState d;
    public static final FulfilmentWindowErrorState e;
    public static final FulfilmentWindowErrorState f;
    public static final /* synthetic */ FulfilmentWindowErrorState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        FulfilmentWindowErrorState fulfilmentWindowErrorState = new FulfilmentWindowErrorState() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowErrorState.NETWORK_ERROR
            @Override // au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowErrorState
            public final String a() {
                return "Network Error";
            }

            @Override // au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowErrorState
            public final String b() {
                return "No network connection. Please try again.";
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.generic_network_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getPrimaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_network_heading);
            }
        };
        d = fulfilmentWindowErrorState;
        FulfilmentWindowErrorState fulfilmentWindowErrorState2 = new FulfilmentWindowErrorState() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowErrorState.NO_AVAILABLE_WINDOWS
            @Override // au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowErrorState
            public final String a() {
                return "No Windows Available";
            }

            @Override // au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowErrorState
            public final String b() {
                return "No Availability";
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_no_results;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.message_no_available_windows_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.title_no_available_windows_error);
            }
        };
        e = fulfilmentWindowErrorState2;
        FulfilmentWindowErrorState fulfilmentWindowErrorState3 = new FulfilmentWindowErrorState() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowErrorState.SERVER_ERROR
            @Override // au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowErrorState
            public final String a() {
                return "Server Error";
            }

            @Override // au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowErrorState
            public final String b() {
                return "Unable to load at this time.";
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.generic_server_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getPrimaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.server_error_heading);
            }
        };
        f = fulfilmentWindowErrorState3;
        FulfilmentWindowErrorState[] fulfilmentWindowErrorStateArr = {fulfilmentWindowErrorState, fulfilmentWindowErrorState2, fulfilmentWindowErrorState3};
        g = fulfilmentWindowErrorStateArr;
        h = EnumEntriesKt.a(fulfilmentWindowErrorStateArr);
    }

    public static FulfilmentWindowErrorState valueOf(String str) {
        return (FulfilmentWindowErrorState) Enum.valueOf(FulfilmentWindowErrorState.class, str);
    }

    public static FulfilmentWindowErrorState[] values() {
        return (FulfilmentWindowErrorState[]) g.clone();
    }

    public abstract String a();

    public abstract String b();
}
