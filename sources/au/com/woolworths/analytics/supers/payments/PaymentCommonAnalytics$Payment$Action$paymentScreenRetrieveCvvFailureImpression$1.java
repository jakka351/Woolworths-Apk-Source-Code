package au.com.woolworths.analytics.supers.payments;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.payments.PaymentCommonAnalytics;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentCommonAnalytics$Payment$Action$paymentScreenRetrieveCvvFailureImpression$1", "Lau/com/woolworths/analytics/Event;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentCommonAnalytics$Payment$Action$paymentScreenRetrieveCvvFailureImpression$1 implements Event {
    public final Object d;

    public PaymentCommonAnalytics$Payment$Action$paymentScreenRetrieveCvvFailureImpression$1(PaymentCommonAnalytics.Payment.Action action, String str) {
        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
        spreadBuilder.b(action.f4043a.g);
        spreadBuilder.a(new Pair("event.Category", "Payments"));
        spreadBuilder.a(new Pair("event.Action", "cvv_error"));
        androidx.constraintlayout.core.state.a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "CVV error", spreadBuilder, str), spreadBuilder);
        ArrayList arrayList = spreadBuilder.f24269a;
        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
    }

    @Override // au.com.woolworths.analytics.Event
    /* renamed from: d */
    public final String getE() {
        return "payment_screen_retrieve_cvv_failure_impression";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return "payment_screen_retrieve_cvv_failure_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // au.com.woolworths.analytics.Event
    public final Map getData() {
        return this.d;
    }
}
