package au.com.woolworths.android.onesite.modules.checkout.payserviceserror;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/payserviceserror/PaymentServicesFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PaymentServicesFullPageErrorState implements FullPageErrorCause {
    public static final PaymentServicesFullPageErrorState d;
    public static final PaymentServicesFullPageErrorState e;
    public static final /* synthetic */ PaymentServicesFullPageErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        PaymentServicesFullPageErrorState paymentServicesFullPageErrorState = new PaymentServicesFullPageErrorState() { // from class: au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState
            public final void a(PayServicesErrorViewModel payServicesErrorViewModel) {
            }

            @Override // au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState
            public final void b(PayServicesErrorViewModel payServicesErrorViewModel) {
                payServicesErrorViewModel.g();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.payments_service_no_network_subtext);
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
        d = paymentServicesFullPageErrorState;
        PaymentServicesFullPageErrorState paymentServicesFullPageErrorState2 = new PaymentServicesFullPageErrorState() { // from class: au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState
            public final void a(PayServicesErrorViewModel payServicesErrorViewModel) {
            }

            @Override // au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState
            public final void b(PayServicesErrorViewModel payServicesErrorViewModel) {
                payServicesErrorViewModel.g();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.payments_service_error);
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
        e = paymentServicesFullPageErrorState2;
        PaymentServicesFullPageErrorState[] paymentServicesFullPageErrorStateArr = {paymentServicesFullPageErrorState, paymentServicesFullPageErrorState2};
        f = paymentServicesFullPageErrorStateArr;
        g = EnumEntriesKt.a(paymentServicesFullPageErrorStateArr);
    }

    public static PaymentServicesFullPageErrorState valueOf(String str) {
        return (PaymentServicesFullPageErrorState) Enum.valueOf(PaymentServicesFullPageErrorState.class, str);
    }

    public static PaymentServicesFullPageErrorState[] values() {
        return (PaymentServicesFullPageErrorState[]) f.clone();
    }

    public abstract void a(PayServicesErrorViewModel payServicesErrorViewModel);

    public abstract void b(PayServicesErrorViewModel payServicesErrorViewModel);
}
