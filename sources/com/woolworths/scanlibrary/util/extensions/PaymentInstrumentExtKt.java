package com.woolworths.scanlibrary.util.extensions;

import android.content.Context;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaymentInstrumentExtKt {
    public static final boolean a(PaymentInstrument paymentInstrument) {
        Intrinsics.h(paymentInstrument, "<this>");
        if (paymentInstrument.getLastUsed() != null && paymentInstrument.isAllowed()) {
            return ((paymentInstrument instanceof CreditCardInstrument) && ((CreditCardInstrument) paymentInstrument).isExpired()) ? false : true;
        }
        return false;
    }

    public static final String b(CreditCardInstrument creditCardInstrument, Context context) {
        Intrinsics.h(creditCardInstrument, "<this>");
        if (creditCardInstrument.isExpired()) {
            String string = context.getString(R.string.sng_label_expired);
            Intrinsics.g(string, "getString(...)");
            return string;
        }
        if (!Intrinsics.c(creditCardInstrument.getStatus(), "UNVERIFIED_PERSISTENT")) {
            return "";
        }
        String string2 = context.getString(R.string.sng_label_unverified);
        Intrinsics.g(string2, "getString(...)");
        return string2;
    }

    public static final boolean c(CreditCardInstrument creditCardInstrument) {
        Intrinsics.h(creditCardInstrument, "<this>");
        return creditCardInstrument.isExpired() || Intrinsics.c(creditCardInstrument.getStatus(), "UNVERIFIED_PERSISTENT");
    }
}
