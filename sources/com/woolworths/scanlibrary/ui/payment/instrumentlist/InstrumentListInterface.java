package com.woolworths.scanlibrary.ui.payment.instrumentlist;

import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListInterface;", "", "InstrumentListCallback", "InstrumentListContainer", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InstrumentListInterface {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListInterface$InstrumentListCallback;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface InstrumentListCallback {
        void A4(PaymentInstrument paymentInstrument);

        void F4(boolean z);

        void G4(PaymentInstrument paymentInstrument);

        String L3();

        boolean P1(List list);

        void q1();

        boolean r1();

        default void v2(List fetchedCreditCardInstrumentList) {
            Intrinsics.h(fetchedCreditCardInstrumentList, "fetchedCreditCardInstrumentList");
        }

        void w();

        void x(List list);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListInterface$InstrumentListContainer;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface InstrumentListContainer {
        void a(int i);

        void f0(boolean z);

        void q();

        void r();

        void y0(PaymentInstrument paymentInstrument);
    }
}
