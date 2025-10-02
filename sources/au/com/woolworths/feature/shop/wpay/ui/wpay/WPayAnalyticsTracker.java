package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.supers.deliveryunlimited.SubscriptionConfirmationAnalytics;
import au.com.woolworths.analytics.supers.payments.PaymentAnalytics;
import au.com.woolworths.analytics.supers.payments.PaymentCommonAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayAnalyticsTracker;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WPayAnalyticsTracker {

    /* renamed from: a, reason: collision with root package name */
    public final AnalyticsManager f8369a;

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

    public WPayAnalyticsTracker(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f8369a = analyticsManager;
    }

    public static PaymentCommonAnalytics.Payment.Action a(PaymentFlowTypeData paymentFlowTypeData) {
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
        return new PaymentCommonAnalytics.Payment(screen.getD(), String.valueOf(screen.getData().get("app.Section"))).h;
    }

    public final void b(final String str, final String str2) {
        final PaymentCommonAnalytics.Payment.Action actionA = a(PaymentFlowTypeData.d);
        actionA.getClass();
        this.f8369a.g(new Event(actionA, str, str2) { // from class: au.com.woolworths.analytics.supers.payments.PaymentCommonAnalytics$Payment$Action$paymentFailureCvvValidation$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(actionA.f4043a.g);
                spreadBuilder.a(new Pair("event.Category", "Payments"));
                spreadBuilder.a(new Pair("event.Label", "CVV validation error"));
                androidx.constraintlayout.core.state.a.z("event.Action", "payment_error", spreadBuilder, "event.Value", str);
                androidx.constraintlayout.core.state.a.y("event.Description", "Payment failure ".concat(str2), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "payment_failure";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "payment_failure".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    public final void c(AnalyticsData analyticsData) {
        Intrinsics.h(analyticsData, "analyticsData");
        this.f8369a.g(AnalyticsDataKt.b(PaymentAnalytics.Payment.d, analyticsData));
    }

    public final void d(AnalyticsData analyticsData) {
        Intrinsics.h(analyticsData, "analyticsData");
        this.f8369a.g(AnalyticsDataKt.b(SubscriptionConfirmationAnalytics.Payment.d, analyticsData));
    }
}
