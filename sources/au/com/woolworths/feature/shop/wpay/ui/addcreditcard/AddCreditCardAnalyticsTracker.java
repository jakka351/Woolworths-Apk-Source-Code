package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.supers.deliveryunlimited.SubscriptionConfirmationAnalytics;
import au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics;
import au.com.woolworths.analytics.supers.payments.PaymentAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardAnalyticsTracker;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddCreditCardAnalyticsTracker {

    /* renamed from: a, reason: collision with root package name */
    public final AnalyticsManager f8322a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PaymentFlowTypeData.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PaymentFlowTypeData paymentFlowTypeData = PaymentFlowTypeData.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AddCreditCardAnalyticsTracker(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f8322a = analyticsManager;
    }

    public static AddCreditCardAnalytics.Payment a(PaymentFlowTypeData paymentFlowTypeData) {
        Screen screen;
        int iOrdinal = paymentFlowTypeData.ordinal();
        if (iOrdinal == 0) {
            screen = PaymentAnalytics.Payment.d;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            screen = SubscriptionConfirmationAnalytics.Payment.d;
        }
        return new AddCreditCardAnalytics.Payment(screen.getD(), String.valueOf(screen.getData().get("app.Section")));
    }

    public final void b(PaymentFlowTypeData flowType) {
        Intrinsics.h(flowType, "flowType");
        this.f8322a.g((Event) a(flowType).h.g.getD());
    }

    public final void c(PaymentFlowTypeData flowType) {
        Intrinsics.h(flowType, "flowType");
        this.f8322a.g((Event) a(flowType).h.b.getD());
    }
}
