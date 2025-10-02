package com.woolworths.scanlibrary.util.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import com.woolworths.scanlibrary.util.extensions.PaymentInstrumentExtKt;
import java.util.Comparator;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/util/payment/PaymentInstrumentLastUsageComparator;", "Ljava/util/Comparator;", "Lau/com/woolworths/pay/sdk/models/PaymentInstrument;", "Lkotlin/Comparator;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaymentInstrumentLastUsageComparator implements Comparator<PaymentInstrument> {
    @Override // java.util.Comparator
    public final int compare(PaymentInstrument paymentInstrument, PaymentInstrument paymentInstrument2) {
        PaymentInstrument p1 = paymentInstrument;
        PaymentInstrument p2 = paymentInstrument2;
        Intrinsics.h(p1, "p1");
        Intrinsics.h(p2, "p2");
        if (!PaymentInstrumentExtKt.a(p1) && !PaymentInstrumentExtKt.a(p2)) {
            return 0;
        }
        if (!PaymentInstrumentExtKt.a(p1) && PaymentInstrumentExtKt.a(p2)) {
            return 1;
        }
        if (PaymentInstrumentExtKt.a(p1) && !PaymentInstrumentExtKt.a(p2)) {
            return -1;
        }
        Date lastUsed = p1.getLastUsed();
        Intrinsics.e(lastUsed);
        long time = lastUsed.getTime();
        Date lastUsed2 = p2.getLastUsed();
        Intrinsics.e(lastUsed2);
        if (time > lastUsed2.getTime()) {
            return -1;
        }
        Date lastUsed3 = p1.getLastUsed();
        Intrinsics.e(lastUsed3);
        long time2 = lastUsed3.getTime();
        Date lastUsed4 = p2.getLastUsed();
        Intrinsics.e(lastUsed4);
        return time2 < lastUsed4.getTime() ? 1 : 0;
    }
}
